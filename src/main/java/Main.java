import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        System.out.println("Введите числа для суммирования (для окончания введите нечисловой символ):");
        try {
            String input ;
            while ((input = reader.readLine())!=null){
                try{
                    double number = Double.parseDouble(input);
                    sum+= number;
                }catch (NumberFormatException e){
                    System.out.println("Ошибка: введено нечисловое значение. Суммирование завершено!!!");
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сумма введенных чисел: " + sum);



       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;

        System.out.println("Введите числа для суммирования (для окончания введите нечисловой символ):");

        try {
            String input;
            while ((input = reader.readLine()) != null) {
                try {
                    double number = Double.parseDouble(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введено нечисловое значение. Суммирование завершено.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Сумма введенных чисел: " + sum);

        */
    }
}
