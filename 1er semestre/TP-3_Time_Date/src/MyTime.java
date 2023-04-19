
public class MyTime {
	private Integer hour;
	private Integer minute;
	private Integer second;
	
	//constructor null
	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	
	//constructor classique
	public MyTime(Integer h, Integer m, Integer s){
		try{
			setH(h);
			setM(m);
			setS(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//getters
	public Integer getH() {
		return this.hour;
	}
	public Integer getM() {
		return this.minute;
	}
	public Integer getS() {
		return this.second;
	}
	public Integer[] getHMS() {
		Integer[] tab = {this.getH(), this.getM(), this.getS()};
		return tab;
	}
	
	//setters
	public void setH(Integer h)throws Exception {
		if(h>23||h<0) {
			throw(new Exception("Erreur : heure invalide"));
		}
		else {
			this.hour = h;
		}
	}
	public void setM(Integer m) throws Exception{
		if(m>59||m<0) {
			throw(new Exception("Erreur : Minute invalide"));
		}
		else {
			this.minute = m;
		}
	}
	public void setS(Integer s) throws Exception {
		if(s>59||s<0) {
			throw(new Exception("Erreur : Second invalide"));
		}
		else {
			this.second = s;
		}
	}
	public void setHMS(Integer[] tab){
		try{
			setH(tab[0]);
			setM(tab[1]);
			setS(tab[2]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	//to String pour l'affichage
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	
	//nextSecond
	public void nextSecond() {
		 this.second++;
		 if(this.second > 59) {
			 this.second=this.second%60;
			 this.nextMinute();
		 }
		 
	}
	
	//nextMinutes
	public void nextMinute() {
		this.minute++;
		 if(this.minute>59) {
			 this.minute=this.minute%60;
			 this.nextHour();
		 }
	}
	
	public void nextHour() {
		this.hour++;
		if(this.hour > 23) {
			this.hour=this.hour%24;
		}
		
	}
	
	//previousSecond
	public void previousSecond() {
		this.second--;
		if(this.second < 0) {
			this.second+=60;
			this.previousMinute();
		}
	}
	
	//previousMinute
	public void previousMinute() {
		 this.minute--;
		 if(this.minute < 0) {
			 this.minute+=60;
			 this.previousHour();
		 }
	}
	
	
	//previousHour
	public void previousHour() {
		 this.hour--;
		 if(this.hour < 0) {
			 this.hour+=24;
		 }
	}

	
	
	//add time
	public void addTime(MyTime time) {
	
		for(int i = 0; i<time.second; i++) {
			this.nextSecond();
		}
		for(int i = 0; i<time.minute; i++) {
			this.nextMinute();
		}
		for(int i = 0; i<time.hour; i++) {
			this.nextHour();
		}
	}
	
	//del Time
	public void delTime(MyTime time) {
	
		for(int i = 0; i<time.second; i++) {
			this.previousSecond();
		}
		for(int i = 0; i<time.minute; i++) {
			this.previousMinute();
		}
		for(int i = 0; i<time.hour; i++) {
			this.previousHour();
		}
	}
	
	
	public static void test(){
		try {
			MyTime time = new MyTime(25,54,59);
			MyTime test = new MyTime(2,6,2);
			System.out.println(time);
			time.nextSecond();
			System.out.println(time);
			time.nextMinute();
			System.out.println(time);
			time.nextHour();
			System.out.println(time);
			
			
			time.previousSecond();
			System.out.println(time);
			time.previousMinute();
			System.out.println(time);
			time.previousHour();
			System.out.println(time);
			
			
			time.addTime(test);
			System.out.println(time);
			time.delTime(test);
			System.out.println(time);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	
}
