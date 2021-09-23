package utils;

import models.Facility;

import java.io.*;
import java.util.Collection;
import java.util.Map;

public class ReadAndWrite {
    public static void write(Collection collection, String diaChi) {
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
    public static Object read(String diaChi){
        FileInputStream fis=null;
        ObjectInputStream ois= null;

        Object object=null;

        try {
            fis=new FileInputStream(diaChi);
            ois=new ObjectInputStream(fis);

            object =ois.readObject();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
