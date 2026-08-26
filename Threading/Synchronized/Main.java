/*

    -synchronized maxsus kalit so'zi merodni chaqirayotgan iplarda navbatni belgilan sinxron ishlashni taminlaydi
    -synchronized yordamida o'zgaruvchi qiymati ustida amal bajarilish vaqtida bir nechta ip murojaatbqilganda xatolikni oldini oladi
    -synchronized bo'lmasa iplar o'zgaruvchiga bie vaqtda murojaat qilganda bir ip o'zgartirgan qiymatni ko'rmay qol8shi va natija xato chiqishi mumkin

*/

public class Main {
	
    public static int test = 0;  // Barcha threadlar uchun umumiy hisoblagich
    
	public static void main(String[] args) throws Exception{
		
		// 1-vazifa: 1000 marta hisoblagichni oshirish
		Runnable task1 = () -> {
			
			for (int i = 0; i < 1000; i ++){
			
			    upd();
			}
		};
		
		// 2-vazifa: 1000 marta hisoblagichni oshirish
		Runnable task2 = () -> {
			
			for (int i = 0; i < 1000; i ++){
				
			    upd();
			}
		};
		
		// Ikkita thread yaratish
		Thread t1 = new Thread(task1);
	    Thread t2 = new Thread(task2);
	    
	    // Threadlarni parallel ishga tushirish
	    t1.start();
	    t2.start();
	    
	    // Ikkala thread ham tugashini kutish (join = "qo'shilish")
	    t1.join();  // t1 tugaguncha kut
	    t2.join();  // t2 tugaguncha kut
	    
	    // Natijani chop etish (2000 bo'lishi kerak)
	    System.out.println(test);
		
	}
	
	// synchronized = bir vaqtda faqat 1 thread ishlatishi mumkin
	// Bu race condition ni oldini oladi
	public static synchronized void upd(){
		
		test ++;  // test = test + 1 (3 qadam: o'qi, qo'sh, yoz)
	}
}