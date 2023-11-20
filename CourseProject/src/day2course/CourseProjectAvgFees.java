package day2course;

public class CourseProjectAvgFees extends CourseDataCalculator {

	@Override
	public float doCalculation(CourseProject[] allCourses) {
		int totalFees=0;
		for(int i=0;i<allCourses.length;i++) {
			totalFees  = totalFees + allCourses[i].getFees();
		}
		float avgFees=totalFees/allCourses.length;
		return avgFees;
		
	}

}
