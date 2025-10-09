import java.util.*;
public class Teacher {
    private String teacherName;
    private List<Subject>subjects=new ArrayList<>();
    public Teacher(String teacherName){
        this.teacherName=teacherName;

    }
    public void addSubject(Subject subject){
        subjects.add(subject);

    }
    public void showSubject(){
        System.out.println("Teacher;"+teacherName);
        for(Subject s: subjects){
            System.out.println("-"+s.getSubjectName());
        }
    }

    
}
