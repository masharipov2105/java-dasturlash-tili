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
    }
}
