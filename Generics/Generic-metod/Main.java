/*

    -generic-metodlar bular turli tiplar uchun ishlay oladigan va kompilatsiya vaqida tip aniqlanadigan metodlar
    -generic-metodlar bilan bir marta yozilgan metod turli tiplar uchun ishlay oladi
    -generic-metodlarda tipni ma'lum bir doirada ishlaydigan qilish mumkin <T extends Number> va h.k

*/

public class Main{

    public static void main(String[] args){

        // testing adder generic metod
        System.out.println(adder(2, 3));
        System.out.println(adder("3.14", "Salom"));

        // testing swap generic metod
        String[] arr1 = {"Salom", "Dunyo", "Yakshanba", "Bugun"}; // create simple array

        // print example array
        for (String i : arr1){

            System.out.print(i + " ");
        }
        System.out.println();

        swap(arr1, 0, 3); // execute generic metod

        // print example array
        for (String i : arr1){

            System.out.print(i + " ");
        }
        System.out.println();
    }

    // parametr sifatida berilgan argumetlarni string ko'riinishida qo'shish
    //  natijani Stringda qaytaruvchi generic metod yozamiz
    public static <T> String adder(T a, T b){

        return (String.valueOf(a) + " " + String.valueOf(b));
    }

    // T tipidagi arrayni 2ta indeksini qiymatolarni almashtirish
    // avval arr[0] = x, arr[1] = y , keyin arr[0] = y, arr[1] = x

    public static <T> void swap(T[] array, int indx1, int indx2){

        T helper;
        helper = array[indx1];
        array[indx1] = array[indx2];
        array[indx2] = helper;
    }
}



