package entity;

public class Student {
    public static int count;
    private int id;
    private String name;


    public Student(String name) {
        if (count >= 7 ){
            throw new IllegalStateException("Tối đa 7 học sinh");
        }
        // Trc khi tăng biến count lên thì mình đặt ra 1 ngoại lệ
        count++;
        this.id = count;
        this.name = name;
    }

    /**
     * @deprecated Replaced by {@link #getIdV2()}
     */
    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdV2() {
        return "MSV: " + id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}