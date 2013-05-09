package uk.ac.shu.webarch.eregister

class Instructor {

	String name
	String staffId

	Set classes
	static hasMany = [classes: RegClass]
	static mappedBy = [classes: 'classInstructor']

    static constraints = {
	name(nullable:false, blank:false,maxSize:256);
	staffId(nullable:false, blank:false, maxSize:20, unique:true);
    }
}
