/*

    -rekursiya bu metod ichida o'zini chaqirishi orqali yana bir yangi llopni xosil qilish usulidir
    -rekursiya uchun sikl operatorlari kerak emas va rekursiyaning o'zi ana bir loopning tuidir
    -rekursiya uchun base case shartini yaratish muhim va bu loop necha martada yoki qanday vaziyatda to'xtashini belgilovchi shartdir

*/

public class Main{

    public static void main(String[] args){

        // berilgan soning faktorialini xioblaydigan rekursiv metod yozib ko'ramiz
        // faktorial bu berilgan songacha bo'lgan natural sonlar ko'paytmasi yani 3! = 1 * 2 * 3
        // void tipidagi metod bilan 1-variantni ko'ramiz
        int son = 5;
        faktorial_hisobchi(son, 0, 1); // void tipidagi metod qiymat qaytarmaydi va natija metod ichida chop etiladi
        System.out.println(String.format("%d! = %d", son, faktorial_hisobchi(son))); // int tipida natijani qaytaradigan rekursiv metod

        // sonning darajasini rekursiya yordamida hisoblaydigan metod yozib ko'ramiz
        int son_1 = 2;
        int daraja = 5;
        daraja(son_1, daraja, daraja-1, son_1); // void tipidagi natijani metod ichida chop etuvchi rekursiv metod
        System.out.println(String.format("%d^%d = %d", son_1, daraja, daraja(son_1, daraja))); // natijani int tipida qaytaradigan rekursiv metod
    }

    // sonlarni ketma ket ko'paytirb natijani xisoblab boruvchi rekursiv metod
    public static void faktorial_hisobchi(int finish, int start, int xolat){

        int natija = xolat;

        if (start == finish){

            System.out.println(String.format("%d! = %d", finish, natija));
        } else{

            int args = start + 1;
            natija = xolat * args;
            faktorial_hisobchi(finish, args, natija);
        }
    }
    // natijani qaytradigan va overload qilingan faktorial_hisibchi metodi
    public static int faktorial_hisobchi(int finish){

        if (finish == 1 || finish == 0){

            return 1;
        } else{

            return finish * faktorial_hisobchi(finish-1); // har bir o'zini chaqirish vatida oxirgi o'zini chaqirishgacha bu return natija sifatida qaytarilmasdan kutadi
        }
    }

    // void tipidagi natijani ichida chop etuvchi rekursiv metod
    public static void daraja(int son, int daraja, int hisob, int jarayon){

        int natija = jarayon;

        if (daraja == 0){
            natija = 1;
            System.out.println(String.format("%d^%d = %d", son, daraja, natija));
        } else{

            if (hisob == 0){

                System.out.println(String.format("%d^%d = %d", son, daraja, natija));
            } else{

                int args = hisob - 1;
                natija = natija * son;
                daraja(son, daraja, args, natija);
            }
        }
    }

    // int tipida natijani qaytaradigan rekursiv metod
    public static int daraja (int son, int daraja){

        if (daraja == 0){

            return 1;
        } else{

            return son * daraja(son, daraja-1);
        }
    }
}
