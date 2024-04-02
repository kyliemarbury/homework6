public class OrderTester {
    public static void main(String[] args)
    {
        OrderQueue o1 = new OrderQueue(14); 
        o1.new_order("reyna", "april", 5);
        o1.new_order("fade", "april", 5);
        o1.new_order("clove", "april", 8);
        System.out.println(o1);
        o1.remaining_stock();
        System.out.println(o1);
        o1.more_stock(10);
        o1.new_order("omen", "april", 3);
        o1.new_order("sky", "april", 3);
        o1.new_order("sage", "april", 5);
        o1.remaining_stock();
        System.out.println(o1);
    }
}
