import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
            int num1 = In.readInt();
            int num2 = In.readInt();
            int num3 = In.readInt();
        
           if (num1 > num2 && num1 > num3)  {
              Out.println("Der größte Wert: " + num1 );
            } else if (num2 > num1 && num2 > num3) {
              Out.println("Der größte Wert: " + num2);
            } else if (num3 > num1 && num3 > num2) { 
               Out.println("Der größte Wert: " + num3); }
         
    }
}
