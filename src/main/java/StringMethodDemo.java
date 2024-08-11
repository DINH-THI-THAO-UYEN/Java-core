import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args){
        String s = "Java Core";
        String empty = " ";
        String blank = "   ";
        String search = "    Samsung   ";
        String name = "Đinh Thị Thảo Uyên";

        System.out.println("s.toLowerCase() = "+ s.toLowerCase());
        System.out.println("s.toLowerCase() = "+ s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("s.charAt(0) = " + s.indexOf('a'));
        System.out.println("s.lastIndex0f('a') = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"Core\") = "+ s.contains("Core"));
        System.out.println("search.trim() =" + search.trim());
        String[] words = name.split(" ");
        for (String word : words){  // Muốn lặp từng từ trong mảng String thì dùng for
            System.out.println("word = " + word);
        }

        // begin =< ... < end
        System.out.println("s.substring(0,4) = " + s.substring(0,4));

        //Thực hành (Bài tập)
        // input: uyen -> output: Uyen ; đầu ra viết hoa chữ cái đầu
        // Và đếm số từ trong tên vd Đinh Thị Thảo Uyên -> 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên:");
        String s1 = scanner.nextLine();
        String a1 = s1.substring(0,1).toUpperCase()
                + s1.substring(1).toLowerCase();
        System.out.println("a1 = " + a1);

        System.out.println("Mời bạn nhập vào họ và tên:");
        String s2 = scanner.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ: " + count);

        int c2 = s2.trim().split("\\s+").length;
        System.out.println("c2 = " + c2);

    }
}
