/*

    - overlading tushunchasi bu dastur ichida bir xil nom bilan bir qancha metodlarni yaratish mumkinligini ko'rsatadi
    - bir nechta bir xil nomli metodlarni overlaoding qilish uchun o'ziga xos shartlar asosida amalga oshirish mumkin
    - varargs tushunchasi metod ichida shunday bir parametrni yaratish imkoniyatini beradiki argumetlar uzunligi aniq bo'lmagan
      vaziyatlarda uni ishatish mumkin va argumetlar metod ichida massiv kabi qabul qilinadi
    - varargs va massivning o'xshahsliklari shundaki ikkisi ham metod ichida massiv kabi qabul qilinib ahr bir argumetni element
      sifatida ko'radi va index yordamida murojaat qilish mumkin.
    - varargs va massiv nig farqi esa matodni chaqirish vaqtida argumetlarni tayinlashda sintaksisida farq bo'ladi

*/

public class Main{

    public static void main(String[] args){

        // kopaytirish nomli parametrlari 2, 3, va 4 ta bo'lgan metodlarni overload qilishni ko'rib chiqamiz
        int num_1 = 6;
        int num_2 = -22;
        int num_3 = 10;
        int num_4 = -8;

        System.out.println(String.format("%d, %d sonlarini (2 ta parametrli metod chaqiriladi) ko'paytirish: " + kopaytirish(num_1, num_2), num_1, num_2));
        System.out.println(String.format("%d, %d, %d sonlarini (3 ta parametrli metod chaqiriladi) ko'paytirish " + kopaytirish(num_1, num_2, num_3), num_1, num_2, num_3));
        System.out.println(String.format("%d, %d, %d, %d sonlarini (4 ta parametrli metod chaqiriliadi) ko'paytirish: " + kopaytirish(num_1, num_2, num_3, num_4), num_1, num_2, num_3, num_4));

    }

    public static int kopaytirish(int son_1, int son_2){

        int natija = son_1 * son_2;
        return natija;
    }

    public static int kopaytirish(int s_1, int s_2, int s_3){

        int natija_2 = s_1 * s_2 * s_3;
        return natija_2;
    }

    public static int kopaytirish(int n_1, int n_2, int n_3, int n_4){

        int natija_3 = n_1 * n_2 * n_3 * n_4;
        return natija_3;
    }
}
