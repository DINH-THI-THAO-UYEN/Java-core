public class ForEachDemo {
    // để liệt kể ra danh sách. đi từ đầu đến cuối danh sách
    // Cách lặp từ đầu đến cuối danh sách
    public static void main(String[] args){
        int[] numbers = {123, 48, 12, 9, 20};
        for(int number:numbers){
            System.out.println("number = " + number);
        }

        // vòng for nhanh ngắn. nhưng mà ko biết đc thứ tự
        // ko bị gặp vấn đề lỗi tràn mảng
        // Vòng foreach thì tránh bị sót
    }
}