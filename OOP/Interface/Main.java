/*

    -interface bu shunday kod bloki xisoblanadiki uning ichida classnigmetodlarini saqlash mumkin
    -interface ichida yaratilgan standart metod public abstract xolatida yaratiladi
    -interfaceni metodlaridan foydlaanish uchun class da implements kalit so'zidan foydalaniladi
    -interfaceni implements qilgan class barcha metodlarini ishlatish imkoniga ega bo'ladi private metodlaridan tashqari
    -class cheksiz ko'p interfacelarni implenets qila oladi
    -interface ichida asl maqsadiga ko'ra abstract yani tanasiz metodlar bo'lishi kerak, ammo interface ichida protected metodlardan
     tashqari barcha turdagi metodlarni joriy qilish mumkin java 17+ dan boshlab

*/

public class Main{

    public static void main(String[] args){

    }
}

// Smartfonlar uchun bir qancah metodlanri interface ichida abstract xolatda shakklantiramiz
interface smartfonMetodlar{

    public abstract void yoqish();
    public abstract void ochir();
    public abstract void zaryadlash();
    void oyin(); // avtomatik public abstract xolatida bo'ladi
}
