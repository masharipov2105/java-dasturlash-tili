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
        int bizning_son = 12;
        System.out.println(bizning_son + " sonining kvadrati: " + kvadratXisobla(bizning_son));
    }


    // qiymat qaytarmaydigan 'void' metod yozib koramiz, chaqirilganda blokidagi kod ishga tushadi
    public static void salomlash(){

        System.out.println("Assalomu aleykum");
    }

    public static int kvadratXisobla(int son){

        // metod ichida ham o'zgaruvchi yaratish mumkin va istagancha
        // natija nomli o'zgaruvchi yaratib unga parametrdagi son o'zgaruvchisini o'zini o'ziga ko'paytirgandagi qiymatni tayinladik
        int natija = son * son;

        // natija o'zgaruvchisini metodni qiymati sifatida return operatori yordamida qaytaramiz
        return natija;
    }
}
