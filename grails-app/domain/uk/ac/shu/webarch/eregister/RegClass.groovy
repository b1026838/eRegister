package uk.ac.shu.webarch.eregister

class RegClass {
	
	String name
	String code
	Instructor classInstructor
	Course course

	Set enrolledStudents
	Set registrationSheets

	static hasMany = [enrolledStudents:Enrollment, registrationSheets:RegistrationSheet]
	static mappedBy = [enrolledStudents: 'regClass', registrationSheets: 'regClass']


    	static constraints = {
	}
	
	static mapping = {
	classInstructor column: 'instructor_fk'
	course column: 'course_fk'
	}
}
