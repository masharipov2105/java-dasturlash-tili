/*

    -String sinfi nafaqat java tilida balki barcha dasturlash tillarida juda ko'p qo'llaniladigan sinfdir
    -String matnlar bilan ishlaydigan va eng ko'p qo'llaniladigan sinf
    -String matnlar va ular ustida amallar bajarish uchun ko'plab qulay va foydali metodlarga ega

*/


public class Main{

    public static void main(String[] args){

        String matn1 = "java";
        char[] char_massiv = new char[]{'s', 'a', 'l', 'o', 'm'};
        byte[] byte_massiv = new byte[]{74, 97, 118, 97};
        StringBuilder string_builder = new StringBuilder("Salom");
        StringBuffer string_buffer = new StringBuffer("Salom Buffer");

        //konstruktorlar
        System.out.println("bo'sh satrli qiymatga ega obekt yaratadi: new String() " + new String());
        System.out.println("Biror mattni qiymat sifatida obektga beradi: new String('java') " + new String(matn1));
        System.out.println("char tipidagi massiv elementlaridan String obekti uchun qiymat xosil qiladi: new String(new char[]{'s', 'a', 'l', 'o', 'm'}) " + new String(char_massiv));
        System.out.println("char tipidagi massiv elementlaridan berilgan pozistsiyadan boshlab nechta belgigacha bo'lgan oraliqni ajratgan xolda String obekti uchun qiymat xosil qiladi: new String(new chat[]{'s', 'a', 'l', 'o', 'm'}, 0, 3) " + new String(char_massiv, 0, 3));
        System.out.println("byte tipidagi massiv elementlarini ASCII jadvalidagi belgilarga mos qilymatlarni tushungan xolatda qiymat yaratadi: new String(new byte[]{74, 97, 118, 97}) " + new String(byte_massiv));
        System.out.println("byte tipidagi massiv elementlarini ASCII jadvalidagi belgilarga mos qiymatlarini berilgan pozistsiyadan boshlab nechta belgini olish kerakligini ko'rsatgan xolda String obektiga qiymat yaratadi: String(new byte[]{74, 97, 118, 17}, 0, 2) " + new String(byte_massiv, 0, 2));
        System.out.println("StringBuilder obektidan qiymatni olib String obektiga tayinlaydi: new String(new StringBuilder('Salom')) " + new String(string_builder));
        System.out.println("StringBuffer obektidan qiymatni olib String obektiga tayinlaydi: new String(new StringBuffer('Salom Buffer')) " + new String(string_buffer));
    }
}
