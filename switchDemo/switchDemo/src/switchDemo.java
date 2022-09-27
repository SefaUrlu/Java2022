public class switchDemo {
    public static void  main(String[] args) {
        char grade = 'g';

        switch (grade){
            case 'A':
                System.out.println("Tebrikler geçtiz");
                break;
            default:
                System.out.println("Geçersiz");
                break;
        }
    }
}
