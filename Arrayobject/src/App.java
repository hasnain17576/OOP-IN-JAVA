public class App {
    public static void main(String[] args) throws Exception {
        Book[]book=new Book[3]
        Book[0]=new Book("java basics","james gosing");
         Book[1]=new Book("java effective ","Joshua bloach");
          Book[2]=new Book("clean code","Martin");
          for(Book b: books){
            b.display();
          }
    }
}
