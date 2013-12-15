package Hostel21;



import java.io.Serializable;

import java.util.*;

import org.w3c.dom.NodeList;

/**
 *
 * @author 
 */
public class HostelModel implements Serializable {
    
    private String hostelid;
    private String hostelname;
    private String street;
    private String city;
    private String state;
    private int postalcode;
    private String country;
    private String phone;
    private String email;
    private String facebook;
    private String web;
    private String checkintime;
    private String checkouttime;
    private String smoking;
    private String alcohol;
    private int cancellationdeadline;
    private String cancellationpenalty;
    
    private NodeList availability;

    /**
     * @return the hostelid
     */
    public String getHostelid() {
        return hostelid;
    }

    /**
     * @param hostelid the hostelid to set
     */
    public void setHostelid(String hostelid) {
        this.hostelid = hostelid;
    }

    /**
     * @return the hostelname
     */
    public String getHostelname() {
        return hostelname;
    }

    /**
     * @param hostelname the hostelname to set
     */
    public void setHostelname(String hostelname) {
        this.hostelname = hostelname;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.hostelid);
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
        final HostelModel other = (HostelModel) obj;
        if (!Objects.equals(this.hostelid, other.hostelid)) {
            return false;
        }
        return true;
    }
    
   

//    @Override
//    public int compareTo(HostelModel o) {
//       if(date-o.date<0)
//           return -1;
//       else if(date==o.date)
//               return Integer.parseInt(hostelid)-Integer.parseInt(o.hostelid);
//       else return 1;
//    }

	public void setStreet(String street) {
		// TODO Auto-generated method stub
		this.street=street;
	}
	 public String getStreet() {
	        return street;
	    }

	public void setCancellationPenalty(String cancellationpenalty) {
		// TODO Auto-generated method stub
		this.cancellationpenalty=cancellationpenalty;
	}
	 public String getPenalty() {
	        return cancellationpenalty;
	    }
	public void setAlcohol(String alcohol) {
		// TODO Auto-generated method stub
		this.alcohol=alcohol;
	}
	 public String getAlcohol() {
	        return alcohol;
	    }
	public void setCancellationDeadline(int cancellationdeadline) {
		// TODO Auto-generated method stub
		this.cancellationdeadline=cancellationdeadline;
	}
	 public int getDeadline() {
	        return cancellationdeadline;
	    }
	public void setSmoking(String smoking) {
		// TODO Auto-generated method stub
		this.smoking=smoking;
	}
	 public String getSmoking() {
	        return smoking;
	    }
	public void setCheckOutTime(String checkouttime) {
		// TODO Auto-generated method stub
		this.checkouttime=checkouttime;
	}
	 public String getCheckOutTime() {
	        return checkouttime;
	    }
	public void setCheckInTime(String checkintime) {
		// TODO Auto-generated method stub
		this.checkintime=checkintime;
	}
	 public String getCheckInTime() {
	        return checkintime;
	    }
	public void setCity(String city) {
		// TODO Auto-generated method stub
		this.city=city;
	}
	 public String getCity() {
	        return city;
	    }
	public void setState(String state1) {
		// TODO Auto-generated method stub
		this.state=state1;
	}
	 public String getState() {
	        return state;
	    }
	public void setPostalCode(int postalcode) {
		// TODO Auto-generated method stub
		this.postalcode=postalcode;
	}
	 public int getCode() {
	        return postalcode;
	    }
	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country=country;
	}
	 public String getCountry() {
	        return country;
	    }
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		this.phone=phone;
	}
	 public String getPhone() {
	        return phone;
	    }
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
	}
	 public String getEmail() {
	        return email;
	    }
	public void setFacebook(String facebook1) {
		// TODO Auto-generated method stub
		this.facebook=facebook1;
	}
	 public String getFb() {
	        return facebook;
	    }
	public void setWeb(String web1) {
		// TODO Auto-generated method stub
		this.web=web1;
	}
	 public String getWeb() {
	        return web;
	    }
	public void setAvailability(NodeList nlist1) {
		// TODO Auto-generated method stub
		this.availability=nlist1;
		
	}
	 public NodeList getAvailability() {
	        return availability;
	    }
	 @Override
	    public String toString(){
	        return "Hostel id: "+hostelid+", "+"Hostel branch name: "+hostelname+", "+"Street: "+street+",  "+"City: "+city+", "+"State: "+state+", "+"postal code: "+postalcode
	        		+", "+"Country:"+ country+", "+ "phone:"+phone+", "+"email:"+email+", "+ "facebook:"+facebook+", "+"web:"+web+","+"Check In time:"+
	        		checkintime+", "+"Check Out Time:"+checkouttime+", "+ "Smoking:"+ smoking+", "+"alcohol:"+ alcohol+", "+ "Cancellation Deadline:"
	        		+cancellationdeadline+", "+"Availability:"+ availability;
	    }

//	@Override
//	public int compareTo(HostelModel o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
    
}
