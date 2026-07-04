/*

    -kvadrat tenglamalarga A*(x^2) + B*(x) + c = 0 ko'rinishidagi tenglamalarga aytiladi
    -kavdrat tenglamalar eng ko'pi bilan 2 ta haqiqy yechimga ega bo'ladilar, va eng kamida 2 ta mavhum yechimga egadirlar
    -har qanday kvadrat tenglamani yecha oladigan universal usulga Diskriminantlar usuli deyiladi

*/

public class Tenglama{

    public static void main(String[] args){

        //kvadrat tenglamani yechuvchi va javoblarini chop etuvchi dastur

        //tenglamaning koefitsiyaetlarini e'lon qilish
        int A = 1;
        int B = 5;
        int C = 4;

        if (A != 1){

            System.out.println("Tenglama: " + A + "x^2 + " + B + "x + " + C + " = 0");
        } else{

            System.out.println("Tenglama: " + "x^2 + " + B + "x + " + C + " = 0");
        }

        //Diskriminantni xisoblash

        int D = (B * B) - (4 * A * C);

        System.out.println("Tenglama diskriminanti: " + D);

        //Diskriminant asosida yechimni xisoblash
        if (D > 0){

            double x_1 = (-B - Math.pow(D, 1.0 / 2)) / (2 * A);
            double x_2 = (-B + Math.pow(D, 1.0 / 2)) / (2 * A);

            System.out.println("X1 = " + x_1);
            System.out.println("X2 = " + x_2);
        } else if (D == 0){

            double x_ = (-B) / (2 * A);

            System.out.println("X1 = X2 = " + x_);
        } else{

            System.out.println("tenglama haqiqiy yechimlarga ega emas!");
        }
    }
}
