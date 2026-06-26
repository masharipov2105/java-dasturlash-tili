/*
    -long tipi javadagi butun sonlar bilan ishlaydigan eng katta xajmli tur xisoblanadi
    -long primitiv turining Long deb nomlanuvchi wrapper sinfiga ega.
    -long tipidagi o'zgaruvchi yoki obektga sonli qiymat berishda son oxiriga L harifini qo'yish mumkin
    -long tipida katta sonlarni yozishda _ past chiziqdan foydlaanish mumkin, o'qishda qulaylik uchun 1_000_000 kabi (java 7+)

*/


public class Main{

    public static void main(String[] args){

        long son1 = 100L;
        long son2 = 120L;
        String son_16 = "0xAABB";
        String son_str = "salom123";
        String son_str2 = "123";

        Long son_long = Long.valueOf(son_str2);
        Long son_long2 = Long.valueOf(son_str2);
        //konstanta qiymatlari
        System.out.println("long tipining xotira xajmi (baytda): Long.BYTES " + Long.BYTES + " bayt");
        System.out.println("long tipining eng katta qiymati: Long.MAX_VALUE " + Long.MAX_VALUE);
        System.out.println("long tipining eng kichik qiymati: Long.MIN_VALUE " + Long.MIN_VALUE);
        System.out.println("long tipining xotira xajmi (bitda): Long.SIZE " + Long.SIZE + " bit");
        System.out.println("long tipini nomini qaytaradi: Long.TYPE " + Long.TYPE);

        //staric metodlari
        System.out.println("ikkita long tipidagi qiymatlarni taqqoslaydi, agar birnchisi ikkinchisidan kichik bo'lsa -1 ni qaytaradi, agar aksincha bo'lsa 1 ni qaytaradi, agar teng bo'lsa 0 ni qaytaradi: Long.compare(100L, 120L) " + Long.compare(son1, son2));
        System.out.println("matn ko'rinishida va 0x formatida yozilgan 16 lik sonni 10 lik tizimga o'tkazib long tipida qaytaradi: Long.decode('0xAABB') " + Long.decode(son_16));
        System.out.println("ikkita long tipidagi qiymatlarni taqqoslab, eng kattasini qaytaradi: Long.max(100L, 120L) " + Long.max(son1, son2));
        System.out.println("ikkita long tipidagi qiymatlarni taqqoslab, eng kichigini qaytaradi: Long.min(100L, 120L) " + Long.min(son1, son2));
        System.out.println("matn ko'rinishida ifodalangan qiymatning ma'lum bir oralig'ini tanlab va son qaysi saniq tizimga tegishi ekanligini ham ko'rsatish orqali belgilangan oraliqni 10 lik tizimga o'giradi va long tipida natijani qaytaradi: Long.parseLong('salom123', 5, 8, 4) " + Long.parseLong(son_str, 5, 8, 4));
        System.out.println("matn ko'rinishidagi sonni long tipida qaytaradi:Long.parseLong('123225') " + Long.parseLong(son_str2));
        System.out.println("matn ko'rinishida ifodalangan sonni va shu son qaysi saniq tizimida ekanligni ham ko'rsatgan xolda sonni 10 lik tizimga o'girib qiymatini long da qaytaradi: Long.parseLong('123', 4) " + Long.parseLong("123", 4));
        System.out.println("long tipidagi qiymatni ishorasini aniqlaydi, agar son 0 dan katta bo'lsa 1 ni qaytaradi, aksincha bo'lsa -1 ni qaytaradi, agar 0 ga teng bo'lsa 0 ni qaytaradi: Long.signum(100L) " + Long.signum(son1));
        System.out.println("ikkita long tipidagi qymatlarni arifmetik yig'indisini qataradi: Long.sum(100L, 120L) " + Long.sum(son1, son2));
        System.out.println("long tipidagi qiymatni String obektiga aylantiradi va qaytaradi: Long.toString(120L) " + Long.toString(son2));
        System.out.println("long tipidagi qiymatni biz tanlagan sanoq tizimidagi qiymatini stringda qaytaradi: Long.toString(7, 2)" + Long.toString(7, 2));
        System.out.println("long tipidagi qiymatni olib Long wrapper sinfiga tegishli obekt yaratadi va unga qiymat sifatida beradi va println ichida bu obektni String sifatida qaytaradi: Long.valueOf(100L) " + Long.valueOf(100L));
        System.out.println("matn ko'rinishidagi sonni olib Long wrapper sinfiga tegishli obekt yaratadi va qiymat sifatida beradi, println ichida esa bu obektni String sifatida qaytaradi: Long.valueOf('123225') " + Long.valueOf(son_str2));
        System.out.println("matn ko'rinishida ifodalangan sonni oladi va qaysi sanoq tizimga tegishli ekanligini xisobga olib 10 lik tizimga o'tkazadi va Long wrapper sinfiga tegishli obekt yaratib unga qiymat sifatida beradi, println ichida obektni String sifatida qaytaradi: Long.valueOf('123', 4) " + Long.valueOf("123", 4));

        //instance metodlar
        System.out.println("Long obektini qiymatini bytega toraytiradi va qiymatini byte da qaytaradi: son_long.byteValue() " + son_long.byteValue());
        System.out.println("Long obektini qiymatini boshqa bir Long obektini qiymati bilan taqqoslaydi, agar bitinchi obekt qiymati ikkinchisidan kichik bo'lsa -1, aksincha bo'lsa 1, agar teng bo'lsalar 0 ni qaytaradi: son_long.compareTo((long) 123L) " + son_long.compareTo((123L)));
        System.out.println("Long obektini qiymatini double ga toraytiradi va qiymatni double da qataradi: son_long.doubleValue() " + son_long.doubleValue());
        System.out.println("Long obektini boshqa bir obekt bilan avval tiplar bo'yicha keyin qiymatlari bo'yicha taqqoslaydi, agar barchasi teng bo'lsa true qaytaradi, aks xolda false qaytaradi: son_long.equals((long) 123L) " + son_long.equals(son_long2));
        System.out.println("Long obektini qiymatini float tipiga toraytiradi va qiymatini float tipida qaytaradi: son_long.floatValue() " +son_long.floatValue());
        System.out.println("Long obektini qiymatini int tipiga toraytiradi va qiymatini int tipida qaytaradi: son_long.intValue() " + son_long.intValue());
        System.out.println("Long obektini qiymatini long primitiv tipga olib o'tadi va qiymatini long tipida qaytaradi: son_long.longValue() " + son_long.longValue());
        System.out.println("Long obektini qiymatini short tipiga toraytiradi va qiymatini short tipida qaytaradi: son_long.shortValue() " + son_long.shortValue());
        System.out.println("Long obketini qiymatini String obekti qiymati qiladi va String tipida qaytaradi: son_long.toString() " + son_long.toString());

    }
}
