package interface_ex.serializable;

import java.io.*;

// chuyển đối tượng thành chuỗi byte
public class SerializableEx {
    public static void main(String[] args) throws IOException {
        File file = new File("src/interface_ex/SerializableEx.dat");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout);

        Person person = new Person();
        person.setName("trieu");
        person.setAge(21);
        person.setAddress("TP.HCM");

        System.out.println("person before serialization");
        System.out.println(person);

        oos.writeObject(person);
        oos.close();

    }
}
