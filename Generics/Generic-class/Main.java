/*

    -Generic-class bu umuman Kollektionslarni g asosida xisoblanadi
    -Generic-class yordamida custom kollektion yaratish mumkin
    -Generic-class Kollektionsda turlar orasidagi farqlarni belgilash uchun kerak. Yani kolleltion bir xil tipdagi qiymatlarni emas turli tipdagi qiymatlarni yig'ib borishi bu esa oxiroda turli xatoliklar keltirib chiqarishi mumkin.

*/

//kerakli modullarni dasturimizga bog'lash
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] arga){
		
		//testing... String
		
		Xotira<String> x_1 = new Xotira<>();
		x_1.put("element_1");

		System.out.println(x_1.get());
		
		x_1.remove();
		
		System.out.println(x_1);
		
		// testing Integer
		
		Xotira<Integer> x_2 = new Xotira<>();
		
		x_2.put(17);
		
		System.out.println(x_2);
		
		x_2.remove();
		
		System.out.println(x_2);
		
		// testing... XotiraArrat... String
		
		XotiraArray<String> a1 = new XotiraArray<>();
		
		a1.put("Baki");
		a1.put(1, "Alibek");
		
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		a1.drop(0);
		
		System.out.println(0);
		
		System.out.println(a1.toString());
		
		
		// testing... XotiraArray... Integer
		
		XotiraArray<Integer> a2 = new XotiraArray<>();
		
		a2.put(255);
		a2.put(1, 378);
		
		System.out.println(a2.get(0));
		System.out.println(a2.get(1));
		
		System.out.println(a2);
		
		
	}
}

// O'z custom Kollektion sinfimizni quramiz
// Xotira nomli generic sinfimizni quramiz
// put get va remove kabi metodlarini tayinlaymiz

class Xotira<T> {
	//T hali nomalum tbo'lgan turni ofoda etuvchi tip.
	private T kontent = null;
	
	// konstruktorni tayinlaymiz
	public Xotira(){} //parametrsiz
	
	//put metodini yaratamiz
	//ma'lumot qo'shish metodi
	public void put(T qiymat){
		
		this.kontent = qiymat;
	}
	
	// qiymatlarni o'qish uchun get metodi
	public T get(){
		
		return this.kontent;
	}
	
	//ma'lumotni o'chiruvchi remove() metodi
	public void remove(){
		
		this.kontent = null;
	}
	
	// qiymatni aniq va tushinarli shaklda chop etish uchun toString merodini oveeriding qilamiz
	@Override
	public String toString(){
		
		return this.kontent+"";
	}
}

//XotiraArray sinfini yaratamiz
//Maxsus kollektion quramiz
//malumotlar doim ro'yxat oxiriga qo'shilib boradi

class XotiraArray<T>{
	
	//xususiyatlar
	private ArrayList<T> royxat;
	
	//konstruktorni tayinlaymiz
	public XotiraArray(){this.royxat = new ArrayList<>();} // bo'sh konstruktor, asosiy amallar metodlar yordamida bakariladi
	
	//ro'yxatga ma'lumot qo'shish metodi
	public void put(T value){
		
		this.royxat.add(value);
	}
	
	//ro'yxatimizga malimot qo'shish metodi overloading
	
	public void put(int indeks, T value){
		
		this.royxat.add(indeks, value);
	}
	
	// indeks bo'yicha malumot o'qish metodi
	public T get(int indeks){
		
		return royxat.get(indeks);
	}
	
	//malumotni indeks asosida o'chirish metodi
	public void drop(int indeks){
		
		this.royxat.remove(indeks);
	}
	
	// to'liq ro'yxatninqaytaruvchi metod
	//toStrimg metodini overriding qilamiz
	
	@Override
	public String toString(){
		
		return this.royxat+"";
	}
}