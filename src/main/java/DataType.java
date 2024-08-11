public class DataType {
    public static void main(String[] args){
  //      System.out.println("Hello Java");
        // 1.Cú pháp khởi tại biến
        //[Kieu_du_lieu][ten_bien] = [gia_tri_khoi_tao];
        // 2.Kiểu số nguyên: byte(1), short(2), int(4), long(8)
    int age = 18;
    System.out.println("age = " + age);
        //3.Kiểu số thực: float (4),double(8)
    float pi = 3.14f;
    double PI = 3.141592653589793;
    System.out.println("pi = " + pi);
    System.out.println("PI = " + PI);
        // Viết nhanh bằng cách : tên biến.soutv và enter sẽ in đc ngay ra mẫu

        //4.Kiểu logic:boolean đúng hoặc sai
        boolean isLoading = true;
        System.out.println("true = " + true);
        //5. Kiểu ký tự: char(2)
        char c ='a';
        System.out.println("c = " + c);

        // =>>> CÓ TỔNG CỘNG 8 KIỂU DỮ LIỆU NGUÊN THỦY

        //6. Kiểu  xâu ký tự: String
        String name = "Uyên"; // Chỉ đc bọc trong dấu nháy kép
        System.out.println("name = " + name);
        // ko sử dụng String cho các dữ liệu có sẵn như enum, v.v...

         // Kiểu enum
        Gender gender1 = Gender.FEMALE;
        Gender gender2 = Gender.MALE;
        System.out.println("gender1 = " + gender1);
        System.out.println("gender2 = " + gender2);

        //8.Class vs Object
        Person person1 =new Person();
        person1.name = "NGUYEN VAN A";
        person1.age = 35;
        person1.gender = Gender.MALE;
        person1.speak();
        int sum = person1.sum(1,10);
        System.out.println("sum = " + sum);


        Person person2 = new Person();
        person2.name = "DINH THI B";
        person2.age = 26;
        person2.gender = Gender.FEMALE;
        person2.speak();


    }
    }
