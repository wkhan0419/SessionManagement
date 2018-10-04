package MyFascade;

public class OrderFascade 
{
private Payment pm = new Payment();
private Inventory iv = new Inventory();
public void placeOrder(String OrderId)
{
	String step1=iv.checkInventory(OrderId);
	String step2=pm.deductPaayment(OrderId);
	System.out.println("Following steps completed:" + step1  + " & " + step2);
}
}
