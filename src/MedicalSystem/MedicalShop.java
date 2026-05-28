package MedicalSystem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalShop {
	static List<Medicine> medicines = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static void addMedicine() {
		System.out.println("  Please enter the medicine ID :");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(" Enter the medicine name : ");
		String name = scanner.nextLine();
		
		System.out.println(" Enter the price : ");
		double price = scanner.nextDouble();
		
		System.out.println(" Enter the Quantity : ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		LocalDate expiryDate = null;
		while(expiryDate==null) {
		try {
			
		
		System.out.println(" Enter expiry (yyyy-mm-dd): ");
		String date  = scanner.nextLine();
		 expiryDate  = LocalDate.parse(date)	;
		}catch (Exception e) {
			System.out.println(" Please enter  valid date pattern");
		} 
		  }
		 Medicine m = new Medicine(id, name, price, quantity, expiryDate);
		 medicines.add(m);
		 System.out.println("Add medicine successfully\n");
			
		
	}
	static void viewMedicine() {
		 if(medicines.isEmpty()) {
			 System.out.println(" There is no medicine");
		 }else {
			for (Medicine medicine : medicines) {
				System.out.println(medicine);
				System.out.println();
				
			}
		}
	 }
	static void search() {
		if(medicines.isEmpty()) {
			 System.out.println(" There is ni medicine");
			 return;
		}
		System.out.println(" Enter the id of medicine");
		int searchId = scanner.nextInt();
		
		boolean isfound  = false;
		for (Medicine medicine : medicines) {
			if(medicine.getId()==searchId) {
				System.out.println(medicine);
				System.out.println();
				isfound = true;
			}
			
		}
		
		if(isfound==false) {
			System.out.println("medicine is not founded");
		}
	}
	
	static void sellMedicine() {
		scanner.nextLine();
		System.out.println(" Enter the medicine name");
		String Mname = scanner.nextLine();
		System.out.println("Enteer the quantity of Medicine");
		int Mquantity = scanner.nextInt();
		boolean namefound=false;
		
		for (Medicine medicine : medicines) {
			if(medicine.getName().equalsIgnoreCase(Mname))  {
				namefound = true;
			
				
				if(Mquantity<=medicine.getQuantity()) {
					medicine.setQuantity(medicine.getQuantity()-Mquantity);
					double total = Mquantity*medicine.getPrice();
					System.out.println("====Bill====\n");
					
					System.out.println("Medicine Name : "+ medicine.getName());
					System.out.println("Per medicine price : "+ medicine.getPrice());
					System.out.println(" Mediine  Quantity : " + medicine.getQuantity());
					System.out.println("Total price : "+ total);
					System.out.println("\nSold successfully");
					System.out.println(" *===Thank you=== *\n");
					
				}else  {
					System.out.println("There is no enough quantity");
				}
				break;
									
				
				
		} 
			}
		if(!namefound) {
			System.out.println("Medicine was not found");
			}
		
		
		
			
		}
	
	

	public static void main(String[] args) {
		 int choice;
		 do {
			 System.out.println("\n==== MENU==== \n");
			 System.out.println(" 1. Add medicine");
			 System.out.println(" 2. View  medicine");
			 System.out.println(" 3. Search medicine");
			 System.out.println(" 4. sell medicine");
			 System.out.println(" 5. Exit medicine");
			 System.out.println("Enter your choice : ");
			 choice = scanner.nextInt();
			 switch (choice) {
			case 1: {
				
				MedicalShop.addMedicine();
				break;
			}
			case 2 :{
				MedicalShop.viewMedicine();
				break;
				
			}
			case 3 :{
				MedicalShop.search();
				break;
			}
			case 4:{
				MedicalShop.sellMedicine();
				break;
			}
			case 5 :{
				System.out.println(" Program Exit ");
			}
			default:
				System.out.println("  invalid choice ");
				break;
			}
			 
			
		} while (choice!=5);
	
 
	}

}
