package gt.com.antiguaburger.antiguaburgerweb.controller;

import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;

import java.util.ArrayList;
import java.util.List;

public class Extras {
    public OrderEntity llenar(String id) {
        List<String> lleno = new ArrayList<>();
        OrderEntity extra = new OrderEntity();
        switch (id) {
            case "0":
                extra.setExtras("-"); extra.setTotal(0);break;
            case "1":
                extra.setExtras("Huevos Revueltos"); extra.setTotal(1); break;
            case "2":
               extra.setExtras("Huevos Estrellados"); extra.setTotal(1); break;
            case "3":
                extra.setExtras("Omelette"); extra.setTotal(1); break;
            case "4":
                extra.setExtras("Frijoles Parados"); extra.setTotal(4); break;
            case "5":
                extra.setExtras("Frijoles Volteados"); extra.setTotal(4); break;
            case "6":
                extra.setExtras("Platanos Fritos"); extra.setTotal(4); break;
            case "7":
                extra.setExtras("Platanos Cocidos"); extra.setTotal(4); break;
            case "8":
                extra.setExtras("Pan Blanco"); extra.setTotal(4); break;
            case "9":
                extra.setExtras("Pan Integral"); extra.setTotal(4); break;
            case "10":
                extra.setExtras("Crema"); extra.setTotal(2); break;
            case "11":
                extra.setExtras("Queso"); extra.setTotal(2); break;
            case "12":
                extra.setExtras("Tortillas"); extra.setTotal(5); break;
            case "13":
                extra.setExtras("Fruta"); extra.setTotal(8); break;
            case "14":
                extra.setExtras("Jugo de Naranja"); extra.setTotal(6); break;
            case "15":
                extra.setExtras("Torta de Carne Simple"); extra.setTotal(10); break;
            case "16":
                extra.setExtras("Torta de Carne Doble"); extra.setTotal(10); break;
            case "17":
                extra.setExtras("Torta de Carne Triple"); extra.setTotal(10); break;
            case "18":
                extra.setExtras("Queso Amarillo Sencillo"); extra.setTotal(6); break;
            case "19":
                extra.setExtras("Queso Amarillo Doble"); extra.setTotal(6); break;
            case "20":
                extra.setExtras("Queso Amarillo Triple"); extra.setTotal(6); break;
            case "21":
                extra.setExtras("Helado"); extra.setTotal(7); break;
            case "22":
                extra.setExtras("Pastel"); extra.setTotal(10); break;
            case "23":
                extra.setExtras("Flan"); extra.setTotal(8); break;
            case "24":
                extra.setExtras("Gelatina"); extra.setTotal(3); break;
        }
        return extra;
    }
}
