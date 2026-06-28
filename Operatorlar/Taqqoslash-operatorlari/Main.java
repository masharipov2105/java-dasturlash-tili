/*

    -taqqoslash operatorlari, barcha dasturlash tillarida shart operatorilari bilan birga ishlatilinadi
    -taqqoslash operatorlari boolean tipida qiymat qaytaradi
    -taqqoslash operatorlari yordamida tarmoqlanuvchi dastur yozish mumkin

*/

public class Main{

    public static void main(String[] args){

        //aynan tenglikni tekshirish operatori
        short son1 = 12;
        int son2 = 12;
        float son3 = 12.1f;
        double son4 = 12.1;
        String str1 = "salom";
        String str2 = "salom";
        System.out.println("(short 12 == int 12) " + (son1 == son2));
        System.out.println("(float 12.1f == double 12.1) " + (son3 == son4));
        System.out.println("('salom' == 'salom') " + (str1 == str2));
        System.out.println("(short 12 == float 12.1f) " + (son1 == son3));

        // teng emasligini tekshirish operatori
        //int s_1 = 27;
        //int s_2 = 30;
        //System.out.println("(int 27 != int 30) " + (s_1 != s_2));

    }
}
