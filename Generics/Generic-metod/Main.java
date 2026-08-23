/*

    -generic-metodlar bular turli tiplar uchun ishlay oladigan va kompilatsiya vaqida tip aniqlanadigan metodlar
    -generic-metodlar bilan bir marta yozilgan metod turli tiplar uchun ishlay oladi
    -generic-metodlarda tipni ma'lum bir doirada ishlaydigan qilish mumkin <T extends Number> va h.k

*/

public class Main{

    public static void main(String[] args){

        System.out.println(adder(2, 3));
        System.out.println(adder("3.14", "Salom"));
    }

    // parametr sifatida berilgan argumetlarni string ko'riinishida qo'shib natijani Stringda qaytaruvchi generic metod yozamiz
    public static <T> String adder(T a, T b){

        return (String.valueOf(a) + " " + String.valueOf(b));
    }
}



