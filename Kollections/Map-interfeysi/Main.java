/*

    -Map interfeysi java tilida kalit-qiymat jufliklari ro'yxarini boshqarish tizimi
    -Map interfeysi json ro'yxat tizimi kabi ma'lumotlarni unikal kalit asosida saqlaysi
    -Map interfeysi asosidagi ro'yxatdagi ma'lumotlarga kalit qiymati asosida murojaat qilinadi

*/
// kerakli modullarni dasturimizga yuklaymiz
import java.util.Map;
import java.util.HashMap;

public class Main{
	
	public static void main(String[] args){
		
		// Bo'sh HashMap ro'yxatini yaratish
		Map<String, Integer> hash_map = new HashMap<>();
		
		// ro'yxatga ma'lumot qo'shish
		hash_map.put("Bir", 1);
		hash_map.put("Ikki", 2);
		hash_map.put("Uch", 3);
		hash_map.put("Olma", 4);
		hash_map.put("Anjir", 10);
		
		System.out.println(hash_map);
		
		// ro'yxatdagi ma'lumotni o'qish
		int qiymat = hash_map.get("Olma");
		System.out.println("hash_map.get('Olma') = " + qiymat);
		
		// ro'yxatdagi biror kalit-qiymat juftligini o'chirish
		hash_map.remove("Bir");
		System.out.println(hash_map);
		
		//joriy kalit va qiymat ro'yxatda borligini tekshirish
		boolean bormi = hash_map.containsKey("Yetti"); // Kalit asosida tekshiruv
		System.out.println("hash_map.contanisKey('Yetti') = " + bormi);
		
		boolean qiymat_b = hash_map.containsValue(10); // Qiymat asosida tekshiruv
		System.out.println("hash_map.containsValue(10) = " + qiymat_b);
		
		//barcha kalitlar yoli qiymatlar ro'yxatlarini olosh
		System.out.print("kalitlar = ");
		for(String key: hash_map.keySet()){
			System.out.print(key + ", ");
		}
		System.out.println();
		
		System.out.print("qiymatlar = ");
		for(Integer vals: hash_map.values()){
			System.out.print(vals + ", ");
		}
		System.out.println();
		
		// ro'yxat haqida ma'lumotlarni qaytaruvchi metodlar
		
		System.out.println("hash_map.size() = " + hash_map.size());
		
		System.out.println("hash_map.isEmpty() = " + hash_map.isEmpty());
		
	}
}