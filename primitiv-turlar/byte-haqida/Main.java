/*
    -byte primitiv turi javadagi xajmi eng kichik bo'lgan sonlarni ifoda etuvchi tipdir
    -byte xotira xajmi 1 byte ga teng
    -byte primitiv turining Byte deb nomlangan wrapper sinfi mavjud
*/



public class Main{

    public static void main(String[] args){

        byte son1 = 12;
        byte son2 = 15;

        System.out.println("Byte ning maksimal qiymati: " + Byte.MAX_VALUE);
        System.out.println("Byte ning minimal qiymati: " + Byte.MIN_VALUE);
        System.out.println("Byte ning xotira xajmi (bitda): " + Byte.SIZE);
        System.out.println("Byte ning turi: " + Byte.TYPE);
        System.out.println("Bytening xotira xajmi (baytda): " + Byte.BYTES);
    }
}
