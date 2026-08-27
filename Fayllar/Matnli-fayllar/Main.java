/*

    -Javada fayllar bilan ishlash uchun standart modullariga ega bular File, BufferReder/ BufferWriter
    -File moduli yordamida faylni obekt sifatida qarashimiz mumkin bo'ladi
    -BufferReder yordamida fayl obektini tez va qulay o'qish imkoniyatiga ega bo'lamiz
    -BufferWriter yordamida fayl obketiga ma'lumot yozishimiz mumkin

*/
// kerakli modullarni dasturimizga bog'laymiz
import java.io.File;


public class Main{

    public static void main(String[] args){

        // File classi yordamida o'zimizni mahalliy faylimizni obektga aylantiramiz
        // File sinfi faylni meta malumiotlarini olishga ham imkon beradi
        File fayl = new File("test.txt");

        // fayl haqida ma'lumotlar olish
        System.out.println("fayl nomi: " + fayl.getName());
        System.out.println("fayl yo'li: " + fayl.getPath());
        System.out.println("absolut yo'li: " + fayl.getAbsolutePath());
        System.out.println("fayl o'lchami: " + fayl.length() + " bayt");
    }
}
