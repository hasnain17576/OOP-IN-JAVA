class Point{
    private int x;
    private int y;
    Point(){
        x=1;
        y=2;
    }

    Point(int a, int b) {
        int x = a;
        int y = b;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    public void display(){
        System.out.println("x coordinate="+x+"y coordinate="+y);
    }
    public void movePonit(int a, int b){
        x=x+a;
        y=y+b;
        System.out.println("x coordinate after moving"+x+"y coordinate after moving"+y);

    }
}