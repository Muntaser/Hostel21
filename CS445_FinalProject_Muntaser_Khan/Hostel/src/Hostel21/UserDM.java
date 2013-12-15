package Hostel21;




import java.util.List;

/**
 *
 * @author 
 */
public interface UserDM {
   /*
    * create user
    * if uuid has existed, return false
    * @param user
    * @return
    */
    public boolean create(UserModel user);
    
    /*
     * update user
     * if uuid has not existed, return false
     * @param user
     * @return
     */
    public boolean update(UserModel user);
    /*
     * delete user
     * if uuid exists, delete and return true
     * if does not, return false
     * @param user
     * @return
     */
    public boolean delete(String uuid);
    /*
     * get all users
     * @return
     */
    public List<UserModel>getAll();
    /*
     * get single user through uuid
     * if uuid exists, return it, if does not, return null
     * @para uuid
     * @return
     */
    public UserModel getSingle(String uuid);
    /*
     * uuid->exact search
     * name->fuzzy search
     * type->exact search
     */
    public List<UserModel>getByCondition(UserQueryModel uqm);
    
    public UserModel getUserByName(String name);
    public boolean isOwner(String name, String password);
}
