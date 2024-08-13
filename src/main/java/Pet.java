public class Pet {
    public String name;
    protected String host;
    private int age;
// thuộc tính là private thì class Dog ko thể kế thừa đc
    // private là chỉ class đó truy cập đc chứ class khác ko truy cập đc

    public Pet(String name, int age){
        this.name =name;
        this.age=age;
    }

    public void run(){
        System.out.println("Pet is running...");
    }

    public String getName(){
        return name;
    }
}
