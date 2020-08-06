package gt.com.antiguaburger.antiguaburgerweb.controller;

public class OrderDecorator extends OrderBuilderDecorator{

    @Override
    public OrderEntity getOrderm(String  whatOrder) {
        return null;
    }
    @Override
    public List<String> getDecoratoralgo(List<String> comida, List<String> option) {
        List<String> lista = new ArrayList<>();
        for(int a =0; a<option.size();a++){
            lista.add(comida.get(a+1)+" ["+option.get(a)+"]");
        }
        return lista;
    }

}
