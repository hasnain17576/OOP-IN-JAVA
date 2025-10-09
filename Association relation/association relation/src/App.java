public class App {
    public static void main(String[] args) throws Exception {
     Faculty f1 = new Faculty("ali","MSCS");

        Course [] c = new Course[2];
        c[0]= new Course("OOP", f1);
         c[1]= new Course("PF", f1);
        f1.set_course_list(c);
        f1.view_teacher();

        Student [] s= new Student[3];
        s[0]= new Student("abc", "fa24-bse000", c);
        s[1]= new Student("xyz", "fa24-bse001", c);
        s[2]= new Student("rrrrrr", "fa24-bse003", c);


        s[0].display_Student_info();

        c[0].set_Student_list(s);
        c[0].show_class_Students();
    }
}
