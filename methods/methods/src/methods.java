public class methods {
    public static void main(String[] args){

sayiBulmaca();

    }
    public static void sayiBulmaca (){
        int [] sayilar = new int[]{1,2,3,4,65,7,6,9,4,7,5,6,};

        int aranacak = 5;
        boolean varMi = false;

        for(int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("sayi mevcuttur");
        }
        else{
            System.out.println("sayi mevcut değil");}


    }



}
