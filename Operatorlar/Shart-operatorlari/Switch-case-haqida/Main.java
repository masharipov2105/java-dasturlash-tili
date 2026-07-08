/*

    -switch-case operatroir ma'lum qiymat asodia shu qiymatga mos kod blokini ihlatishga imkon beradi
    -switch-case operatori if-else operatoridan farqi jihati u doim (==) ni tekshiradi
    -switch-case operaotri murakkab shartlarni tekshira olmaydi va faqat aynan tenglikni tekshiradi
    -java 14+ dan keyin yangi sintaksis paydo bo'ldi

*/

public class Main{

    public static void main(String[] args){

        //songa mos hafta kunlarini chop etish
        short kun = 1;

        switch (kun){

            case 1:

                System.out.println(kun + " haftaning Dushanba kuni");
                break;
            case 2:

                System.out.println(kun + " haftaning Seshanba kuni");
                break;
            case 3:

                System.out.println(kun + " haftaning Chorshanba kuni");
                break;
            case 4:

                System.out.println(kun + " haftaning Payshanba kuni");
                break;
            case 5:

                System.out.println(kun + " haftaning Juma kuni");
                break;
            case 6:

                System.out.println(kun + " haftaning Shanba kuni");
                break;
            case 7:

                System.out.println(kun + " haftaning Yakshanba kuni");
                break;
            default:

                System.out.println(kun + " haftaning bunday kuni yo'q");
                break;
        }
    }
}
