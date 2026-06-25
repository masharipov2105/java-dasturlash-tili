/*
    -char tipi nafaqat java tilida balki boshqa ko'plab OOP tillarida mavjud
    -char uzunligi 1 ga teng String deb tushunish mumkin
    -String tipidan avval char tipi mavjud bo'lgan va String go'yoki char[] massiviga praporsional
    -char tipining Character deb nomlanuvchi wrapper sinfi mavjud

*/


public class Main{

    public static void main(String[] args){

        char belgi1 = 'a';
        char belgi2 = '7';
        char belgi3 = '?';
        char belgi4 = '	';
        char belgi5 = 'B';

        //konstanta qiymatlari
        System.out.println("char tipining xotira xajmi (baytda): Character.BYTES " + Character.BYTES + " bayt");
        System.out.println("char tipining xotira xajmi (bitda): Character.SIZE " + Character.SIZE + " bit");
        System.out.println("char tipining eng katta qiymati: Character.MAX_VALUE " + Character.MAX_VALUE);
        System.out.println("char tipining eng kichik qiymati: Character.MIN_VALUE " + Character.MIN_VALUE);
        System.out.println("Character sinfining primitiv turi tipini qaytaradi: Character.TYPE " + Character.TYPE);


        //static metodlar
        System.out.println("belgini harf ekanligini tekshiradi: Character.isLetter('a') " + Character.isLetter(belgi1));
        System.out.println("belgini raqam ekanligiga tekshiradi: Character.isDigit('7') " + Character.isDigit(belgi2));
        System.out.println("belgini harf yoki raqam ekanligni tekshiradi: Character.isLetterorDigit('?') " + Character.isLetterOrDigit(belgi3));
        System.out.println("belgini bo'shliq ekanligni tekshiradi: Character.isWitespace('	') " + Character.isWhitespace(belgi4));
        System.out.println("belgini katta harf ekanligini tekshiradi: Character.isUpperCase('B') " + Character.isUpperCase(belgi5));
        System.out.println("belgini kichik harf ekanligini tekshiradi: Character.isLowerCase('B') " + Character.isLowerCase(belgi5));
        System.out.println("belgini bosh harfga aylantiradi: Character.toUpperCase('a') " + Character.toUpperCase(belgi1));
        System.out.println("belgini kichik harfga aylantiradi: Character.toLowerCase('B') " + Character.toLowerCase(belgi5));
        System.out.println("belgini berilgan sanoq tizimi asosida 10 lik tizimda qaytaradi: Character.digit('B', 16) " + Character.digit(belgi5, 16));
        System.out.println("sonni berilgan sanoq tizimi asosida belgisini qaytaradi: Character.forDigit(11, 16) " + Character.forDigit(11, 16));
        System.out.println("belgini olib Character wrapper sinfiga o'raydi va obekt yaratadi, println ichida esa obektni String sifatida qaytaradi: Character.valueOf('a') " + Character.valueOf(belgi1));
        System.out.println("char tipidagi belgini String obektiga aylantirib qaytaradi: Character.toString('B') " + Character.toString(belgi5));
        System.out.println("ikkita char tipidagi qiymatlarni solishtiradi, va orasidagi farqni qaytaradi: Character.compare('a' , 'B') " + Character.compare(belgi5, belgi1));

    }
}
