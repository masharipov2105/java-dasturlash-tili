/*

    -break operatori odatda sikllar va switch operatorlari bilan birga ishlatilinadi va siklni butkul to'xtatadi va hatto sikl sharti true bo'lsa ham
     switch ichida esa u shunchaki shartga mos blok ishga tushgandan keyin keyingi bloklarga o'tmaslikni taminlab beradi
    -continue operatori odatda sikl operatorlari bilan birga qo'llaniladi va breakdan farqli ravishda siklni butkul to'xtatib qo'ymaydi 
     balki ma'lum bir iteratsiyaalrni o'tkazib yuboradi xolos
    -retrun operatori o'ziga xosdir, u odatda metodlar ichida qo'llaniladi va u 2 xil xusiyati bor. 1) u operator metod ichida qiymat
     qaytarish xusuiyatiga ega. 2) u operator chaqirilgandan keyin metodni kod bloki butkul to'xtaydi yani bu operatordan
     keyingi kodlar ishlamaydi.

*/

public class Main{

    public static void main(String[] args){

        //ma'lum bir songacha (o'zi kirmaydi) bo'lgan oraliqdagi butun sonlarni chop etish

        int son = 8;
        int hisobchi = 1;

        while (true){

            if (hisobchi == son){
                //songa yetganida siklni butkul to'xtatish
                break;
            }
            // qolgan barcha xolatlarda hisobchini chop etish va qiymatini 1 ga oshirib borish
            System.out.println(hisobchi);
            hisobchi ++;
        }

        System.out.println("\nJuft sonlar gineratori\n");

        //berilgan songacga faqat juft sonlarni chiqarish
        int son2 = 12;

        for (int i = 1; i <= 12;  i++){

            if (i % 2 == 1){

                // agar son toq bo'lsa iteratsiyani tashlab ketish
                continue;
            }
            System.out.println(i);
        }
    }
}
