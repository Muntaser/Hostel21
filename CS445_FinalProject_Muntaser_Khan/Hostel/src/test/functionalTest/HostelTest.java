package test.functionalTest;



import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import Hostel21.*;


public class HostelTest {
	  Node root = null;
	    int length = 0;
	    

	public static void main(String[] args){
		
		HostelDM DM=new HostelDMSerImplTest();
		HostelModel first=new HostelModel();
		first.setHostelname("Hostel 21-Romantic");

	
		 
		AvailabilityModel model1=new AvailabilityModel();
		model1.setDate(20140701);
		model1.setRoom(1);
		model1.setBed(1);
		model1.setPrice(10);
		//AvailabilityNode an=new AvailabilityNode(model1);
		
		first.setCity("San Francisco");
		first.setCountry("USA");
		first.setEmail("romantic@hostel.com");
		first.setWeb("romantic.hostel.com");	
		first.setFacebook("hostel21-romantic");
		first.setSmoking("N");
		first.setAlcohol("N");
		first.setPhone("+1-555-555-5555");
		first.setState("California");
		first.setStreet("425 clay street");
		first.setPostalCode(94111);
		//first.setAvailability(nlist1);
		first.setCancellationDeadline(48);
		first.setCancellationPenalty("75%");
		first.setCheckInTime("14:00");
		first.setCheckOutTime("11:00");
		//first.setAvailability(nlist1);
		DM.create(first);
		List<HostelModel> list=DM.getAll();
		System.out.println("1.test getAll() method---");
		for(HostelModel model:list){
			System.out.println(model.toString());
		}
	    
		System.out.println("\n2.test getSingle() method---");
		String uuid=first.getHostelid();
		HostelModel model=DM.getSingle(uuid);
		System.out.println(model.toString());
		
		System.out.println("\n3.test create() method---");
		
		model.setAlcohol("Y");
		model.setSmoking("Y");
		model.setHostelname("Hostel 21-Romantic");
		System.out.println(DM.create(model)+": the Hostel has exist");
		
		System.out.println("\n4.test getByCondition() method---");
		
		HostelQueryModel uqm=new HostelQueryModel();
		uqm.setHostelid("123");
		List<HostelModel> model1ist=DM.getByCondition(uqm);
		for(HostelModel j:model1ist){
		
			System.out.println(j.toString());
		}
		
		System.out.println("\n5.test update() method---");
		model.setHostelname("Hostel 21-Romantic");
		DM.update(model);
		System.out.println(model.toString()+", ");
		
		System.out.println("\n6.test delete() method---");
		
		System.out.println(DM.delete("26")+" the Hostel does not exist");
	}


	}


