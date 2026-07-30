/*

    -Abstrakt class bu tugallanmagan class va tugallanmagan metodlar.
    -Abstrakt class dan obekt yaratilmaydi, u har doim superclass xisoblanadi va subclasslar uchun andoza, qolip vazifasida bo'ladi
    -Abstract class ichidagi abstract metodlarni har doim subclass ichida overriding qilish shart
    -Abstract classning konstruktori ham bo'la oladi uni subclassda super yordamida iniitalize qilish kerak

*/

public class Main{

    public static void main(String[] args){

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
