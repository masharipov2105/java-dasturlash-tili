/*

    -Binar fayllar bu matnli fayllardan farqli ravishda ma'lumot xom baytlar ko'rinishida bo'ladi
    -BInar fayllardagi xom baytlarni qanday o'qilishini uning fayl kengaytmasi belgilab beradi
    -java tilida binar fayllar bilan ishlash uchun FileInputStream/FileOutputStream, BufferedInputStream/BufferedOutputStream sinflari mavjud
    -java tilida primiritv qiymatlanri ham binar ko'risnishda saqlash imkoni bor, Bunda DataInputStream/DataOutputStream sinflari bor

*/

// kerakli modullarni dasturimizga bog'lash

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{

    public static void main(String[] args){

        // binar faylga ma'lumot yozish
        try{

            FileOutputStream fos = new FileOutputStream("test.dat"); // faylni obket sifatida qarash
            byte[] data = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // yozilishi kerak bo'lgan bayt ma'lumotlar massivi
            fos.write(data);
            System.out.println("ma'lumtolar muvoffaqiyatli yozildi!");
        } catch (IOException e){

            e.printStackTrace();
        }
    }
}
