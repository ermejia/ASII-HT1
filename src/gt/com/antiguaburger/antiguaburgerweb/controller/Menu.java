package gt.com.antiguaburger.antiguaburgerweb.controller;

import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IGetItems{
    public OrderEntity llenar(String id) {
        List<String> lleno = new ArrayList<>();
        OrderEntity menu = new OrderEntity();
        int precio=0;
        switch (id) {
            case "1":
                lleno.add(id);
                lleno.add("Huevos");
                lleno.add("Frijoles");
                lleno.add("Plátanos");
                lleno.add("Pan");
                lleno.add("Bebida");
                precio = 25;
                break;
            case "2":
                lleno.add(id);
                lleno.add("Cereal");
                lleno.add("Fruta");
                lleno.add("Bebida   ");
                precio = 18;
                break;
            case "3":
                lleno.add(id);
                lleno.add("Avena");
                lleno.add("Fruta");
                lleno.add("Bebida");
                precio = 20;
                break;
            case "4":
                lleno.add(id);
                lleno.add("Hamburguesa");
                lleno.add("Papas");
                lleno.add("Bebida");
                lleno.add("Postre");
                precio = 30;
                break;
            case "5":
                lleno.add(id);
                lleno.add("Ensalada");
                lleno.add("Pollo");
                lleno.add("Sopa");
                lleno.add("Bebida");
                precio = 35;
                break;
            case "6":
                lleno.add(id);
                lleno.add("Huevos");
                lleno.add("Frijoles");
                lleno.add("Tortillas");
                lleno.add("bebida");
                precio = 28;
                break;

        }
        menu.setTotal(precio);
        menu.setItems(lleno);
        return menu;
    }
}