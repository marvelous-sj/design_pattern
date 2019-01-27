package xyz.marsj.design.pattern.creational.factorymethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-27 12:46
 **/
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
