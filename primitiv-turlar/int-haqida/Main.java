/*
    -int java tilida eng ko'p ishlatilinadigan va butun sonlarni ifoda etadigan tip hisoblanadi
    -int xotira xajmi 4 bayt
    -int primitiv turining Integer deb nomlangan wrapper sinfiga ega
*/

public class Main{

    public static void main(String[] args){

        //konstanta qiymatlari
        System.out.println("int ning eng kichik qiymati: Integer.MIN_VALUE " + Integer.MIN_VALUE);
        System.out.println("int ning eng katta qiymati: Integer.MAX_VALUE " + Integer.MAX_VALUE);
        System.out.println("int ning xotira xajmi (baytda): Integer.BYTES " + Integer.BYTES + " bayt");
        System.out.println("int ning xotira xajmi (bitda): Integer.SIZE " + Integer.SIZE + " bit");
        System.out.println("Integer wrapper sinfining primitiv turini qaytarad: Integer.TYPE " + Integer.TYPE);


    }
}
