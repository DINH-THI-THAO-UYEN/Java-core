import java.io.*;

public class IOManager {

    public static void writeByte(String path, byte[] bytes, boolean append) throws IOException {

        //FileOutputStream fos = new FileOutputStream(path, append);
        // Biến path, đc đọc bằng byte, kiểu trả về đúng hoặc sau
        //fos.close();

        try (
                FileOutputStream fos = new FileOutputStream(path, append);
                ){
//        } catch (Exception e) {
//            throw new RuntimeException(e);
            fos.write(bytes);
       }
    }

    public static byte[] readBytes(String path) throws IOException {
        try (
                FileInputStream fis = new FileInputStream(path);
        ) {
            return fis.readAllBytes();
        }
    }

    public static void writeObject(
            String path, Object object, boolean append
    ) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(String path)
            throws IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return ois.readObject();
        }
    }
}
