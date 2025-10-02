public class App {
    public static void main(String[] args) throws Exception {
        Student[] students= {

            new Student("Ayesha",85),
             new Student("bibal",90),
              new Student("hina",78),
               new Student("omar",88),
               
        };
        int total=0;
        for(Student s:students){
            total+=s.marks;
        }
        double average=(double)total/students.length;
        System.out.println("Average Marks="+average);

    }
}
