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

        //+, -, *, / amallarini bajaruvchi sodda kalkulator

        int son1 = 18;
        int son2 = 7;
        char amal = '/';
        System.out.println("\n Sodda kalkulator dasturi \n");
        switch (amal){

            case '+':

                int natija1 = son1 + son2;
                System.out.println(son1 + " " + amal + " " + son2 + " = " + natija1);
                break;

            case '-':

                int natija2 = son1 - son2;
                System.out.println(son1 + " " + amal + " " + son2 + " = " + natija2);
                break;

            case '*':

                int natija3 = son1 * son2;
                System.out.println(son1 + " " + amal + " " + son2 + " = " + natija3);
                break;

            case '/':

                double natija4 = (double)son1 / (double)son2;
                String natija_ = String.format("%.3f", natija4);
                System.out.println(son1 + " " + amal + " " + son2 + " = " + natija_);
                break;
            default:

                System.out.println(amal + " bunday amalni bajara olmayman");
                break;
        }
    }
}
