/*

    -Dasturda har doim to'g'ri ma'lumot kiritlmasligi mumkin, natijada noto'g'ri ma'lumot ustida amaliyot bajariladi
    -Noto'g'ri ma'lumiit ustida amaliyot bajarilganda albatta dasturda xatolik yuzaga keladi
    -Xatolik deb dastur kutilgan trayektoriyasidan og'ishiga aytiladi, Natijada dastur muzlaydi yoki JVM ishdan chiqishi mumkin
    -Xatolik yuzga kelishi mumkin bo'lgan kod satrini try nomli maxsus kod bloki ichiga yozish orqali xatolikni ushlash mumkin
    -Try bloki ihicda sodir bo'lgan xatolik catch bloki icida qayta ishlanishi va dastur muzlashining oldini olish mumkin
    -Xatoliklar turiga ko'ra juda ko'p toifalarga ega va ularning barchasi Throwable super sinfining obekti bo'ladi

*/

// kerakli modularni dasturimizga yuklaymiz
import java.lang.ArithmeticException;

public class Main{

    public static void main(String[] args){

        // Eng oddiy misol 0 ga bo'lish amaliyotining natijasi
        // Kompilatsiyada xatolik aniqlanmaydi
        // Runtime vaqtida aniqlanadi
        int a = 10;
        int b = 0;

        //System.out.println("a / b = " + (a / b));
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at Main.main(Main.java:20)

        // Xatolik bo'lishi mumkin bo'lgan kod try-catch bloklariga ko'chiriladi
        try{

            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException error){

            System.out.println(error.getMessage());
        }

        // Massivning mavjud bo'lmagan indexsiga yani uzunligidan tashqaridagi indexsiga murojjatni sinab ko'ramiz
        // xatolikni kuzatamiz

        int[] massiv = new int[5];

        //System.out.println(massiv[10]);

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	//at Main.main(Main.java:41)

        try{

            System.out.println(massiv[10]);
        } catch (ArrayIndexOutOfBoundsException error){

            System.out.println(error.getMessage());
        }

        // matn ustida ham null qiymatining uzunligini olisha urinib ko'ramiz
        // xatolikni kuzatamiz
        String matn = null;

        //System.out.println(matn.length());

        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
	//at Main.main(Main.java:59)

        try{

            System.out.println(matn.length());
        } catch (NullPointerException error){

            System.out.println(error.getMessage());
        }

        // matnni songa aylantirishga urinib ko'ramiz
        // xatolikni kuzatamiz
        String str_num = "123a";
        //int int_num = Integer.parseInt(str_num);

        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "123a"
        	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        	at java.base/java.lang.Integer.parseInt(Integer.java:668)
        	at java.base/java.lang.Integer.parseInt(Integer.java:786)
        	at Main.main(Main.java:76)
        */

        try{

        int int_num = Integer.parseInt(str_num);
        } catch (NumberFormatException error){

            System.out.println(error.getMessage());
        }
    }
}
