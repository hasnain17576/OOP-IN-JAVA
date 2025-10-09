public class App {
    public static void main(String[] args) throws Exception {
        Teacher teacher =new Teacher("MR DALA PRO MAX");
        teacher.addSubject(new Subject("dali"));
        teacher.addSubject(new Subject("Physics"));
        teacher.showSubject();
    }
}
