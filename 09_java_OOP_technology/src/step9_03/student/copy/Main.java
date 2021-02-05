package step9_03.student.copy;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();
		
		while(true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if(selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id, num, name));
			}
			else if (selectMenu == 2){
				System.out.print("수정할 아이디를 입력하세요 : ");
				String changeId = scan.next();
				
				StudentSelect stSel = controller.getSelect();
				stSel.checkId(changeId);
				
				
				//??
				
				
			}
			else if (selectMenu == 3){
				
			}
			else if (selectMenu == 4){
				
			}
			else if (selectMenu == 5){
				
			}
			else if (selectMenu == 6){
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			
			
			
		}
		
		
		
	}

}
