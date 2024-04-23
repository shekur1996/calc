import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите данные: ");
        Scanner scan = new Scanner(System.in);      // объявляем метод сканер в scan, передаем объект System.in(ввод с клавиатуры)
        String enter = scan.nextLine();             //nextLine() считывает нашу строчку из сканера и записывает в enter
        String[] num = enter.split(" ");    //объявляем методу сплит разделитель пробел (при вводе данных 1 + 3) в массив строки parts запишется(1,+,3)
        if (num.length != 3) {                    //если количество символов меньшн или больше
            System.out.println("throws Exception");
            return;
        }

        int a = Integer.parseInt(num[0]); //преобразуем строку из массива в целое число
        int b = Integer.parseInt(num[2]); //преобразуем строку из массива в целое число
        char operation = num[1].charAt(0); //преобразуем строку из массива в тип операции

        if (a < 1 || a > 10 || b < 1 || b > 10) { //делаем проверку не больше 10 не меньше 1
            System.out.println("throws Exception");
            return;
        }

        int res;         //записываем результат
        switch (operation) { //переключаем на нужную операцию в зависимости от ввода
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("throws Exception");
                return;
        }
        System.out.println(res);
    }
}