import java.util.Scanner;

public class IT25101389Lab5Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double ROOM_CHARGE_PER_DAY = 48000.0;
		
		System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int numberOfDays = endDate - startDate;

        double discountRate = 0;
        if (numberOfDays >= 5) {
            discountRate = 20;
        } else if (numberOfDays >= 3) {
            discountRate = 10;
        }
		
		double totalBeforeDiscount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalBeforeDiscount * discountRate / 100;
        double totalAmount = totalBeforeDiscount - discountAmount;

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
	}
}