package Break_statment;
public class switch_statment {
    public static void main(String[] args) {
    	
    	// it is value based statment
    //// based on the  value switch statment is worked	
    	
    	
        int month = -1;
        switch (month) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
