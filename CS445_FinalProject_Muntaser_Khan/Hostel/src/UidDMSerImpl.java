


import java.util.List;



public class UidDMSerImpl implements UidDM {
	
	private static final String FILE_NAME= "UidModel.txt";

	@Override
	public int getNextUid(UidModelEnum model) {
		
		final String name = model.getName();
		
		List<UidModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		
		for(UidModel uidModel:list){
			if(uidModel.getModelName().equals(name)){
				final int uid = uidModel.getCurrentUid();
				uidModel.setCurrentUid(uid+1);
				ReadWriteFile.write2File(list, FILE_NAME);
				return uid+1;
			}
		}
		
		//if list=null
		final int uid = 1;
		UidModel uidModel = new UidModel();
		uidModel.setModelName(name);
		uidModel.setCurrentUid(uid);
		list.add(uidModel);
		ReadWriteFile.write2File(list, FILE_NAME);
		return uid;
		
	}
	
	public static void main(String[] args) {
		UidDM test = new UidDMSerImpl();
		System.out.println(test.getNextUid(UidModelEnum.USER));
		System.out.println(test.getNextUid(UidModelEnum.USER));
		System.out.println(test.getNextUid(UidModelEnum.USER));
		
	}

}
