
public class MyDate {

	private Integer year;
	private Integer month;
	private Integer day;

	private String[] strMonth = { "Jan", "Fev", "Mar", "Avr", "Mai", "Jun", "Jui", "Aou", "Sep", "Oct", "Nov", "Dec" };
	private String[] strDay = { "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" };
	private int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(Integer y, Integer m, Integer d){
		try {
			setY(y);
			setM(m);
			setD(d);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isBissextile() {
		if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0)
			return true;
		else
			return false;
	}

	public boolean isValidDate() {
		if (this.isBissextile()) {
			if (this.month == 2) {
				if (this.day < 0 || this.day > 29)
					return false;
				else
					return true;
			} else {
				if (this.day < 0 || this.day > dayInMonth[this.month - 1] || this.month < 1 || this.month > 12)
					return false;
				else
					return true;
			}
		} else {
			if (this.day < 0 || this.day > dayInMonth[this.month - 1] || this.month < 1 || this.month > 12)
				return false;
			else
				return true;
		}
	}

	public String getDayOfWeek() {
		if (this.isBissextile()) {
			if (this.month < 3)// premier cas si le mois est avant mars
				return strDay[(int) (((23 * this.month) / 9) + this.day + 4 + this.year + ((this.year - 1) / 4)
						- ((this.year - 1) / 100) + ((this.year - 1) / 400)) % 7]; // formule prise d'internet
																					// https://fr.wikibooks.org/wiki/Curiosit%C3%A9s_math%C3%A9matiques/Trouver_le_jour_de_la_semaine_avec_une_date_donn%C3%A9e
			else
				return strDay[(int) (((23 * this.month) / 9) + this.day + 4 + this.year + ((this.year - 1) / 4)
						- ((this.year - 1) / 100) + ((this.year - 1) / 400) - 1) % 7];
		} else {
			if (this.month < 3)// deuxième cas si le mois est après mars
				return strDay[(int) (((23 * this.month) / 9) + this.day + 4 + this.year + ((this.year - 1) / 4)
						- ((this.year - 1) / 100) + ((this.year - 1) / 400)) % 7];

			else
				return strDay[(int) (((23 * this.month) / 9) + this.day + 4 + this.year + ((this.year - 1) / 4)
						- ((this.year - 1) / 100) + ((this.year - 1) / 400) - 2) % 7];

		}
	}

	// getters
	public Integer getY() {
		return this.year;
	}

	public Integer getM() {
		return this.month;
	}

	public Integer getD() {
		return this.day;
	}

	public Integer[] getYMD() {
		Integer[] tab = { this.year, this.month, this.day };
		return tab;
	}

	// setters
	public void setY(Integer y){ // exception
		this.year = y;
	}

	public void setM(Integer m) throws Exception{// exception
		if(m<1 || m>12) {
			throw(new Exception("mois invalide !"));
		}
		else {
			this.month = m;
		}
	}

	public void setD(Integer d) throws Exception{// exception
		
		if(d<1 || d>dayInMonth[this.month-1]) {
			throw(new Exception("jour invalide !"));
		}
		
		
		else {
			this.day = d;
		}
	}

	public void setYMD(Integer[] tab) {
		
		try {
		setY(tab[0]);
		setM(tab[1]);
		setD(tab[2]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String toString() {
		return this.getDayOfWeek() + " " + String.format("%02d", this.day) + " " + strMonth[this.month - 1] + " "
				+ String.format("%04d", this.year);
	}

	// next
	public void nextDay() {
		this.day++;
		if (this.isBissextile() && this.month == 2) {
			if (this.day > 29) {
				this.day = 1;
				this.nextMonth();
			}
		} else {
			if (this.day > dayInMonth[this.month - 1]) {
				this.day = 1;
				this.nextMonth();
			}
		}
	}

	public void nextMonth() {
		this.month++;
		if (this.month > 12) {
			this.month = 1;
			this.nextYear();
		} else if (this.day > dayInMonth[this.month - 1] && this.isBissextile() && this.month == 2) {
			this.day = 29;
		} else if (this.day > dayInMonth[this.month - 1] && !this.isBissextile()) {
			this.day = dayInMonth[this.month - 1];
		}
	}

	public void nextYear() {
		this.year++;
	}

	// previous
	public void previousYear() {
		this.year--;
	}

	public void previousMonth() {
		if (this.month == 1) {
			this.month = 12;
			previousYear();
		} else if (this.month == 3) {
			if (this.day == 31 || this.day == 30) {
				if (isBissextile()) {
					this.month--;
					this.day = 29;
				} else {
					this.month--;
					this.day = 28;
				}
			} else {
				this.month--;
			}
		} else {
			if (this.day == dayInMonth[this.month - 1]) {
				this.month--;
				this.day = dayInMonth[this.month - 1];
			} else {
				this.month--;
			}
		}
	}

	public void previousDay() {
		if (this.day == 1) {
			previousMonth();
			this.day = dayInMonth[this.month - 1];
		} else {
			this.day--;
		}
	}

	// addDate
	public void addTime(int annee, int mois, int jour) {
		this.year += annee;
		this.month += mois;
		this.day += jour;
		
		while(this.month > 12) {
			this.month -= -12;
			this.year++;
		}
		if(this.day > dayInMonth[this.month-1]) {
			this.day -= dayInMonth[this.month-1];
			this.month++;
		}
		
	}
	

	// delDate
	public void delTime(int annee, int mois, int jour) {
		for(int i = 0; i<annee; i++) {
			this.previousYear();
		}
		for(int i = 0; i<mois; i++) {
			this.previousMonth();
		}
		for(int i = 0; i<jour; i++) {
			this.previousDay();
		}
	}
	

	public static void test() {
		try {
			
		// date
		MyDate date = new MyDate(2012, 4, 1);
		System.out.println("l'année est-elle bisextile : " + date.isBissextile());
		System.out.println("la date est-elle valide : " + date.isValidDate());
		System.out.println("le jour de la semaine : " + date.getDayOfWeek());
		System.out.println(date);

		System.out.println("\nNext : ");
		date.nextDay();
		System.out.println(date);
		date.nextMonth();
		System.out.println(date);
		date.nextYear();
		System.out.println(date);

		date = new MyDate(2012, 5, 1);

		System.out.println("\nPrevious : ");
		date.previousYear();
		System.out.println(date);
		date.previousMonth();
		System.out.println(date);
		date.previousDay();
		System.out.println(date);
		
		date = new MyDate(2015,1,25);
		date.addTime(1,1,5);
		System.out.println("\nAddTime : ");
		System.out.println(date);
		
		
		date = new MyDate(2015, 1, 25);
		date.delTime(1,1,5);
		System.out.println("\nDelTime : ");
		System.out.println(date);
		
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
