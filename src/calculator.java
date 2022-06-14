import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char opeator;
        double number1 , number2 , result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        number1 =input.nextDouble();
        System.out.println("Enter 2nd Number:");
        number2 = input.nextDouble();
        System.out.println("Enter operators : + , - , * , / ");
        opeator = input.next().charAt(0);
        switch (opeator){
            case '+':
                result = number1 + number2;
                System.out.println(number1+"+"+number2+"="+result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1+"-"+number2+"="+result);
                break;
            case '*':
                result=number1*number2;
                System.out.println(number1+"x"+number2+"="+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println(number1+"/"+number2+"="+result);
                break;
            default:
                System.out.println("Invalid Operator !!");
                break;

        }
    }
}
