package bazaar;

import bazaar.beans.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentsList = new ArrayList<>(Arrays.asList(new Student("1","Imtiaz","13"),new Student("2","Qayyom","13")
    ,new Student("3","Munesh","14")));

    public List<Student> getStudentsList(){
        return studentsList;
    }

    public Student getStudentById(String id) {
        return studentsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public boolean addStudent(Student student) {
        return studentsList.add(student);
    }

    public boolean deleteStudent(String id) {
        return studentsList.removeIf(pr -> pr.getId().equals(id));
    }

    public boolean updateStudent(Student student) {

        for (int i = 0; i<studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(student.getId())){
                studentsList.add(i,student);
                return true;
            }
        }
        return false;
    }
}
