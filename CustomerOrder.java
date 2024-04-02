public class CustomerOrder{
    public String name;
    public String date; 
    public int quantity;

    public CustomerOrder()
    {
        this.name = "";
        this.date = "";
        this.quantity = 0;
    }
    public CustomerOrder(String name, String date, int quantity)
    {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }
    public void ship()
    {
        if (quantity > 0) // to make sure quantity isn't negative!
        {
            quantity--;
        }
    }
}