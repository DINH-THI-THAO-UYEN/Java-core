public class Program {
    public static void main(String[] args){
        Department department1 = new Department();
        department1.id =1 ;
        department1.name = "Giám Đốc";
        System.out.println("Tên phòng ban 1: " + department1.name);

        Department department2 = new Department();
        department2.id =2 ;
        department2.name = "Nhân Viên";
        System.out.println("Tên phòng ban 2: " + department2.id);

        Department department3 = new Department();
        department3.id =3 ;
        department3.name = "Bảo Vệ";
        System.out.println("Tên phòng ban 3: " + department3.name);


    }
}
