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
        System.out.println("matn ko'rinishidagi sonni sonni Integer wrapper sinfiga o'raydi va qiymatini qaytaradi: Integer.valueOf(''2255) " + Integer.valueOf(son_str));
        System.out.println("int tipidagi sonni Integer wrapper sinfiga o'raydi va qiymatini qaytaradi: Integer.valueOf(1100) " + Integer.valueOf(son2));
        System.out.println("matn ko'risnishida va sanoq tizimi ham belgilangan xolatda Integer wrapper sinfiga o'raydi sonni 10 lik tizimga o'giradi va qiymatini qaytaradi: Integer.valueOf('2255', 8) " +Integer.valueOf(son_str, 8));
    }
}
