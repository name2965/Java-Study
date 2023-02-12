import java.util.Scanner;

class CurrencyConverter{
    private static double rate;
    public static double toDoller(double won){
        return won / rate;
    }
    public static double toKWR(double doller){
        return doller * rate;
    }
    public static void setRate(double r){
        rate = r;
    }
}
public class StaticMember {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $" + CurrencyConverter.toDoller(1000000) + "입니다.");
        System.out.println("$10는 " + CurrencyConverter.toKWR(10) + "원입니다.");
        scanner.close();
    }
}
