/*

    -Arraylist obektini List sinfining subclasi bo'lib oddiy massiga nisbatan ko'plab qulayliklarga ega ro'yxat tizimi
    -ArrayList ko'p o'qish amaliyoti bajariladigan tizimlarda o'z samaradorigi bilan ajralib turadi
    -Arraylist ko'p o'qishdan tashqari oxiriga yozish jarayonida ham o'z tezligi bilan qolgan ro'yxatlardan farqlanadi


*/

// kerakli modullarni dasturimiz bilan bog'laymiz
import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        //ArrayList yaratib uni imkoniyatlarini ko'rib chiqamiz
        List<String> array_list = new ArrayList<>(); // Oddiy o'lchami aniq bo'lmagan bosh ro'yxat

        // ro'yxatimizga elementlar qo'shamiz
        // qo'shilayotgan har bir yangi element doim ro'yxat oxiriga yozib boriladi

        array_list.add("Olma");
        array_list.add("Uzum");
        array_list.add("Anjir");
        array_list.add("Tarvuz");

        // ro'yxatni chop etish
        System.out.println("array_list = " + array_list);

        // yangi elemntni istalgan indexga qo'shishimiz mumkin
        array_list.add(0, "Shaftoli");
        System.out.println("array_list = " + array_list);

        // index bo'yicha elemenni o'qish mumkin
        System.out.println("array_list[1] = " + array_list.get(1));

        // istalgan indexdagi elementni o'chirish
        array_list.remove(4); // 4-element: Tarvuz ni o'chirish
        System.out.println("array_list = " + array_list);

        // elemtni indexsidan tashqari uning qiymati asosida ham o'chirihs mumkin
        array_list.remove("Olma"); // Olma qiymatiga ega elementni o'chirish
        System.out.println("array_list = " + array_list);

        // ro'yxatning uzunligini ko'rish
        System.out.println("array_list.size() = " + array_list.size());

        //ro'yxatni bosh yoki bo'sh emasligini tekshirish
        System.out.println("array_list.isEmpty() = " + array_list.isEmpty());

        // BIror indexdagi elemtning qiymatini yangilash imkoniyati
        array_list.set(0, "Nok");
        System.out.println("array_list = " + array_list);

        // elementni izlash yani qiymatga mos eleemntni ro'yxat boshida yo oxiridan izlab indexisni chop etish mumkin
        // indexOf metodi kiritilgan qiymatga mos datlabki natijani ro'yxat boshida izlaydi
        array_list.add(1, "Banan");
        array_list.add("Banan");

        System.out.println("array_list dagi ro'yxat boshidan izlangandagi ilk natija: " + array_list.indexOf("Banan"));
        System.out.println("array_list dagi ro'yxat oxiridan izlangandagi ilk natija: " + array_list.lastIndexOf("Banan"));

        // malum bir qiymatga teng element ro'yxatda borligini aniqlash
        System.out.println("array_list? Banan " + array_list.contains("Banan"));

        // ro'yxatni butunlay tozalash
        array_list.clear(); // barcha elementlarni yo'q qilib ro'yxatni boshatish
    }
}
