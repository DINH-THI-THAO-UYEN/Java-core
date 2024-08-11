public class ArithmeticOperatorDemo {
    public static void main(String[] args){
        int a =100;
        int b = 10;

        // +, -,*, / chia ra số kiểu dữ liệu lớn hơn. Cụ thể là số nguyên => số thực ,
        // %: chia ra số chữ số cuối. vd như 100245 % 100 => kết quả ra là 245
        int c1 = 100% 10;
        float c2 = 105 / 10;
        float c3 = 105.5f / 10;
        System.out.println("c1 = " + c1 );
        System.out.println("c2 = " + c2 );
        System.out.println("c3 = " + c3 );

        // += , -=, *=, /= , %=
        a += 10;
        System.out.println(" a = " + a);

        // ++b , giá trị của b đc gán vào d xong rồi cộng
        // với b =10 => b = b+1. Trc khi tăng b thì gán gtri d1 =b
        int d1 = b++;
        System.out.println(" d1 = " + d1 );



        //b++ là b đc cộng vào trc xong rồi mới đc gán.
        // với b=10 => b tăng lên 1 nên b =11
        // b = b +1 => d = b = 12, d bằng b sau khi tăng + 1
        int d2 = ++b;
        System.out.println(" d2 = " + d2 );

        //
    }
}
