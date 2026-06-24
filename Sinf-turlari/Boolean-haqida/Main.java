/*

    -bool tipi java tilida mantiqiy tur xisoblanib atigi 2 ta qiymatni ifoda eta oladi.
    -bool tipi nafaqat javada balki barcha datrulash tillarida doimiy qo'llaniladigan tur xisoblanadi
    -bool tipi ning Boolena deb nomlanuvchi wrapper sinfi mavjud

*/


public class Main{

    public static void main(String[] args){

        boolean bool1 = false;
        boolean bool2 = true;

        Boolean bool_tur = Boolean.valueOf(bool2);
        Boolean bool_tur2 = Boolean.valueOf(bool1);

        //konstanta qiymatlari
        System.out.println("Boolena obekti bo'lib false qiymatiga teng: Boolean.FALSE " + Boolean.FALSE);
        System.out.println("Boolean obekti bo'lib true qiymatiga teng: Boolean.TRUE " + Boolean.TRUE);
        System.out.println("Boolena sinfining tipi nomini qaytaradi: Boolean.TYPE " + Boolean.TYPE);

        //staric metodlar
        System.out.println("ikkita boolean tipidagi qiymatlarni taqqislaydi, agar birinchisi ikkinchisan kichik bo'lsa -1, agar aksincha bo'lsa 1 , agar teng bo'lsa 0 ni qaytaradi: Boolean.compare(false, true) " + Boolean.compare(bool1, bool2));
        System.out.println("ikkita boolean tipidagi qiymat ham true bo'lsagina true ni qaytaradi, qolgan barcha xollarda false qayatradi: Boolean.logicalAnd(true, true) " + Boolean.logicalAnd(true, true));
        System.out.println("ikkita boolean tipidagi qiymatdan kamida bittasi true bo'lsa true ni qaytaradi, aks xolda false ni qaytaradi: Boolean.logicalOr(false, false) " + Boolean.logicalOr(false, false));
        System.out.println("ikkita boolean tipidagi qiymatlar teng bo'lsa false qaytaradi, qolgan xollarda true qaytaradi: Boolean.logicalXor(false, true) " + Boolean.logicalXor(bool1, bool2));
        System.out.println("boolean tipidagi qiymatni String obektiga aylantirib qiymatini qaytaradi: Boolean.toString(false) " + Boolean.toString(bool1));
        System.out.println("boolean tipidagi qiymatni olib Boolean wrapper sinfiga o'raydi va obekt yaratadi, obektga shu qiymatni beradi, println ichida esa obektni String ko'risnishida qaytaradi: Boolean.valueOf(true) " + Boolean.valueOf(bool2));
        System.out.println("matn ko'rinishida ifodalangan qiymatni olib Bollean wraper sinfiga o'raydi va obekt yaratadi, obektga shu qiymatni beradi, println ichida esa bu obektni String ko'risnishida qaytaradi: Boolean.valueOf('false') " + Boolean.valueOf("false"));

        //instance metodlar
        System.out.println("Boolean obketini qiymatini boolean primitv tipida qaytaradi: bool_tur.booleanValue() " + bool_tur.booleanValue());
        System.out.println("Boolean obektini qiymatini boshqa bir boolean qiymati bilan taqqsolaydi, agar obekt qiymati kichik bo'lsa -1 ni, aksincha bo'lsa 1 ni, agar teng bo'lsa 0 ni qaytaradi: bool_tur.compareTo((boolean) true) " + bool_tur.compareTo((boolean) true));
        System.out.println("Boolean obektini boshqa bir obekt bilan avval turlari bo'yicha keyin qiymatlari bo'yicha solishtiradi, agar hammasi teng bo'lsa true qaytaradi, aks xolda flase qaytaradi: bool_tur.equals(bool_tur2) " + bool_tur.equals(bool_tur2));
        System.out.println("Boolean obektini qiymatini String obekti sifatida qaytaradi: bool_tur.toString() " + bool_tur.toString());

    }
}
