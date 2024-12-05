package guru.qa;

public class HomeWork {

    public static void main(String[] args){

        // переполнение области памяти для int
        int nt = Integer.MAX_VALUE;
        System.out.println(nt);
        nt += 1;
        System.out.println(nt);

        // переполнение области памяти для double (магия )))   )
        double dblMAX = 1.7 * Math.pow(10,308);
        System.out.println(dblMAX);
        dblMAX +=1;
        System.out.println(dblMAX);

        System.out.println((Double.MAX_VALUE + 0.1e-300) == Double.MAX_VALUE); // true     воспринимается как прибавление незначительного к огромному
        System.out.println((Double.MAX_VALUE * 0.1e-300) == Double.MAX_VALUE); // false    воспринимается как переход в другое состояние (infinity)



        //приоритеты действий
        int a = 5;
        int b = 10;
        int c = 20;
        boolean d = true;
        boolean e = false;

        // Пример с арифметическими операторами
        int arithmeticResult = a + b * c / 2 - 3;
        System.out.println("Арифметический результат: " + arithmeticResult); // 5 + (10 * 20) / 2 - 3 = 102

        // Пример с побитовыми операторами
        int bitwiseResult = a & b | c ^ a; // & имеет более высокий приоритет чем | и ^
        System.out.println("Результат побитовых операторов: " + bitwiseResult); // 17

        // Пример с логическими операторами
        boolean logicalResult = d && e || !d;
        System.out.println("Результат логических операторов: " + logicalResult); // false

        // Пример с операторами сравнения
        boolean comparisonResult = (a < b) && (b == c);
        System.out.println("Результат сравнения: " + comparisonResult); // false

        // Пример с тернарным оператором
        String ternaryResult = (a > b) ? "a больше b" : "a не больше b";
        System.out.println("Результат тернарного оператора: " + ternaryResult); // "a не больше b"

        // Пример с оператором присваивания
        int assignResult = a += b + c; // a будет равно 15 после выполнения операции
        System.out.println("Результат присваивания: " + assignResult); // 35


                                        //преобразования int и double

        // Преобразование int в double
        int intValue = 10;
        double doubleValueFromInt = intValue; // Автоматическое преобразование
        System.out.println("Преобразование int в double: " + doubleValueFromInt); // 10.0

        // Преобразование double в int
        double doubleValue = 9.99;
        int intValueFromDouble = (int) doubleValue; // Явное преобразование
        System.out.println("Преобразование double в int: " + intValueFromDouble); // 9

        // Пример 3: Использование преобразования в арифметическом выражении
        int x = 5;
        double y = 2.5;
        double result = x + y; // int преобразуется в double автоматически
        System.out.println("Результат сложения int и double: " + result); // 7.5
    }
}
