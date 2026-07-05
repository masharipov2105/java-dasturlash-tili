/*

    sikl operatori asosida teng yoni to'g'ri burchakli uchburchakni o'xshatuvchi dastur
    sikl ichidagi sikl asosida ishlaydi va mahallliy o'zgaruvchilarini bir biriga bog'lash asosida har bir satrda sikl oshib boradi

*/

public class Uchburchak{

    public static void main(String[] args){

        // yon tomonli uzunligi va qanday belgidan tashkil topishini e'lon qilamiz

        byte yon_tomon = 15;
        char belgi = 'A';

        System.out.println(yon_tomon + "x" + yon_tomon + " o'lchamli teng yonli uchburchak\n");

        // primitiv tipni qiymati asosida obekt yaratamiz
        Byte yon_tomon_ = Byte.valueOf(yon_tomon);

        // sikl ichidagi siklni quramiz
        for (int i = 1; i <= yon_tomon_.intValue(); i ++){

            for (int j = 0; j < i; j ++){

                System.out.print(belgi + " ");
            }

            System.out.println();
        }
    }
}
