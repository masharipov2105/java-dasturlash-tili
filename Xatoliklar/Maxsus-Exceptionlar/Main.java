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

