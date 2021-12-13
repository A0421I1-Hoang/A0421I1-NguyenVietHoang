import java.io.*;
import java.util.Collection;

public class DocVaGhi {
    public static void ghi(Collection collection, String diaChi) {
        File file =new File(diaChi);

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos =null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(collection);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static Object doc(String diaChi){
        FileInputStream fis=null;
        ObjectInputStream ois= null;

        Object object=null;

        try {
            fis=new FileInputStream(diaChi);
            ois=new ObjectInputStream(fis);

            object =ois.readObject();
            fis.close();
            ois.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
