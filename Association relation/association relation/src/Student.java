public class Student {
    private String name;
    private String reg_no;
    Course[] course_list;

    Student(String name, String reg_no, Course[] course_list) {
        this.name = name;
        this.reg_no = reg_no;
        this.course_list = course_list;
    }

    public void display_Student_info() {
        System.out.println("The name is: " + name);
        System.out.println("The reg is: " + reg_no);
        for (int i = 0; i < course_list.length; i++) {
            System.out.println("The course name is: " + course_list[i].getCourse_name());
        }
    }

    public String get_Student_name() {
        return name;
    }
}
