package entity;

public class PrimaryStudent extends  Student {
    public static int count;
    // KO cần viết count =0 vi đã mặc định count =0 rồi

    public PrimaryStudent(String name){
        super(name);
        // tham chiếu đến contructor của lớp cha (Student)
        // Ngoài tăng biến count của Student thì cũng tăng trong class PrimaryStudent luôn

        count++;
    }

}
