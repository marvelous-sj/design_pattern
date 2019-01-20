package xyz.marsj.design.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-20 13:09
 **/
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())) {
            System.out.println("has video , pass");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("video is empty , not pass");
        }
    }
}
