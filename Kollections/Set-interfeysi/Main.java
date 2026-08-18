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
    }
}
