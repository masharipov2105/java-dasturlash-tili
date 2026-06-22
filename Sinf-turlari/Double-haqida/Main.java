/*

    -double tipi java dagi kasr sonlarni ifoda etuvchi eng katta tip hisoblanadi
    -double primitiv turining Doubledeb nomlanuvchi wrappper sinfi mavjud
    -float bilan taqqoslaganda asosiy farq xotira xajmi kattaligida.
    -odatda kasr sonlar bilan ishlaganimizda ko'pincha floatga nisbatan double ko'piroq qo'llaniladi

*/

public class Main{

    public static void main(String[] args){

        double son1 = 125.75;
        double son2 = 200.25;
        String son_str = "22.55";

        //konstanta qiymatlari
        System.out.println("double ning xotira xajmi (baytda): Double.BYTES " + Double.BYTES + " bayt");
        System.out.println("double ning eng katta qiymati: Double.MAX_VALUE " + Double.MAX_VALUE);
        System.out.println("double ning eng kichik qiymati: Double.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println("double da NaN(Not a Number) qiymati noaniq bo'lgan qiymatning ifodasi: Double.NaN " + Double.NaN);
        System.out.println("double da manfiy cheksizlikni ifodalanishi: Double.NEGATIVE_INFINITY " + Double.NEGATIVE_INFINITY);
        System.out.println("double da musbat cheksizlikni ifodalanishi: Double.POSITIVE_INFINITY " + Double.POSITIVE_INFINITY);
        System.out.println("doubelning xotira xajmi (bitda): Double.SIZE " + Double.SIZE + " bit");
        System.out.println("doublening primitiv turi nomini qaytaradi: Double.TYPE " + Double.TYPE);

        //staric metodlar
        System.out.println("ikkita double tipidagi qoymatlarni taqqoslaydi va agar 1-qiymat 2-sidan kichik bo'lsa -1 qaytaradi agar aksincha bo'lsa 1 qaytaradi, agar teng bo'lsa 0 qaytarad: Double.compare(125.75, 200,25) " +Double.compare(son1, son2));
        System.out.println("double tipidagi qiymatni aniq va chekli son ekanligiga tekshiradi: Double.isFinite(125.75) " + Double.isFinite(son1));
        System.out.println("double tipidagi qiymatni cheksilikka tekshiradi: Double.isInfinite(200.25) " + Double.isInfinite(son2));
        System.out.println("double tipidagi qiymatni aniq yoki noaniq ekanligiga tekshiradi: Double.isNaN((double) 0.0 / 0) " + Double.isNaN((double) 0.0 / 0));
        System.out.println("ikkita double tipidagi qiymatlarni taqqoslab eng kattasini qaytaradi: Double.max(125.75, 200,25) " + Double.max(son1, son2));
        System.out.println("ikkita double tipidagi qiymatlarni taqqoslab eng kichigini qaytaradi: Double.min(125.75, 200.25) " + Double.min(son1, son2));
        System.out.println("ikkita double tipidagi qiymatlarni oddiy + kabi yig'indisini xisoblab qaytaradi: Double.sum(125.75, 200.25) " + Double.sum(son1, son2));
        System.out.println("double tipidagi qiymatni String obektiga aylanti0radi va qiymatini qaytaradi: Double.toString(200.25) " + Double.toString(son2));
        System.out.println("double tipidagi qiymatni Double wrapper sinfiga o'raydi va Double obektini yaratadi, Stringda qiymatini qaytaradi: Double.valueOf(125.75) " + Double.valueOf(son1));
        System.out.println("matn ko'rinishidagi sonni Double wrapper sinfiga o'rab Double obektini yaratadi va Stringda qiymatini qaytaradi: Double.valueOf('22.55') " + Double.valueOf(son_str));


    }
}
