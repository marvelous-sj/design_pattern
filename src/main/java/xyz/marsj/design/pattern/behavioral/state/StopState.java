package xyz.marsj.design.pattern.behavioral.state;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-24 22:28
 **/
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("error stop state can't speed");
    }

    @Override
    public void pause() {
        System.out.println("error stop state can't pause");
    }

    @Override
    public void stop() {
        System.out.println("stop state");
    }
}
