/*

    -Generic-class bu umuman Kollektionslarni g asosida xisoblanadi
    -Generic-class yordamida custom kollektion yaratish mumkin
    -Generic-class Kollektionsda turlar orasidagi farqlarni belgilash uchun kerak. Yani kolleltion bir xil tipdagi qiymatlarni emas turli tipdagi qiymatlarni yig'ib borishi bu esa oxiroda turli xatoliklar keltirib chiqarishi mumkin.

*/

public class Main{
	
	public static void main(String[] arga){
		
		
	}
}

// O'z custom Kollektion sinfimizni quramiz
// Xotira nomli generic sinfimizni quramiz
// put get va remove kabi metodlarini tayinlaymiz

class Xotira<T> {
	//T hali nomalum tbo'lgan turni ofoda etuvchi tip.
	private T kontent;
	
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
	
}