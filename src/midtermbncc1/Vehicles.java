package midtermbncc1;

public class Vehicles {
	private String type;
	private String brand;
	private String name;
	private String license_number;
	private int top_speed;
	private int gasCap;
	private int wheel;
	private int entertainment;
	private String jenis_tipe_kendaraan;
	private int helmet;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public int getTop_speed() {
		return top_speed;
	}
	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}
	public int getGasCap() {
		return gasCap;
	}
	public void setGasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getEntertainment() {
		return entertainment;
	}
	public void setEntertainment(int entertainment) {
		this.entertainment = entertainment;
	}
	public String getJenis_tipe_kendaraan() {
		return jenis_tipe_kendaraan;
	}
	public void setJenis_tipe_kendaraan(String jenis_tipe_kendaraan) {
		this.jenis_tipe_kendaraan = jenis_tipe_kendaraan;
	}
	public int getHelmet() {
		return helmet;
	}
	public void setHelmet(int helmet) {
		this.helmet = helmet;
	}
	public Vehicles(String type, String brand, String name, String license_number, int top_speed, int gasCap, int wheel,
			int entertainment, String jenis_tipe_kendaraan, int helmet) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license_number = license_number;
		this.top_speed = top_speed;
		this.gasCap = gasCap;
		this.wheel = wheel;
		this.entertainment = entertainment;
		this.jenis_tipe_kendaraan = jenis_tipe_kendaraan;
		this.helmet = helmet;
	}

	
	
}
