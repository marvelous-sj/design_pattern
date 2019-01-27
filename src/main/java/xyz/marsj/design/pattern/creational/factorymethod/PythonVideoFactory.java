package xyz.marsj.design.pattern.creational.factorymethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-27 12:47
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
