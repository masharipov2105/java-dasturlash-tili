/*

    -Threading bu asinxorn dasturlash uchun mo'ljallangan java tilidagi standart vosita
    -Threading siz qurilgan kod odatiy tarzda bir satrdagi kod bajarilib bo'lmagunicha keyingi satrdagi kod bajarilmaydi
    -Threading asosida qurilgan kod Thread ichidagi kod satri to'liq bajarilishini kutmasdan asosiy Thrrad bajarilishida davom etadi

*/

public class Main{
	
	public static void main(String[] args){
		
		MyThread t1 = new MyThread();
		t1.start();
		
		// asosiy Main threadi
		// bu qatordagi kod satrlari MyThread kodi to'liq bajarilishini kutmasdan davom etadi
		for (int i = 0; i < 5; i ++){
			
			System.out.println("MainThread run: " + i);
			try{
			
			    Thread.sleep(100);
		    } catch (Exception e){
			
			    e.printStackTrace();
	    	}
		}
		
	}
}

// Thread sinfidan meros olish orqali barcha metodlaridan foydalaniah imkoniga ega bo'lamiz
//run metodini ovveriding qilish orqali o'zimizni bajarilishi kerak bo'lgan kodni yozamiz

class MyThread extends Thread{
	
	//run metodini ovveriding qilamiz
	@Override
	public void run(){
		
		// asinxron kodimizni shu blokka yozamiz
		//oddiy sikl ypzib har bir iteratsiya bakarilishi uchun 1 soniya kutamiz
		for (int i = 0; i < 5; i ++){
			
			System.out.println("MyThread run: " + i);
			try{
			
			    Thread.sleep(100);
		    } catch (Exception e){
			
			    e.printStackTrace();
	    	}
		}
	}
}