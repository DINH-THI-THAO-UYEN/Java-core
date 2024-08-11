public class ArrayDemo {
        // Array là mảng
        public static void main(String[] arg){
            //Các cách gán giá trị thông thg
            int[] numbers = {1,2,3,4,5};
            String[] names = new String[]{"Uyen","Phuong","Thanh"};
            int[] array = new int[0];
            // Cách dài khi gán số
//        int[] array;
//        array = new int[]{1,2,3,4,5};

            // Cách viết ngắn gọn lại vs array
//        int[]array = new int[5];
//        String[] names = new String[3]; // giá trị trả về là null

            // Kích thước của mảng
            System.out.println("numbers.length = " + numbers.length);
            System.out.println("numbers.length = " + names.length);
            System.out.println("array.length = " + array.length);

            //  Truy cập dựa theo chỉ số (index)
            // Mảng bắt đầu bằng số 0
            System.out.println("name[0] = " + names[0]);
            int lastIndex = numbers.length - 1;
            System.out.println("name[lastIndex] = " + numbers[lastIndex] );

            // Lặp các phần tử trong mảng
            for (int i = 1; i < numbers.length; i++){
                System.out.println("numbers[i] = " + numbers[i]);
            }

            // Lặp các phần tử trong mảng (phải qua trái)
            for (int i =numbers.length - 1; i >= 0 ; i--){
                System.out.println("number[i] = " + numbers[i]);
            }
            // Các phần tử trong mảng thì từ phải qua trái, nhưng giá trị chạy từ trái sang phải
            for (int i =numbers.length - 1; i >= 0 ; i--){
                System.out.println("number["+ i +"] = " + numbers[i]); // +i+ tăng dần giá trị của i

            }


        }
    }
