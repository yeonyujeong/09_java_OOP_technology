package step9_03.student;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
		
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id , num , name));
				
			}
			
			else if (selectMenu == 2) {
				System.out.print("수정할 아이디를 입력하세요 : ");
				String changeId = scan.next();
				String changeKey = "";
				StudentSelectAll stSelAll = controller.getSelectAll();
				for (String key : stSelAll.allSelect().keySet()) {
					if(changeId.equals(key)) {
						changeKey = key;
					}
				}
				if(changeKey.equals("")) {System.out.println("입력하신 아이디는 존재하지 않습니다."); continue;}
				System.out.println("변경할 번호를 입력하세요 : ");
				int changeNum = scan.nextInt();
				System.out.print("변경할 이름을 입력하세요 : ");
				String changeName = scan.next();
				
				stSelAll.allSelect().put(changeKey, new StudentVO(changeKey, changeNum, changeName));
			}
			
			else if (selectMenu == 3) {
				System.out.print("삭제할 아이디를 입력하세요 : ");
				String delId = scan.next();
				String delKey = "";
				StudentSelectAll stSelAll = controller.getSelectAll();
				for (String key : stSelAll.allSelect().keySet()) {
					if(delId.equals(key)) {
						delKey = key;
					}
				}
				stSelAll.allSelect().remove(delKey);
			}
			
			else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			}
			else if (selectMenu == 5) {
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
