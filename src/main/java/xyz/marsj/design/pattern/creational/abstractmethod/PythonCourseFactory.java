package xyz.marsj.design.pattern.creational.abstractmethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-28 10:47
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
