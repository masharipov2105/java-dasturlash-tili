/*

    - for operatori ma'lum bir kod blokini qayta va qayta ishlatadi
    - for sikli ma'lum bir shartni tekshirish asosida ishlaydi va shart bajarilmay qolsa to'xtaydi
    - for sikli bajaradigan kod bloki ichidagi har bir o'zgaruvchi yoki amal har bir iteratsiyada yangidan bajariladi

*/

public class Main{

    public static void main(String[] args){

        // berilgan son qiymatiga teng marta takrolanishni bajarish
        int son = 8;
        int xisoblagich = 1;

        for (int i = 0; i < son; i ++){

            System.out.println(xisoblagich + ") " + i);
            xisoblagich ++;
        }
    }
}
