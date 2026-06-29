/*

    -mantiqiy operatorlar shart operatotlari bilan birga ishlatilinadi(odatda)
    -mantiqiy operatotlar bir nechta shart bir vaqtda tekshirilishini taminlaydi
    -mantiqiy operatorlar boolen tipida qiymat qaytaradi

*/

public class Main{

    public static void main(String[] args){

        // AND (&&) operatori

        boolean qiymat1 = true;
        boolean qiymat2 = false;

        boolean natija1 = (qiymat2 && qiymat2);
        boolean natija2 = (qiymat1 && qiymat2);
        boolean natija3 = (qiymat2 && qiymat1);
        boolean natija4 = (qiymat1 && qiymat1);

        System.out.println("(bool false && bool false) " + natija1);
        System.out.println("(bool true && bool false) " + natija2);
        System.out.println("(bool false && bool true) " + natija3);
        System.out.println("(bool true && bool true) " + natija4);

        // OR (||) operatori

        boolean natija5 = (qiymat2 || qiymat2);
        boolean natija6 = (qiymat1 || qiymat2);
        boolean natija7 = (qiymat2 || qiymat1);
        boolean natija8 = (qiymat1 || qiymat1);

        System.out.println("(bool false || bool false) " + natija5);
        System.out.println("(bool true || bool false) " + natija6);
        System.out.println("(bool false || bool true) " + natija7);
        System.out.println("(bool true || bool true) " + natija8);

    }
}
