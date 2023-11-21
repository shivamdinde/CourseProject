package day2course;

public class CourseCountMatch implements CourseInfoProcessor {
	/*@Override
	public float processCourseInfo(CourseProject[] CourseProjLocal,CourseInfo cinfo) {
		int count=0;
		for(CourseProject CourseArr:CourseProjLocal) {
			if(CourseArr.getProvider().equals(cinfo.getProviderName()) && CourseArr.getDuration() == cinfo.getDuration())
					count++;
		}
		return count;
	}*/
	
	@Override
	public float processCourseInfo(CourseProject[] CourseProjLocal,CourseInfo cinfo) {
		int count=0;
		for(CourseProject CourseArr:CourseProjLocal) {
			CourseInfo crI = new CourseInfo(CourseArr.getProvider(), CourseArr.getDuration());
			if(cinfo.equals(crI))
					count++;
		}
		return count;
	}
}
