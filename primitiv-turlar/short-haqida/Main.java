/*
    -short primitiv turi javadagi byte dan keyingi eng kichi sonlar bilan ishlaydigan tur xisoblanadi
    -short xotira xajmi 2 baytga teng,
    -Short deb nomlanuvchi wrapper sinfiga ega.
*/



public class Main{

    public static void main(String[] args){

        short son1 = 120;
        short son2 = 150;
        String son_16 = "0xAB";
        String son_str = "171";

        //Konstanta qiymatlari
        System.out.println("Shortning eng kichik qiymati: Short.MIN_VALUE " + Short.MIN_VALUE);
        System.out.println("Shortning eng katta qiymati: Short.MAX_VALUE " + Short.MAX_VALUE);
        System.out.println("Short ning primitiv turi nomi: Short.TYPE " + Short.TYPE);
        System.out.println("Shortning xotira xajmi (bitda): Short.SIZE " + Short.SIZE + " bit");
        System.out.println("Shortning xotira xajmi (baytda): Short.BYTES " + Short.BYTES + " bayt");

        //static metodlari
        System.out.println("ikkita short o'zgaruvchilarining qiymatlari orasidagi farqni qaytaradi: Short.compare(120, 150) " + Short.compare(son1, son2));
        System.out.println("matn ko'rinishida ifodalangan va 0x formatidagi 16 lik tizimdagi sonni 10 lik tizimga o'girib short tipida qiymatini qaytarad: Short.decode('0xAB') " + Short.decode(son_16));
        System.out.println("matn ko'rinishidagi sonni qiymatini 10lik tizimda short tipiga o'girib qiymatini qaytaradi: Short.parseShort('171') " + Short.parseShort(son_str));
        System.out.println("matn ko'rinishida ifodalangan sonni berigan son qiymatidagi sanoq tizimida deb xisoblab matndagi son qiymatni 10 lik songa o'tkazib uning qiymatini short tipida qaytaradi: Short.parseShort('171', 8) " + Short.parseShort(son_str, 8));
        System.out.println("short o'zgaruvchisini qiymatini yangi String obekt sifatida matn ko'rinishidagi qiymatini qaytaradi: Short.toString(150) " + Short.toString(son2));
        System.out.println("short o'zgaruvchisini qiymatini Short wrapper sinfiga o'raydi va Short obekti sifatida qiymatini qaytaradi: Short.valueOf(120) " + Short.valueOf(son1));
        System.out.println("matn ko'rinishida ifodalangan sonni qiymatini standart xolatda 00 lik tizimda deb qataydi va Short wrapper sinfiga o'rab uni qiymatini qaytaradi: Short.valueOf('171') " + Short.valueOf(son_str));
        System.out.println("matn ko'rinishida ifodalangan va berilgan son qiymatiga teng sanoq tizimida deb xisoblan qiymatni 10 lik tizimga o'giradi va Short wrapper sinfiga o'rab qiymatini qaytaradi: Short.valueOf('171', 8) " + Short.valueOf(son_str, 8));
    }
}
