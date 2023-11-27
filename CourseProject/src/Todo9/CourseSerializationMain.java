package Todo9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import day2course.CourseProject;

public class CourseSerializationMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Course Objects: ");
		int size = sc.nextInt();
		sc.nextLine();
		CourseProject[] CourseArr = new CourseProject[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the CourseId: ");
			int CourseId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Title: ");
			String Title = sc.nextLine();
			
			System.out.println("Enter the Duration: ");
			int Duration = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Provider: ");
			String Provider = sc.nextLine();
			
			System.out.println("Enter the Fees: ");
			int Fees = sc.nextInt();
			sc.nextLine();
			
			CourseArr[i]  =  new CourseProject(CourseId,Title,Duration,Provider,Fees);
		}
		
		
		Serialize(CourseArr);
		
		
	}
	public static void Serialize(CourseProject course[]){
		
		String filePath = "CourseSerialization.txt";
		File currentFile = new File(filePath);
		
			
			try(
					FileOutputStream fout = new FileOutputStream(filePath);
					ObjectOutputStream out = new ObjectOutputStream(fout);
					) {
				for(int i=0;i<course.length;i++) {
					out.writeObject(course[i]);
				}
				
				System.out.println("Serialized Successfully");
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}

}
