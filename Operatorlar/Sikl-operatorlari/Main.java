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

        //dastlab i o'zgaruvchisi qiymati 0 ga teng, demak dastlab ekranga 0 chiqadi, sikl takrorlanishi asosida i 1 ta ga o'zib boradi
        // sikl 8 marta davom etishi natijasida esa 0 dan 7 gacha sanaydi, oqibatda yakun 7 bilan tugaydi, yani i 7 gacha o'sadi
        for (int i = 0; i < son; i ++){

            System.out.println(xisoblagich + ") " + i);
            xisoblagich ++;
        }
    }
}
