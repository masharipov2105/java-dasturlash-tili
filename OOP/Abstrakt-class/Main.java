/*

    -Abstrakt class bu tugallanmagan class va tugallanmagan metodlar.
    -Abstrakt class dan obekt yaratilmaydi, u har doim superclass xisoblanadi va subclasslar uchun andoza, qolip vazifasida bo'ladi
    -Abstract class ichidagi abstract metodlarni har doim subclass ichida overriding qilish shart
    -Abstract classning konstruktori ham bo'la oladi uni subclassda super yordamida iniitalize qilish kerak

*/

public class Main{

    public static void main(String[] args){

        //Televizor sinfidan obekt yaratib test qilib ko'ramiz
        Televizor t1 = new Televizor("LG", "Trubkali televizor",100);
        t1.yoqish();
        t1.ovoz();
        t1.ochir(); 
    }
}


// Texnika nomli abstract class yaratamiz va bishqa subclasslari uchun umumiy abstract metodlarni ham yaratamiz

abstract class Texnika{

    // umumyi xususiatlarni yaratamiz
    protected String tur;
    protected String nom;
    protected int quvvat;

    // konstruktorni yaratamiz
    protected Texnika(String tur_, String nom_, int quvvat_){

        this.tur = tur_;
        this.nom = nom_;
        this.quvvat = quvvat_;
    }

    //abstract metodlarni tashkil qilish
    protected abstract void yoqish();
    protected abstract void ochir();

    //concrate yani tanasi bor oddiy metodlarni tashkil qilish
    protected static void ovoz(){

        System.out.println("texnika ovoz chiqaryati...");
    }
}

// Abstract classdan meros olgan Televizor nomli subclass yaratamiz

class Televizor extends Texnika{

    //konstruktorni shakklantiramiz
    protected Televizor(String tur_, String nom_, int quvvat_){

        //superclass konstruktori yordamida ininitllaize qilamiz
        super(tur_, nom_, quvvat_);
    }

    // meros olingan abstract metodlarni qayta yozamiz , bu majburiy amaliyot
    @Override
    protected void yoqish(){

        System.out.println(String.format("%s - %s: ishga tushdi (power on) %d W", super.tur, super.nom, super.quvvat));
    }

    @Override
    protected void ochir(){

        System.out.println(String.format("%s - %s: quvvat o'chirildi (power off) 0 W", super.tur, super.nom));
    }
}
