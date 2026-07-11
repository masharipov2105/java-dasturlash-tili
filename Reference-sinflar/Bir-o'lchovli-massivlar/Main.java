/*

    -bir o\lchovli massiv bu ma'lum bir tipga mansub bo'lgan qiymatlarni tartib bilan o'zida saqlovchi va ularni boshqara oladigan bir tip xisoblanadi
    -java tilida har bir tip asosida bir o'lchovli massiv xosil qilish mumkin
    -bir o'lchovli massiv dasturlashda juda ko'p foydalaniladigan tur xisoblanadi

*/


public class Main{

    public static void main(String[] args){

        // int tipiga mansub massivni yaratish va unga qiymatlarini tayinlash
        int[] sonli_massiv = {0, 1, 2, 3, 12, -4, 8, 7};

        // massivning biror elementini chop etish
        System.out.println("massivning 4-indexdagi elementi: " + sonli_massiv[4]);

        //String tipidagi uzunligi oldindan ma'lum bo'lgan bo'sh massiv yaratish
        String[] oylar_massivi = new String[12];

        // bo'sh massivga qiymatlarni tayinlash
        oylar_massivi[0] = "yanvar";
        oylar_massivi[1] = "fevral";
        oylar_massivi[2] = "mart";
        oylar_massivi[3] = "aprel";
        oylar_massivi[4] = "may";
        oylar_massivi[5] = "iyun";
        oylar_massivi[6] = "iyul";
        oylar_massivi[7] = "avgust";
        oylar_massivi[8] = "sentabr";
        oylar_massivi[9] = "oktabr";
        oylar_massivi[10] = "noyabr";
        oylar_massivi[11] = "dekabr";

        System.out.println("Oylar massivining elementlari");
        // for sikli yordamida massivning barcha elemeentlarini chop etish
        // for eich siklidan foydalanib barcha elementlarni chop etish
        for (String oy : oylar_massivi){

            System.out.print(oy + " ");
        }
        // bir probel pastga o'tkazish uchun
        System.out.println();

        // massiv elementlarini qiymatlarini o'zgartirib ko'ramiz
        int[] sonlar = {12, 14, 15, 17, 20};
        System.out.println("sonlar massivining 0-elementi dastlab: " + sonlar[0]);
        sonlar[0] = -2;
        System.out.println("sonlar massivining 0-elementi keyin: " + sonlar[0]);

    }
}
