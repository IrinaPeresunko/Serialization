package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i=5;
	private String s="test";
	private transient String[] mas={"aaa","bbb","ccc"};
	CustomObject co;
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeObject(getMyData());
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		setMyData((String) in.readObject());
	}

}
