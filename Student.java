package Features;

import java.io.FileWriter;
import java.io.IOException;

public class Student {
String  name;
int roll;
int marks;
Student(String name, int marks, int roll){
	this.name=name;
	this.roll= roll;
	 this.marks= marks;
}

public void addFile() throws IOException {

	    FileWriter fw = new FileWriter("D:\\Index.txt", true); // append mode
	    System.out.println("File is Created / Updated");
	    fw.write("Name: " + name + ", Roll: " + roll + ", Marks: " + marks + "\n");
	    fw.close();
	}

}


