package xyz.marsj.design.pattern.structural.composite;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-15 21:45
 **/
public class Course extends CatalogComponent {
    private String name;
    private String price;

    public Course(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public String getPrice(CatalogComponent catalogComponent) {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course{" + "name='" + name + '\'' + ", price='" + price + '\'' + '}');
    }
}
