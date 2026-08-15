/*

    -Maxsus exception,yani customExceptionlarni Exception yoki RuntimeException sinfidan meros olish orqali o'zimizga moslash mumkin
    -class yaratib uni xatolik kuzatilishi mumkin bo'lgan metodlarida ayna shu subclassimizni ishlatib xatoliklarni nazorat qilamiz
    -throws maxsus kalit so'zi yordamida yaratgan customExceptionimizni metodimizga bog'laymiz
    -throw new customException("matn") yordamida xatolikni va uni matnini xuddi return kabi qaytaramiz
    -qaytarilgan xatolikni catch bloki handling qiliadi ekan

*/

public class Main{

    public static void main(String[] args){


    }
}


// Yosh tekshiruvbi asosida o'z exceptionmizini yozamiz
// RuntimeExceptiondan meros olib dastur ishga tushgan vaqtida xatoliklar kuzatiladigan bo'ladi
// messageimizni parentni konstruktoriga yuboramiz

class smallAgeException extends RuntimeException{

    public smallAgeException(String message){

        super(message);
    }
}

// Student nomli class yaratamiz
// aynan setAge metodida smallAgeExceptiondan foydalaanmiz

class Student{

    // o'ziga xos fieldslarini tahskil qilamiz
    private int age = 18;
    private String name;

    // konstruktorni tashkil qilamiz
    public Student(String name_){

        this.name = name_;
    }

    // getter setterlarni sozlaymiz
    public int getAge(){

        return this.age;
    }

    public String getName(){

        return this.name;
    }

    public void setAge(int newAge) throws smallAgeException{

        if (newAge < 18){

            throw new smallAgeException("yosh 18 kichik bo'lmasligi kerak, kiritlgan yosh: " + newAge);
        }

        this.age = newAge;
    }

    public void setName(String newName){

        if (!newName.isEmpty() && newName != null){

            this.name = newName;
        } else{

            System.out.println("Ism bo'sh bo'lmasligi kerak");
        }
    }
}
