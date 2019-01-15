package xyz.marsj.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-15 21:50
 **/
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> courses = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        courses.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        courses.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent course : courses) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            course.print();
        }
    }
}
