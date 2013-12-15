package test.functionalTest;



import java.util.List;

import Hostel21.*;

public class UserTest {
	
	public static void main(String[] args){
		UserDM dao=new UserDMSerImplTest();
		UserModel first=new UserModel();
		first.setName("Subash Luitel");
		first.setPwd("123");
		first.setEmail("sluitel@iit.edu");
		dao.create(first);
		List<UserModel> list=dao.getAll();
		System.out.println("1.test getAll() method---");
		for(UserModel model:list){
			System.out.println(model.toString());
		}
	    
		System.out.println("\n2.test getSingle() method---");
		String uuid=first.getUuid();
		UserModel model=dao.getSingle(uuid);
		System.out.println(model.toString());
		
		System.out.println("\n3.test create() method---");
		
		model.setAddress("315 S Michigan Ave");
		model.setCreditCard("12345");
		model.setName("Li");
		model.setEmail("hua@iit.edu");
		System.out.println(dao.create(model)+": the user has exist");
		
		System.out.println("\n4.test getByCondition() method---");
		
		UserQueryModel uqm=new UserQueryModel();
		uqm.setName("Subash Luitel");
		List<UserModel> model1ist=dao.getByCondition(uqm);
		for(UserModel j:model1ist){
		
			System.out.println(j.toString());
		}
		
		System.out.println("\n5.test update() method---");
		model.setAddress("888 king drive");
		dao.update(model);
		System.out.println(model.toString()+", "+model.getAddress().toString());
		
		System.out.println("\n6.test delete() method---");
		
		System.out.println(dao.delete("26"));
	}

}
