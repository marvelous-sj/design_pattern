package xyz.marsj.design.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-20 13:09
 **/
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getArticle())) {
            System.out.println("has article , pass");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("article is empty , not pass");
        }
    }
}
