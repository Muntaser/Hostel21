


	

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;

	

	public class ReadWriteFile {

		private ReadWriteFile(){	
		}
		public static List readFromFile(String fileName){
	                List list=null; 
			final File file = new File(fileName);
			if (file.exists()){

				ObjectInputStream input = null;
				try {
					input = new ObjectInputStream(new FileInputStream(fileName));

					list = (List) input.readObject();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
						if (input!=null){
							input.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}else{
				list = new ArrayList();
			}
			
			return list;
			
		}
		
		public static void write2File(List list,String fileName){
			ObjectOutputStream output = null;
			try {
				output = new ObjectOutputStream(new FileOutputStream(fileName));

				output.writeObject(list);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (output!=null){
						output.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


