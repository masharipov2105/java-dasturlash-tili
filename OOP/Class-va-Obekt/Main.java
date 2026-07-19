/*

    -class operatori OOP dasturlashga kirishdagi eng muhim kalitso'z xisoblanadi
    -class o'zimizni nostandart tipimizni yaratishda ishlatilinadigan operator
    -obekt classimiz asosida yaratilgan yangi o'zgaruvchi deb tushunsak bo'ladi
     xuddi Wrapper sinf asosida yaratgan o'zgaruvchismiz kabi Integer ozgaruvchi = new Integer.valueOf(18)
    -obekt biz yaratgan sinfning o'zgaruvchisi desak bo'ladi

*/

public class Main{

    public static void main(String[] args){

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
    short tamimot_blok_quvvati = 600; // standart ravishda 600W
    boolean video_karta_bormi = false; // standaet ravishda yo'q;
    String video_karta_modeli = "nomalum"; //standart ravishda nomalum
}

