/*

    -bool tipi java tilida mantiqiy tur xisoblanib atigi 2 ta qiymatni ifoda eta oladi.
    -bool tipi nafaqat javada balki barcha datrulash tillarida doimiy qo'llaniladigan tur xisoblanadi
    -bool tipi ning Boolena deb nomlanuvchi wrapper sinfi mavjud

*/


public class Main{

    public static void main(String[] args){

        boolean bool1 = false;
        boolean bool2 = true;

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

    }
}
