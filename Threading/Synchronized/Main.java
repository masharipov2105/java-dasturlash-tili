/*

    -synchronized maxsus kalit so'zi merodni chaqirayotgan iplarda navbatni belgilan sinxron ishlashni taminlaydi
    -synchronized yordamida o'zgaruvchi qiymati ustida amal bajarilish vaqtida bir nechta ip murojaatbqilganda xatolikni oldini oladi
    -synchronized bo'lmasa iplar o'zgaruvchiga bie vaqtda murojaat qilganda bir ip o'zgartirgan qiymatni ko'rmay qol8shi va natija xato chiqishi mumkin

*/

public class Main {
    public static int test = 0;
    
    public static void main(String[] args) {
        // 1000 marta oshiramiz
        for (int i = 0; i < 1000; i++) {
            test++;
        }
        System.out.println("Natija: " + test);  // 1000
    }
}