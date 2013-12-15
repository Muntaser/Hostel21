package Hostel21;





	import java.io.Serializable;
	import java.util.*;



	/**
	 *
	 * @author 
	 */
	public class SearchModel implements Serializable{
	    private String searchid;//user id
	 

		/**
	     * @return the uuid
	     */
	    public String getSearchid() {
	        return searchid;
	    }

	    /**
	     * @param uuid the uuid to set
	     */
	    public void setSearchid(String Searchid) {
	        this.searchid = searchid;
	    }

	    /**
	     * @return the name
	     */
	

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 97 * hash + Objects.hashCode(this.searchid);
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
	        final SearchModel other = (SearchModel) obj;
	        if (!Objects.equals(this.searchid, other.searchid)) {
	            return false;
	        }
	        return true;
	    }
	    public String toString(){
	        return "Search id: "+searchid ;
	    }
	
	 

}
