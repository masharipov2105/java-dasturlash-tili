/*

    -inkapsulyatsiya tushunchasi obektning xususiyatlari va metodlariga tog'ridsn to'g'ri murojaatni bloklaydi
    -inkapsulyatsiya qilish uchun pirvate va public kabi operatorlardan foydlaaniladi
    -private operatri obektni xususiyatini yoki metodni tashqi kodlaruchun bloklaydi va to'g'ridan to'g'ri murojaatni oldini oladi
    -public operatori esa obekt xususiyatlari yoki metodlarini tashqi kodlar ucuhn ochiq qiladi va to'g'ridan to'g'ri murojaatga ruxsat beradi 

*/


public class Main{

    public static void main(String[] args){

        //BankHisobi sinfi yordmida yangi obket yaratamiz va uni userName xususiyatiga to'g'ridan to'g'ri murojaatni ko'ramiz
        BankHisobi user_1 = new BankHisobi("Alisher Valiev",12218765, 1270650.80, "1987-17-08");

        //userName xususiyatiga metodsiz to'g'idan to'g'ri murojjatni amalga oshirishga urinamiz;
        //System.out.println("Username = " + user_1.userName); xatolik: userName is private

        //userName qiymatini standart getter metodi bilan olishga urinamiz
        System.out.println("dastlab Username: " + user_1.getUserName());

        //userName ni setUserName setter metodi bilan o'zgartirishga urinamiz
        user_1.setUserName("Rustam G'aniev");

        //userName qiymati o'zgarishidan keyingi xolatni chop etib ko'ramiz
        System.out.println("keyin UserName: " + user_1.getUserName());

        // yangi BankHisobi yaratib barcha metodlarni sinab ko'ramiz
        BankHisobi user_2 = new BankHisobi("Ali Aliev", 12210001, 1500000.00, "1970-24-10");

        // barcha xusiyatlarini chop etib ko'ramiz
        System.out.println("\nUser: " + user_2.getUserName());
        System.out.println("UserAccountNumber: " + user_2.getAccountNumber());
        System.out.println("User balanse: " + user_2.getBalanse() + " so'm");
        System.out.println("User birthday: " + user_2.getUserBirthDay() + "\n");

        // xususiatlarni yangilab ko'ramiz;
        user_2.setUserName("Ali Valiev");
        user_2.setAccountNumber(12210002);
        //user_2.setbalanse(3000000.00); // ishlamaydi, bunday metod mavjud emas va bo'lmasligi kerak
        //user_2.setUserBirthDay("2049-12-12"); // ishlamaydi, bunday metod yo'q va bo'lmasligi kerak

        // yangilangandan keyingi xolatni ko'rib chiqamiz

        System.out.println("\nUser (yangilanish): " + user_2.getUserName());
        System.out.println("UserAccountNumber(yangilansih): " + user_2.getAccountNumber());
        System.out.println("User balanse(yangilanish): " + user_2.getBalanse() + " so'm");
        System.out.println("User birthday(yangilanish): " + user_2.getUserBirthDay() + "\n");

       // balans va tug'ilgan kun sanalari yangilanmadi chuni ularni yoangilash mantiqiy emas va sinf falasafasiga ziddir
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

    public void setUserName(String newName){

        if (!newName.isEmpty()){

            this.userName = newName;
        } else{

            System.out.println("Ism bo'sh bo'la olmaydi");
        }
    }

    public String getUserName(){

        return this.userName;
    }

    public void setAccountNumber(int newNumber){

        if (newNumber > 12210000){

            this.accountNumber = newNumber;
        } else{

            System.out.println("hisob raqami formati xato !");
        }
    }

    public int getAccountNumber(){

        return this.accountNumber;
    }

    public double getBalanse(){

        return this.balanse;
    }

    public String getUserBirthDay(){

        return this.userBirthDay;
    }
}
