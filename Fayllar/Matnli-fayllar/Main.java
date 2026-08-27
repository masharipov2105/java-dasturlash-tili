/*

    -Javada fayllar bilan ishlash uchun standart modullariga ega bular File, BufferedReader/ BufferedWriter
    -File moduli yordamida faylni obekt sifatida qarashimiz mumkin bo'ladi
    -BufferReder yordamida fayl obektini tez va qulay o'qish imkoniyatiga ega bo'lamiz
    -BufferWriter yordamida fayl obketiga ma'lumot yozishimiz mumkin

*/
// kerakli modullarni dasturimizga bog'laymiz
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

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

        // BufferedReader yordamida faylni o'qish

        try{
            // BufferedReader FileReader obketini qabul qiladi
            BufferedReader br = new BufferedReader(new FileReader(fayl));

            String line; // yordamich, har bir iteratsiyada faylning har bir satriga teng bo'ladi
            while ((line = br.readLine()) != null){

                System.out.println(line); // satrlarni chop etish
            }
            br.close(); // readerni yopish
        } catch(IOException e){ e.printStackTrace();}

        // test2 fayli bilan aloqa o'rnatish
        File fayl2 = new File("test2.txt");

        try {
            // BUfferedWriter yordamida nishon fayli 'br' nomli obektga aylantirilmoqda
            BufferedWriter bw = new BufferedWriter(new FileWriter(fayl2));

            BufferedReader br = new BufferedReader(new FileReader(fayl));
            // test.txt faylida yozilgan ma'lumotni teskari tartibda test2 fayliga yozishga urinamiz
            // test.txt faylidagi har bir satrni ArrayListga yuklab uni teskari taribda sikl bilan test2.txt ga yozamiz
            ArrayList<String> list = new ArrayList<>(); // arrylist obektini yaratish

            String satr;

            while((satr = br.readLine()) != null) {

                list.add(satr); // har bir satrni alohida element sifatida ro'yxatga qo'shish
            }

            for (int i = list.size() - 1; i >= 0; i --){

                bw.write(list.get(i)); //list dan ma'lumotni o'qib yozish
                bw.newLine(); // yangi satrga o'tish
            }

            // yozish amalini bajarish
            bw.flush(); // buferdagi ma'lumotni faylga yozish
            bw.close(); // writerni yopish
            br.close(); // readerni yopish

            System.out.println("Ma'lumot muvoffaqiyatli yozildi!");
        } catch (IOException e){e.printStackTrace();}
    }
}
