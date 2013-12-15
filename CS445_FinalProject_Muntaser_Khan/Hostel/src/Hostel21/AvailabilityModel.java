package Hostel21;


	import java.io.Serializable;

	import java.util.*;

	import org.w3c.dom.NodeList;
public class AvailabilityModel  implements Serializable, Comparable<AvailabilityModel>{
	
	    private String availabilityid;
	    private int room;
	    private int bed;
	    private float price;
	    private long date;

//	    public AvailabilityModel(AvailabilityModel a1) {
//			// TODO Auto-generated constructor stub
//	    	availabilityid=a1.availabilityid;
//	    	room=a1.room;
//	    	bed=a1.bed;
//	    	price=a1.price;
//	    	date=a1.date;
//		}

		/**
	     * @return the Availabilityid
	     */
	    public String getAvailabilityid() {
	        return availabilityid;
	    }

	    /**
	     * @param Availabilityid the Availabilityid to set
	     */
	    public void setAvailabilityid(String Availabilityid) {
	        this.availabilityid = Availabilityid;
	    }


	    public int getBed() {
	        return bed;
	    }
	
	    /**
	     * @param seats the seats to set
	     */
	    public void setBed(int bed) {
	        this.bed = bed;
	    }
	
	    /**
	     * @return the date
	     */
	    public long getDate() {
	        return date;
	    }
	
	    /**
	     * @param date the date to set
	     */
	    public void setDate(long date) {
	        this.date = date;
	    }
	

	    public float getPrice() {
	        return price;
	    }


	    public void setPrice(float price) {
	        this.price = price;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 37 * hash + Objects.hashCode(this.availabilityid);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final AvailabilityModel other = (AvailabilityModel) obj;
	        if (!Objects.equals(this.availabilityid, other.availabilityid)) {
	            return false;
	        }
	        return true;
	    }
	    
	   

	    @Override
	    public int compareTo(AvailabilityModel o) {
	       if(date-o.date<0)
	           return -1;
	       else if(date==o.date)
	               return Integer.parseInt(availabilityid)-Integer.parseInt(o.availabilityid);
	       else return 1;
	    }



	    public int getRoom() {
	        return room;
	    }
	    
	


	public void setRoom(int room) {
		// TODO Auto-generated method stub
		this.room=room;
	}


	 @Override
	    public String toString(){
	       return "Availability ID:"+ availabilityid+","+"Date:"+ date+ ","+ "Room ID:"+ room+","+ "Bed ID:"+ bed + ","+"Price:"+ price;
	    }

}
