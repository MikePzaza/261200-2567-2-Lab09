public class Penguin implements Swimming{
    @Override
    public void walk(){
        System.out.println("Penguin is walk");
    }
    @Override
    public void swim(){
        System.out.println("Penguin is swim");
    }
}