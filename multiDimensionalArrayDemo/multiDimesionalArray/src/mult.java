public class mult {
    public static void main(String[] args){
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Antalya";
        sehirler[0][2] = "izmir";
        sehirler[1][0] = "bursa";
        sehirler[1][1] = "çanakkale";
        sehirler[1][2] = "aydın";
        sehirler[2][0] = "burdur";
        sehirler[2][1] = "paris";
        sehirler[2][2] = "wien";

        for (int i = 0; i<=2 ;i++){
            for(int k =0; k<= 2; k++){
                System.out.println(sehirler[i][k]);
            }

        }


    }
}
