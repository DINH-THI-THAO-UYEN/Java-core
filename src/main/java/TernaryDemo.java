public class TernaryDemo {
    public static void main(String[] args){
        int a = 100;
        int b = 10;

//        int max;
//        if (a>b){
//            max = a;
//        }else {
//            max = b;
//        }
        // Toán tử Ternary là viết ngắn gọn lại if else
        int max = (a>b)? a:b;
        System.out.println("max = " + max);
    }


}
