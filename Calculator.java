/*This is a calculator which will be used to make mathematical calculations
Made by Diogo Relhas in 2025
*/ 
public class Calculator{
  public Calculator(){
  }

  //Plus
  public int add(int a, int b){
    return a + b;
  }

  //Subtraction
  public int subtract(int a, int b){
    return a - b;
  }

  //Multiplication
  public int multiply(int a, int b){
    return a * b;
  }

  //Divide
  public int divide(int a, int b){
    return a / b;
  }

  //Modulo
  public int modulo(int a, int b){
    return a % b;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(12, 34));
    System.out.println(myCalculator.multiply(2, 10));
    System.out.println(myCalculator.divide(20, 4));
    System.out.println(myCalculator.modulo(30, 6));
  }
}
