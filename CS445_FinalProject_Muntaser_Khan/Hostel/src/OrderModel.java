


import java.io.Serializable;
import java.util.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Amanda
 */
public class OrderModel implements Serializable,Comparable<OrderModel> {
    private String orderid;
    private long dateCreate;
    private String userid;
    private String hostelid;
    private int quantity;
    private float unitprice;
    private float total;
    private int status;
    private String email;
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getHostelid() {
		return hostelid;
	}

	public void setHostelid(String hostelid) {
		this.hostelid = hostelid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}

    /**
     * @return the orderid
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * @param orderid the orderid to set
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * @return the dateCreate
     */
    public long getDateCreate() {
        return dateCreate;
    }

    /**
     * @param dateCreate the dateCreate to set
     */
    public void setDateCreate(long dateCreate) {
        this.dateCreate = dateCreate;
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.orderid);
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
        final OrderModel other = (OrderModel) obj;
        if (!Objects.equals(this.orderid, other.orderid)) {
            return false;
        }
        return true;
    }
  @Override
	public String toString(){
		
		if(status==1){
		return "OrderID: "+orderid+", "+"UserID: "+userid+", "+"HostelID: "+hostelid+", "+"OrderCreateDate: "+dateCreate+", "+"status: "+"order completed";
		}else{
			return "OrderID: "+orderid+", "+"UserID: "+userid+", "+"HostelID: "+hostelid+", "+"OrderCreateDate: "+dateCreate+", "+"status: "+"order cancelled";	
		}
	}
  @Override
	public int compareTo(OrderModel o) {
	  if(dateCreate-o.dateCreate<0)
          return -1;
      else if(dateCreate==o.dateCreate)
              return Integer.parseInt(orderid)-Integer.parseInt(o.orderid);
      else return 1;
	}
}
