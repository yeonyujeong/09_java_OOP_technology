package step9_03.student;

import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	
	public Map<String , StudentVO> allSelect(){
		return studentDAO.getStudentDB();
	}
	// StrudentDAO를 통해서 HashMap(stDB)에 있는 정보 불러오기.
	
	public void printAll() {
	// 정보 프린트	
		Map<String , StudentVO> map = studentDAO.getStudentDB();
		
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
		
	}
	
}
