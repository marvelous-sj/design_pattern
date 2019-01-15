package xyz.marsj.design.pattern.structural.composite;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-15 21:41
 **/
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("can't supported add");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("can't supported remove");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("can't supported getName");
    }

    public String getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("can't supported getPrice");
    }

    public void print() {
        throw new UnsupportedOperationException("can't supported print");
    }
}
