package Hospital_Abdallah;

import java.util.Date;

public class Guardian {
	private String name;
	private String relationship;
	private String contactInfo;
	private String address;
	private String occupation;
	private String emergencyContact;
	private Date dateOfBirth;
	private String idNumber;
	
	public Guardian(String name, String relationship, String contactInfo, String address, String occupation,
		String emergencyContact, Date dateOfBirth, String idNumber) {
		this.name = name;
		this.relationship = relationship;
		this.contactInfo = contactInfo;
		this.address = address;
		this.occupation = occupation;
		this.emergencyContact = emergencyContact;
		this.dateOfBirth = dateOfBirth;
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRelationship() {
		return relationship;
	}
	
	public void setRelationship(String relationship) {
			this.relationship = relationship;
	}
	
	public String getContactInfo() {
		return contactInfo;
	}
	
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getEmergencyContact() {
		return emergencyContact;
	}
	
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "Guardian [name=" + name + ", relationship=" + relationship + ", contactInfo=" + contactInfo
				+ ", address=" + address + ", occupation=" + occupation + ", emergencyContact=" + emergencyContact
				+ ", dateOfBirth=" + dateOfBirth + ", idNumber=" + idNumber + "]";
	}
}
