package step9_03.student;
public class StudentInsert {
	
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복아이디 입니다");
		}
	}
	// VO에 있는 정보 중 id를 불러와서 중복체크 후 중복 아니면 true
	// true이면 HashMap(stDB)에 집어넣기.
	
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false;
	}
	// id를 입력해서 해당하는 정보가 있으면 id가 있는거니까 
	// null이면    true : 해당 id 없음 (중복X)
	// null아니면 false : 해당 id 있음 (중복O)
	
}
