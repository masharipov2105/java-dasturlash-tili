/*

    - 2+ meroslar zanjirini xosil qilish mumkin Yani C extends B extends A kabi
    - faqat konstrultori private bo'lmagan sinflardan meros olish mumkin
    - ota sinf konstrultorida parametrlar bo'lsa bola sinfda super ni ishlatish majburiy
    - ota sinf konsturltorida parametr bo'lmasa bola sinfda super yozmasa ham ota ainf konsturktori ishlaydi

*/

public class Main{

    public static void main(String[] args){

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

    // getter lar yaratamiz;
    protected String getIsm(){

        return this.ism;
    }

    protected int getYosh(){

        return this.yosh;
    }

}
