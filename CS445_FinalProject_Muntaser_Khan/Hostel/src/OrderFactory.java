



public class OrderFactory {

	public static Order getOrder(){
		return new OrderCMImpl();
	}
}
