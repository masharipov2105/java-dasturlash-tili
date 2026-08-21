/*

    -Generic-class bu umuman Kollektionslarni g asosida xisoblanadi
    -Generic-class yordamida custom kollektion yaratish mumkin
    -Generic-class Kollektionsda turlar orasidagi farqlarni belgilash uchun kerak. Yani kolleltion bir xil tipdagi qiymatlarni emas turli tipdagi qiymatlarni yig'ib borishi bu esa oxiroda turli xatoliklar keltirib chiqarishi mumkin.

*/

public class Main{
	
	public static void main(String[] arga){
		
		//testing...
		
		Xotira<String> x_1 = new Xotira<>();
		x_1.put("element_1");

		System.out.println(x_1.get());
		
		x_1.remove();
		
		System.out.println(x_1);
		
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