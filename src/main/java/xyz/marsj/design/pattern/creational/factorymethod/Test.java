package xyz.marsj.design.pattern.creational.factorymethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-27 12:48
 **/
public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.produce();

        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.produce();
    }
}
