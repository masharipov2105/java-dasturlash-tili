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
        Double son_double = Double.valueOf(son_str);
        Double son_double2 = Double.valueOf(son1);
        Float son_float = Float.valueOf("22.55f");

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

        //instance metodlar
        System.out.println("Double obektini qiymatini bytega toraytirib, butun ko'rinishda, qiymatini byte da qaytaradi: son_double.byteValue() " + son_double.byteValue());
        System.out.println("Double obektini qiymatini boshqa bir double obektini qiymati bilan taqqoslaydi, agar obekt qiymati taqqoslanayotgan obekt qiymatidan kichik bo'lsa -1 ni qaytaradi, agar aksincha bo'lsa 1 ni qaytaradi, agar teng bo'lsalar 0 ni qaytaradi: son_double.compareTo(125.75) " + son_double.compareTo(son_double2));
        System.out.println("Double obektini qiymatini double tipiga o'zgartirib qiymatini double da qaytaradi: son_double.doubleValue() " + son_double.doubleValue());
        System.out.println("Double obektini boshqa bir obekt bilan avval tiplari bo'yicha keyin qiymatlari bo'yicha taqqoslaydi, agar hammasi bir xil bo'lsa true qaytaradi, aks xolda false qaytaradi: son_double.equals(22.55f) " + son_double.equals(son_float));
        System.out.println("Double obektini qiymatini float tipiga toraytirib, qiymatini floatda qaytaradi: son_double.floatValue() " + son_double.floatValue());
        System.out.println("Double obektini qiymatini int ga toraytirib butin shaklga o'tkazadi va qiymatini int da qaytaradi: son_double.intValue() " + son_double.intValue());
        System.out.println("Double obektini qiymatini cheksizlikka tekshiradi: son_double.isInfinite() " + son_double.isInfinite());
        System.out.println("Double obektini qiymatini aniq yoki noaniq ekanligiga tekshiradi: son_double.isNaN() " + son_double.isNaN());
        System.out.println("Double obektini qiymatini long tipiga kengaytirib, butun shaklda va qiymatini longda qaytaradi: son_double.longValue() " + son_double.longValue());
        System.out.println("Double obektini qiymatini short tipiga toraytirib, butun shaklda va qiymatini shortda qaytaradi: son_double.shortValue() " + son_double.shortValue());
        System.out.println("Double obeltini qiymatini String tipoga o'zgartirib qiymatini stringda qaytaradi: son_double.toString() " + son_double.toString());


    }
}
