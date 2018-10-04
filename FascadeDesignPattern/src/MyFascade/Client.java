package MyFascade;

public class Client 
{
public static void main (String args[])
{
	OrderFascade of = new OrderFascade();
	of.placeOrder("OR12345");
	System.out.println("Order Processing Completed");
}
}
