package lab;

interface Loan{
	void calculateEMI(double loanAmount,int months);
}
interface Insurance{
	void calculateinsurance(double vehiclePrice);
}
class Vehicle implements  Loan,Insurance{
	private String vahicleNumber;
	private String brand;
	private double price;
	
	public void addVehicle(String vehicleNumber, String brand, double price) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.price = price;
    }
	//overriding Loan method
	public void calculateEMI(double loanAmount, int months) {
        double interestRate = 0.08; // 8% annual interest
        double monthlyRate = interestRate / 12;

        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Monthly EMI: " + emi);
    }
	//overriding Insurance method
	public void calculateinsurance(double vehiclePrice)
	
}
public class V_purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
