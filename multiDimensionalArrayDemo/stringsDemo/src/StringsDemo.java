public class StringsDemo {
    public static void main(String[] args){

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

       /* System.out.println(mesaj + mesaj.length());
        System.out.println(mesaj.charAt(4));
        System.out.println(mesaj.concat(" amına koyim"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("v"));

        char[] karakter = new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));*/
        String yenimesaj = mesaj.replace(' ','-');
        System.out.println(yenimesaj);
        System.out.println(yenimesaj.substring(2,4));

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
}
}
