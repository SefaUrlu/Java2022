public class arraysDemo {
    public static void main(String[] args){
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Sefa";
        ogrenciler[1]="Ahmet";
        ogrenciler[2]="İrem";
        for(int i =0 ; i< ogrenciler.length ;i+=1){
            System.out.println(ogrenciler[i]);

        }
        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
