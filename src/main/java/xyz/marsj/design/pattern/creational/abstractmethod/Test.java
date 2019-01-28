package xyz.marsj.design.pattern.creational.abstractmethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-28 10:49
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getArticle().produce();
        javaCourseFactory.getVideo().produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.getArticle().produce();
        pythonCourseFactory.getVideo().produce();
    }
}
