public class FinalDemo {
    private String name;
    public static void main(String[] args){
        // Biến final đc gọi là final variable, final property
        // Tạo hằng số (constant)
        final double PI = 3.14159;

        // PI = 4; // Đây là điều vô lý. Ko thể gán gtri cho 1 biến đc đánh dấu là final/ còn gọi là hằng số

        // final method
        // Lớp con ko thể ghi đề final method của lớp cha
        Dog dog = new Dog();
        dog.eat();


        // final class: nếu đánh dấu class bằng final thì class đó ko có class nào khác đc kế thừa

    }
}
