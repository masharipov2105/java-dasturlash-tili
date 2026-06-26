/*
    -byte primitiv turi javadagi xajmi eng kichik bo'lgan sonlarni ifoda etuvchi tipdir
    -byte xotira xajmi 1 byte ga teng
    -byte primitiv turining Byte deb nomlangan wrapper sinfi mavjud
*/



public class Main{

    public static void main(String[] args){

        byte son1 = 12;
        byte son2 = 15;
        String son_16 = "0x0F";
        String son_str = "22";

        Byte son_byte = Byte.valueOf("55");

        //konstalar qiymatlari
        System.out.println("Byte ning maksimal qiymati: " + Byte.MAX_VALUE);
        System.out.println("Byte ning minimal qiymati: " + Byte.MIN_VALUE);
        System.out.println("Byte ning xotira xajmi (bitda): " + Byte.SIZE + " bit");
        System.out.println("Byte ning turi: " + Byte.TYPE);
        System.out.println("Bytening xotira xajmi (baytda): " + Byte.BYTES + "bayt");

        //statik metodlari
        System.out.println("Ikkita byte o'zgaruvchilarning qiymatlari farqi: compare(12, 13): " + Byte.compare(son1, son2));
        System.out.println("Matn ko'rinishidagi 16 lik tizimda ifodalangan sonni bytega o'giradi: decode('0x0F') " + Byte.decode(son_16));
        System.out.println("Matn ko'rinishidagi sonni byte qiymatini qaytaradi: parseByte('22') " + Byte.parseByte(son_str));
        System.out.println("Matn ko'rinishida va biror sanoq tizimda yozilgan sonni bye qiymatini 10 lik tizimda qaytaradi: parseByte('22', 3) " + Byte.parseByte(son_str, 3));
        System.out.println("byte o'zgaruvchi qiymatini String tipidagi qiymatini qaytaradi: Byte.toString(15) " + Byte.toString(son2));
        System.out.println("byte o'zgaruvchisini qiymatini olib uni Byte wrapper sinfiga o'rab qiymatni Stringda qaytaradi: Byte.valueOf(15) " + Byte.valueOf(son2));
        System.out.println("Matn ko'rinishidagi sonni qiymatni byte olib uni wrapper sinfga o'rab qiymatni Stringda  qaytaradi: Byte(valueOf('22')) " + Byte.valueOf(son_str));
        System.out.println("matn ko'rinishidagi sonni qiymatini berilan sanoq tizimida ekanligni bilgan xolda uni qiymatini 10 lik tizimga o'giradi va wrapper sinfga o'raydi so'ng Stringda qiymatini qaytaradi: Byte.valueOf('22', 3) " + Byte.valueOf(son_str, 3));

        //instance metodlar
        System.out.println("Byte obektining qiymatini byteda qaytaradi: son_byte.byteValue() " + son_byte.byteValue());
        System.out.println("Byte obektining qiymatini boshqa byte tipidagi o'zgaruvchi qiymati bilan farqini qaytaradi: son_byte.compareTo(17) " + son_byte.compareTo(son2));
        System.out.println("Byte obektini qiymatini double tipiga kengaytirb, qiymatini qaytaradi: son_byte.doubleValue() " + son_byte.byteValue()); 
        System.out.println("Byte obektini boshqa bir ixtiyoriy obekt bilan avval tip bo'yicha keyin qiymat bo'yicha taqqoslaydi, agar hammasi yeng bo'lsa true qaytaradi, aks xolda false qaytaradi: son_byte.equals(Object obj) " + son_byte.equals(son_16));
        System.out.println("Byte obektini qiymatini floatga tipiga kengaytirib, qiymatini qaytaradi: son_byte.floatValue() " + son_byte.floatValue());
        System.out.println("Byte obektini qiymatini int tipiga kengaytirib, qiymatini qaytaradi: son_byte.intValue() " + son_byte.intValue());
        System.out.println("Byte obektini qiymatini long tipiga kengaytirib, qiymatini qaytaradi: son_byte.longValue() " + son_byte.longValue());
        System.out.println("Byte obektini qiymatini short tipiga kengaytirib, qiymatini qaytaradi: son_byte.shortValue() " + son_byte.shortValue());
        System.out.println("Byte obektini qiymatini String obektiga aylantirib, qiymatini qaytaradi: son_byte.toString() " + son_byte.toString());
    }
}
