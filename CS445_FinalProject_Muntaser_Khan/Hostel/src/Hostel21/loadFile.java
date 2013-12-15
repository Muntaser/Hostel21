package Hostel21;



import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;




public class loadFile {
//private
	public loadFile(){
		
	}
	
	public void loadFromFile(String fileName){
		 List list=null; 

		 final File file = new File(fileName);
		 HostelDM hostel=new HostelDMSerImpl();
		 Availability a=new AvailabilityImpl();
		 try{
			 if(file.exists()){
				 
				 
				 DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			     DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			     Document doc=dBuilder.parse(file);
			     
			     NodeList nlist= doc.getElementsByTagName("hostel");
			     for(int temp=0;temp<nlist.getLength();temp++){
			    	Node nNode=nlist.item(temp);
			    	HostelModel model=new HostelModel();
			    	if(nNode.getNodeType()==Node.ELEMENT_NODE){
			    		Element eElement=(Element)nNode;
			    		String name=eElement.getElementsByTagName("name").item(0).getTextContent();
			    		//String address=eElement.getElementsByTagName("address").item(0).getTextContent();
			    		String street=eElement.getElementsByTagName("street").item(0).getTextContent();
			    		String city=eElement.getElementsByTagName("city").item(0).getTextContent();
			    		String state=eElement.getElementsByTagName("state").item(0).getTextContent();
			    		int postalcode=Integer.parseInt(eElement.getElementsByTagName("postal_code").item(0).getTextContent());
			    		String country=eElement.getElementsByTagName("country").item(0).getTextContent();
			    		
			    		String phone=eElement.getElementsByTagName("phone").item(0).getTextContent();
			    		String email=eElement.getElementsByTagName("email").item(0).getTextContent();
			    		String facebook=eElement.getElementsByTagName("facebook").item(0).getTextContent();
			    		String web=eElement.getElementsByTagName("web").item(0).getTextContent();
			    		
			    		String checkintime=eElement.getElementsByTagName("check_in_time").item(0).getTextContent();
			    		String checkouttime=eElement.getElementsByTagName("check_out_time").item(0).getTextContent();
			    		String smoking=eElement.getElementsByTagName("smoking").item(0).getTextContent();
			    		String alcohol=eElement.getElementsByTagName("alcohol").item(0).getTextContent();
			    		int cancellationdeadline=Integer.parseInt(eElement.getElementsByTagName("cancellation_deadline").item(0).getTextContent());
			    		String cancellationpenalty=eElement.getElementsByTagName("cancellation_penalty").item(0).getTextContent();
			    		
			    		NodeList nlist1= doc.getElementsByTagName("availability");
			    		  for(int temp1=0;temp1<nlist1.getLength();temp1++){
						    	Node nNode1=nlist1.item(temp1);
						    	AvailabilityModel model1=new AvailabilityModel();
						    	if(nNode1.getNodeType()==Node.ELEMENT_NODE){
			    		long date=Long.parseLong(eElement.getElementsByTagName("date").item(0).getTextContent());
			    		int room=Integer.parseInt(eElement.getElementsByTagName("room").item(0).getTextContent());
			    		int bed=Integer.parseInt(eElement.getElementsByTagName("bed").item(0).getTextContent());
			    		int price=Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent());

			    		model1.setDate(date);
			    		model1.setRoom(room);
			    		model1.setBed(bed);
			    		model1.setPrice(price);
			    		
			    		a.create(model1);
			    		System.out.println(model1.toString());
						    	}
			    		
			    		model.setHostelname(name);
			    		model.setStreet(street);
			    		model.setCity(city);
			    		model.setState(state);
			    		model.setPostalCode(postalcode);
			    		model.setCountry(country);
			    		model.setPhone(phone);
			    		model.setEmail(email);
			    		model.setFacebook(facebook);
			    		model.setWeb(web);
			    		model.setCheckInTime(checkintime);
			    		model.setCheckOutTime(checkouttime);
			    		model.setSmoking(smoking);
			    		model.setAlcohol(alcohol);
			    		model.setCancellationDeadline(cancellationdeadline);
			    		model.setCancellationPenalty(cancellationpenalty);
			    		model.setAvailability(nlist1);
			    		
			    		
			    		hostel.create(model);
			    		System.out.println(model.toString());
			    	}	
			    }
			 }
			 }
		 }catch(Exception e){
			 
			 e.printStackTrace();
		 }
	}

}
