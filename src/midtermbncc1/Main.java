package midtermbncc1;

import java.util.ArrayList;
import java.util.Scanner;	

public class Main extends Cars{
	
	ArrayList<Vehicles> daftar = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	int input; 
	
	void input() {
		String type, brand, name, jenis_tipe_kendaraan = null, license_number;
		int top_speed, wheel = 0, gasCap, entertainment = 0, helmet = 0, valid= 0;
		do {
			System.out.println("Input type (Car | Motorcycle): ");
			type = scan.nextLine();
			if(type.equals("Car") ||
				type.equals("Motorcycle") ){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		do {
			System.out.println("Input brand[>=5]: ");
			brand = scan.nextLine();
			if(brand.length() >= 5){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		do {
			System.out.println("Input name[>=5]: ");
			name = scan.nextLine();
			if(name.length() >= 5){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;

		do {
			System.out.println("Input license: ");
			license_number = scan.nextLine();
			if (license_number.length() == 10
			&&	license_number.toUpperCase().charAt(0) >= 'A' && license_number.toUpperCase().charAt(0) <= 'Z' 
			&&  license_number.toUpperCase().charAt(1) == ' '
			&&  license_number.toUpperCase().charAt(2) >= '0' && license_number.toUpperCase().charAt(2) <= '9' 
			&&  license_number.toUpperCase().charAt(3) >= '0' && license_number.toUpperCase().charAt(3) <= '9' 
			&&  license_number.toUpperCase().charAt(4) >= '0' && license_number.toUpperCase().charAt(4) <= '9' 
			&&  license_number.toUpperCase().charAt(5) >= '0' && license_number.toUpperCase().charAt(5) <= '9' 
			&&  license_number.toUpperCase().charAt(6) == ' '
			&&  license_number.toUpperCase().charAt(7) >= 'A' && license_number.toUpperCase().charAt(7) <= 'Z' 
			&&  license_number.toUpperCase().charAt(8) >= 'A' && license_number.toUpperCase().charAt(8) <= 'Z' 
			&&  license_number.toUpperCase().charAt(9) >= 'A' && license_number.toUpperCase().charAt(9) <= 'Z' )
			{
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;

		do {
			System.out.println("Input top speed [100 <= topspeed <= 250]: ");
			top_speed = scan.nextInt();
			if(top_speed >= 100 &&
				top_speed <= 250){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCap = scan.nextInt();
			if(gasCap >= 30 &&
					gasCap <= 60){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		if(type.equals("Car"))
		do {
			System.out.println("Input wheel [4 <= wheel <= 6]: ");
			wheel = scan.nextInt();
			if(wheel >= 4 &&
					wheel <= 6){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		if(type.equals("Car"))
			do {
				System.out.println("Input entertainment system amount [>=1]: ");
				entertainment = scan.nextInt();
				if(entertainment >= 1){
					valid = 1;
				}
			}while(valid != 1);
		
		valid = 0;
		if(type.equals("Car"))
		do {
			System.out.println("Input type (SUV | Supercar | Minivan): ");
			jenis_tipe_kendaraan = scan.nextLine();
			if(jenis_tipe_kendaraan.equals("SUV") ||
				jenis_tipe_kendaraan.equals("Supercar") ||
				jenis_tipe_kendaraan.equals("Minivan")	){
				valid = 1;
			}
		}while(valid != 1);
		valid = 0;
		if(type.equals("Motorcycle"))
			do {
				System.out.println("Input wheel [2 <= wheel <= 3]");
				wheel = scan.nextInt();
				if(wheel >= 2 &&
						wheel <= 3){
					valid = 1;
				}
		}while(valid != 1);
		valid = 0;
		if(type.equals("Motorcycle"))
		do {
			System.out.println("Input type (Manual | Automatic): ");
			jenis_tipe_kendaraan = scan.nextLine();
			if(jenis_tipe_kendaraan.equals("Manual") ||
				jenis_tipe_kendaraan.equals("Automatic")){
				valid = 1;
			}
		}while(valid != 1);
		valid= 0;
		if(type.equals("Motorcycle"))
			do {
				System.out.println("Input helmet amount [>=1]: ");
				helmet = scan.nextInt();
				if(helmet >= 1){
					valid = 1;
				}
			}while(valid != 1);
		 Vehicles maba = new Vehicles(type,	brand, name, license_number, top_speed, gasCap, wheel, entertainment, jenis_tipe_kendaraan, helmet);

		 daftar.add(maba);
		 System.out.println("Success, Click anything to proceed");
		 scan.nextLine();
		 mainmenu();
	}

	
	
	void view() {
		System.out.println("----------");
		System.out.println("List of vehicles");
		for(int i=0; i<daftar.size(); i++) {
			System.out.println("No. " + (i+1));
			System.out.println("Type: " + daftar.get(i).getType());
			System.out.println("Name: " + daftar.get(i).getName());
			System.out.println("----------");
		}
		System.out.println("Pick a vehicle to test drive[Enter '0' to exit]:");
		input = scan.nextInt();
		if (input <=0) {
			exit();}
		else {
		scan.nextLine();
		for(int i=0; i<1; i++) {
			System.out.println("Brand: " + daftar.get(i).getBrand());
			System.out.println("Name: " + daftar.get(i).getName());
			System.out.println("License Plate: " + daftar.get(i).getLicense_number());
			System.out.println("Type: " + daftar.get(i).getJenis_tipe_kendaraan());
			System.out.println("gasCap: " + daftar.get(i).getGasCap());
			System.out.println("Wheel(s): " + daftar.get(i).getWheel());
			System.out.println("----------");
			System.out.println("Entertainment System: " + daftar.get(i).getEntertainment());
			System.out.println("Helmets: " + daftar.get(i).getHelmet());
			System.out.println("Turning on entertainment system");
			System.out.println("----------");
		}
		scan.nextLine();
		int helmetprice;
		System.out.println("Price: <harganya> ");
		helmetprice = scan.nextInt();
		mainmenu();
		}
			
	}
	
	void exit() {
		System.out.println("==========");
		System.out.println("Thank you");
		return;
	}
	
	void mainmenu() {
		System.out.println("==========");
		System.out.println("1. Input");
		System.out.println("2. View");
		System.out.println("3. Exit");
		System.out.println(">> ");
		input= scan.nextInt();
		scan.nextLine();
		switch(input) {
		case 1:
			input();
			break;
		case 2:
			view();
			break;
		case 3:
			exit();
			break;
		default:
			mainmenu();
		}
	}

	public Main() {
		// TODO Auto-generated constructor stub
		mainmenu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
