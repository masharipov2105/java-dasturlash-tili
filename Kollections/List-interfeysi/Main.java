/*

    -Arraylist obektini List sinfining subclasi bo'lib oddiy massiga nisbatan ko'plab qulayliklarga ega ro'yxat tizimi
    -ArrayList ko'p o'qish amaliyoti bajariladigan tizimlarda o'z samaradorigi bilan ajralib turadi
    -Arraylist ko'p o'qishdan tashqari oxiriga yozish jarayonida ham o'z tezligi bilan qolgan ro'yxatlardan farqlanadi

    -LinkedList bu ArrayListdan farqli ravishda elemetlarini saqlashda elementning o'zidan oldingi va keyingi elemtga yo'lni ham saqlaydi
    -LinkedList shu sabali ham ArrayListag nisbatan ko'piroq xotira talab qiladi
    -LinkedListning asosiy kuchli tomonlari ko'p malumotlar ro'yxat boshi va oxiriga qo'shish va o'chirish amali juda tez
    -LinkedList ning kamchiliklari malumotni index bo'yicha o'qish sekin, ArrayListga nisbatan

*/

// kerakli modullarni dasturimiz bilan bog'laymiz
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

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


        //=========================================================================================================
        //=========================================================================================================
        //=========================================================================================================

        // LinkedList bo'yicha amaliy kod
        // LinkedListni yaratish va uning asosiy metodlari bilan tanishuv

        LinkedList<String> linked_list = new LinkedList<>(); // LinkedList ro'yxatini yaratish

        // LinkedList ro'yxatiga ma'lumot qo'shish usullari
        linked_list.add("Rezistor"); // indeks ko'rsatilmagan, avtomatik ro'yxat oxiriga qo'shadi
        linked_list.add(1, "Kondensator"); // indeksni aniq ko'rsatgan xolda ma'lumot qo'shish

        System.out.println("linked_list = " + linked_list);

        // Ma'lumotni o'qish usullari
        String l1 = linked_list.get(0); // indeks bo'yicha ma'lumotni o'qish
        String l2 = linked_list.getFirst(); // LinkedListning o'ziga xos tezkor metodi, ro'yxat boshidagi elemtni olish
        String l3 = linked_list.getLast(); // LinkedListning o'ziga xos tezkor metodi, ro'yxat oxiridagi elemtni olish

        System.out.println("linked_list: " + l1 + " " + l2 + " " + l3);
    }
}
