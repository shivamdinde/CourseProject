package ToDo8;

import java.io.BufferedReader;
import java.io.FileReader;

import day2course.CourseProject;

public class CourseDataRead {
	public static void main(String[] args) {
		
		String filePath = "./src/ToDo8/course_data.txt";
		CourseProject[] CourseArr = new CourseProject[3];
		int index = 0;
		try(
				FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				){
			
			while(true) {
				String line = br.readLine();
				if (line == null) 
					break;
				//System.out.println(line);
				
				String data[]= line.split(":");
				int CourseId = Integer.parseInt(data[0]);
				String Title = data[1];
				int Duration = Integer.parseInt(data[2]);
				String Provider =data[3];
				int Fees = Integer.parseInt(data[4]);
				
				CourseArr[index] = new CourseProject(
						CourseId,
						Title,
						Duration,
						Provider,
						Fees
						);
				index++;
				
			}
			
				 
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		for(int i=0;i<CourseArr.length;i++) {
			System.out.println(CourseArr[i].toString());
		}
	}

}
