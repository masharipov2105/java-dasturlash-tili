/*

    - 2+ meroslar zanjirini xosil qilish mumkin Yani C extends B extends A kabi
    - faqat konstrultori private bo'lmagan sinflardan meros olish mumkin
    - ota sinf konstrultorida parametrlar bo'lsa bola sinfda super ni ishlatish majburiy
    - ota sinf konsturltorida parametr bo'lmasa bola sinfda super yozmasa ham ota ainf konsturktori ishlaydi

*/

public class Main{

    public static void main(String[] args){

        // Test maqsadida ota sinf asosida obekt yaratamiz
        //Ota ota = new Ota("Otajonov", 70);
        //System.out.println("ism: " + ota.getIsm());
        //System.out.println("yosh: " + ota.getYosh());
        //System.out.println("turi: " + Ota.getTuri());

        // Test uchun Bola sinfidan obekt yaratamiz
        Bola bola = new Bola("Vali", 40, "Aliev");
        System.out.println("Ism: " + bola.getIsm());
        System.out.println("yosh: " + bola.getYosh());
        System.out.println("familiya: " + bola.getFamiliya());
        System.out.println("tur: " + Bola.getTuri());
    }
}

// Uch ta sinfdan  iborat meroslar tarmog'ini qurib ko'ramiz
// Bunda asosiy Ota sinfi undan meros oladigan Bola sinfi va undan meros oladigan Nevara sinfini quramiz
// Bir biridan meros olishini va ularda o'ziga xos fieldsarni yaratib o'zaro qanday bog'lanishini ko'ramiz


class Ota{

    // o'ziga xos va sub classlari uchun umumiy bo'lgan xususiatlar
    protected String ism;
    protected int yosh;
    private static String turi;

    // static fieldslarga dastlabki qiymatlarini tayinlash
    static{

        turi = "Ota";
    }

    // protected konstruktor shakklantiramiz, qolgan sub classlar meros olishi uchun
    protected Ota(String ism_, int yosh_){

        // static bo'lmagan fieldslarga dastlabki qiymatlarini tayinlaymiz
        this.ism = ism_;
        this.yosh = yosh_;
        // Ota sinf konstruktori doim chaqirilishini ko'rish uchun konsolga matn chop etmaiz
        System.out.println("Ota sinf konstruktori initialize bo'ldi!");
    }

    // shunchaki o'tgan mavzularni takrorlash uchun Ota sinfning o'zida static metod yaratamiz
    protected static String getTuri(){

        return turi;
    }

    // private Staric fiedlsni bola sinf ichida o'zgartirishni tajriba qilib ko'ryapmiz
    protected static void setTuri(String yangiTur){

        if (!yangiTur.isEmpty()){

            turi = yangiTur;
        } else{

            System.out.println("Bo'sh tur bo'la olmaydi!");
        }
    }

    // getter lar yaratamiz;
    protected String getIsm(){

        return this.ism;
    }

    protected int getYosh(){

        return this.yosh;
    }

}

// Bola sinfini Ota sinfdan meros olish orqali shakkklantiramiz
class Bola extends Ota{

    // o'ziga xos fieldslar
    protected String familiya;

    // konstruktorni shakklantiramiz
    protected Bola(String ism_, int yosh_, String familiya_){

        //super yordamida Ota sinf konstruktorini chaqirish MAJBURIY!
        super(ism_, yosh_); // meros olingan fiedlslarini initialize qilamiz
        // o'sining fieldsini initialize qilamiz
        this.familiya = familiya_;
        Ota.setTuri("Bola");
        // Bola sinfning konstruktori initialize bo'lishini ko'rish ucun konsolga matn chop etamiz
        System.out.println("Bola sinf konstruktori initialize bo'ldi!");
    }

    // o'ziga xos fields uchun getter
    protected String getFamiliya(){

        return this.familiya;
    }
}
