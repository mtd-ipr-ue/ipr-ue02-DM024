import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
            int num1 = 345;
            int num2 = 5;
            int num3 = 210;
        
           if (num1 > num2 && num1 > num3)  {
              Out.println(num1);
            } else if (num2 > num1 && num2 > num3) {
              Out.println(num2);
            } else if (num3 > num1 && num3 > num2) { 
               Out.println(num3); }
         
    }
}
