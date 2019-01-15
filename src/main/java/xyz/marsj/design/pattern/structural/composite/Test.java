package xyz.marsj.design.pattern.structural.composite;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-15 22:13
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse=new Course("LinuxCourse","1");
        CatalogComponent windowsCourse=new Course("WindowsCourse","2");
        CatalogComponent javaCourseCatalog=new CourseCatalog("JavaCourseCatalog",2);
        CatalogComponent springCourse=new Course("SpringCourse","3");
        CatalogComponent nettyCourse=new Course("NettyCourse","4");
        javaCourseCatalog.add(springCourse);
        javaCourseCatalog.add(nettyCourse);
        CatalogComponent mainCourseCatalog=new CourseCatalog("MainCourseCatalog",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);
        mainCourseCatalog.print();
    }
}
