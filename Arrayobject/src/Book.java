class Book{
    String title;
    String author;
    Bool(String title, String author){
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println("title::"+title+"author::"+author)
    }
}