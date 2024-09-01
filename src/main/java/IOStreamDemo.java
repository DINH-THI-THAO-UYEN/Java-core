import com.vti.Account;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
// Các chức năng của IOStream
        // Đơn vị nhỏ nhất là bit (0 hoặc 1), trong đọc ghi file thì sẽ có từng byte một
        // Muốn đọc hết các file thì phải chuyển từng bit sang
        // Nhưng với số lượng nhiều quá thì phải đọc thành từng byte

        String path = "src/main/resources/abc.txt";

        String text = "high.score=1000";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        IOManager.writeByte(path, bytes, true);
        IOManager.writeByte(path, bytes, true);
        IOManager.writeByte(path, bytes, false);

        byte[] result = IOManager.readBytes(path);
        String content = new String(result, StandardCharsets.UTF_8);
        System.out.println(content);
        System.out.println("high.score = " + content.split("=")[1]);

        Account account = new Account(
                1,
                "Đinh Thị Thảo Uyên",
                "uyen.nv",
                "123456!@#"
        );
        IOManager.writeObject(path, account, false);

        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println(savedAccount);
    }

}
