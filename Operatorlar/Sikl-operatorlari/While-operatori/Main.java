/*

    -while operatori sikl operatorlar sirasiga kiradi va for operatoriga o'xshab ma'lum kod blokini shart asosida takrorlaydi
    -while operatori o'zining () bloki ichiga yozilgan boolean tipidagi qiymatni tekshirish asosida kod blokini qayta qayta ishga tushiradi
    -while operatroir va for operatori asosan sintaksisda farq qiladi asosiy vazifalari bir xil o'zini kod bloki ichidagi kodni qayta qayta takrorlash
    -while operatorining for operattoidan farqi shuki, for siklida iteratsiyaalr soni aniq, whileda esa aniq emas vaziyatda foydalanish qulay

*/


public class Main{

    public static void main(String[] args){

        // 1 dan 10 gacha sonlarni ekranga chiqarish
        boolean shart = true;
        int hisobchi = 1;

        while (shart){
            if (hisobchi < 10){

                System.out.println(hisobchi);
                hisobchi ++;
            } else{
                shart = false;
                //oxirgi iteratsiyda yakuniy qiymatni ham chiqarish kerak
                System.out.println(hisobchi);
            }
        }
    }
}
