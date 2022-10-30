public class Main {
    public static void main(String[] args) {

        // задание 1 и 2

        byte clientOS = 1;  int clientDeviceYear = 2013;

        if (clientOS == 0 & clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 & clientDeviceYear <2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        else if (clientOS == 1 & clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 & clientDeviceYear <2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else System.out.println(" Такой версии OC нет ");

        System.out.println(" ");


                                    //Задание 3


        int year = 2021;
        if(year % 4 == 0 & year % 100 != 0){
             // если год делиться на 4 без остатка и делиться на 100 с остатком год високосный
             System.out.println(year + " год високосный");
         }else if (year % 4 ==0 & year % 100 ==0 & year % 400 == 0){
             // иначе если год делиться на 4 на 100 и на 400 без остатка
             System.out.println(year + " год високосный");
         } else System.out.println(year + " год не високосный");
        // иначе год не високосный





        System.out.println(" ");


                                    // задание 4



        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            int day = 1;
            System.out.println( "потребуется дней " + day );
        }
        else if (deliveryDistance >20 & deliveryDistance <60){
            int day = 2;
            System.out.println("потребуеться дней " + day);
        }
        else if (deliveryDistance >=60 & deliveryDistance < 100){
            int day = 3;
            System.out.println("потребуеться дней " + day);
        }

        System.out.println(" ");


                        // задача 5

        int monthNumber = 12;

        switch (monthNumber){
            case 1:
                System.out.println("Январь принадлежит зимнему сезону");
                break;
            case 2:
                System.out.println("Февраль принадлежит зимнему сезону");
                break;
            case 3:
                System.out.println("Март принадлежит весеннему сезону");
                break;
            case 4:
                System.out.println("Апрель принадлежит весеннему сезону");
                break;
            case 5:
                System.out.println("Май принадлежит весеннему сезону");
                break;
            case 6:
                System.out.println("Июнь принадлежит летнему сезону");
                break;
            case 7:
                System.out.println("Июль принадлежит летнему сезону");
                break;
            case 8:
                System.out.println("Авгус принадлежит летнему сезону");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит осеннему сезону");
                break;
            case 10:
                System.out.println("Октябрь принадлежит осеннему сезону");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит осеннему сезону");
                break;
            case 12:
                System.out.println("Декабрь принадлежит зимнему сезону");
                break;
            default:
                System.out.println("Введёное значение не коректно");
        }






    }
}