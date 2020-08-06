package gt.com.antiguaburger.antiguaburgerweb.controller;

import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;


import java.util.ArrayList;
import java.util.List;

public class Extras implements IGetItems{
	@Override
    public OrderEntity llenar(String id) {
        List<String> lleno = new ArrayList<>();
        OrderEntity extra = new OrderEntity();
        switch (id) {
            case "0":
                extra.setExtras("-"); extra.setTotal(0);break;
            case "1":
                extra.setExtras("Huevo"); extra.setTotal(1); break;
            case "2":
               extra.setExtras("Frijoles"); extra.setTotal(4); break;
            case "3":
                extra.setExtras("Plátanos"); extra.setTotal(4); break;
        }
        return extra;
    }
}