/*

    -shart operatorlari java dasturlash tilida balki barcha dasturlash tillarida juda muhim operator xisoblanadi
    -shart operatori shartni tekshirish asosida shu shartga mos qarorni qabul qiladi va natija ham shu shartga mos bo'ladi
    -shart operatori yordamida tarmoqlanuvchi dasturlar tuziladi

*/

public class Main{

    public static void main(String[] args){

        // if operatori
        int yosh = 11;
        if (yosh >= 18){

            System.out.println(yosh + " yosh, Siz balog'atga yetgansiz");
        }
        if (yosh < 18 && yosh > 0){

            System.out.println(yosh + " yosh, Siz balog'atga yetmagansiz");
        }
        // har bir alohida if dastur ishga tushganda doim tekshiriladi

        //else-if operatori
        int qiymat = 0;

        if (qiymat > 0 && qiymat % 2 == 0){

            System.out.println(qiymat + " soni, musbat juft son");
        } else if (qiymat < 0 && qiymat % 2 == 0){

            System.out.println(qiymat + " soni, manfiy juft son");
        } else if (qiymat > 0 && qiymat % 2 == 1){

            System.out.println(qiymat + " soni, musbat toq son");
        } else if (qiymat < 0 && qiymat % 2 == -1){

            System.out.println(qiymat + " soni, manfiy toq son");
        } else if (qiymat == 0){

            System.out.println(qiymat + " soni, 0 ga teng");
        }
        // else-if bloklarida qachonki biror shart bajarilsa to'xtaydi, yani hamma bliklardagi shart doim tekshirilmaydi

        // else bloki
        //else bloki doin if bloki bilan birga ishlatilinadi, yani if blokisiz elseni o;zi ishlamaydi, va u ixtiyiroiydir

        int raqam = 8;

        if (raqam == 7){

            System.out.println("raqam 7 ga teng");
        } else{

            System.out.println("raqam 7 ga teng emas!");
        }
    }
}
