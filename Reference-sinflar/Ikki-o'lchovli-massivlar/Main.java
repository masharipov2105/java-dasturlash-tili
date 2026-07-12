/*

    -ikki o'lchovli massivlar nafaqat java tilida balki deyarli barcha tillarda ko'p foydlaaniladigan tipfit
    -ikki o'lchovli massivlar bu bir o'lchovli massiv ichidagi yana bir o'lchovli massivga o'xshaydi
    -ikki o'lchovli massivda ma'lumotlarni jadvalga o'xshagan usulda boshqarish mumkin

*/


public class Main{

    public static void main(String[] args){

        // eng sodda ikki o'lchovli massivni yaratib ko'ramiz
        int[][] massiv_2x = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        // ikki o'lchovli massivning elementini chop etish
        System.out.println("massivning [0][1] elementi: " + massiv_2x[0][1]);

    }
}
