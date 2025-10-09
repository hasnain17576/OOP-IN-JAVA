public class Student {
    private String name;
    private LibraryCard libraryCard; // association ho rhi ahis aus main 
    

    Student(String name,LibraryCard libraryCard){
        this.name=name;
        this.libraryCard=libraryCard;
    }
    public void displayInfo(){
        System.out.println("Student::"+name);
        System.out.println("LibraryCard Number::"+libraryCard.getCardNumber());
    }
}
