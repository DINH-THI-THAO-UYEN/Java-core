public class Student {
    private String name ;
    private int age;

    public static int count;
// Thuộc tính count là thuộc tính dùng chung nên phải có static
    public Student(String name, int age){
        this.name = name;
        this.age =age;
    }

    public static int max(int a, int b){
        //System.out.println(name)
        // Nếu in name ở đây ra thì sẽ bị lỗi
        // Do name ở hàm ko có static nên là hàm cà nhân
        // Mà hàm max là hàm tập thể, do có static. Nên ko thể gọi đc hàm cá nhân
        // Nhưng ngược lại, cá nhân có thể gọi tập thể đc
        // Tức là hàm max có thể in đc ở trong mục name

        return a>b ? a:b;
    }

    @Override
    public String toString(){
        return "Student { "+
                "name ='" + name +'\''+
                ", age = " + age +
                '}';

    }
}
