public class ContinueDemo {
        public static void main (String[] args){
            for (int i =1; i <= 1000 ; i++){
                if (i == 5){
                    continue; //Next. Tức là chỉ ko in mỗi số 5 thôi
                }
                System.out.println(i);
            }
            System.out.println("Xong!");
        }
    }
