/*

    -float java tilidagi kasr sonlar bilan ishlaydigan eng ko'p qo'llaniladigan tip xisoblanadi
    -float primitiv tipining wrapper sinfi Float deb ataladi
    -float tipidagi o'zgaruvchilarga qiymatni berishda son oxirifa f kalit so'zi qo'yilishi kerak.
    - 0.0f / 0 yoki 0.0f * 0 kabi amallarni bajarishda NaN qiymati xosil bo'ladi.
    - NaN qaytaruvchi hisoblar yoki qiymatlarni NaN konstantasi bilan emas balki Float.IsNan() static mentodi bilan tekshirish kerak

*/


public class Main{

    public static void main(String[] args){

        float son1 = 10.5f;
        float son2 = 14.5f;
        String son_str = "1.23f";

        Float son_float = Float.valueOf("10.1f");

        //konstanta qiymatlari
        System.out.println("float tipining xotira xajmi (baytda): Float.BYTES " + Float.BYTES + " bayt");
        System.out.println("float tipining eng katta qiymati: Float.MAX_VALUE " + Float.MAX_VALUE);
        System.out.println("float tipining tipining eng kichik qiymati: Float.MIN_VALUE " + Float.MIN_VALUE);
        System.out.println("float tipida ifodlaangan manfiy cheksizlik : Float.NEGATIVE_INFINITY " + Float.NEGATIVE_INFINITY);
        System.out.println("float tipida ifodalangan musbat cheksizlik : Float.POSITIVE_INFINITY " + Float.POSITIVE_INFINITY);
        System.out.println("float tipining xotira xajmi (bitda): Float.SIZE " + Float.SIZE + " bit");
        System.out.println("float tipining tur nomini qaytaradi: Float.TYPE " + Float.TYPE);

        //static metodlar
        System.out.println("ikkita float tipidagi sonlarni solishtiradi agar birinchisi ikkinchisidan kichik bo'lsa -1 ni qaytaradi aksincha katta bo'lsa 1 ni qataradi, agar teng bo'lsa 0 ni qaytaradi: Float.compare(10.5f, 14.5f) " + Float.compare(son1, son2));
        System.out.println("agar son chekli va aniq bo'lsa true qiymatini qataradi, qolgan barcha vayiyatlar uchun flase: Float.isFinite(10.5) " + Float.isFinite(son1));
        System.out.println("agar son cheksiz b'lsa yani ga teng bo'lmagan kasr sonni 0 ga bo'lganda xosil bo'ladigan cheksizlikni tekshirishda foydalaniladi: Float.isInfinite(0.4f/0) " + Float.isInfinite(0.4f / 0));
        System.out.println("nolni nolga bo'lish kabi qiymati noaniq natijalarnini tekshirihsda ishlatilinadi: Float.isNan(0.0f / 0) " + Float.isNaN((float)(0.0f / 0)));
        System.out.println("ikkita float tipidagi o'zgaruvchilar qiymatlari ichidan eng kichigini qaytaradi: Float.min(10.5, 14.5) " + Float.min(son1, son2));
        System.out.println("Ikkita float tipidagi o'zgaruvchilar qiymatlari ichidan eng kattasini qaytaradi: FLoat.max(10.5, 14.5) " + Float.max(son1, son2));
        System.out.println("matn ko'rinishidagi qiymatni float primitiv turida qiymatini qaytaradi: Float.parseFloat('1.23f') " + Float.parseFloat(son_str));
        System.out.println("ikkita float tipidagi qiymatlarni oddiy + operwtori kabi qo'shib natijani qaytaradi: Float.sum(10.5, 14.5) " + Float.sum(son1, son2));
        System.out.println("float tipidagi qiymatni String obektiga aylantirib qiymatini qaytaradi: Float.toString(14.5f) " + Float.toString(son2));
        System.out.println("float tipidagi qimatni olib uni Float wrapper sinfiga o'rab obekt yaratadi va qiymatini Stringda qayatradi: Float.valueOf(10.5f) " + Float.valueOf(son1));
        System.out.println("Matn ko'rinishida ifodalangan sonni Float wrapper sinfiga o'rab obekt yaratdi va obekt qiymmatini Stringda qaytaradi: Float.valueOf('1.23f') " + Float.valueOf(son_str));

        //instance metodlar
        System.out.println("Float obektini qiymatini byte primitiv turiga toraytiradi va qiymatini butun ko'rinishda qaytaradi: son_float.byteValue() " + son_float.byteValue());
        System.out.println("Float obektini qiymatini boshqa bir float primitiv turidagi o'zgaruvchi qiymati bilan taqqoslaydi agar obekt qiymati o'zgaruvchi qiymatidan kichik bo'lsa -1 aksincha bo'lsa 1, agar teng bo'lsa 0 ni qaytaradi: son_float.compareTo(10.5) " + son_float.compareTo(son1));
        System.out.println("Float obektini qiymatini doublega kengaytiradi va qiymatini doubleda qaytaradi: son_float.doubleValue() " + son_float.doubleValue());
        System.out.println("Float obektini avval turlari bo'yicha keyin qiymatlari bo'yicha solishtiradi, agar barchasi teng bo'lsa true qaytaradi, aks xolda false qaytaradi: son_float.equals((double) 10.1) " + son_float.equals((double) 10.1));
        System.out.println("Float obektini qiymatini float tipiga o'girib qiymatini qaytaradi: son_float.floatValue() " + son_float.floatValue());
        System.out.println("Float obektini qiymatini int tipiiga o'girib qiymatini butun ko'rinishda,  intda qaytaradi: son_float.intValue() " + son_float.intValue());
        System.out.println("Float obektini qiymatini cheksizlikka tekshiradi: son_float.isInfinite() " + son_float.isInfinite());
        System.out.println("Float obektini qiymatini NaN yani qiymati aniq yoki aniq emasmi, tekshiradi: son_float.isNaN() " + son_float.isNaN());
        System.out.println("Float obektini qiymatini long tipiga kengaytiradi va qiymatini butun ko'rinishda, longda qaytaradi: son_float.longValue() " + son_float.longValue());
        System.out.println("Float obektini qiymatini short tipiga toraytiradi va qiymatini butun ko'rinishda, shortda qaytradi: son_float.shortValue() " + son_float.shortValue());
        System.out.println("Float obektini qiymatini wiymatini String obektiga aylantiradi va qiymatini stringda qaytaradi: son_float.toString() " + son_float.toString());


    }
}
