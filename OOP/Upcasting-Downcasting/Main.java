/*

    -pucasting bu subclass dan superclassga referens orqali ishora qilishva bir xil tipga o'tib olish ni anglatadi
    -pucasting xavfsiz amaliyot va avtomatik tarzda amalga oshiriladi chunki har qanday subclassinig o'z superclassi bor
    -downcasting aniq bo'lmaganligi sababli xavfliroq amaliyot xisoblanadi upcastingning teskari amali
    -downcasting superclass referensini o'zining biror subcassiga o'tkazishni anglatadi
    -downcasting amaliyoti xavfliroq sababi biz o'tkazmiqchi bo'lgan subcass bizni supercassdan meros olganligi aniq emas xollar mavjud
     bunday vaziatlar uchun xavfsizlik tekshiruvi mavjud bo'lim maxsus instanceof operatori orqali
     biror sinf biror bir sinfga tegishliligini tekshirib bool tipida qiymat qaytaradi

*/

public class Main{

    public static void main(String[] args){

    }
}

// Hayvon nomli superclass yaratamiz va qolgan subclasslar ucuhn umumiy bo'lgan metodlarni hamyaratamiz
class Hayvon{

    //parametrsiz konstruktor shakklantiramiz
    protected Hayvon(){}

    // barcha subclasslar uchun umumiy metodlar
    protected void ovoz(){

        System.out.println("Ovoz chiqarish...");
    }
}


// Mushuk nomli subclass yaratamiz va Hayvon superclassidan meros olamiz
class Mushuk extends Hayvon{

    // parametrsiz konstruktor yaratamiz
    protected Mushuk(){super();}

    // meros olingan metodlarni qayta yozamiz
    @Override
    protected void ovoz(){

        System.out.println("Mushuk: mioovv-moovv!");
    }
}

// Kuchuk nomli subclass yaratamiz, Hayvon sinfidan meros olamiz
class Kuchuk extends Hayvon{

    //paramersiz konstruktor yaratamiz
    protected Kuchuk(){super();}

    // meros olingan metodlarni qayta yozamiz
    protected void ovoz(){

        System.out.println("Kuchuk: voov-voov!");
    }
}

