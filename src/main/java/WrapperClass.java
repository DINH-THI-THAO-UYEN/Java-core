public class WrapperClass {
    // Bao gồm bye, short, Integer
    // Có giá trị mặc định là null
    public static void main (String[] args){
        //byte    -> Byte
        //short   -> Short
        //int     -> Integer
        //long    -> long
        //float   -> Float
        //double  -> Double
        //boolean -> Boolean
        //char    -> Character
        //boxing : primive -> wrapper class  Chuyển kiểu dữ liệu nguyên thủy => ko nguyên thủy
        Integer a  = Integer.valueOf(100);

        //unboxing: wrapper class -.> primive
        // Chuyển từ kiểu ko nguyên thủy => kiểu nguyên thủy
        int b = a.intValue();

        // Chuyển chuỗi sang số: String -> number
        int c = Integer.parseInt("123");
        System.out.println("123" + 1000); // ra ký tự số
        System.out.println(c+1000); // ra tổng


        String s1 = new String("1");
        String s2 = new String("2");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
