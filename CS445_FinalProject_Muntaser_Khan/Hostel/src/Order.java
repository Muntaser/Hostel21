




import java.util.List;

/**
 *
 * @author 
 */
public interface Order {
    
    public boolean create(OrderModel order);
    public boolean delete(String orderid);
    public boolean update(OrderModel  order);
    public List<OrderModel> getAll();
    public OrderModel getSingle(String orderid);
    public List<OrderModel> getByCondition(OrderQueryModel tqm);
    
    
}
