/*

    -Polimarfizm- ko'pshakkkilik deb tarjima qilinar ekan va class ichidagi metodlarni ko'p shaklda tashkil qilishni anglatadi
    -Polimarfizm class ichidagi metodlarni asosan 2 xil usul yordamida bir xil nomda turlicha tashkil qilish imkonini beradi
    -Overloadding va Overriding deb ataluvchi 2 xil usul asosida bir xil nomli metodlarni tashkil qilish mumkin
    -Overloading ning eng asosiy shartlari bir xil sinf ichida bur xil nomli ammo parametrlari qattiy farq qilivchi metodlarni tashkil qiladi
    -Overriding ning asosiy shartlari Ota bola meros asosida shakllangan sinflar icihda bir xil nomli va bir xil parametrlai metodlarni 
     algoritmini qayta yozish imkoni taqdim etadi

*/


public class Main{

    public static void main(String[] args){


    }
}

// Kalkulator nomli sinf yaratamiz va ichida qoshish nomli 3 xil metodlarni overloading qilib ko'ramiz
// Kalkulator sinfida Overloading usulidan foydalanamiz

class Kalkulator{

    // parametrlarsiz bo'sh konstruktor yaratamiz
    protected Kalkulator(){}

    // qo'shish int tipidagi oddiy 2 sinni yig'indisini qaytaramiz
    protected int qoshish(int son1, int son2){

        return (son1 + son2);
    }

    // qoshish 3ta int sonini yig'indisini qaytaradi
    protected int qoshish(int son1, int son2, int son3){

        return (son1 + son2 + son3);
    }

    // qoshish 2ta double sonlanri yig'ondisini qaytaradi
    protected double qoshish(double son1, double son2){

        return (son1 + son2);
    }

    // qoshish 2ta matn ko'rinishdagi sonlarni yig'indisini qaytaradi
    protected int qoshish(String son1, String son2){

        if (!son1.isEmpty() && !son2.isEmpty()){

            return (int)(Integer.parseInt(son1) + Integer.parseInt(son2));
        } else{

            return 0;
        }
    }
}
