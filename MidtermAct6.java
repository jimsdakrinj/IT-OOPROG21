import java.util.Scanner;

class MidtermAct6 {
    public static void main(String[] args){
        
        int dueDate, record, returnDate, lateDays;
        Scanner scanf = new Scanner(System.in);

        System.out.println("--- Library Book Borrowing System --- \n\n\n");

        System.out.println("Membership types:\n\n1 - Regular \n2 - Premium \n3 - VIP\n\n");
        System.out.printf("Enter your membership type: ");
        String membership = scanf.next();

        switch (membership) {
            case "Regular":
                System.out.printf("Enter how many records you want to see: ");
                record = scanf.nextInt();

                for(int i = 1; i <= record; i++){

                    System.out.printf("Enter due date: ");
                    dueDate = scanf.nextInt();
                    System.out.printf("Enter actual date returned: ");
                    returnDate = scanf.nextInt();

            
                    lateDays = returnDate - dueDate;
                    if( lateDays < 5 ){
                        System.out.println("Pay minimal fine. \n\n");
                    }else if (lateDays > 5){
                        System.out.println("Pay full fine. \n\n");
                    } 
                }
                scanf.close();
                break;
            case "Premium":
                System.out.printf("Enter how many records you want to see: ");
                record = scanf.nextInt();

                for(int i = 1; i <= record; i++){

                    System.out.printf("Enter due date: ");
                    dueDate = scanf.nextInt();
                    System.out.printf("Enter actual Date returned: ");
                    returnDate = scanf.nextInt();
            
                    lateDays = returnDate - dueDate;
                    if( lateDays < 5) {
                        System.out.println("Pay minimal fine. \n\n");
                    }else if (lateDays > 5){
                        System.out.println("Pay full fine. \n\n");
                    } 
                }
                break;
            case "VIP":
                System.out.printf("Enter how many records you want to see: ");
                record = scanf.nextInt();

                for(int i = 1; i <= record; i++){

                    System.out.printf("Enter due date: ");
                    dueDate = scanf.nextInt();
                    System.out.printf("Expected days to return: ");
                    returnDate = scanf.nextInt();
            
                    lateDays = returnDate - dueDate;
                    if( lateDays < 5){
                        System.out.println("Pay minimal fine. \n\n");
                    }else if (lateDays > 5){
                        System.out.println("Pay full fine. \n\n");
                    }
                }
                break;
            default:
                System.err.println("ERROR 404: Invalid membership type.");
                scanf.close();
                break;     
        }

        scanf.close();
    }
}
