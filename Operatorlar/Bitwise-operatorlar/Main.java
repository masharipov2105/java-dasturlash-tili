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
    }
}
