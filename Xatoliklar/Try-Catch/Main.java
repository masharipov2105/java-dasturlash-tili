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
    }
}
