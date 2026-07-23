/*

    -meros osih bu ota sinf deb nomlanuvchi bir sinfning barcha ochiq va olish mumkin bo'lgan metodlari va xusuiatlarini ishlatishimkoniyati
    -extends operatori bizga bir sinfning barcha ochiq va  olish mumkin bo'lgan fieldslari va metodlarini ishlatish imkonini beradi
    -super operatori bizga ota sinfning konstrukktori meros olingan metod larini chaqirish va xusisiyatlariga murojaat imkonini beradi
    -@Override annotatsiyasi bizga ota sinf metodini qayta tashkil qilish imkoni beradi, natijada ota sinf emas yangi bola sinfdagi kod ishlaydi

*/


public class Main{

    public static void main(String[] args){

    }
}

// Transport nomli ota sinf tashkil qilamiz
// Ota sinf asosida bir qancha bola sinflar tashkil qilamiz
// bola sinf da ota sinfdan olingan meroslardan foydalanishni ko'rib chiqamiz
// har bir bola sinfning o'ziga xos fieldsi va metodlarini ham qo'shamiz
// @override annotatsiyasidan foydalanib ota sinfning bazi metodlarini qayta yozamiz

class Transport{

    // ota sinfning umumiy xususiyatlari
    protected String nom;
    protected int maxTezlik;
    protected int yolovchiSoni;
    protected String rang;
    protected static int intervalTezlik;

    //static xusiatlarga dastlabki qiymatlarini berish
    static{

        intervalTezlik = 3; // km/h
    }

    //kosntruktorni yaratamiz
    public Transport(String nom_, int max_tezlik_, int yolovchi_soni_, String rang_){

        this.nom = nom_;
        this.maxTezlik = max_tezlik_;
        this.yolovchiSoni = yolovchi_soni_;
        this.rang = rang_;
    }

// ------------------------------------------------------------

    //getter/setter larni sozlash
    public String getNom(){

        return this.nom;
    }

    public void setNom(String yangiNom){

        if (!yangiNom.isEmpty()){

            this.nom = yangiNom;
        } else{

            System.out.println("Nom bo'sh bo'la olmaydi");
        }
    }
// ------------------------------------------------------------

    public int getMaxTezlik(){

        return this.maxTezlik;
    }

    public void setMaxTezlik(int yangiTezlik){

        if (yangiTezlik > 0){

            this.maxTezlik = yangiTezlik;
        } else{

            System.out.println("Maksimal tezlik 0 bo'la olmaydi");
        }
    }
// ------------------------------------------------------------

    public int getYolovchiSoni(){

        return this.yolovchiSoni;
    }

    public void setYolovchiSoni(int yangiYolovchiSoni){

        if (yangiYolovchiSoni > 0){

            this.yolovchiSoni = yangiYolovchiSoni;
        } else{

            System.out.println("Yo'lovchilar soni 0 bo'la olmaydi");
        }
    }
// ------------------------------------------------------------

    public String getRang(){

        return this.rang;
    }

    public void setRang(String yangiRang){

        if (!yangiRang.isEmpty()){

            this.rang = yangiRang;
        }
    }
// ------------------------------------------------------------


}
