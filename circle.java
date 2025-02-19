public class circle extends Shape {
    private double radius ;
    public circle
            (double radius){
        this.radius = radius ;

    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
