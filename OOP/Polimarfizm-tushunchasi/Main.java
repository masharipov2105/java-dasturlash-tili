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
}
