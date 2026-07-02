/*

    -assignment-operatorlari bular asosan sonli tiplar bilan ishlashga mo'ljallangan
    -asosiy maqsad kodni ixchamlashtirish a = a + 5 o'rniga a += 5 qilib ixchamlasj
    -bu operatorlarda avtomatik 'explicit kasting' yani aniq tipda ishlay olish xusuiyati mavjud
     yani short a = 5; a += 5; kodida avtomatik 5 + 5 ni short tilida xisoblaydi,  oddiy a = a +5; xaolik qaytaradi
     sababi kichik tipdagi sonlar bilana rifmetik amllar bajarilganda kompilator avtomatik intda javob qaytaradi natijada xatolik
     yuzaga keladi, int ni short ga o'tkazib bo'lmaydi degan manodagi xatolik.

*/


public class Main{

    public static void main(String[] args){

    // = operatori
    int son1, son2;
    String satr1;

    son1 = 27; // son1 o'zgaruvchisiga 27 degan qiymatni yuklash
    satr1 = "salom"; // satr1 o'zgaruvchisiga 'salom' degan qiymatni yuklash
    son2 = (son1 + 3) * 2; //son2 o'zgaruvchisiga operatordan keyin o'ng tarafda turgan ifodani qiymatini yuklash

    System.out.println("son1 o'zgaruvchisiga 27 degan qiymatni yuklash " + son1);
    System.out.println("satr1 o'zgaruvchisiga 'salom' degan qiymatni yuklash " + satr1);
    System.out.println("son2 o'zgaruvchisiga operatordan keyin o'ng tarafda turgan ifodani qiymatini yuklash "+ son2);
    }
}
