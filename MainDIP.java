public class MainDIP {
    public static void main(String[] args) {
        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        orderProcessor.processOrder(order);

    }
}