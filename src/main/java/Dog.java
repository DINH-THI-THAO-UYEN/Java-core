public class Dog extends Pet{
    // 1 class sử dụng hoặc kế thừa lại những code của 1 class khác
    // class Dog kế thừa các thông tin của class Pet

    // Để kế thừa hành động của class Pet thì class Dog phải ghi lại hành động
    // super là tham chiếu đến class cha

    public Dog(String name, int age){
        super(name,age); //class Dog tái sử dụng lại code this của class Pet
        // và gọi ra theo thứ tự mong muốn thông qua super
    }

@Override
    public void run(){
    super.run();
    System.out.println(getName() + " is running...");
    // Cách khác
    // System.out.println(name + " is running...");
}
}
