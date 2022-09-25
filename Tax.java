import java.util.Scanner;

public class Tax {public static void main(String[]args){
    System.out.println("if you are single enter '1' or enter '2' :");
    int salary;
    Scanner y=new Scanner(System.in);
    int x=y.nextInt();
    System.out.println("Enter the salary in dollar :");
    salary=y.nextInt();
    y.close();
    TaxCalculator tx=new TaxCalculator();
    double Tax=tx.calculator(x, salary);
    System.out.println("Total tax : "+Tax);

}
    
}