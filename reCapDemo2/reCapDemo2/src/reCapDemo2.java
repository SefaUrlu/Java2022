public class reCapDemo2 {
    public static void main(String[] args){
        double []  listem ={ 1.2,3.5,7.6,10.4,17.5};
        double total = 0;
        double max = listem[0];
        for(double number : listem){
            if (max<number){
                max=number;
            }
            total = total + number;
            System.out.println(number);


        }
        System.out.println("en büyük"+total);
        System.out.println("en tassaklı ="+ max);

    }
}
