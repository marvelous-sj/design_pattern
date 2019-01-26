package xyz.marsj.design.pattern.behavioral.state;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-26 17:48
 **/
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println(courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        System.out.println(courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println(courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();
        System.out.println(courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        System.out.println(courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
