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

        //qo'shish operatori
        int son_1 = 22;
        int son_2 = 55;
        int son_3 = son_1 + son_2;
        System.out.println("(22 + 55) butun sonlar yig'indi: " + son_3);

        float f_1 = 12.7f;
        float f_2 = 7.8f;
        float f_sum = f_1 + f_2;
        System.out.println("(12.7f + 7.8f) kasr sonlar yig'indisi: " + f_sum);

        String satr_1 = "Salom";
        String satr_2 = "dunyo";
        String probel = " " ;
        System.out.println("('Salom' + ' ' + 'dunyo') Satrlar yig'indisi: " + satr_1 + probel + satr_2);

        //ayrish operatori
        int s_1 = 17;
        int s_2 = 21;
        int s_ = s_1 - s_2;
        System.out.println("(17 - 21) butun sonlar ayirmasi: " + s_);

        float f_3 = 17.74f;
        float f_4 = 20.86f;
        float f_ = f_3 - f_4;
        System.out.println("(17.74f - 20.86f) kasr sonlar ayirmasi: " + f_);

        //ko'paytirish operatori
        int s_3 = 25;
        int s_4 = 4;
        int s__ = s_3 * s_4;
        System.out.println("(25 * 4) butun sonlar ko'paytmasi: " + s__);

        float s_5 = 12.5f;
        float s_6 = 8.0f;
        float f__ = s_5 * s_6;
        System.out.println("(12.5f * 8.0f)  kasr sonlar ko'paytmasi: " + f__);

        //bo'lish operatori
        int s_7 = 30;
        int s_8 = 7;
        int s___ = s_7 / s_8;
        System.out.println("(30 / 7) butun sonlar bo'linmasi: " + s___);

        float f_5 = 7.8f;
        float f_6 = 3.0f;
        float f___ = f_5 / f_6;
        System.out.println("(7.8f / 3.0f) kasr sonlar bo'linmasi: " + f___);

        //qoldiqli bo'lish
        int s_9 = 14;
        int s_10 = 3;
        int qoldiq = s_9 % s_10; // 14 ni 3 bo'lganda qoladigan qoldiq yani 2 ni qaytaradi
        System.out.println("(14 % 3) butun sonlar bo'linmasidagi qoldiq: " + qoldiq);

        double d_1 = 13.2;
        double d_2 = 0.2;
        double qoldiq_d = d_1 % d_2;
        System.out.println("(13.2 % 0.2) kasr sonlarni bo'lishdagi qoldiq: " + qoldiq_d);

    }
}

