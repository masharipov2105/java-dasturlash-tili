/*

    -static operatori sinf ichida ayna sinfning o'ziga tegishli bo'lgan o'zgaruvchi va metodlarni shakklantiradi
    -static operatori asosida yaratilgan metod yoki o'zgaruvchiga biz istalgan kodda obket yartamasdan sinfni o'zi
    orqali murojaati qila olamiz oddiy misol: Integer.sum(a, b) sum metodi Integer sinfining static metodidir
    -static kod bloki esa o'ziga xos ajoyib vazifani bajarar ekan, u JVM ihcida kompilatsiyada faqat 1 marta yuklnib
    static o'zgaruvchilarga dastlabki qiymatlarini tayinlaydi, konstruktordan farqli tarzda u har bir obekt yaratilganda ishlamaydi
    va faqat static o'zgaruvchilarga qiymat tayinlar ekan, konstruktor esa har bir obekt ucuhn faqat instance o'zgaruvchilarga
    qiymat tayinlar ekan

*/

public class Main{

    public static void main(String[] args){

    }
}

// Talaba nomli sinf yaratish asosida static operatoridan foydalanishni ko'rib chiqamiz

class Talaba{

    // instanse xususiyatlar
    private String ism;
    private int baho;

    // static xusuiyatlar, hamma talaba uchun bir xil
    public static String OTM;
    public static int talabalar_soni;

    // static kod bloki yordamida static xusuiatlarga dastlabki qiymatlarni tayinlaymiz
    static {

        OTM = "TATUNF";
        talabalar_soni = 0;
    }

    // konstriktorni shakllantiramiz
    public Talaba(String ism_, int baho_){

        // this yordamida instanse xusuiatlarga qiymatni konstruktor parametri orqali tayinlaymiz
        this.ism = ism_;
        this.baho = baho_;
    }
}
