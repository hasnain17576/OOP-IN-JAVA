public class Faculty {
    private String name;
    private String qualification;
    private Course[]Courselist;

    Faculty(String name, String qualifiaction){
        this.name=name;
        this.qualification=qualifiaction;
    }
    public void set_course_list(Course[]Courselist){
        this.Courselist=Courselist;

    }
    public void view_teacher(){
        System.out.println("the name of teacher is"+name);
        System.out.println("the name of the qualification is::"+qualification);
        System.out.println("the lsit of Course");
        for(Course a:Courselist){
            System.out.println(a.getCourse_name());
        }
    }
}
