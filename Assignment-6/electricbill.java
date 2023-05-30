import java.util.Scanner;

class ElectricityBill {
    private String connectionType;
    private int unitsConsumed;

    public ElectricityBill(String connectionType, int unitsConsumed) {
        this.connectionType = connectionType;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBill() {
        double ratePerUnit;
        double fixedCharge;
        double billAmount;

        if (connectionType.equalsIgnoreCase("domestic")) {
            ratePerUnit = 4.0;
            fixedCharge = 250.0;
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            ratePerUnit = 6.0;
            fixedCharge = 350.0;
        } else {
            System.out.println("Invalid connection type");
            return;
        }

        billAmount = fixedCharge + (unitsConsumed * ratePerUnit);

        System.out.println("Connection type: " + connectionType);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Bill amount: " + billAmount);
    }
}

public class electricbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter connection type (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        ElectricityBill electricityBill = new ElectricityBill(connectionType, unitsConsumed);
        electricityBill.calculateBill();
        scanner.close();
    }
}
