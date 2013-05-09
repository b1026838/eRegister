import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->
	
	println("BootStrap::init");
	
	def  ian_instructor = Instructor.findByStaffId('wae23') ?: new Instructor(name: 'Ian Ibbotson', staffId: 'wae23').save();

	def web_course = Course.findByCourseCode('7738d') ?: new Course(courseName: 'Web Systems Design', courseCode: '7738d', 
	description: 'A course for web').save();

	def base_student = Student.findByStudentNumber('B1026838') ?: new Student(fullStudentName: 'Sean Edgar', studentNumber: 	'B1026838', notes: 'empty').save();
    }

	//Test data, for demonstration purposes.

    def destroy = {
    }
}
