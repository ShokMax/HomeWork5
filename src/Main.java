public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOc = 1;
        if (clientOc == 0) {
            System.out.println(" Клиент испульзует Iphone");
        } else {
            System.out.println(" Клиент использует Android");
        }
        System.out.println(" Задание 2");
        int clientDeviceYear = 2013;
        if (clientOc == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша система IOS, можете устанавливать приложение");
        } else if ( clientOc == 0 && clientDeviceYear <2015) {
            System.out.println(" Ваша система IOS устарела, установите облегченную версию приложения для IOS по ссылке");
        } else if ( clientOc == 1 && clientDeviceYear >=2015) {
            System.out.println(" Ваша система Aindroid, можете устанавливать приложение");
        } else if (clientOc == 1 && clientDeviceYear <2015) {
            System.out.println(" Ваша система Android устарела, установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println(" Задание 3");
        int year = 2024;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
        System.out.println(" Задание 4");
        byte deliveryDistance = 75;
        if (deliveryDistance >=20 && deliveryDistance <=60) {
            System.out.println(" Доставка карты будет в течении двух суток");
        } else  if (deliveryDistance >=61 && deliveryDistance <=100) {
            System.out.println(" Доставка карты будет в течении трех суток");
        } else if (deliveryDistance <=19) {
            System.out.println(" Доставка карты займет сутки ");
        } else if (deliveryDistance >100) {
            System.out.println(" На такое расстояние мы не доставляем карты");
        }
        System.out.println(" Задание 5");
        byte monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println(" Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(" Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(" Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(" Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(" Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(" Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(" Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(" Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(" Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(" Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(" Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(" Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println(" Такого месяца не существует");
        }
}
}