
public class Rectangle implements figure {
    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(length+width);
    }
   
}
