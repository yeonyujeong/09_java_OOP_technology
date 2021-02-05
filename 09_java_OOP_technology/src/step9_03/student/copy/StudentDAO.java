package step9_03.student.copy;

import java.util.Map;

public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public Map<String, StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}
	
	
}
