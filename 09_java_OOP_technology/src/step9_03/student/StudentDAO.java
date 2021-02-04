package step9_03.student;

import java.util.Map;

public class StudentDAO {
	
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}	
	// HashMap(stDB)에 새로운 정보 넣기
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	} // key값에 해당하는 VO정보들 불러오기
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}
	// HashMap(stDB)에 있는 정보 불러오기
	

}
