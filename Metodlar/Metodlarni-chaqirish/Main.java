/*

    -metod ichida boshqa bir metodni chaqirish mumkin va bu mantiqli
    -metod ichida metodni chqirganda ularning ishga tushisi va yakunlanish jarayonida aniq mantiq bor va bu tamoil
    LIFO(Last In First Out) deb nomlanadi, bu eng oxirda chaqirilgan metod birinchi yakunlanadi degani
    -nafaqat metodlar balki har qanday kod satri to'liq bajarilmagunicha keyingi satrdagi kodlar ishga tushmay navbatini kutishadi

*/


public class Main{

    public static void main(String[] args){

        // 3 ta metod yaratamiz va ketma-ketlikda bir birni chaqirib qachon boshlanishi va yakunlanishini kuzatamiz
        // bu dastur bizga LIFO tamoilini mazmunini tushunishga yordam beradi
        System.out.println("asosiy main metodi ishga tushdi ...");
        metod1(); // 1-metodni chaqirish
        System.out.println("asosiy main metodi nihoyasiga yetdi");

        // ikkita son ustda oddiy 4ta rifmetik amalni bajaradigan metdlarni yaratib bir birining ichida chaqiramiz
        int son1 = 16;
        int son2 = 5;
        hisoblash(son1, son2);
    }

    public static void metod1(){

        System.out.println("metod1 ishga tushdi ...");
        metod2(); // 2-metodni chaqirish
        System.out.println("metod1 nihoyasiga yetdi");
    }

    public static void metod2(){

        System.out.println("metod2 ishga tushdi ...");
        metod3(); // 3-metodni chqirish
        System.out.println("metod2 nihoyasiga yetdi");
    }

    public static void metod3(){

        System.out.println("metod3 ishga tushdi...");
        System.out.println("metod3 nihoyasiga yetdi");
    }

    public static void hisoblash(int a, int b){

        int natija = a + b;
        System.out.println(a + " + " + b + " = " + natija);
        ayirish(a, b);
    }

    public static void ayirish(int s1, int s2){

        int natija = s1 - s2;
        System.out.println(s1 + " - " + s2 + " = " + natija);
        kopaytirish(s1, s2);
    }

    public static void kopaytirish(int son_1, int son_2){

        int natija = son_1 * son_2;
        System.out.println(son_1 + " * " + son_2 + " = " + natija);
        bolish(son_1, son_2);
    }

    public static void bolish(int n1, int n2){

        double natija = ((double)n1) / n2;
        String natija_ = String.format("%.3f", natija);
        System.out.println(n1 + " / " + n2 + " = " + natija_);
    }
}
