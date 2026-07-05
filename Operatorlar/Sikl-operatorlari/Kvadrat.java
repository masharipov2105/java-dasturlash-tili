/*

    for sikli yordamida berilgan char belgisi va berilgan bo'y va eng qiymatlari asoida 
    to'g'ri to'rtburchak shaklidagi ajoyib matnni xosil qiluvchi dastur

*/

public class Kvadrat{

    public static void main(String[] args){

        // to'rtburchakning qanday belgidan iboratligi , bo'yi va enini e'lon qilish;
        char belgi = '#';
        byte boyi = 15; // max 127
        byte eni = 15; // max 127

        Byte boyi_ = Byte.valueOf(boyi);
        Byte eni_ = Byte.valueOf(eni);

        if (boyi == eni){

            System.out.println(boyi + "x" + eni + " o'lchamli kvadrat\n");
        } else{

            System.out.println(boyi + "x" + eni + " o'lchamli to'g'ri  to'rtburchak\n");
        }

        // sikl ichidagi sikldan foydlaanib to'rtburchakni qatroma qator xosil qilamiz (printerga o'xshab)
        for (int i = 0; i < boyi_.intValue(); i ++){

            for (int j = 0; j < eni_.intValue(); j ++){

                System.out.print(belgi + " ");
            }
            System.out.println();
        }
    }
}
