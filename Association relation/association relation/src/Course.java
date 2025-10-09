public class Course {
    private String course_name;
    private Student[] class_list;
    private Faculty teacher;

    Course(String course_name, Faculty teacher) {
        this.course_name = course_name;
        this.teacher = teacher;
    }

    public void set_Student_list(Student[] s) {
        class_list = s;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void show_class_Students() {  
        for (Student a : class_list) {
            System.out.println(a.get_Student_name());
        }
    }
}
