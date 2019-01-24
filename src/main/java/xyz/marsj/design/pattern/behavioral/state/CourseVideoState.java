package xyz.marsj.design.pattern.behavioral.state;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-24 21:49
 **/
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();
}
