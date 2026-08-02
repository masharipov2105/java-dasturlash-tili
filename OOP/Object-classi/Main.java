/*

    -Obect classi bu java tiling eng yuqori ota classi hisoblanadi
    -Object classidan barcha boshqa classlar meros olgan, hatto standart wrapper sinflar ham
    -Biz qo'lda yaratgan oddiy classimiz ham compilatorda Obkect classidan meros oldiradi extends bo'lmasa ham
    -Obkect classidagi asosiy 3ta metodni overriding qilish orqali o'zimizga moslashtirishimiz mumkin

*/

public class Main{

    public static void main(String[] args){

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

    
}
