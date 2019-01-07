package game_project;

public class Worker {

	public static void main(String[] args) {
        //8000 * 8 * 20 = 1280000
        MonthlyWorker mw = new MonthlyWorker("홍길동", 8000, 8);
        mw.showInfo();
        
        //7500 * 4 * 7 = 210000
        HourWorker hw = new HourWorker("박기순", 7500, 4, 7);
        hw.showInfo();

	}

}


class WorkerCal {
	
    
    private String name;    
    private int hourPay;    //시급
    private int workHour;    //근무시간
    
    //생성자
    public WorkerCal() {}        //기본 생성자 = 클래스명 + ctrl + space 
 
    //alt + shift + s, o 생성자 자동완성 단축키
    public WorkerCal(String name, int hourPay, int workHour) {
        setName(name);
        setHourPay(hourPay);
        setWorkHour(workHour);
        
    }
    
    //급여계산 메서드
    //월급 = 시급 * 1일 근무시간 * 20일
    //시급 = 시급 * 1일 근무시간 * 근무일 수
    public int getPay() {
        return getHourPay() * getWorkHour();
        
    }
    
    //정보출력 메서드
    public void showInfo() {
        System.out.println("이름 : " + getName());
        System.out.println("급여 : " + getPay());
    }
 
    //set과 get메서드
    //alt + shift + s,r
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }
    
    public int getHourPay() {
        return hourPay;
    }
    
    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
    
    public int getWorkHour() {
        return workHour;
    }

}


class MonthlyWorker extends WorkerCal{
    
    public MonthlyWorker() {}
    
    public MonthlyWorker(String name, int hourPay, int workHour) {
        //setName(name);
        //setHourPay(hourPay);
        //setWorkHour(workHour);
        super(name, hourPay, workHour);    //내가 일일히 셋팅하는 것보다 부모 클래스에게 시키자
    }
    
    @Override
    public int getPay() 
    {
        return getHourPay() * getWorkHour() * 20;
    }
 
}

class HourWorker extends WorkerCal{
    
    private int workDay = 0;
    
    public HourWorker() {}
    
    public HourWorker(String name, int hourPay, int workHour, int workDay) {
        super(name, hourPay, workHour);
        setWorkDay(workDay);
    }
    
    @Override
    public int getPay() 
    {
        return getHourPay() * getWorkHour() * getWorkDay();
    }
    
    
    public int getWorkDay() {return workDay;}
    public void setWorkDay(int workDay) {this.workDay = workDay;}
    
}






