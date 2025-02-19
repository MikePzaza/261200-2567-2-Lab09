public class MainLSP_DIP {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Eagle  eagle   = new Eagle();
        ostrich.walk();
        ostrich.run();
        penguin.walk();
        penguin.swim();
        sparrow.walk();
        sparrow.fly();
        eagle.walk();
        eagle.fly();
    }
}