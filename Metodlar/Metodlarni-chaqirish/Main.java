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
}
