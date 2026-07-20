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
    private String userName = "unknown";
    private int accountNumber = 0;
    private double balanse = 0.0;
    private String userBirthDay = "0000-00-00";

    public BankHisobi(String user_name, int account_number, double balanse_, String user_birth_day){

        this.userName = user_name;
        this.accountNumber = account_number;
        this.balanse = balanse_;
        this.userBirthDay = user_birth_day;
    }
}
