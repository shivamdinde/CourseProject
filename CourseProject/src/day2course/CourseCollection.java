package day2course;

public class CourseCollection {
	private static CourseProject[] availableCourses;
	static {
		availableCourses= new CourseProject[3];
		
		availableCourses[0] = new CourseProject(101,"PGDAC",22,"CDAC",106200);
		availableCourses[1] = new CourseProject(102,"PGDMC",22,"CDAC",150000);
		availableCourses[2] = new CourseProject(103,"PGDBDA",60,"CDAC2",116200);
		
	}
	public static String printCourseNames(String provider) throws ProviderNotFoundException{
		String curr="";
		
		for(CourseProject CourseArr:availableCourses) {
			String currentProvider = CourseArr.getProvider();
			if(currentProvider.equals(provider)) {
				curr += "\n" + CourseArr.getTitle();
			}
		}
		if(curr == "") {
			String error = "The entered Provider name is invalid. It is not available";
			ProviderNotFoundException nx = new ProviderNotFoundException(error, provider);
			throw nx;			
		}
		return curr;
	}
	
}
