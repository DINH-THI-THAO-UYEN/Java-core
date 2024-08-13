public class InheritanceDemo {
    //Inheritance: Kế thừa
    // Mục đích là tái sử dụng code
    // Các từ khóa: extends
    // Đơn kế thừa: tức là 1 class chỉ kế thừa đc 1 class

    public static void main(String[] args) {
        Dog dog = new Dog("Milu",2);
        dog.run();
    }
}

    // this: Tham chiếu đến class đó
    // super thì tham chiếu đến class cha (kế thằ)
