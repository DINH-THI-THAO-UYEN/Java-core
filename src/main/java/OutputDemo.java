import java.util.Locale;

public class OutputDemo {
    public static void main (String[] args){
        //System.out.print   ko tự xuống dòng
        //System.out.println tự xuống dòng
        //Escape character
        // \n xuống dòng
        // \t tab

        System.out.print("\"Java\" Core\n");
        System.out.println("\"Java\" Core");
        // System.out.printf
        // %d: Số nguyên (byte, short, int, long)
        // %f: Số thực (float, double)
        // %s: String
        // %c: kí tự (char)
        // %n: Xuống dòng
        String name = "Uyen";
        int age = 30;
        System.out.println("Tên của bạn là: " + name + ",tuổi của bạn là: " + age);
        System.out.printf("Tên của bạn là: %s, tuổi của bạn là : %d%n", name, age);
        System.out.printf("| %8s |%n", "abc");  // in trc ký tự abc, bao gồm cả abc là 8 ký tự
        System.out.printf("| %-8s |%n", "abcdefghiklmnouq"); // số ký tự nhiều hơn 8 nên chỉ cần
        System.out.printf("| %-8s |%n", "abc"); // in vào sau khoảng trống cho đủ 8 ký tự

        // Làm tròn số
        System.out.printf("PI = %.3f%n", 3.1415);
        //Nhóm 3 số
        System.out.printf(Locale.ITALY, "Money = %,d%n", 1234560000);
        System.out.printf(Locale.CHINA, "Money = %,d%n", 1234560000);
        System.out.printf(Locale.JAPAN, "Money = %,d%n", 1234560000);
        System.out.printf(new Locale("vi"),"Money = %,d%n", 1234560000);

        //In hoa: %S , %C
        System.out.printf("Tên: %S%n", "uyen");


    }
}
