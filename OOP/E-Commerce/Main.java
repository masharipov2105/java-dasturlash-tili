/*

    - E-Commerce bu online bozor deb atash mumkin bo'lgan raqamli tizim
    - E-commerce tizimini OOP ni dastlabki tushunchalarini o'zlashtirganimiz munosabati bilan ilk katta layoha sifatid ishlab chiqmoqchimiz
    - E-Commerce tizimini dasturlashda asosiy OOP ning 4a tamoilidan foydlalanamiz
    - E-commerce tizimi Product abstract ota classi va uni bolalari Electronics, Book, Clouthing kabi bir nechta subclasslar bo'ladi
    - E-commerce tizmida yana Cart nomli alohida ro'yxatni shakklantirish uchun mustaqil class ham bo'ladi
    - E-commerce tizimida Purchasable  nomi interface yaratilib subclasslar uni implements qilishadi

*/

public class Main{

    public static void main(String[] args){

    }
}


// Asosiy Product abstract classini shakklantirib olamiz
// id, name va price kabi umumiy fieldslarni yaratamiz
// fieldslar private xolatida bo'ladi
// private fieldslarga faqat getter/setter yordamida murojaat amalga oshiriladi
// getDiscountedPrice() nomli abstract metod bilan har bir subclass o'z chegirmasini belgilaydi
// har bir subclass da toString metodini overriding qilamiz

abstract class Product{

    // umumyi fieldslarni yaratamiz
    private int id;
    private String name;
    private int price;

    // konstruktorni shakklantiramiz
    public Product(int id_, String name_, int price_){

        // fieldsgarga dastlabki qiymatlarni berib iniitalize qilish
        this.id = id_;
        this.name = name_;
        this.price = price_;
    }
}
