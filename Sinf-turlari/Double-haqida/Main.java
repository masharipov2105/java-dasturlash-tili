/*

    -double tipi java dagi kasr sonlarni ifoda etuvchi eng katta tip hisoblanadi
    -double primitiv turining Doubledeb nomlanuvchi wrappper sinfi mavjud
    -float bilan taqqoslaganda asosiy farq xotira xajmi kattaligida.
    -odatda kasr sonlar bilan ishlaganimizda ko'pincha floatga nisbatan double ko'piroq qo'llaniladi

*/

public class Main{

    public static void main(String[] args){

        //konstanta qiymatlari
        System.out.println("double ning xotira xajmi (baytda): Double.BYTES " + Double.BYTES + " bayt");
        System.out.println("double ning eng katta qiymati: Double.MAX_VALUE " + Double.MAX_VALUE);
        System.out.println("double ning eng kichik qiymati: Double.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println("double da NaN(Not a Number) qiymati noaniq bo'lgan qiymatning ifodasi: Double.NaN " + Double.NaN);
        System.out.println("double da manfiy cheksizlikni ifodalanishi: Double.NEGATIVE_INFINITY " + Double.NEGATIVE_INFINITY);
        System.out.println("double da musbat cheksizlikni ifodalanishi: Double.POSITIVE_INFINITY " + Double.POSITIVE_INFINITY);
        System.out.println("doubelning xotira xajmi (bitda): Double.SIZE " + Double.SIZE + " bit");
        System.out.println("doublening primitiv turi nomini qaytaradi: Double.TYPE " + Double.TYPE);

    }
}
