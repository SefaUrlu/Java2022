public class methots21 {
    public static void main(String []args){
      int sayi = topla(10,12);
      System.out.println(sayi);

      int topluSayi = toplam2(2,4,5,6,7,5,8,9);
      System.out.println(topluSayi);


    }

    public static int topla (int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
public static int toplam2 (int...sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;

        }
return toplam;
    }
}
