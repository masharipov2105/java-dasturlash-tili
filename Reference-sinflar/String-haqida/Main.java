/*

    -String sinfi nafaqat java tilida balki barcha dasturlash tillarida juda ko'p qo'llaniladigan sinfdir
    -String matnlar bilan ishlaydigan va eng ko'p qo'llaniladigan sinf
    -String matnlar va ular ustida amallar bajarish uchun ko'plab qulay va foydali metodlarga ega

*/

import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        String matn1 = "java";
        char[] char_massiv = new char[]{'s', 'a', 'l', 'o', 'm'};
        byte[] byte_massiv = new byte[]{74, 97, 118, 97};
        StringBuilder string_builder = new StringBuilder("Salom");
        StringBuffer string_buffer = new StringBuffer("Salom Buffer");
        long son1 = 2255L;

        String satr1 =  String.valueOf("Salom java");

        //konstruktorlar
        System.out.println("bo'sh satrli qiymatga ega obekt yaratadi: new String() " + new String());
        System.out.println("Biror mattni qiymat sifatida obektga beradi: new String('java') " + new String(matn1));
        System.out.println("char tipidagi massiv elementlaridan String obekti uchun qiymat xosil qiladi: new String(new char[]{'s', 'a', 'l', 'o', 'm'}) " + new String(char_massiv));
        System.out.println("char tipidagi massiv elementlaridan berilgan pozistsiyadan boshlab nechta belgigacha bo'lgan oraliqni ajratgan xolda String obekti uchun qiymat xosil qiladi: new String(new chat[]{'s', 'a', 'l', 'o', 'm'}, 0, 3) " + new String(char_massiv, 0, 3));
        System.out.println("byte tipidagi massiv elementlarini ASCII jadvalidagi belgilarga mos qilymatlarni tushungan xolatda qiymat yaratadi: new String(new byte[]{74, 97, 118, 97}) " + new String(byte_massiv));
        System.out.println("byte tipidagi massiv elementlarini ASCII jadvalidagi belgilarga mos qiymatlarini berilgan pozistsiyadan boshlab nechta belgini olish kerakligini ko'rsatgan xolda String obektiga qiymat yaratadi: String(new byte[]{74, 97, 118, 17}, 0, 2) " + new String(byte_massiv, 0, 2));
        System.out.println("StringBuilder obektidan qiymatni olib String obektiga tayinlaydi: new String(new StringBuilder('Salom')) " + new String(string_builder));
        System.out.println("StringBuffer obektidan qiymatni olib String obektiga tayinlaydi: new String(new StringBuffer('Salom Buffer')) " + new String(string_buffer));

        //static metodlar
        System.out.println("istalgan tipdagi, umuman Object sinfiga tegishli har qanday obektni String obkketiga aylantiradi: String.valueOf((long) 2255L) " + String.valueOf(son1));
        System.out.println("ko'rsatilgan ajratuvchi belgi asosida qolgan qiymatlarni birlashtiradi: String.join('#', 's', 'a', 'l', 'o', 'm') " + String.join("#", "s", "a", "l", "o", "m"));
        System.out.println("formatlangan satr yaratish, xuddi pythondagi f'{}' ga alternativ: String.format('Salom %s, yosh %d', 'Asadbek', 25) " + String.format("Salom %s, yosh %d", "Asadbek", 25));
        System.out.println("valueOf ga o'xshaydi, char massividagi elementlardan String obketi uchun qiymat yaratadi: String.copyValueOf(new char[]{'j', 'a', 'v', 'a'}) " + String.copyValueOf(new char[]{'j', 'a', 'v', 'a'}));

        //instance metodlar
        System.out.println("satr uzunligi, yani belgilar sonini qaytaradi: satr1.length() " + satr1.length());
        System.out.println("satr uzunligini 0 ga tekshiradi: satr1.isEmpity() " + satr1.isEmpty());
        System.out.println("String obektini qiymatini berilgan son marta takrorlab yangi matn yaratadi: satr1.repeat(3) " + satr1.repeat(3));
        System.out.println("satrning tarkibi probel yoki bo'sh (uzunligi 0) bo'lsa true qaytaradi: satr1.isBlank() " + satr1.isBlank());
        System.out.println("satrning berilgan index soniga mos belgisini qaytaradi: satr1.charAt(0) " + satr1.charAt(0));
        System.out.println("String obektini boshqa bir obekt bilan avval tiplar bo'yicha keyin qiymatlar bo'yicha solishtiradi: agar hammasi teng bo'lsa tre ni qaytaradi, aks xolda false ni qaytaradi: satr1.equals('Salom java') " + satr1.equals("Salom java"));
        System.out.println("satrni katta-kichik haeflarga qaramasdan taqqoslaydi: satr1.equalsIgnoreCase('salom JAVA') " + satr1.equalsIgnoreCase("salom JAVA"));
        System.out.println("String obektini qiymatini boshqa bir string obketi qiymati bilan taqqsolaydi va orasidagi farqni qaytaradi: satr1.compareTo('salom java') " + satr1.compareTo("salom java"));
        System.out.println("Berilgan ketmaketlik satr tarkibida borligini aniqlaydi: satr1.contains('ava') " + satr1.contains("ava"));
        System.out.println("Berilgan satr, obekt qiymati tarkibida ilk marta qaysi indexda kelganini qaytaradi, aks xolda -1 ni qaytaradi: satr1.indexOf(' ') " + satr1.indexOf(" "));
        System.out.println("Berilgan indexdan boshlab satr, obekt qiymatida birinchi uchiragan natijani indexini qaytaradi: satr1.indexOf('j', 7) " + satr1.indexOf("a", 8));
        System.out.println("String obektini qiymatini barini bosh harflarga o'girib qaytaradi: satr1.toUpperCase() " + satr1.toUpperCase());
        System.out.println("String obektini qiymatini barini kichik harflarga o'girib qaytaradi: satr1.toLowerCase() " + satr1.toLowerCase());
        System.out.println("String obektini qiymatini boshi va oxiridagi bo'shliqlar va probellarni olib tashlaydi: satr1.trim() " + satr1.trim());
        System.out.println("String obektini qiymatini boshi va oxiridagi bo'shliq va probellarni unicode bo'yicha olib tashlaydi: satr1.strip() " + satr1.strip());
        System.out.println("String obektini qiymatida berilgan 1-qiymatga mos belgilarni 2-qiymat ga almashtirib beradi: satr1.replace('a', 'A') " + satr1.replace("a", "A"));
        System.out.println("String obektini qiymatini berilgan 1-qiymatga mos satrni 2-qiymatga mos satr bilan almashtiradi: satr1.replace('java', 'Spring') " + satr1.replace("java", "Spring"));
        System.out.println("String obektini qiymatini berilgan ajratgich asosida String massivini qaytaradi: satr1.split(' ') " + Arrays.toString(satr1.split(" ")));

    }
}
