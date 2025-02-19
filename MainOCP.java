public class MainOCP {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator() ;
        Shape rectangle = new rectangle(6,10);
        Shape circle = new circle(5);
        Shape ellipse = new ellipse(4,8);

        System.out.println("rectangle area ="+ calculator.calculateArea(rectangle));
        System.out.println("circle area ="+ calculator.calculateArea(circle));
        System.out.println("ellipse area ="+ calculator.calculateArea(ellipse));


    }
}
