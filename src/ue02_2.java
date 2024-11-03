import libraries.Out;
import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        int year = In.readInt();
        int month = In.readInt();
        int days;
        
        if (year == 1988 || year == 2000 || year == 2020) {
        switch(month) {
            case 1, 3, 5, 7, 9, 10, 12:
            days = 31; Out.println(days);
                break;
            case 2:
            days = 29;
            Out.println(days);
                break;
            case 4, 6, 8, 11:
            days = 30;
            Out.println(days);
                break;
            default: Out.print("Error");
            }
        }
        
        else if (year == 1900 || year == 1999 ||year == 2022) {
            switch(month) {
                case 1, 3, 5, 7, 9, 10, 12:
                days = 31;
                Out.println(days);
                    break;
                case 2:
                days = 28;
                Out.println(days);
                    break;
                case 4, 6, 8, 11:
                days = 30;
                Out.println(days);
                    break;
                default: Out.print("Error");
            }
        
        }
    }
}

