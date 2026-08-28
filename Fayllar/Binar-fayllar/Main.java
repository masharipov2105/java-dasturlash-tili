/*

    -Binar fayllar bu matnli fayllardan farqli ravishda ma'lumot xom baytlar ko'rinishida bo'ladi
    -BInar fayllardagi xom baytlarni qanday o'qilishini uning fayl kengaytmasi belgilab beradi
    -java tilida binar fayllar bilan ishlash uchun FileInputStream/FileOutputStream, BufferedInputStream/BufferedOutputStream sinflari mavjud
    -java tilida primiritv qiymatlanri ham binar ko'risnishda saqlash imkoni bor, Bunda DataInputStream/DataOutputStream sinflari bor

*/

// kerakli modullarni dasturimizga bog'lash

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Main{

    public static void main(String[] args){

        // binar faylga ma'lumot yozish
        try{

            FileOutputStream fos = new FileOutputStream("test.dat"); // faylni yozish uchun obektga aylantirish
            byte[] data = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // yozilishi kerak bo'lgan bayt ma'lumotlar massivi
            fos.write(data); // ma'lumotni yozish
            System.out.println("ma'lumtolar muvoffaqiyatli yozildi!");
        } catch (IOException e){

            e.printStackTrace();
        }

        // Binar fayllni o'qishni ko'ramiz
        try{

            FileInputStream fis = new FileInputStream("test.dat"); // faylni o'qish uhcun obektga aylantirish
            int data_line; // yordamichi o'zgaruvchi, har bir baytdagi ma'lumotni o'zida aks ettiradi
            while ((data_line = fis.read()) != -1){

                System.out.print(data_line + " "); // har bir iteratsiyadagi ma'lumotni chop etib boradi
            }
            System.out.println(); // yakuniy enter tashlash
        } catch(IOException e){

            e.printStackTrace();
        }

        // Buferlash orqali binar faylni yozish
        try{

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test2.dat")); //BuffedOutputStream obektini yaratish

            byte[] data_ = {10, 20, 20, 40, 50}; // yozilishi kerak bo'lgan baytlar
            bos.write(data_); // buferga yozish
            bos.flush(); // buferdagi ma'lumotni faylga yozish
            System.out.println("test2.dat fayliga ma'lumitlar yozildi");
        } catch (IOException e){

            e.printStackTrace();
        }
    }
}
