package game_project;


interface Testable{// �������̽����� �ڿ� ~able ���̴°� ����

	 /*public static final*/ int MAX_NUM = 10; //��� : /**/�� �κ��� �翬�� ���̹Ƿ� �����ص� ��
	 /*public abstract*/ void add();//�߻�޼���

}

public class IntpTest {

	public static void main(String[] args) {

		int num = 10;
		num = 20;
		
		final int NUM2 = 1; //������� �빮�� ǥ�Ⱑ ����
		//NUM2 = 2; ����� �ѹ� ���� �ʱ�ȭ�ϸ� �ٲܼ�����.
		
		final int MAX_VOLUMN = 30; //_�� �ṉ̀���

		
		System.out.println(num + " , " + NUM2 + ", MAX : " + MAX_VOLUMN);
	}

}
