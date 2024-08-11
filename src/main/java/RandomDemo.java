import java.util.Random;

public class RandomDemo {
    public static void main(String[] arg){
        Random random = new Random();

        int a = random.nextInt();
        System.out.println("a = " + a);

        //0 =< random.nextInt(max) < max
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // 0 =< random.nextInt(max + 1) > max
        int min = 100;
        int max = 999;
        int c = min + random.nextInt(max - min + 1);
        System.out.println("c = " + c);

        //Ramdom một phần tử trong mảng
        String[] fruits = {"Cam","Táo","Ổi","Lê","Dừa"};
        int index = random.nextInt(fruits.length);
        String fruit = fruits[index];
        System.out.println("fruit = " + fruit);


    }
}
