package xyz.marsj.design.pattern.behavioral.chainofresponsibility;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-20 13:05
 **/
public abstract class Approver {
    protected Approver approver;

    protected void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
