public class miniProjeAsalSayi {
        public static void main(String[] args){
                int number = -3;
                int remainder = number % 2;
                boolean isPrime = true;

                for (int i =2; i< number; i++ ){
                        if (number % i ==0){
                                isPrime = false;
                        }
                }
                if(number==1){
                        System.out.println("sayı asal değildir");
                }
                if(number<1){
                        System.out.println("geçersiz sayı");
return;
                }
        if (isPrime==true){
                System.out.println("sayı asaldır");
        }
        else {
                System.out.println("sayı asal değildir");
        }
        }0


}