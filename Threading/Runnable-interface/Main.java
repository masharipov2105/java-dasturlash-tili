/*

    -Runnable bu interfeys bo'lib ichida bitta run() abstrakt metodiga ega
    -Runnable interfeysi yordamida alohida kod blokini mudul sifatida alohida obekt sifatida ajrata olamiz
    -Runnable+Thread zamonaviy va ko'p imkoniyatli kombinatsiya, asinxron dasturlashda

*/

public class Main{

    public static void main(String[] args){


        // task1 ichida for sikli namunasi bilan bajarilishi uchun vaqt talab qiladigan dastur yozamiz
        // task1 ni Threadsiz sinxron ishlashini ko'ramiz
        Runnable task1 = () -> {

            // 15 ta iteratsiyaga ega osuvchi for sikli
            for (int i = 0; i < 15; i ++){

                System.out.println("task1 jarayoni: " + i);

                // har bir iteratsiya uchun kutish rejimi Thread bilan
                try{

                    // time sleep
                    Thread.sleep(200);
                } catch (Exception e){

                    // Exception handling
                    e.printStackTrace();
                }
            }
        };



        // task2 jarayonini while sikli namunasi asosida qurib olamiz
        // task2 jarayonini Thread bilan asinxron ishlatib ko'ramiz
        Runnable task2 = () -> {

            // yordamchi o'zgaruvchi
            int begin = 0;

            // sikl yordamchi o'zgaruvchi 15 ga tenglashgunicha davom etadi
            while (begin < 15){

                System.out.println("task2 jarayoni: " + begin);

                // har bir iteratsiyada o'zgaruvcgi qiymatini bittaga oshirish
                begin ++;

                try{

                    Thread.sleep(200);
                } catch (Exception e){

                    e.printStackTrace();
                }
            }
        };

        // task2 ni Thread yordamida asinxron ishga tushiramiz
        new Thread(task2).start(); // yangi threadda ishga tushiramiz

        // task1 ni Main threadni o'zida ishga tushiramiz
        task1.run();
    }
}


