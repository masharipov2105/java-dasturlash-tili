/*
    -int java tilida eng ko'p ishlatilinadigan va butun sonlarni ifoda etadigan tip hisoblanadi
    -int xotira xajmi 4 bayt
    -int primitiv turining Integer deb nomlangan wrapper sinfiga ega
*/

public class Main{

    public static void main(String[] args){

        int son1 = 1001;
        int son2 = 1100;
        String son_str = "2255";
        String son_16 = "0x0AA";
        Integer son_int = Integer.valueOf("77");

        //konstanta qiymatlari
        System.out.println("int ning eng kichik qiymati: Integer.MIN_VALUE " + Integer.MIN_VALUE);
        System.out.println("int ning eng katta qiymati: Integer.MAX_VALUE " + Integer.MAX_VALUE);
        System.out.println("int ning xotira xajmi (baytda): Integer.BYTES " + Integer.BYTES + " bayt");
        System.out.println("int ning xotira xajmi (bitda): Integer.SIZE " + Integer.SIZE + " bit");
        System.out.println("Integer wrapper sinfining primitiv turini qaytarad: Integer.TYPE " + Integer.TYPE);

        //staric metodlari
        System.out.println("ikki int tipidagi o'zgaruvchilar qiymatlarini taqqoslaydi, agar birinchi ikkinchisidan kichik bo'lsa -1 qaytaradi agar aksincha bo'lsa 1 ni qaytaradi, agar teng bo'lsa 0 ni qaytaradi: Integer.compare(1001, 1100) " + Integer.compare(son1, son2));
        System.out.println("matn ko'rinishida ifodalangan va 0x formatidagi 16 lik sonni 10 lik tiizmga o'tkazib qiymatini int da qaytaradi: Integer.decode('0x0AA') " + Integer.decode(son_16));
        System.out.println("ikki int tipidagi sonlarni taqqoslash orqali orasidan eng kichigini qaytaradi: Integer.min(1001, 1100) " + Integer.min(son1, son2));
        System.out.println("ikki int tipidagi sonlarni taqqoslash orqali orasidan eng kattasini qaytaradi: Integer.max(1001, 1100) " + Integer.max(son1, son2));
        System.out.println("matn ko'rinishida ifodaangan satr ichida ma'lum bir oraliqni int tipiga aylantiripb qiymatini qaytaradi, undan tashqari bu metod berilayotgan son qaysi tipga mansubliigni ko'rsatish mumkin, va natija doim 10 lik tizimga o'giriladi: Integer.parseInt('salom123', 5, 8, 8) " + Integer.parseInt("salom123", 5, 8, 8));
        System.out.println("matn ko'rinishida ifodalangan sonni int tipiga o'girib qiymatini qaytaradi: Integer.parseInt('2255') " +Integer.parseInt(son_str));
        System.out.println("ikkita int tipidagi qiymatlar yig'indisini qaytaradi: Integer.sum(1001, 1100) " + Integer.sum(son1, son2));
        System.out.println("int tipidagi son qiymatini String obektiga aylantiradi va qiymatini qaytaradi: Integer.toString(1001) " + Integer.toString(son1));
        System.out.println("int tipidagi son qiymatini biz belgilagan sanoq tizimiga o'giradi va qiymatini qaytaradi: Integer.toString(1100, 2) " + Integer.toString(son2, 2));
        System.out.println("matn ko'rinishidagi sonni sonni Integer wrapper sinfiga o'raydi va qiymatini Stringda qaytaradi: Integer.valueOf(''2255) " + Integer.valueOf(son_str));
        System.out.println("int tipidagi sonni Integer wrapper sinfiga o'raydi va qiymatini Stringda qaytaradi: Integer.valueOf(1100) " + Integer.valueOf(son2));
        System.out.println("matn ko'risnishida va sanoq tizimi ham belgilangan xolatda Integer wrapper sinfiga o'raydi sonni 10 lik tizimga o'giradi va qiymatini Stringda qaytaradi: Integer.valueOf('2255', 8) " +Integer.valueOf(son_str, 8));

        //instance metodlar
        System.out.println("Integer obektini qimatini olib uni byte tipiga toarytiradi va qiymatini byte tipida qaytaradi: son_int.byteValue() " + son_int.byteValue());
        System.out.println("Integer obektini qiymatini boshqa bir int tipidagi o'zgaruvchi qiymati bilan taqqosladi, agar obekt qiymati o'zgaruvchi qiymatidan kichik bo'lsa -1, agar aksincha yani katta bo'lsa 1 yoki teng bo'lsa 0 ni qaytaradi: son_int.compareTo((int) 23) " + son_int.compareTo((int) 78));
        System.out.println("Integer obektini qiymatini olib uni double tipiga kengaytiradi va qiymatni double tipida qaytaradi: son_int.doubleValue() " + son_int.doubleValue());
        System.out.println("Integer obektini boshqa bir obekt bilan avval tiplari bo'yicha keyin qiymatlari bo'yiha solishtiradi, agar barchasi teng bo'lsa true qaytaradi aks xolda false qaytaradi: son_int.equals((double) 77) " + son_int.equals((double) 77));
        System.out.println("Integer obektini qiymatini float tipiga kengaytirib qiymatini float tipida qaytarad: son_int.floatValue() " + son_int.floatValue());
        System.out.println("Integer obektini qiymatini int tipiga aylantiradi va qiymatini int da qaytaradi: son_int.intValue() " + son_int.intValue());
        System.out.println("Integer obektini qiymatini long tipiga kengaytriadi va qiymatini long tipida qaytaradi: son_int.longValue() " + son_int.longValue());
        System.out.println("Integer obektini qiymatini short tipiga toraytiradi va qiymatini short tipida qaytaradi: son_int.shortValue() " + son_int.shortValue());
        System.out.println("Integer obektini qiymatini String obektiga aylantiradi va qiymatni String tipida qaytaradi: son_int.toString() " + son_int.toString());

    }
}
