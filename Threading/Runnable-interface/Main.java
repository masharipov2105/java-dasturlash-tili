/*

    -Runnable bu interfeys bo'lib ichida bitta run() abstrakt metodiga ega
    -Runnable interfeysi yordamida alohida kod blokini mudul sifatida alohida obekt sifatida ajrata olamiz
    -Runnable+Thread zamonaviy va ko'p imkoniyatli kombinatsiya, asinxron dasturlashda

*/

public class Main{

    public static void main(String[] args){


        // Runnable interfeysi orqali sikl yaratamiz
        Runnable task1 = () -> {

            for (int i = 0; i < 5; i ++){

                System.out.println("Runnable jarayoni: " + i);

                // Kutish rejimi Thread bilan
                try{

                    Thread.sleep(200);
                } catch (Exception e){

                    e.printStackTrace();
                }
            }
        };

        // interfeys ichidagi kodni sinxron tarzda oddiy chaqirib ko'ramiz
        task1.run();
    }
}


