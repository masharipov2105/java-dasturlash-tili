/*

    - E-Commerce bu online bozor deb atash mumkin bo'lgan raqamli tizim
    - E-commerce tizimini OOP ni dastlabki tushunchalarini o'zlashtirganimiz munosabati bilan ilk katta layoha sifatid ishlab chiqmoqchimiz
    - E-Commerce tizimini dasturlashda asosiy OOP ning 4a tamoilidan foydlalanamiz
    - E-commerce tizimi Product abstract ota classi va uni bolalari Electronics, Book, Clouthing kabi bir nechta subclasslar bo'ladi
    - E-commerce tizmida yana Cart nomli alohida ro'yxatni shakklantirish uchun mustaqil class ham bo'ladi
    - E-commerce tizimida Purchasable  nomi interface yaratilib subclasslar uni implements qilishadi

*/

// Kerakli modullarni yuklash
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        Savat savat = new Savat();
        Mahsulot m1 = new Elektronika(1, "Diod", 1, 100);

    }
}


// Asosiy Product abstract classini shakklantirib olamiz
// id, name va price kabi umumiy fieldslarni yaratamiz
// fieldslar private xolatida bo'ladi
// private fieldslarga faqat getter/setter yordamida murojaat amalga oshiriladi
// getDiscountedPrice() nomli abstract metod bilan har bir subclass o'z chegirmasini belgilaydi
// toString metodini overriding qilamiz

// barcha subclasslar uchun metodlar
interface UmumiyMetodlar{

    void sotish();
    boolean mavjudmi();
    int getSoni();
    String getMuallif();
    int getOlcham();
    double chegirmaNarxi();
    void setSoni();
}

abstract class Mahsulot implements UmumiyMetodlar{

    // umumyi fieldslarni yaratamiz
    private int id;
    private String nomi;
    private int narxi;

    // konstruktorni shakklantiramiz
    public Mahsulot(int id_, String nomi_, int narxi_){

        // fieldsgarga dastlabki qiymatlarni berib iniitalize qilish
        this.id = id_;
        this.nomi = nomi_;
        this.narxi = narxi_;
    }

    // private fieldslarga murojaat uchun getter va setter larni yaratish
    public int getId(){

        return this.id;
    }

    public String getNomi(){

        return this.nomi;
    }

    public int getNarxi(){

        return this.narxi;
    }

    public void setId(int newId){

        if (newId > 0){

            this.id = newId;
        } else{

            System.out.println("ID musbat butun son bo'lishi kerak!");
        }
    }

    public void setNomi(String newName){

        if (!newName.isEmpty() || newName != null){

            this.nomi = newName;
        } else{

            System.out.println("nom bo'sh bo'lmasligi kerak");
        }
    }

    public void setNarxi(int newPrice){

        if (newPrice > 0){

            this.narxi = newPrice;
        } else{

            System.out.println("Narx 0 dan katta bo'lishi kerak");
        }
    }

    // Umumiy metodlarni ovveriding qilamiz (Adapter class vazifasini ham bajaramiz)
    @Override
    public void sotish(){}

    @Override
    public boolean mavjudmi(){return false;}

    @Override
    public int getSoni(){return 0;}

    @Override
    public String getMuallif(){return null;}

    @Override
    public int getOlcham(){return 0;}

    @Override
    public double chegirmaNarxi(){return 0.0;}

    @Override
    public void setSoni(){}
}

// Elektronika nomli subclass yaratamiz
// Elektronika mahsulot turi bo'lib Mahsulot sinfidan meros oladi
class Elektronika extends Mahsulot{

    //o'ziga xos fieldslarini yaratamiz
    private int soni;
    private boolean mavjudlik;

    //konstruktorni shakklantiramiz
    public Elektronika(int id_, String nomi_, int narxi_, int soni_){

        // super yordamida ota class konstruktorini chaqirib initialize qilamiz kodni qisqartirish uchun
        super(id_, nomi_, narxi_);
        // qolgan o'ziga xos fieldslarni ham initialize qilamiz
        this.soni = soni_;
        if (soni_ > 0){

            this.mavjudlik = true;
        } else {

            this.mavjudlik = false;
        }
    }

    // sinfga kerkali metodlanri superclassdan olib qayta overriding qilamiz
    @Override
    public boolean mavjudmi(){

        return this.mavjudlik;
    }

    @Override
    public void sotish(){

        if (this.mavjudmi()){

            this.soni --;
            if (this.soni <= 0){

                this.soni = 0;
                this.mavjudlik = false;
            }
        } else{

            System.out.println(String.format("id: %d, name: %s, count: %d, mahsulot qolmagan", super.getId(), super.getNomi(), this.soni));
        }
    }

    // chegirma narxini belgilash
    @Override
    public double chegirmaNarxi(){

        // chegirma foizi
        int foiz = 10;
        // belgilangan narx (super.narx) ga 10% chegirma
        return (double)((super.getNarxi() * foiz) / 100);
    }

    // mahsulot soni
    public int getSoni(){

        return this.soni;
    }

    // Mahsulot savatdan chiqarilhganida mahsulotlar soni oshirgan xolda umumiy mahsulotlar sonini yangilash
    @Override
    public void setSoni(){

        this.soni ++;
    }

    // Object sinfidan kelgan toString metodini override qilmiz,
    @Override
    public String toString(){

        String finalString = String.format("\nid: %d\nnomi: %s\nnarxi: %d\n", super.getId(), super.getNomi(), super.getNarxi());
        return finalString;
    }
}

// Kitob subclassini yaratamiz
// BU sinfda o'ziga xos bo'lgan Muallif fieldis va unga bog'liq metodlar bo'ladi
// toString metodini ham o'ziga xos fieldsi asosida Overriding qilamiz
class Kitob extends Mahsulot{

    // o'ziga xos fieldslari
    private String muallif;
    private int soni;
    private boolean mavjudlik;

    // konstruktorni tayinlaymiz
    public Kitob(int id_, String nomi_, int narxi_, String muallif_, int soni_){

        // superclass konstrukto bi;an initialize qilamiz
        super(id_, nomi_, narxi_);
        // o'ziga xos fieldslarni initialize qilamiz
        this.muallif = muallif_;
        this.soni = soni_;

        if (soni_ > 0){

            this.mavjudlik = true;
        } else {

            this.mavjudlik = false;
        }

    }
    // sinfga kerkali metodlanri superclassdan olib qayta overriding qilamiz
    @Override
    public boolean mavjudmi(){

        return this.mavjudlik;
    }

    @Override
    public void sotish(){

        if (this.mavjudmi()){

            this.soni --;
            if (this.soni <= 0){

                this.soni = 0;
                this.mavjudlik = false;
            }
        } else{

            System.out.println(String.format("id: %d, name: %s, count: %d, mahsulot qolmagan", super.getId(), super.getNomi(), this.soni));
        }
    }

    // chegirma narxini belgilash
    @Override
    public double chegirmaNarxi(){

        // chegirma foizi
        int foiz = 10;
        // belgilangan narx (super.narx) ga 10% chegirma
        return (double)((super.getNarxi() * foiz) / 100);
    }

    // mahsulot soni
    public int getSoni(){

        return this.soni;
    }

    // Mahsulot savatdan chiqarilhganida mahsulotlar soni oshirgan xolda umumiy mahsulotlar sonini yangilash
    @Override
    public void setSoni(){

        this.soni ++;
    }

    // muallif fieldisi ucuhn getter/setter ni yozamiz
    public String getMuallif(){

        return this.muallif;
    }

    public void setMuallif(String newMuallif){

        if(!newMuallif.isEmpty() && newMuallif != null){

            this.muallif = newMuallif;
        } else{

            System.out.println("Muallif nomi bo'sh bo'lmasligi kerak");
        }
    }

    // toString metodini sinfga moslab overriding qilamiz
    @Override
    public String toString(){

        String finalString = String.format("\nid: %d\nnomi: %s\nnarxi: %d\nmuallif: %s\n", super.getId(), super.getNomi(), super.getNarxi(), this.getMuallif());
        return finalString;
    }
}







// Savat sinfini yaratamiz mavjud Mahsulotlarni yig'ish umumiy narx, chegirmani chiqarish uchun
class Savat{

    // o'ziga xos fieldslarni belgilaymiz
    private double chegirmaNarx = 0.0;
    private int umumiyNarx = 0;
    private List<Mahsulot> mahsulotRoyxati = new ArrayList<>();

    // bo'sh konstruktor yaratamiz
    public Savat(){}

    // o'ziga xos metodlarini shakllantiramiz
    // mahsulot qo'shish metodi
    public void addMahsulot(Mahsulot mahsulot, int soni){

        if (soni < mahsulot.getSoni()){
            // Mahsulotni ro'yxatga qo'shish
            for (int i = 0; i < soni; i ++){

                mahsulot.sotish();
                mahsulotRoyxati.add(mahsulot);
            }
        } else{

            System.out.println("Faqat " + mahsulot.getSoni() + " ta xarid qilish mumkin");
        }
    }

    // Mahsulotni olib tashlash metodi
    public void removeMahsulot(Mahsulot mahsulot){

        this.mahsulotRoyxati.remove(mahsulot);
        mahsulot.setSoni();
    }

    // Barcha mahsulotlarni olish
    public List<Mahsulot> getMahsulot(){

        return this.mahsulotRoyxati;
    }

    // Umumiy summani qaytaruvchi metod
    public int getUmumiyNarx(){

        for (Mahsulot mahsulot: this.mahsulotRoyxati){

            this.umumiyNarx += mahsulot.getNarxi();
        }

        return this.umumiyNarx;
    }
}
