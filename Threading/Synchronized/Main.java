/*

    -synchronized maxsus kalit so'zi merodni chaqirayotgan iplarda navbatni belgilan sinxron ishlashni taminlaydi
    -synchronized yordamida o'zgaruvchi qiymati ustida amal bajarilish vaqtida bir nechta ip murojaatbqilganda xatolikni oldini oladi
    -synchronized bo'lmasa iplar o'zgaruvchiga bie vaqtda murojaat qilganda bir ip o'zgartirgan qiymatni ko'rmay qol8shi va natija xato chiqishi mumkin

*/

public class Main {
    public static int test = 0;
    
    public static void main(String[] args) throws Exception {
        
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                upd();
            }
        };
        
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                upd();
            }
        };
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Natija: " + test);  // 2000 dan KICHIK (masalan: 1985)
    }
    
    public static void upd() {
        test++;  // ⚠️ synchronized YO'Q - race condition bor!
    }
}