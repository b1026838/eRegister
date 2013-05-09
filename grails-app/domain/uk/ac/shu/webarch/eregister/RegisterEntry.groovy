package uk.ac.shu.webarch.eregister

class RegisterEntry {

	Student student
	RegistrationSheet regSheet

	Long timestamp
	

    static constraints = {
	timestamp(nullable:false, blank:false);
	}
	
	static mapping = {
	regSheet column: 'reg_sheet_fk'
	student column: 'student_fk'
	}
}
