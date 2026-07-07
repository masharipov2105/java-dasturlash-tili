/*

    -do-while operatoti boshqa while va fot operatorlari kabi kod blokini qayta qayta ishga tushirish imkoniga ega
    -do-while operstorining for va oddi while operatorlaridan asosiy farqi u kamida 1 marta ishlashiga doim kafolat bor.
     sababi bu suklda boshqa siklallardan farqli ravishda avval kod bloki bajariladi, keyin  shart tekshiriladi

*/


public class Main{

    public static void main(String[] args){

        //dastlsbki x ta natural sonni chop etish
        int x = 10;
        int start = 1;

        do {

            System.out.println(start);
            start ++;
        } while (start <= x);
    }
}
