/*

    -HashSet Set interfeysida ko'p ishlatiladigan implementlardan biri bo'lib unikallik muhim tizimlarda ajoyib variant
    -HashSet ma'lumotlarni yig'ish vaqtida dubliklatlarni avtomatik saqlaaydi va unikallikni taminlaydi
    -HashSet faqat 1 ta null qiymatini saqlay oladi, chunki 2 ta null ham dublikat xisoblanadi
    -HashSet tizimida tartib kafolatlanmangan, sababi qimatlar hash qiymatlari asosida saqlanadi, qiymatlarni oldindan aytish qiyin

*/

// kerakli modullarni dasturimiz bilan ulash
import java.util.HashSet;


public class Main{

    public static void main(String[] args){

        // HashSet ro'yxatini tayinlash
        HashSet<String> hash_set = new HashSet<>();

        // HashSetga ma'lumot qo'shish usullari
        // ushbu metod boolean qiymati qaytaradi, agar elemet unikal bo'lsa ture, yani element qo'shildi
        // agar false qiymat qaytarsa demak elementni allaqachon dublikati bor, va bu element qayta qo'shilmaydi
        hash_set.add("Ruchka");
        hash_set.add("Qalam");
        hash_set.add("Daftar");
        hash_set.add("Qog'oz");
        hash_set.add("Daftar");

        System.out.println("hash_set = " + hash_set);

        //ma'lumotni ro'yxatdan o'chirib tashlash usullari
        hash_set.remove("Ruchka");

        System.out.println("hash_set = " + hash_set);

        // ro'yxat ichida joriy qiymatga mos element borligini tekshirish
        boolean natija = hash_set.contains("Daftar");
        System.out.println("hash_set.contains('Daftar') = " + natija);

        // ro'yxat haqida ma'lumot beruvchi metodlar bilan tanishuv
        int uzunlik = hash_set.size();
        boolean mavjudmi = hash_set.isEmpty();

        System.out.println("hash_set.size() = " + uzunlik + "; hash_set.isEmpty() = " + mavjudmi);

        // HashSetning kengaytirilgan metodlari
        // addAll, removeAll,containsAll metodlari
        // ro'yxatlarni kesishmasi, retainAll metodi

        HashSet<String> hash_set2 = new HashSet<>();
        hash_set2.add("Papka");
        hash_set2.add("Kitob");
        hash_set2.add("O'chirg'ich");
        hash_set2.add("Qalam");
        // ro'yxatlarni birlashtirish addAll metodi
        hash_set.addAll(hash_set2);
        System.out.println("hash_set.add(hash_set2) = " + hash_set);

        //hash_set dan hash_set2 elemetlarni olib tashlash
        hash_set.removeAll(hash_set2);
        System.out.println("hash_set.removeAll(hash_set2) = " + hash_set);

        // hash_set ichida hash_set2 da ko'rsatilgan barcha elementlar bormi?
        boolean natija2 = hash_set.containsAll(hash_set2);
        System.out.println("hash_set.contaisnAll(hash_set2) = " + natija2);

        hash_set.add("Ruchka");
        hash_set.add("Qalam");
        hash_set.add("Daftar");
        hash_set.add("Qog'oz");
        hash_set.add("Daftar");

        // faqat berilgan ro'yxatdagi elemetlarni qoldirish
        hash_set.retainAll(hash_set2);
        System.out.println("hash_set.retainAll(hash_set2) = " + hash_set);

        // hash_set ni ro'yxatga aylantirish

        hash_set.add("Ruchka");
        hash_set.add("Qalam");
        hash_set.add("Daftar");
        hash_set.add("Qog'oz");
        hash_set.add("Daftar");

        String[] str_array = hash_set.toArray(new String[0]);

        for (String i : str_array){

            System.out.print(i + " ");
        }
        System.out.println();

    }
}
