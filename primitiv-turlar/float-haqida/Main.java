/*

    -float java tilidagi kasr sonlar bilan ishlaydigan eng ko'p qo'llaniladigan tip xisoblanadi
    -float primitiv tipining wrapper sinfi Float deb ataladi
    -float tipidagi o'zgaruvchilarga qiymatni berishda son oxirifa f kalit so'zi qo'yilishi kerak.
    - 0.0f / 0 yoki 0.0f * 0 kabi amallarni bajarishda NaN qiymati xosil bo'ladi.
    - NaN qaytaruvchi hisoblar yoki qiymatlarni NaN konstantasi bilan emas balki Float.IsNan() static mentodi bilan tekshirish kerak

*/


public class Main{

    public static void main(String[] args){

        //konstanta qiymatlari
        System.out.println("float tipining xotira xajmi (baytda): Float.BYTES " + Float.BYTES + " bayt");
        System.out.println("float tipining eng katta qiymati: Float.MAX_VALUE " + Float.MAX_VALUE);
        System.out.println("float tipining tipining eng kichik qiymati: Float.MIN_VALUE " + Float.MIN_VALUE);
        System.out.println("float tipida ifodlaangan manfiy cheksizlik : Float.NEGATIVE_INFINITY " + Float.NEGATIVE_INFINITY);
        System.out.println("float tipida ifodalangan musbat cheksizlik : Float.POSITIVE_INFINITY " + Float.POSITIVE_INFINITY);
        System.out.println("float tipining xotira xajmi (bitda): Float.SIZE " + Float.SIZE + " bit");
        System.out.println("float tipining tur nomini qaytaradi: Float.TYPE " + Float.TYPE);
    }
}
