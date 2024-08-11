import java.util.Random;

public class Math {
    void showPI(){
        System.out.println(3.1415);
    } //phương thức tìm giá trị

    int max(int a, int b){
        return a > b ? a:b;
    }


    int lode(){
        Random random = new Random();
        return random.nextInt(100);
    }

    // Thay vì viết dài như trên thì chỉ cần gọi dãy số là 1 tên bất kỳ rồi in ra



}
