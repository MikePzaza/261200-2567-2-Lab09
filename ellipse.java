public class ellipse extends Shape {
    private double majoraxis,minoraxis ;

    public ellipse
            (double majoraxis , double minoraxis ){
        this.majoraxis = majoraxis ;
        this.minoraxis = minoraxis ;

    }

    @Override
    public double calculateArea() {
        return Math.PI * this.majoraxis * this.minoraxis ;
    }
}
