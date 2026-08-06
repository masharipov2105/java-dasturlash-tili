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

    }
}


// Asosiy Product abstract classini shakklantirib olamiz
// id, name va price kabi umumiy fieldslarni yaratamiz
// fieldslar private xolatida bo'ladi
// private fieldslarga faqat getter/setter yordamida murojaat amalga oshiriladi
// getDiscountedPrice() nomli abstract metod bilan har bir subclass o'z chegirmasini belgilaydi
// toString metodini overriding qilamiz

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

    // private fieldslarga murojaat uchun getter va setter larni yaratish
    public int getId(){

        return this.id;
    }

    public String getName(){

        return this.name;
    }

    public int getPrice(){

        return this.price;
    }

    public void setId(int newId){

        if (newId > 0){

            this.id = newId;
        } else{

            System.out.println("ID musbat butun son bo'lishi kerak!");
        }
    }

    public void setName(String newName){

        if (!newName.isEmpty() || newName != null){

            this.name = newName;
        } else{

            System.out.println("nom bo'sh bo'lmasligi kerak");
        }
    }

    public void setPrice(int newPrice){

        if (newPrice > 0){

            this.price = newPrice;
        } else{

            System.out.println("Narx 0 dan katta bo'lishi kerak");
        }
    }

    // toString metodini overriding qilamiz, mahsulotni chiroyli ko'rinishda chiqarish uchun
    @Override
    public String toString(){

        String finalString = String.format("\nid: %d\nname: %s\nprice: %d $", this.id, this.name, this.price);
        return finalString;
    }

    // Har bir subclass o'zining chegirmasini belgilaydi;
    public abstract double getDiscountedPrice();
}

//subclasslarning umumiy abstract metodlari uchun interface yaratamiz
interface Purchasable{

    void purchase(); //sotib olish uchun metod;
    boolean isAvaiable(); // mavjudligini bilish uchun metod;
}

// Electronics subclassini yaratamiz Product sinfidan meros olib Purchasable interfaceini implements qilamiz
class Electronics extends Product implements Purchasable{

    //o'ziga xos fieldslarini yaratamiz
    private int count;
    private boolean avaiable;

    //konstruktorni shakklantiramiz
    public Electronics(int id_, String name_, int price_, int count_){

        // super yordamida ota class konstruktorini chaqirib initialize qilamiz kodni qisqartirish uchun
        super(id_, name_, price_);
        // qolgan o'ziga xos fieldslarni ham initialize qilamiz
        this.count = count_;
        if (count_ > 0){

            this.avaiable = true;
        } else {

            this.avaiable = false;
        }
    }

    // interfeysdagi metodlarni overriding qilamiz
    @Override
    public boolean isAvaiable(){

        return this.avaiable;
    }

    @Override
    public void purchase(){

        if (this.isAvaiable()){

            this.count --;
            if (this.count == 0){

                this.avaiable = false;
            }
        } else{

            System.out.println(String.format("id: %d, name: %s, count: %d, mahsulot qolmagan", super.getId(), super.getName(), this.count));
        }
    }

    // chegirma narxini belgilash
    @Override
    public double getDiscountedPrice(){

        // chegirma foizi
        int discountPrice = 10;
        // belgilangan narx (this.price) ga 10% chegirma
        return (double)((super.getPrice() * discountPrice) / 100);
    }
}




// Cart sinfini yaratamiz mavjud Productlar ni yig'ish umumiy narx, chegirmani chiqarish uchun
class Cart{

    // o'ziga xos fieldslarni belgilaymiz
    private double discountedPrice;
    private int totalPrice;
    private List<Product> productList = new ArrayList<>();

    // bo'sh konstruktor yaratamiz
    public Cart(){}

    // o'ziga xos metodlarini shakllantiramiz
    // mahsulot qo'shish metodi
    public void addProduct(Product product){

        // Mahsulotni ro'yxatga qo'shish
        this.productList.add(product);
    }

    // Mahsulotni olib tashlash metodi
    public void removeProduct(Product product){

        this.productList.remove(product);
    }

    // Barcha mahsulotlarni olish
    public List<Product> getProducts(){

        return this.productList;
    }
}
