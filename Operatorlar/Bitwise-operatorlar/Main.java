/*

    -bitwise operatorlari bu 2 lik tizimdagi sonlar ustida &, |, ~, <<, >> ko'risnishidagi amallarni bajaruvchi past darajali amallar xisoblanadi
    -bitwise operatorlari yordamida bajarilgan amallar ancha tez ishlaydi
    -bitwise operatorlari bitlar ustida amallar bajaradi

*/


public class Main{

    public static void main(String[] args){

        // AND (&) operatori
        int a = 1;
        int b = 2;
        int c = a & b; //1 = 1, 2 = 10; 00 & 10 = 00; 00 - 10 lik tizimda 0 ga teng;
        System.out.println("(1 & 2) " + c);

        // OR (|) operatori
        int a1 = 2;
        int b1 = 3;
        int c1 = a1 | b1; //2 = 10, 3 = 11, 10 | 11 = 11; 11 - 10 lik tizimda 3 ga teng
        System.out.println("(2 | 3) " + c1);

        // NOT (~) operatori;
        int a2 = 5;
        int c2 = ~ a2;
        /*
        1) 5 ni 2 lim tizimga o'girish 5 -> 0101, 4 bitli tizimda
        2) ~0101 = 1010; 32 bitli tizimda eng chapdagi bit 1 ga teng va son aniq manfiy demak
        3) 1010 - 0001 = 1001
        4) ~1001 = 0110
        5) 0110 ni 10 lik tizimga o'girish va odiga - ishorasini qo'yish
        6) 0110 -> 6 ga teng
        7) ~5 = -6
        8) tezkor formula ~x = -(x + 1)
        */
        System.out.println("(~ 5) " + c2); // -6 ga teng

        // << Left shift oeratori
        int a3 = 5;
        int b3 = 2;
        int c3 = a3 << b3; // 5 -> 0101; 10100; yani 0101 ni bitlarini 2 xona oldinga silchitib o'ng tomoniga 0 larni qo'shish, natijani 10 lik tizimga o'girish, 10100 -> 20
        System.out.println("(5 << 2) " + c3);

        // >> Right shift operatori
        int a4 = 4;
        int b4 = 1;
        int c4 = a4 >> b4; // 4 -> 0100; 0010 yani chap tarafga 0 lar qo'shiladi,; natijani 10 lik tizimga o'girish 0010 -> 2
        System.out.println("(4 >> 1) " + c4);

        // XOR (^) operatori
        int a5 = 7;
        int b5 = 10;
        int c5 = a5 ^ b5; // 7 -> 0111, 10 = 1010; 0111 ^ 1010 = 1101; 1101 -> 13
        System.out.println("(7 ^ 10) " + c5);
    }
}
