


import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author 
 */
public class OrderCMImpl implements Order {
    private static final String FILE_NAME = "order.txt";
    @Override
    public boolean create(OrderModel order) {
    	UidDM DM = UidDMFactory.getUidDM();
		int uid = DM.getNextUid(UidModelEnum.ORDER);
		List<OrderModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		
	
		for (OrderModel model:list){
			if (model.getOrderid().equals(order.getOrderid())){
			
				return false;
			}
		}
		order.setOrderid(String.valueOf(uid));
		list.add(order);
		
		ReadWriteFile.write2File(list, FILE_NAME);
		
		return true;
    }

    @Override
    public boolean delete(String orderid) {
       List<OrderModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final OrderModel model = list.get(i);
			if (model.getOrderid().equals(orderid)){
				list.remove(i);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
                System.out.println(list);
		return false;
    }

    @Override
    public boolean update(OrderModel order) {
       List<OrderModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		
		for (int i=0;i<list.size();i++){
			final OrderModel model = list.get(i);
			if (model.getOrderid().equals(order.getOrderid())){
			
				list.set(i, order);
			
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		
		return false;
    }

    @Override
    public List<OrderModel> getAll() {
        return ReadWriteFile.readFromFile(FILE_NAME);
    }

    @Override
    public OrderModel getSingle(String orderid) {
        List<OrderModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (OrderModel model:list){
			if (model.getOrderid().equals(orderid)){
				return model;
			}
		}
		return null;
    }

    @Override
    public List<OrderModel> getByCondition(OrderQueryModel tqm) {
        List<OrderModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		List<OrderModel> ret = new ArrayList<OrderModel>();
		for (OrderModel model:list){
			if (tqm.getOrderid()!=null&&tqm.getOrderid().trim().length()>0){
				if (!tqm.getOrderid().equals(model.getOrderid())){
					continue;
				}
			}
			if (tqm.getHostelid()!=null&&tqm.getHostelid().trim().length()>0){
				if (!tqm.getHostelid().equals(model.getHostelid())){
					continue;
				}
			}
			if (tqm.getUserid()!=null&&tqm.getUserid().trim().length()>0){
				if (!tqm.getUserid().equals(model.getUserid())){
					continue;
				}
			}
			if (tqm.getDateCreate()>0){
			
				if (model.getDateCreate()<tqm.getDateCreate()){
					continue;
				}
			}
			if (tqm.getDateCreate2()>0){
				
				if (model.getDateCreate()>tqm.getDateCreate2()){
					continue;
				}
			}
			if (tqm.getQuantity()>0){
				
				if (model.getQuantity()!=tqm.getQuantity()){
					continue;
				}
			}
			
			if (tqm.getStatus()>0){
				if (tqm.getStatus()!=model.getStatus()){
					continue;
				}
			}
			
			if (tqm.getTotal()>0){
			
				if (model.getTotal()!=tqm.getTotal()){
					continue;
				}
			}
			
			if (tqm.getUnitprice()>0){
			
				if (model.getUnitprice()!=tqm.getUnitprice()){
					continue;
				}
			}
			ret.add(model);
		}
		
		
		return ret;
    }
    
   
    public static void main(String[] args) {
		Order mainDM = new OrderCMImpl();
		
                OrderModel order=new OrderModel();
                order.setOrderid("1");
                order.setDateCreate(20130404);
                order.setUserid("1");
                order.setStatus(1);
                mainDM.create(order);
		System.out.println(mainDM.getAll());
		
	}

}
