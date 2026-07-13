/*

    -metod bu har bir dasturlash tilidagi muhim vosita bo'lib asosan kod qulayligi va mudullashtirishni taminlaydi
    -metod bir qancha xuxisyatlariga ko'ra turlicha guruhlanadi yani qiymat qaytarishiga kora (void va qiymat qaytaruvchi) va h.k
    -metodlar chaqirish asosida ishga tushadi va dastur davomida istaganchz chaqirish mumkin
    -public static void main(String[] args) ham aslida bir metod, bu javadagi eng muhim va birinch ishga tushadigan metod xisoblanadi

*/


public class Main{

    public static void main(String[] args){

        // yaartgan metodimizni chaqiramiz
        salomlash();
    }


    // qiymat qaytarmaydigan 'void' metod yozib koramiz, chaqirilganda blokidagi kod ishga tushadi
    public static void salomlash(){

        System.out.println("Assalomu aleykum");
    }
}
