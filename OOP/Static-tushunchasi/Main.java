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

        // Talab sinfining static metodlarini ishlashini tekshiramiz
        // talabalr sonini hech qanday obekt yaratmasdan qancha ekanligini ko'ramiz
        System.out.println("Joriy talabalar soni (datlab): " + Talaba.getTalabalarSoni()); // dastlab 0 ta bo'lishi kerak

        // OTM nomini ko'rish, hech qanday obekt yaratmasdan, to'g'ri sinfning o'zi orqali, static metodi yordamida
        System.out.println("OTM nomi: " + Talaba.getOtm());

        // Yangi Talaba obektini yaratamiz
        Talaba talaba_1 = new Talaba("Alisher", 4); // Ismi Alisher va bahosi 4;

        // endi yana bir bor talabalar sonini ko'ramiz
        System.out.println("Joriy talabalar soni (keyin): " + Talaba.getTalabalarSoni()); // 1 taga oshgan bo'lishi kerak

    }
}

// Talaba nomli sinf yaratish asosida static operatoridan foydalanishni ko'rib chiqamiz

class Talaba{

    // instanse xususiyatlar
    private String ism;
    private int baho;

    // static xusuiyatlar, hamma talaba uchun bir xil
    public static String OTM;
    public static int talabalarSoni;

    // static kod bloki yordamida static xusuiatlarga dastlabki qiymatlarni tayinlaymiz
    static {

        OTM = "TATUNF";
        talabalarSoni = 0;
    }

    // konstriktorni shakllantiramiz
    public Talaba(String ism_, int baho_){

        // this yordamida instanse xusuiatlarga qiymatni konstruktor parametri orqali tayinlaymiz
        this.ism = ism_;
        this.baho = baho_;
        // har gal yangi talaba qo'shilganda talabalr_soni 1 taga ortishi kerak
        talabalarSoni ++;
    }

    // ism xususiati uchun getter (instanse metod)
    public String getIsm(){

        return this.ism;
    }

    // ism xususiati uchun setter (instanse metod)
    public void setIsm(String yangiIsm){

        if (!yangiIsm.isEmpty()){

            this.ism = yangiIsm;
        }
    }

    // bahoni ko'rish uchun getBaho getter (instance metod)
    public int getBaho(){

        return this.baho;
    }

    // talabalar sonini ko'rish uchun getTalabalarSoni getter (static metod)
    public static int getTalabalarSoni(){

        return talabalarSoni;
    }

    // OTM nomini ko'rish uchun getOtm getter (static metod)
    public static String getOtm(){

        return OTM;
    }
}
