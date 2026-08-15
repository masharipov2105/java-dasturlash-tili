/*

    -Maxsus exception,yani customExceptionlarni Exception yoki RuntimeException sinfidan meros olish orqali o'zimizga moslash mumkin
    -class yaratib uni xatolik kuzatilishi mumkin bo'lgan metodlarida ayna shu subclassimizni ishlatib xatoliklarni nazorat qilamiz
    -throws maxsus kalit so'zi yordamida yaratgan customExceptionimizni metodimizga bog'laymiz
    -throw new customException("matn") yordamida xatolikni va uni matnini xuddi return kabi qaytaramiz
    -qaytarilgan xatolikni catch bloki handling qiliadi ekan

*/

public class Main{

    public static void main(String[] args){

        // Student sinfimizni tekshirib test qilamiz
        Student student1 = new Student("Alisher");

        System.out.println(student1.getName() + " " + student1.getAge()); // dastlabki xolat
        //student1.setAge(17); // Runtimeda xatoik chiqarishi kerak
        //student1.setName(null); // runtimeda xatolik berishi kerak
        try{

            student1.setAge(17);
        } catch (smallAgeException error){

            System.out.println(error.getMessage());
        }

        try{

            student1.setName("S");

        } catch (emptyNameException error){

            System.out.println(error.getMessage());
        } catch (smallLengthException error){

            System.out.println(error.getMessage());
        }
    }
}


// Yosh tekshiruvi asosida o'z exceptionmizini yozamiz
// RuntimeExceptiondan meros olib dastur ishga tushgan vaqtida xatoliklar kuzatiladigan bo'ladi
// messageimizni parentni konstruktoriga yuboramiz

class smallAgeException extends RuntimeException{

    public smallAgeException(String message){

        super(message);
    }
}


// bo'sh ism va ism uzunligibo'yicha xatolikni nazorat qilish uchun o'z exceptionimizni yozamiz
// RuntimeExceptiondan meros olamiz
// messagemizni parent konstruktoriga yuboramiz

class emptyNameException extends RuntimeException{

    public emptyNameException(String message){

        super(message);
    }
}

// ism uzunligini nazorat qilish uchun o'z exceptionmizini yozamiz
// RuntimeExceptiondan meros olamiz

class smallLengthException extends RuntimeException{

    public smallLengthException(String message){

        super(message);
    }
}


// Student nomli class yaratamiz
// aynan setAge metodida smallAgeExceptiondan foydalaanmiz
// setName uchun emptyNameException va smallLengthException lardan foydalanamiz
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

    public void setName(String newName) throws emptyNameException, smallLengthException{

        if  (newName == null || newName.isEmpty()){

            throw new emptyNameException("ism bo'sh bo'lishi mumkin emas");
        } else if (newName.length() < 2){

            throw new smallLengthException("Ism uzunligi 2 begidan kichik bo'la olmaydi");
        }

        this.name = newName;
    }
}
