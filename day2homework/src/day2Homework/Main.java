package day2Homework;

public class Main {

	public static void main(String[] args) {


		Course course1 = new Course();
		course1.id=1;
		course1.name="java";
		course1.percent=16;
		course1.instructor="Engin Demiroð";
		
		Course course2 = new Course();
		course2.id=2;
		course2.name="C";
		course2.percent=0;
		course2.instructor="Ahmet Kurt";
		
		Course course3 = new Course();
		course3.id=3;
		course3.name="HTML-CSS";
		course3.percent=90;
		course3.instructor="Yusuf Keleþ";
		
		Course[] courses= {course1,course2,course3}; 
		
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		CourseCategory courseCategory1 = new CourseCategory();
		courseCategory1.id=1;
		courseCategory1.name="Programing";
		
		CourseCategory courseCategory2 = new CourseCategory();
		courseCategory2.id=2;
		courseCategory2.name="Language";
		
		CourseCategory[] courseCategories= {courseCategory1,courseCategory2};
		
		for(CourseCategory courseCategory:courseCategories) {
			System.out.println(courseCategory.name);
		}
		
		method1 methodd1 = new method1();
		methodd1.nextToLesson(course1);
		methodd1.nextToLesson(course2);
		
		method2 methodd2 = new method2();
		methodd2.LessonTheFinish();
		methodd2.LessonTheFinish();
	}

}
