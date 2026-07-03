/*

    -ternary operatori, shart operatorining xusuiy xoli, yani sjddalahstirilgan ko'rinishi
    -ternary operatori qachonki o'zgaruvchi faqat 2ta qiymatdan birini shart asosda qabul qila oladigan vaziatda ishlatish o'rinli bo'ladi
    maslaan (katta-kichik, yosh-qari, zun-kalta, musbat=manfiy, juft-toq va h.k)
    -ternary-operatorlari, shart operatorlariga kirish desak ham bo'ladi

*/


public class Main{

    public static void main(String[] args){

    int son1 = 12;
    int son2 = 15;

    int katta = (son1 > son2) ? son1 : son2;
    System.out.println(son1 + " va " + son2 + "ichida eng kattasi: " + katta);


    int yosh  = 15;
    String xulosa = (yosh >= 18) ? "katta" : "kichik";
    System.out.println(yosh + " yoshi 18 dan " + xulosa);

    int son = 7;
    String natija = (son % 2 == 0) ? "juft" : "toq";
    System.out.println(son + " soni " + natija);

    }
}
