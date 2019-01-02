package game_project;

import javax.swing.JOptionPane;

public class Season {

	public static void main(String[] args) {

		int mon = Integer.parseInt(JOptionPane.showInputDialog("month : "));
		
		String msg = "";
		
		//switch(변수){ case 변수값 : ... } break;를 해야 switch문 탈출 
		switch(mon) {
		case 3:
		case 4:
		case 5:
			msg = "spring";
			break;
			
		case 6: case 7: case 8:
			msg = "summer";
			break;
			
		case 9: case 10: case 11:
			msg = "autumn";
			break;
			
		case 12: case 1: case 2:
			msg = "winter";
			break;
			
		default:
			msg="wrong number";
			
		}
		
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
	

}
