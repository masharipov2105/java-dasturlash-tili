/*

    -operator bu dasturlash tilidagi o'zaruvchi va qiymat kabi tushunchalar bilan bir qatorda juda muhim tushuncha
    -har qanday operator o'z operandlari asosida doim bir amalni bajaradi va aaniq bir primitiv tipda qiymat qaytaradi
    -operatorlar amallar bajarishi va shu amallarining turi bo'yicha aniq guruhlarga bo'lingan
    -amallar deganda biz(tayinlash, guruhlash, arifmetik, mantiqiy, bitlar ustida amallar, murojaat va h.k)larni tushinishimiz mumkin

*/


public class Main{

    public static void main(String[] args){

        //Arifmeti amalalrni bajaruvchi operatorlar

        // tayinlash operatori =
        int son1 = 12; // int tipidagi son1 o'zgaruvchisiga 12 sonini qiymat sifatida tayinlash
        int son2 = son1; // int tipidagi son1 o'zgaruvchisiga son1 nomli o'zgaruvchini qiymatini qiymat sifatida tayinlash

        System.out.println("son1 oldin: " + son1);
        System.out.println("son2 oldin: " + son2);

        son1 = 14; //son1 o'zgaruvchisiga yangi qiymatni tayinlash
        son2 = son1; // son2 o'zgaruvchisiga yangi qiymatni tayinlash

        System.out.println("son1 keyin: " + son1);
        System.out.println("son2 keyin: " + son2);
    }
}
