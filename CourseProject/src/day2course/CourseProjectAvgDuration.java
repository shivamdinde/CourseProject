package day2course;

public class CourseProjectAvgDuration extends CourseDataCalculator {

	@Override
	public float doCalculation(CourseProject[] allCourses) {
		// TODO Auto-generated method stub
		int totalDur=0;
		for(int i=0;i<allCourses.length;i++) {
			totalDur  = totalDur + allCourses[i].getDuration();
		}
		float avgDur=totalDur/allCourses.length;
		return avgDur;
	}

}
