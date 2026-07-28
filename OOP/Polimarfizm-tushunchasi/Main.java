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

    // Overloading asosida shakllantirlgan Kalkulator sinfining metodlarni test qilib ko'ramiz
    System.out.println("int 12 + int 13 = (int)" + Kalkulator.qoshish(12, 13));
    System.out.println("int 20 + int 21 + int 23 = (int)" + Kalkulator.qoshish(20, 21, 23));
    System.out.println("double 22.5 + double 54.82 = (double)" + String.format("%.3f", Kalkulator.qoshish(22.5, 54.82)));
    System.out.println("String 27 + String 47 = (int)" + Kalkulator.qoshish("27", "47"));

    // Shakl sinfini metodlarini tekshirib ko'ramiz
    Shakl shakl_1 = new Shakl();
    System.out.println("shakl_1, yuzasi: " + shakl_1.yuza(10));
    System.out.println("shakl_2, uzunligi: " + shakl_1.uzunlik(10));

    // Aylana sinfini metodlarini tekshirib ko'ramiz
    Shakl shakl_2 = new Aylana();
    System.out.println("shakl_2 yuzasi: " + shakl_2.yuza(10));
    System.out.println("shakl_2 uzunligi: " + String.format("%.3f", shakl_2.uzunlik(10)));

    // Doira sinfini metodlarini tekshirib ko'ramiz
    Shakl shakl_3 = new Doira();
    System.out.println("shakl_3 yuzasi: " + String.format("%.3f", shakl_3.yuza(10)));
    System.out.println("shakl_3 uzunligi: " + String.format("%.3f", shakl_3.uzunlik(10)));
    }
}

// Kalkulator nomli sinf yaratamiz va ichida qoshish nomli 3 xil metodlarni overloading qilib ko'ramiz
// Kalkulator sinfida Overloading usulidan foydalanamiz

class Kalkulator{

    // parametrlarsiz bo'sh konstruktor yaratamiz
    protected Kalkulator(){}

    // qo'shish int tipidagi oddiy 2 sinni yig'indisini qaytaramiz
    protected static int qoshish(int son1, int son2){

        return (son1 + son2);
    }

    // qoshish 3ta int sonini yig'indisini qaytaradi
    protected static int qoshish(int son1, int son2, int son3){

        return (son1 + son2 + son3);
    }

    // qoshish 2ta double sonlanri yig'ondisini qaytaradi
    protected static double qoshish(double son1, double son2){

        return (son1 + son2);
    }

    // qoshish 2ta matn ko'rinishdagi sonlarni yig'indisini qaytaradi
    protected static int qoshish(String son1, String son2){

        if (!son1.isEmpty() && !son2.isEmpty()){

            return (int)(Integer.parseInt(son1) + Integer.parseInt(son2));
        } else{

            return 0;
        }
    }
}


// Overriding asosida metodlarni ko'p shaklli qilib yozishni ko'rib o'tamiz
// Shakl nomli super class yaratib ichida yuza va uzunlik nomli metodlarni yaratamiz
// Aylana, Doira va Tortburchak nomli subclass lar ichida superclassni metodlarini @Override asosida ko'pshaklli qilamiz

class Shakl{

    //o'zgarmas xusuiyatlarni tayinlaymiz
    protected static double Pi;

    // static xusiaytlarga qiymatlarni tayinlaymiz
    static {

        Pi = 3.1415;
    }
    //parametrsiz konstruktor yaratamiz
    protected Shakl(){}

    // yuza nomli metod yaratamiz
    protected double yuza(int R){

        return 0.0;
    }

    //uzunlik nomli metod yaratamiz
    protected double uzunlik(int R){

        return 0.0;
    }
}

// Aylana nomli sublcass yaratib meros olingan metodlarni @Override orqali qayta yozishni sinab ko'ramiz
class Aylana extends Shakl{

    //parametrsiz konstruktor quramiz va ixtiyoriy super yordamida superclassning konstruktorini yuklaymiz
    protected Aylana(){super();}

    // uzunlik  metodini qayta yoramiz
    @Override
    protected double uzunlik(int R){

        return (2 * super.Pi * R);
    }
    // aylananing yuzasi 0 ga teng yuza metodni qayta yozmaymiz
}

// Doira classini yaratamiz
class Doira extends Shakl{

    //parametrsiz konstruktor yaratamiz
    protected Doira(){super();}

    //uzunlik metodini qayta yozamiz
    @Override
    protected double uzunlik(int R){

        return (2 * super.Pi * R);
    }

    // yuza metodini qayta yozamiz
    @Override
    protected double yuza(int R){

        return (super.Pi * (R * R));
    }
}
