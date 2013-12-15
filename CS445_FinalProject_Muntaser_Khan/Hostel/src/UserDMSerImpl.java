



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class UserDMSerImpl implements UserDM {
  private static final String FILE_NAME = "User.txt";
    @Override
    public boolean create(UserModel user) {
        List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
        UidDM DM = UidDMFactory.getUidDM();
		int uid = DM.getNextUid(UidModelEnum.USER);
        for (UserModel model:list){
			if (model.getUuid().equals(user.getUuid())){
				return false;
			}
		}
        user.setUuid(String.valueOf(uid));
		list.add(user);
		
		ReadWriteFile.write2File(list, FILE_NAME);
		System.out.println(list);
		return true;
        
    }
        

    @Override
    public boolean update(UserModel user) {
        List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		
		for (int i=0;i<list.size();i++){
			final UserModel model = list.get(i);
			if (model.getUuid().equals(user.getUuid())){
				//替换
				list.set(i, user);
			
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		
		return false;
    }

    @Override
    public boolean delete(String uuid) {
        List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final UserModel model = list.get(i);
			if (model.getUuid().equals(uuid)){
				list.remove(i);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		return false;
    }

    @Override
    public List<UserModel> getAll() {
        return ReadWriteFile.readFromFile(FILE_NAME);
    }

    @Override
    public UserModel getSingle(String uuid) {
        List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (UserModel model:list){
			if (model.getUuid().equals(uuid)){
				return model;
			}
		}
		return null;
    }

    @Override
	public List<UserModel> getByCondition(UserQueryModel uqm) {
		List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		List<UserModel> ret = new ArrayList<UserModel>();
		for (UserModel model:list){			
			if (uqm.getUuid()!=null&&uqm.getUuid().trim().length()>0){
				if (!uqm.getUuid().equals(model.getUuid())){
					continue;
				}
			}
			if (uqm.getName()!=null&&uqm.getName().trim().length()>0){
				if (model.getName().indexOf(uqm.getName())==-1){
					continue;
				}
			}
		
			if (uqm.getAddress()!=null&&uqm.getAddress().trim().length()>0){
				if (!uqm.getAddress().equals(model.getAddress())){
					continue;
				}
			}
			if (uqm.getEmail()!=null&&uqm.getEmail().trim().length()>0){
				if (!uqm.getEmail().equals(model.getEmail())){
					continue;
				}
			}
			
			if (uqm.getCreditCard()!=null&&uqm.getCreditCard().trim().length()>0){
				if (!uqm.getCreditCard().equals(model.getCreditCard())){
					continue;
				}
			}

			ret.add(model);
		}		
		return ret;
	}
    


    public static void main(String[] args){
        UserDM DM=new UserDMSerImpl();
        UserModel user=new UserModel();
        user.setUuid("4");
        user.setName("zach gilfanaski");
     
        user.setPwd("123");
        System.out.println(DM.create(user));
        System.out.println(DM.getAll());
        
    }


	@Override
	public UserModel getUserByName(String name) {
	    	List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			List<UserModel> users = this.getAll();
			for (UserModel user:users){
				if ((user.getName()).equals(name)){
					return user;
				}
			}
		return null;
	}
	
	@Override
	public UserModel getUserByEmail(String email) {
	    //	List<UserModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			List<UserModel> users = this.getAll();
			for (UserModel user:users){
				if ((user.getEmail()).equals(email)){
					return user;
				}
			}
		return null;
	}
	@Override
	public boolean isOwner(String name, String password){
		if(name.equals("Muntaser")&&(password.equals("123"))){
			return true;		
		}
		return false;
		
	}
    
}
