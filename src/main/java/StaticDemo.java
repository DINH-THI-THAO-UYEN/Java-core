public class StaticDemo {
    public static void main(String[] args){
        //Dog dog =new Dog();
        Student s1 = new Student("Khoa",  20);
        Student s2 = new Student("Hung", 15);

        s1.count =10;
        System.out.println("s2.count = " + s2.count);

        System.out.println("Student.count = " + Student.count);
        // Vì biến count là biến dùng chung, sử dụng static nên dùng Student.count
        // Truy cập thông qua tên Class

        int max = Student.max(10,100); // Có thể gọi hàm thông qua tên class
        System.out.println("max = " + max);
        Math.max()

    }
    // Cách cung cấp bộ nhớ của máy tính (vd: RAM)
    // Vùng nhớ Stack: cung cấp bộ nhớ cho các biến kiểu nguyên thủy (byte,short,int,long,boolean,char,float,double)
    // Thuộc tinh có static là thuộc tính chung, thuộc về tập thể (Static belong to Class)
    // Còn thuộc tính ko có static thì là thuộc về đổi tượng (property belong to instance)
    // Còn lại thì sẽ đc lưu trong vùng nhớ Heat
    // Tức là mỗi một đối tượng sẽ chiếm 1 vùng mới

    // Static ko thể truy cập non-static
    // Non-static có thể truy cập static






}
