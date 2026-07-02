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

    // += operatori;
    int a1 = 5;
    a1 += 15;

    short s1 = 7;
    s1 += 7;
    //s1 = s1 + 1; xatolik qahatradi int dan shortga o'tib bo'lmaydi degan ma'noda
    System.out.println("a1 += 15, a1 ning qiymatini 15 ga oshiryapti " + a1);
    System.out.println("s1 += 7, short tipidagi s1 o'zgaruvchisini qiymatini 7 ga oshirish " + s1);

    // -= operatori

    int a2 = 22;
    a2 -= 7;
    System.out.println("a2 -= 7, a2 o'zgaruvchisini qiymatini 7 ga kamaytirish " + a2);

    }
}
