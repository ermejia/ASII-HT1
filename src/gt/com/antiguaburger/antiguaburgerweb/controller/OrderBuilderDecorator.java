package gt.com.antiguaburger.antiguaburgerweb.controller;

public abstract class OrderBuilderDecorator implements IOrder{
    protected IOrder order;

    public void setOrder(IOrder order) {
        this.order = order;
    }

    public abstract List<String> getDecoratoralgo(List<String> comida,List<String> option);
}
