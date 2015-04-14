package serialization;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DataObject obj = new DataObject();
		obj.setMyData("set information in myData");
		File file = new File("store.txt");
		
//		FileInputStream fi = new FileInputStream(file);
//		ObjectInputStream si = new ObjectInputStream(fi);
//		DataObject objNew = (DataObject) si.readObject();
//		si.close();
//		System.out.println(objNew.getMyData());
		
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream so = new ObjectOutputStream(fo);
		
		so.writeObject(obj);
		so.flush();
		so.close();
	}

}
