public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){
        length=4;
        width=4;
    }
    Rectangle(int l,int w){
        length=l;
        width=w;
    }
    public void setLength(int l){
        length=l;

    }
    public void setWidth(int w){
        width=w;

    }
    public int getLenth(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int area(){
        return (length*width);
    }

}
