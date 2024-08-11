public class IfElseDemo {
    public static void main(String[] args){
        int month = 1;
        if (month == 1) { // == là khác
            System.out.println("Có 31 ngày");
        }else if (month == 11){
            System.out.println("Có 30 ngày");
        } else {
            System.out.println("Không biết!");
        }
    }
}
