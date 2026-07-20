/*

    -inkapsulyatsiya tushunchasi obektning xususiyatlari va metodlariga tog'ridsn to'g'ri murojaatni bloklaydi
    -inkapsulyatsiya qilish uchun pirvate va public kabi operatorlardan foydlaaniladi
    -private operatri obektni xususiyatini yoki metodni tashqi kodlaruchun bloklaydi va to'g'ridan to'g'ri murojaatni oldini oladi
    -public operatori esa obekt xususiyatlari yoki metodlarini tashqi kodlar ucuhn ochiq qiladi va to'g'ridan to'g'ri murojaatga ruxsat beradi 

*/


public class Main{

    public static void main(String[] args){

    }
}


// bankHisobi nomli alohida sinf yaratamiz va uni ayrim xususiatlarini inkapsulatsiya qilib ko'ramiz

class BankHisobi{

    // Bank Hisobi obektining xususiyatlarini yaratamiz
    private String userName;
    private int accountNumber;
    private double balanse;
    private String userBirtDay;
}
