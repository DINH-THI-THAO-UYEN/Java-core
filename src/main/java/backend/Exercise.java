package backend;

import entity.*;

import java.util.Calendar;
import java.util.Date;

    public class Exercise {
    public static void question01() {
        @SuppressWarnings("deprecation")
        Date date = new Date(2020, Calendar.MAY, 18);
    }

    public static void question02() {
        Student student = new Student("Nguyễn Văn A");

        System.out.println("Student = " + student);
        System.out.println("Id = " + student.getId());
        System.out.println("Id v2 = " + student.getIdV2());
    }

        public static void question03() {
            CPU cpu = new CPU(1000);
            CPU.Processor processor = cpu.new Processor(4, "Intel");
            CPU.Ram ram = cpu.new Ram(8, "Samsung");
            System.out.println("processor.getCache() = " + processor.getCache());
            System.out.println("ram.getClockSpeed() = " + ram.getClockSpeed());
    }
    public static void question06() {
        Student s1 = new PrimaryStudent("A");
        Student s2 = new PrimaryStudent("B");
        Student s3 = new SecondaryStudent("C");
        Student s4 = new PrimaryStudent("D");
        Student s5 = new SecondaryStudent("E");
        Student s6 = new SecondaryStudent("F");
        System.out.println("Số lợng student; " + Student.count);
        System.out.println("Số lợng primary student; " + PrimaryStudent.count);
        System.out.println("Số lợng secondary student; " + SecondaryStudent.count);
        }

        public static void question07() {
            Student s1 = new PrimaryStudent("A");
            Student s2 = new PrimaryStudent("B");
            Student s3 = new SecondaryStudent("C");
            Student s4 = new PrimaryStudent("D");
            Student s5 = new SecondaryStudent("E");
            Student s6 = new SecondaryStudent("F");
            Student s7 = new SecondaryStudent("G");
            Student s8 = new SecondaryStudent("H");
            // Nếu tối a in 7 học sinh mà số lượng ít hơn hoặc bằng thì in sẽ lỗi
            System.out.println("Số lợng student: " + Student.count);
            System.out.println("Số lợng primary student: " + PrimaryStudent.count);
            System.out.println("Số lợng secondary student: " + SecondaryStudent.count);
        }
        public static void question08() {
            Hinhhoc h1 = new HinhTron(10.0);
            Hinhhoc h2 = new HinhTron(100.0);
            Hinhhoc h3 = new HinhTron(1000.0);
            HinhChuNhat h4 = new HinhChuNhat(1.0,2.0);
            HinhChuNhat h5 = new HinhChuNhat(10.0,20.0);
            System.out.println("Số hình học là: " + Hinhhoc.count);

        }
}