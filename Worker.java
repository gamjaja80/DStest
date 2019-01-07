package game_project;

public class Worker {

	public static void main(String[] args) {
        //8000 * 8 * 20 = 1280000
        MonthlyWorker mw = new MonthlyWorker("ȫ�浿", 8000, 8);
        mw.showInfo();
        
        //7500 * 4 * 7 = 210000
        HourWorker hw = new HourWorker("�ڱ��", 7500, 4, 7);
        hw.showInfo();

	}

}


class WorkerCal {
	
    
    private String name;    
    private int hourPay;    //�ñ�
    private int workHour;    //�ٹ��ð�
    
    //������
    public WorkerCal() {}        //�⺻ ������ = Ŭ������ + ctrl + space 
 
    //alt + shift + s, o ������ �ڵ��ϼ� ����Ű
    public WorkerCal(String name, int hourPay, int workHour) {
        setName(name);
        setHourPay(hourPay);
        setWorkHour(workHour);
        
    }
    
    //�޿���� �޼���
    //���� = �ñ� * 1�� �ٹ��ð� * 20��
    //�ñ� = �ñ� * 1�� �ٹ��ð� * �ٹ��� ��
    public int getPay() {
        return getHourPay() * getWorkHour();
        
    }
    
    //������� �޼���
    public void showInfo() {
        System.out.println("�̸� : " + getName());
        System.out.println("�޿� : " + getPay());
    }
 
    //set�� get�޼���
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
        super(name, hourPay, workHour);    //���� ������ �����ϴ� �ͺ��� �θ� Ŭ�������� ��Ű��
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






