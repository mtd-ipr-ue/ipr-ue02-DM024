import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        //int year = 2000;
        int month = (1-12);
        int days;
        
        switch(month) {
            case 1, 3, 5, 7, 9, 10, 12:
            days = 31;
                break;
            case 2:
            days = 28;
                break;
            case 4, 6, 8, 11:
            days = 30;
                break;
            default: Out.print("Error");


        }
    }
}
