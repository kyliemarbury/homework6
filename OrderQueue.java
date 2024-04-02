public class OrderQueue {
    public LinkedQueue<CustomerOrder> queue = new LinkedQueue<CustomerOrder>();
    public int stock; 
    public int qsize;

    public OrderQueue()
    {
        this.stock = 0;
        this.qsize = 0;
    }
    public OrderQueue(int stock)
    {
        this.stock = stock; 
    }
    public void new_order(String name, String date, int quantity)
    {
        CustomerOrder new1 = new CustomerOrder(name, date, quantity);
        queue.enqueue(new1);
        qsize++;
    }
    public void more_stock(int stock)
    {
        this.stock += stock;
    }
    public void order1()
    {
        stock--;
        queue.getFront().ship(); // changed quantity by 1 
        if(queue.getFront().quantity == 0)
        {
            queue.dequeue();
        }
    }
    public void remaining_stock()
    {
        while(stock > 0)
        {
            order1();
        }
    }
    public String toString()
    {
        return " " + queue.getFront().quantity + " ";
    }

}
