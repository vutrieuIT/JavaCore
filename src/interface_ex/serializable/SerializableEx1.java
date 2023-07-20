package interface_ex.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/interface_ex/SerializableEx.dat");
        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fin);

        Person person = (Person) ois.readObject();

        System.out.println("person is deserialization");
        System.out.println(person);

        ois.close();
    }
}
