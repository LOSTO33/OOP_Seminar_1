public class Circle implements figure{
    int radius;
 
    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}