import javax.lang.model.util.ElementScanner14;

public class TaxCalculator {
    public static double calculator(int x,int salary){
        double tax;
        if(x==1){
            if(salary>=0 && salary<=8000)
            tax=salary*0.1;
            else if(salary>=8000 && salary<=32000)
            tax=800+(salary-8000)*(15/100);
           
         else 
         tax=4400+(salary-16000)*0.25;

        }
        else 
        {
            if(salary>=0 && salary<=16000)
            tax=salary*0.1;
            else if(salary>=16000 && salary<=64000)
            tax=1600+(salary-1600)*(15/100);
            else 
            tax=8800+(salary-64000)*0.25;

        }
        return tax;
    }
    
}
