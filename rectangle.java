public class rectangle extends Shape {
    private double width , height ;

    public rectangle(double width , double height ){
     this.height = height ;
     this.width = width ;

    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
