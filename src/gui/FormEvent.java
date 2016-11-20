package gui;
import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String occupation;
	private int ageCategory;
	private String empCat;
	private String taxId;
	private boolean usCitizen;
	private String gender;

	// *** Constructor 1 ** //
	public FormEvent(Object source) {
		super(source);
	}

	// *** Constructor 2 ** //
	public FormEvent(Object source, String name, String occupation, int ageCat, String empCat, String taxId, boolean usCitizen, String gender) {
		super(source);

		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCat;
		this.empCat = empCat;
		this.taxId = taxId;
		this.usCitizen = usCitizen;
		this.gender = gender;
	}

	// *** GETTERS AND SETTERS ** //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}
	
	public String getGender() {
		return gender;
	}

	public String getTaxId() {
		return taxId;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAgeCategory() {
		return ageCategory;
	}

	public String getEmploymentCategory() {
		return empCat;
	}
}
