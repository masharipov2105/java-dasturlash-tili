/*

    -ikki o'lchovli massivlar nafaqat java tilida balki deyarli barcha tillarda ko'p foydlaaniladigan tipfit
    -ikki o'lchovli massivlar bu bir o'lchovli massiv ichidagi yana bir o'lchovli massivga o'xshaydi
    -ikki o'lchovli massivda ma'lumotlarni jadvalga o'xshagan usulda boshqarish mumkin
    -iiki o'lchovli massiv 'matritsa' deb ham yuritiladi

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

        // ikki o'lchovli massivning biror elementini qiymatini o'zgartiramiz
        System.out.println("massivning [2][0] elementining dastlabki qiymati: " + massiv_2x[2][0]); // 5
        massiv_2x[2][0] = 77;
        System.out.println("massivning [2][0] elementining keyingi qiymati: " + massiv_2x[2][0]); // 77

        // berilgan 3x3 o'lchovli massivni sehirli kvadrtaga tekshiramiz

        byte[][] raqam_massiv = new byte[][]{
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2},
        };

        // matritsani ekranga chop etish
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j ++){

                System.out.print(raqam_massiv[i][j] + ", ");
            }
            System.out.println("\n");
        }


        // usutnlar, satrlar va diagonallarni tekshirish
        boolean s1 = (raqam_massiv[0][0] + raqam_massiv[0][1] + raqam_massiv[0][2] == 15);
        boolean s2 = (raqam_massiv[1][0] + raqam_massiv[1][1] + raqam_massiv[1][2] == 15);
        boolean s3 = (raqam_massiv[2][0] + raqam_massiv[2][1] + raqam_massiv[2][2] == 15);

        boolean u1 = (raqam_massiv[0][0] + raqam_massiv[1][0] + raqam_massiv[2][0] == 15);
        boolean u2 = (raqam_massiv[0][1] + raqam_massiv[1][1] + raqam_massiv[2][1] == 15);
        boolean u3 = (raqam_massiv[0][2] + raqam_massiv[1][2] + raqam_massiv[2][2] == 15);

        boolean d1 = (raqam_massiv[0][0] + raqam_massiv[1][1] + raqam_massiv[2][2] == 15);
        boolean d2 = (raqam_massiv[0][2] + raqam_massiv[1][1] + raqam_massiv[2][0] == 15);

        // tekshiirlgan natijalar asosida matrintsani sehirli kvadrat ekanligini aniqlaymiz
        if ((s1 && s2 && s3) && (u1 && u2 && u3) && (d1 && d2)){

            System.out.println("Berilgan massiv 'Sehirli kvadrat'");
        } else{

            System.out.println("Berilgan matritsa oddiy");
        }
    }
}
