package Hostel21;



import java.io.Serializable;
import java.util.*;



/**
 *
 * @author 
 */
public class UserModel implements Serializable{
    private String uuid;//user id
    private String name;
    
    //user name
    private String pwd;// password
    private String email;
    private String address;
    private String creditCard;
    


  
	public String getEmail() {
		return email;
	}

	public void setEmail(String email1) {
		this.email = email1;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address1) {
		this.address = address1;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	/**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid1) {
        this.uuid = uuid1;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name1) {
        this.name = name1;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.uuid);
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
        final UserModel other = (UserModel) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        return true;
    }
    public String toString(){
        return "User id: "+uuid +"\n "+"Username: "+name+"\n "+"Email: "+email;
    }

	
}
 
