public class SwitchCaseDemo {
    public static void main(String[] args){
        int month = 4;
        switch (month){ // khối lệnh
            case 1:
                System.out.println("Có 31 ngày");// Khối lệnh
                break; // break là dừng lại đén câu lệnh cần thiết. giống như cái phanh
            case 2:
                System.out.println(" Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("Không biết");
                break;
        }

        //SwithCase về cơ bản thì cũng giống if else nhưng mà nhiều trg hợp hơn

    }
}
