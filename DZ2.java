package ru.geekbrains.api.DZ2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
//import org.json.JSONArray; // почему-то вызывает ошибку(
//import org.json.JSONObject;


public class DZ2 {

    static Scanner scanner = new Scanner(System.in);
    static File logFile = null;
    static FileWriter fileWriter = null;


    public static void main(String[] args) throws Exception {

        System.out.println("**********************************");
        System.out.println("Здравствуйте!\nВы открыли Домашнее задание студента GeekBrains\nТимошенко Максима\n Давайте начнем!)");
        System.out.println("**********************************");
        boolean f = true;
        while(f){
            System.out.println("ЗАДАЧИ СЕМИНАРА №1");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №2");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("5 - Задача 1");
            System.out.println("6 - Задача 2");
            System.out.println("7 - Задача 3");
            System.out.println("8 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");

            switch(no){
                case 1:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Вычислить n-ое треугольного число\n (сумма чисел от 1 до n), n!\n (произведение чисел от 1 до n) ");
                    System.out.println("\n");
                    System.out.print("Введите число n: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ответ: ");
                    Exemple1(n);
                    break;

                case 2:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Вывести все простые числа от 1 до 1000 ");
                    System.out.println("\n");
                    System.out.println("Ответ: ");
                    Exemple2();
                    break;

                case 3:

                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализовать простой калькулятор ");
                    System.out.println("\n");
                    System.out.print("Введите число 1: ");
                    double num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите число 2: ");
                    double num2 = Double.parseDouble(scanner.nextLine());
                    double res = 0;
                    Exemple3(num1,num2,res);
                    break;

                case 4:

                    System.out.print("Условие задачи:\n");
                    System.out.print("Задано уравнение вида q + w = e, q, w, e >= 0. \nНекоторые цифры могут быть заменены знаком вопроса, например, \n2? + ?5 = 69. Требуется восстановить выражение до верного равенства.\n Предложить хотя бы одно решение или сообщить, что его нет.");
                    System.out.println("\n");
                    Exemple4();
                    break;

                case 5:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Дана строка sql-запроса 'select * from students where'.\nСформируйте часть WHERE этого запроса, используя StringBuilder. \nДанные для фильтрации приведены ниже в виде json-строки.\nЕсли значение null, то параметр не должен попадать в запрос.\nПараметры для фильтрации: \n{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}");
                    System.out.println("\n");
                    Map<String, String> params1 = new HashMap<String,String>();
                    params1.put("name","Ivanov");
                    params1.put("country","Russia");
                    params1.put("city","Moscow");
                    params1.put("age",null);
                    System.out.println("Ответ: \n");
                    System.out.println(Exemple5(params1));
                    System.out.println("\n");
                    break;
                
                case 6:
                    logFile = new File("log.txt");
                    fileWriter = new FileWriter(logFile, true);
                    fileWriter.flush();
                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализуйте алгоритм сортировки пузырьком числового массива, \nрезультат после каждой итерации запишите в лог-файл.");
                    System.out.println("\n");
                    System.out.println("Введите массив через пробел: ");
                    String number = scanner.nextLine();
                    String strArr[] = number.split(" ");
                    fileWriter.write("Исходный Массив: " + Arrays.toString(strArr) + "\n");
                    int array[] = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        array[i] = Integer.parseInt(strArr[i]);
                        }
                    //int[] array = {11, 3, 14, 16, 7};
                    Exemple6(array);
                    fileWriter.close();
                    break;

                case 7:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Дана json-строка (можно сохранить в файл и читать из файла)\n[{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},\n{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},\n{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}].\nНаписать метод(ы), который распарсит json и, используя StringBuilder, \nсоздаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].\nПример вывода:\nСтудент Иванов получил 5 по предмету Математика.\nСтудент Петрова получил 4 по предмету Информатика.\nСтудент Краснов получил 5 по предмету Физика.");
                    System.out.println("\n");
                    Exemple7();
                    break;

                case 8:
                    logFile = new File("log.txt");
                    fileWriter = new FileWriter(logFile, true);
                    fileWriter.flush();
                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализовать простой калькулятор \nК калькулятору из предыдущего ДЗ добавить логирование.");
                    System.out.println("\n");
                    System.out.print("Введите число 1: ");
                    double num3 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите число 2: ");
                    double num4 = Double.parseDouble(scanner.nextLine());
                    double res1 = 0;
                    Exemple8(num3,num4,res1);
                    fileWriter.close();
                    break;

                case 0:
                    System.out.println("Завершение работы. \nСпасибо за то что пользовались моим приложением. \nДо новых встреч!!!");
                    f = false;
                    break;
                
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
                break;

            }
        }

    }

     /*
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    static void Exemple1(int num){

        int sum1 = 0;
        int sum2 = 1;
        for(int i=1; i<num+1; i++){
            sum1 = sum1 + i;
        }
        for(int i=1; i<num+1; i++){
            sum2 = sum2 * i;
        }
        System.out.printf("Сумма чисел n = %d\nПроизведение чисел n = %d\n", sum1,sum2);

    }


    /*
     * Вывести все простые числа от 1 до 1000 
     */
    static void Exemple2(){
        for (int j = 2; j <= 1000; j++) {
            boolean flag = false;

            for (int i = 2; i * i <= j; i++) {
                flag = (j % i == 0);
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.print(j + " ");
            }
        }
        System.out.print("\n");
    }

     /*
     Реализовать простой калькулятор
     */
    static void Exemple3(double num1,double num2,double res){
        System.out.print("\nВведите производимую операцию (+, -, *, /): ");
        String sim = scanner.nextLine();
        switch(sim) {
            case "+": 
                res = num1 + num2;
                System.out.println("Результат сложения: " + res);
               break;
            case "-": 
                res = num1 - num2;
                System.out.printf("Результат вычетания: %f\n", res);
               break;
            case "*": 
                res = num1 * num2;
                System.out.printf("Результат умножения: %f\n", res);
               break;
            case "/": 
                res = num1 / num2;
                System.out.printf("Результат деления: %f\n", res);
               break;
            default:  System.out.print("Ошибка!!!");
               return;
        }

    }
    //Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
    static void Exemple4(){
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();
        String[] parts = equation.split("\s*[+=]\s*");
        // System.out.print(Arrays.asList(parts)); // Проверка что выражение разбивает на массив
        int q = -1, w = -1, e = -1;
        for(int i = 0; i<10; i++){
            if(q == -1 && !parts[0].contains("?")){
                q = Integer.parseInt(parts[0]);
            }
            if(w == -1 && !parts[1].contains("?")){
                w = Integer.parseInt(parts[1]);
            }
            if(e == -1 && !parts[2].contains("?")){
                e = Integer.parseInt(parts[2]);
            }
            if(parts[0].charAt(i) == '?'){
                q = i;
            }
            if(parts[1].charAt(i) == '?'){
                w = i;
            }
            if(parts[2].charAt(i) == '?'){
                e = i;
            }
        }
        if(q + w == e && q != -1 && w != -1 && e != -1){
            System.out.printf("%d + %d = %d", q, w, e);

        }
        else {
            System.out.print("Решений нет!(");
        }
    }

    //Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.Если значение null, то параметр не должен попадать в запрос.Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static String Exemple5(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
    
    
    //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
    public static int Exemple6(int[] inputArray) throws Exception{
        int [] mas = inputArray;
 
        boolean isSorted = false;
        int buf = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    fileWriter.write("Процесс: " + Arrays.toString(mas) + "\n");
                }
            }
        }
        
        System.out.println(Arrays.toString(mas));
        fileWriter.write("Результат: " + Arrays.toString(mas) + "\n");
        return buf;  
    }

    //Дана json-строка (можно сохранить в файл и читать из файла) [{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}].Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].Пример вывода:Студент Иванов получил 5 по предмету Математика.Студент Петрова получил 4 по предмету Информатика.Студент Краснов получил 5 по предмету Физика.
    public static void Exemple7(){
        System.out.println("Извините, Задача в стадии разработки!\n");
    //     String jsoString = "[{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}]";
    //     JSONArray jsonArray = new JSONArray(jsoString);
    //     StringBuilder result = new StringBuilder();
    //     for (int i = 0; i<jsonArray.lendth(); i++){
    //         JSONObject jsonObject = jsonArray.getJSONObject(i);
    //         String lastName = jsonOject.getString("фамилия");
    //         String subject = jsonOject.getString("предмет");
    //         String mark = jsonOject.getString("оценка");
    //         result.append(String.format("Студент %s получил %s по предмету %s.%n", lastName, mark, subject));
    //     }
    //     System.out.println(result.toString());
    
    }

    //К калькулятору из предыдущего ДЗ добавить логирование.
    static void Exemple8(double num1,double num2,double res)
    {
        try
        {
            System.out.print("\nВведите производимую операцию (+, -, *, /): ");
            String sim = scanner.nextLine();
            switch(sim) 
            {
                case "+": 
                    res = num1 + num2;
                    System.out.println("Результат сложения: " + res);
                    fileWriter.write(num1 + "+" + num2 + "=" + res + "\n");
                break;
                case "-": 
                    res = num1 - num2;
                    System.out.printf("Результат вычетания: %f\n", res);
                    fileWriter.write(num1 + "-" + num2 + "=" + res + "\n");
                break;
                case "*": 
                    res = num1 * num2;
                    System.out.printf("Результат умножения: %f\n", res);
                    fileWriter.write(num1 + "*" + num2 + "=" + res + "\n");
                break;
                case "/": 
                    res = num1 / num2;
                    System.out.printf("Результат деления: %f\n", res);
                    fileWriter.write(num1 + "/" + num2 + "=" + res + "\n");
                break;
                default:  System.out.print("Ошибка!!!");
                return;
                
            }
        }    
        catch(Exception ex){
            System.out.println("Работа приложения будет завершена.");
        }
    }
           
      
}
