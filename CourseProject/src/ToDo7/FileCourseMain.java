package ToDo7;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCourseMain {

	public static void main(String[] args) {
		
		String SourceInfo = String.valueOf(args[0]);
		String DestinationInfo = String.valueOf(args[1]);
		
		
		try (FileInputStream fin = new FileInputStream(SourceInfo);
				BufferedInputStream bin = new BufferedInputStream(fin);
				FileOutputStream fout= new FileOutputStream(DestinationInfo);
				BufferedOutputStream bout = new BufferedOutputStream(fout))
		{
			
			StringBuilder srg = new StringBuilder();
			
			while(true) {
				int data = bin.read();
				if(data == -1)
					break;
				char ch = (char)data;
				srg.append(ch);
				System.out.print(ch);
			}
			
			String NewData = srg.toString();
			byte[] arr = NewData.getBytes();
			bout.write(arr);
			System.out.println("File Copied Successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

}
