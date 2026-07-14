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
}
