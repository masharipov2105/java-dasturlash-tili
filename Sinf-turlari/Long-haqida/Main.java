/*
    -long tipi javadagi butun sonlar bilan ishlaydigan eng katta xajmli tur xisoblanadi
    -long primitiv turining Long deb nomlanuvchi wrapper sinfiga ega.
    -long tipidagi o'zgaruvchi yoki obektga sonli qiymat berishda son oxiriga L harifini qo'yish mumkin
    -long tipida katta sonlarni yozishda _ past chiziqdan foydlaanish mumkin, o'qishda qulaylik uchun 1_000_000 kabi (java 7+)

*/


public class Main{

    public static void main(String[] args){

        //konstanta qiymatlari
        System.out.println("long tipining xotira xajmi (baytda): Long.BYTES " + Long.BYTES + " bayt");
        System.out.println("long tipining eng katta qiymati: Long.MAX_VALUE " + Long.MAX_VALUE);
        System.out.println("long tipining eng kichik qiymati: Long.MIN_VALUE " + Long.MIN_VALUE);
        System.out.println("long tipining xotira xajmi (bitda): Long.SIZE " + Long.SIZE + " bit");
        System.out.println("long tipini nomini qaytaradi: Long.TYPE " + Long.TYPE);

    }
}
