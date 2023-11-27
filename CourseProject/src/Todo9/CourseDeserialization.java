package Todo9;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import day2course.CourseProject;

public class CourseDeserialization {
	public static void main(String[] args) {
		Deserialize();
	}
	
	
public static void Deserialize() {
		
	String filePath = "CourseSerialization.txt";
	
	try(
			FileInputStream fin = new FileInputStream(filePath);
			ObjectInputStream in = new ObjectInputStream(fin);
			){
		 while(true) {
			Object currentObject = in.readObject();
			
			CourseProject current = (CourseProject)currentObject;
			System.out.println(current.toString());
			System.out.println();
		 }
		}
	catch(EOFException ex) {
		System.out.println("Deserialized Successfully.");
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	}
}

