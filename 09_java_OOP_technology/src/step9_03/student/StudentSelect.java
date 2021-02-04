package step9_03.student;

public class StudentSelect {
	
	private StudentDAO studentDAO;
	
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	
	
	public StudentVO select(String id) {
		
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	// id 입력해서 
	// checkId > true (정보있음) > VO정보들 반환하기
	//         > false(정보없음) > "정보가 없습니다."
	
	
	public boolean checkId(String id) {
		
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
		// 정보 불러와서 null이 아니면 true : 해당 정보 있음
		// null이면 false : 해당 정보 없음.
	}
}
