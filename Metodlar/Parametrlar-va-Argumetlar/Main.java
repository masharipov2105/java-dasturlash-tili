/*

    - parametr bu metod ichidagi mahaliy o'zgaruvchi
    - argumet bu metodni chaqirish vaqtida o'sah parametrga qiymat sifatida qaraldi
    - parametr va argument bu o'zgaruvchi va unga tayinlangan qiymat kabi tushunish mumkin
    - argumetlar tartibi yaratilgan parametrlar tartibiga mos bo'lishi kerak, yani tartib muhim

*/

public class Main{

    public static void main(String[] args){

        // 3ta int tipidagi sonlarni o'rta arifmetigini hisoblovchi metod yozib ko'ramiz
        int a = 7;
        int b = 13;
        int c = 8;

        System.out.printf(a +", " + b + ", "+ c + ", larnig o'rta arifmetigi: %.3f",  arifmetik(a, b, c));
        System.out.println(); // shunchaki yangi qatorga o'tish uchun

        // berilgan ism va yosh asosida salomlashish metodini sinab ko'ramiz
        String user_ismi = "Anvar";
        short user_yoshi = 23;
        salomlashish(user_ismi, user_yoshi); // metodni chaqiramiz

        // 4ta double turidagi sonlarni yig'indisini metod orqali xisoblab ko'ramiz
        double d_1 = 12.7;
        double d_2 = 8.9;
        double d_3 = -2.81;
        double d_4 = 3.25;

        System.out.printf(d_1 + ", " + d_2 + ", " + d_3 + ", " + d_4 + " larning yig'indisi: %.4f", doubleYigindi(d_1, d_2, d_3, d_4));
        System.out.println(); // shunchaki yangi satrga o'tish uchun
    }

    // 3ta int tipidagi sonlarni o'rta rifmetigini qaytaruvchi metod
    public static double arifmetik(int son1, int son2, int son3){

        double orta_arifmetik = (son1 + son2 + son3) / 3.0;

        return orta_arifmetik;
    }

    // ismi va yoshi bo'yicha salom beruvchi metod
    public static void salomlashish(String ism, short yosh){

        String yakuniy_matn = String.format("Salom %s, yoshi %d", ism, yosh);

        System.out.println(yakuniy_matn);
    }

    // 4ta double tipidagi sonlarni yig'oindisini qaytaruvchi metod
    public static double doubleYigindi(double son1, double son2, double son3, double son4){

        double yigindi = (son1 + son2 + son3 + son4);

        return yigindi;
    }
}
