package Features;

public class StudentNotFoundException extends Exception{
	 StudentNotFoundException(){
		 super();
	 }
	 StudentNotFoundException(String mess){
		 super(mess);
	 }
}
