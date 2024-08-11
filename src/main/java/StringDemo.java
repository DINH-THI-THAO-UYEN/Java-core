public class StringDemo {
    public static void main(String[] args){
        //Primitive : kiểu nguyên thủy
        String s1 = "Java Core";
        String s2 = "Java Core";

        //Non primitive : ko phải nguyên thủy
        String s3 = new String("Java Core");
        String s4 = new String("Java Core");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        //equals: So sánh giá trị
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }
}
