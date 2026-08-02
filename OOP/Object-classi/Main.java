/*

    -Obect classi bu java tiling eng yuqori ota classi hisoblanadi
    -Object classidan barcha boshqa classlar meros olgan, hatto standart wrapper sinflar ham
    -Biz qo'lda yaratgan oddiy classimiz ham compilatorda Obkect classidan meros oldiradi extends bo'lmasa ham
    -Obkect classidagi asosiy 3ta metodni overriding qilish orqali o'zimizga moslashtirishimiz mumkin

*/
// Kerakli classlarni import qilamiz
import java.util.Objects;


public class Main{

    public static void main(String[] args){

        // Kompyuter classi orqali obekt yaratib toString metodini test qilib ko'ramiz
        Kompyuter k1 = new Kompyuter("Apple", "MacBook Air", 16, 16, 2);
        System.out.println("k1 = " + k1);

        Kompyuter k2 = new Kompyuter("Dell", "ECS1250", 16, 16, 2);
        System.out.println("k2 = " + k2);
        // Kompyuter classida overriding qilingan equals metodini test qilib ko'ramiz
        System.out.println("k1.equals(null): " + k1.equals(null));
        System.out.println("k1.equals(k2) " + k1.equals(k2));
        System.out.println("k1.equals(k1) " + k1.equals(k1));

        // KOmpyuter classi ichida overriding qilingan hashCode metodini test qilamiz
        System.out.println("k1.hashCode() " + k1.hashCode());
        System.out.println("k2.hashCode() " + k2.hashCode());
    }
}


// KOmpyuter nomli class yaratib ichida toString equals va hashCode metodlarini overriding qilamiz

class Kompyuter{

    // o'ziga xos xususiatlarini yaratamiz
    protected String brend;
    protected String model;
    protected int yadro;
    protected int ram; // GB da
    protected int rom; // Tb da

    // konstruktorni tayinlaymiz
    protected Kompyuter(String brend_, String model_, int yadro_, int ram_, int rom_){

        //fieldslariga konstruktor parametrlari orqali dastlabki qiymatlarini berib initialize qilamiz
        this.brend = brend_;
        this.model = model_;
        this.yadro = yadro_;
        this.ram = ram_;
        this.rom = rom_;
    }

    // Object classidan meros olingan toString metodini qayta yozamiz
    @Override
    public String toString(){

        String natija = String.format("brend: %s \nmodel: %s\nyadrolar soni: %d\nRAM: %d GB\nROM: %d TB", this.brend, this.model, this.yadro, this.ram, this.rom);
        return natija;
    }

    // Object classidan meros olingan equals metodini ovveriding qilib ko'ramiz
    @Override
    public boolean equals(Object obyekt){

        if (obyekt == null){

            return false;
        } else if (this == obyekt){

            return true;
        } else{

            return false;
        }
    }

    // Object classidan meros olingan hashCode metodini overriding qilib ko'ramiz
    // Bunda classning fieldslari asosida va Object classining standart hash nomli static metodidan foydlaaniladi
    // So'ng xosil bo'lgan hash qiymaitni qaytaramiz
    @Override
    public int hashCode(){

        return Objects.hash(this.brend, this.model, this.yadro, this.ram, this.rom);
    }
}
