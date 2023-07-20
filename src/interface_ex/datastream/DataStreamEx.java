package interface_ex.datastream;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) throws IOException {
        // ghi file
        FileOutputStream fout = null;
        DataOutputStream dos = null;
        try{
            fout = new FileOutputStream("src/interface_ex/datastream/DataStreamEx.txt");
            dos = new DataOutputStream(fout);

            dos.writeInt(1);

        } catch (Exception e){
            System.out.println(e);
        } finally {
            dos.close();
        }

        // đọc file
        FileInputStream fin = null;
        DataInputStream dis = null;
        try{
            fin = new FileInputStream("src/interface_ex/datastream/DataStreamEx.txt");
            dis = new DataInputStream(fin);

            int i = dis.readInt();
            System.out.println(i);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            dis.close();
        }
    }
}
