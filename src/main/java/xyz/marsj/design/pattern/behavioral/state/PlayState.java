package xyz.marsj.design.pattern.behavioral.state;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-24 22:28
 **/
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("normal play state");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
