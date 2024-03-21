import java.util.Scanner;
class Calculator 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        try 
          {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result = 0;
            switch(operator) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) 
                    { throw new ArithmeticException("Cannot divide by zero!"); result = 0;  }
                    else 
                    {  result = num1 / num2; }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator!");
            }
            System.out.println("Result: " + result);
        } catch (Exception e) 
          {
            System.out.println("Error: " + e.getMessage());
        } 
  }
}
