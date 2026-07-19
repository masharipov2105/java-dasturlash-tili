/*

    -class operatori OOP dasturlashga kirishdagi eng muhim kalitso'z xisoblanadi
    -class o'zimizni nostandart tipimizni yaratishda ishlatilinadigan operator
    -obekt classimiz asosida yaratilgan yangi o'zgaruvchi deb tushunsak bo'ladi
     xuddi Wrapper sinf asosida yaratgan o'zgaruvchismiz kabi Integer ozgaruvchi = new Integer.valueOf(18)
    -obekt biz yaratgan sinfning o'zgaruvchisi desak bo'ladi

*/

public class Main{

    public static void main(String[] args){

        // Kompuyter sinfidan foydalanib yangi obekt yaratamiz va info metodidan foydlaanib jotiy holatini chop etamiz
        Kompyuter pc_1 = new Kompyuter("Tizimli blok", "Dell Vostro 3888", "Intel® Core™ i5-10400", "HDD",(byte)4, (short)1024, (short)8, (short)500, true, "NVIDIA GeForce RTX 3050 8 GB");
        System.out.println(pc_1.info()); // kompyuterimiozning xolatini chop etish instance info metodi bilan
    }
}

// o'zimizning ilk sinfimizni qurib ko'ramiz
// Kompyuter nomli sinf yaratamiz

class Kompyuter{

    //instance o'zgaruvchilarini yani obektni xususiyatlarini shakllantiramiz
    String tip = "Tizimli blok"; // standart ravishda Tizimli blok
    String model = "nomalum"; // standart ravishda nomalum
    String protsessor = "nomalum"; // standart ravishda nomalum
    String doimiy_xotira_turi = "SSD"; // standart ravishda SSD
    byte tezkor_xotira_turi = 4; // standart ravishda DDR4
    short doimiy_xotira = 128; // standart ravishda 128 GB (eng minimal SSD yoki HDD)
    short tezkor_xotira = 8; // standart ravishda 8GB
    short taminot_blok_quvvati = 600; // standart ravishda 600W
    boolean video_karta_bormi = false; // standaet ravishda yo'q;
    String video_karta_modeli = "nomalum"; //standart ravishda nomalum

    // konstruktor yasaymiz va obektni initializatsiya vaqitda ilk parametr qiymatlarini xusiaytlarga tayinlaymiz
    public Kompyuter(
        String tip_,
        String model_,
        String protsessor_,
        String xotira_rom_type,
        byte xotira_ram_type,
        short xotira_rom,
        short xotira_ram,
        short taminot,
        boolean isVideoCard,
        String video_karta
    ){
        this.tip = tip_;
        this.model = model_;
        this.protsessor = protsessor_;
        this.doimiy_xotira_turi = xotira_rom_type;
        this.doimiy_xotira = xotira_rom;
        this.tezkor_xotira = xotira_ram;
        this.taminot_blok_quvvati = taminot;
        this.video_karta_bormi = isVideoCard;
        this.video_karta_modeli = video_karta;
    }

    // kompyuterning joriy xarkteristikaini chop etish uchun instance info nomli metod yaratamiz, parametrlari yo'q
    public String info(){

        String yakuniy_xolat = "";

        // video karta mavjud bo'lmagan xolat uchun dastlabki qiymatlarni tayinladik
        String p8 = String.format("Video karta mavjudligi: %s \n", "mavjud emas");
        String p9 = String.format("Video karta modeli: %s \n", "mavjud emas");

        String ramka = String.format("\n================= %s =================\n", this.model);
        String p1 = String.format("Turi: %s \n", this.tip);
        String p2 = String.format("Kompyuter protsessori (CPU): %s \n", this.protsessor);
        String p3 = String.format("Doimiy xotira turi (ROM) %s \n", this.doimiy_xotira_turi);
        String p4 = String.format("Doimiy xotira hajmi (GB): %d GB \n", this.doimiy_xotira);
        String p5 = String.format("Tezkor xotira turi: DDR%d \n", this.tezkor_xotira_turi);
        String p6 = String.format("Tezkor xotira hajmi (GB): %d GB \n", this.tezkor_xotira);
        String p7 = String.format("Taminot bloki quvvati: %d \n", this.taminot_blok_quvvati);
        String ramka_oxiri = "======================================\n";
        // agar video karta mavjud bo'lsa konstruktordagi qiymatlarni tayinlaymiz
        if (this.video_karta_bormi){

            p8 = String.format("Video karta mavjudligi: %s \n", "mavjud");
            p9 = String.format("Video karta modeli: %s \n", this.video_karta_modeli);
        }

        yakuniy_xolat = (ramka + p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + ramka_oxiri);

        return yakuniy_xolat;
    }
}

