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

        // qoshish nomli metodni int, double va String asosida overloading qilishni ko'ramiz
        int son_1 = 13;
        int son_2 = 17;
        double s_1 = 13.1;
        double s_2 = 16.9;
        String str_1 = "14";
        String str_2 = "16";

        // metodlarni chaqirib sinab ko'rish
        System.out.println(String.format("int %d, int %d qoshish metodini chaqiramiz: " + qoshish(son_1, son_2), son_1, son_2));
        System.out.println(String.format("double %.3f, double %.3f qoshish metodini chaqiramiz: " + qoshish(s_1, s_2), s_1, s_2));
        System.out.println(String.format("String %s, String %s, qoshish metodini chaqiramiz: " + qoshish(str_1, str_2), str_1, str_2));

        // varargs parametridan foydalanishga oddiy misol
        // metodni chaqirgandan keyin argumetga (,) vergul bilan ajratilgan xolda istalgancha butun son kiritish mumkin
        System.out.println("dastlabki 10ta natural sonlar yigindisi allSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10): " + allSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // 55


    }
    // ikki parametrli overloadign qilingan metod
    public static int kopaytirish(int son_1, int son_2){

        int natija = son_1 * son_2;
        return natija;
    }
    // uch parametrli overloading qilingan metod
    public static int kopaytirish(int s_1, int s_2, int s_3){

        int natija_2 = s_1 * s_2 * s_3;
        return natija_2;
    }
    // to'rt parametrli overloading qilingan metod
    public static int kopaytirish(int n_1, int n_2, int n_3, int n_4){

        int natija_3 = n_1 * n_2 * n_3 * n_4;
        return natija_3;
    }

    // int tipidagi parametrlariga ega overloading qilingan qoshish metodi
    public static int qoshish(int s_1, int s_2){

        int natija = s_1 + s_2;
        return natija;
    }

    // double tipidagi parametrlariga ega overloading qilingan qoshish metodi
    public static double qoshish(double n_1, double n_2){

        double natija_ = n_1 + n_2;
        return natija_;
    }

    // String tipidagi parametrlariga ega overloading qilingan qoshish metodi
    public static String qoshish(String a_1, String a_2){

        int son_1 = Integer.parseInt(a_1);
        int son_2 = Integer.parseInt(a_2);

        int natija = son_1 + son_2;
        String natija_yakuniy = String.valueOf(natija);

        return natija_yakuniy;
    }

    // Varargs parametriga ega allSum nomli metod, baracha parametrlar yig'indisini qaytaradi
    public static int allSum(int... sonlar){

        int yigindi = 0;

        for(int i : sonlar){

            yigindi += i;
        }
        return yigindi;
    }
}
