package test.functionalTest;


import java.util.List;

import Hostel21.*;

public class OrderTest {
	
	public static void main(String[] args){
		Order dao=new OrderCMImplTest();
		OrderModel first=new OrderModel();
		first.setTotal(20);
		first.setHostelid("123");
		first.setEmail("ccv@iit.edu");
		dao.create(first);
		List<OrderModel> list=dao.getAll();
		System.out.println("1.test getAll() method---");
		for(OrderModel model:list){
			System.out.println(model.toString());
		}
	    
		System.out.println("\n2.test getSingle() method---");
		String uuid=first.getOrderid();
		OrderModel model=dao.getSingle(uuid);
		System.out.println(model.toString());
		
		System.out.println("\n3.test create() method---");
		
		model.setDateCreate(20130405);
		model.setUnitprice(20);
		model.setEmail("ccv@iit.edu");
		System.out.println(dao.create(model)+": the Order has exist");
		
		System.out.println("\n4.test getByCondition() method---");
		
		OrderQueryModel uqm=new OrderQueryModel();
		uqm.setHostelid("123");
		List<OrderModel> model1ist=dao.getByCondition(uqm);
		for(OrderModel j:model1ist){
		
			System.out.println(j.toString());
		}
		
		System.out.println("\n5.test update() method---");
		model.setEmail("888 king drive");
		dao.update(model);
		System.out.println(model.toString()+", ");
		
		System.out.println("\n6.test delete() method---");
		
		System.out.println(dao.delete("26")+" the order does not exist");
	}

	}


