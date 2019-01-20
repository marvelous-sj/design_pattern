package xyz.marsj.design.pattern.behavioral.chainofresponsibility;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-20 13:14
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("java");
        course.setVideo("javaVideo");
        course.setArticle("javaArticle");
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
