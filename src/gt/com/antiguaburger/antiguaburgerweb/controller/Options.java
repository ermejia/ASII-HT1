package gt.com.antiguaburger.antiguaburgerweb.controller;

import java.util.ArrayList;
import java.util.List;

public class Options {
    public String llenar(String id) {
        List<String> lleno = new ArrayList<>();
        switch (id) {
            case "0": return "-";
            case "1": return "Estrellados";
            case "2": return "Revueltos";
            case "3": return "Omelette";
            case "4": return "Parados";
            case "5": return "Volteados";
            case "6": return "Fritos";
            case "7": return "Cocidos";
            case "8": return "Blanco";
            case "9": return "Integral";
            case "10": return "Café";
            case "11": return "Té";
            case "12": return "Jugo";
            case "13": return "Fritas";
            case "14": return "Al Vapor";
            case "15": return "Horneadas";
            case "16": return "Verde";
            case "17": return "César";
            case "18": return "Asiática";
            case "19": return "Frito";
            case "20": return "A la Parrilla";
            case "21": return "Gaseosa";
            case "22": return "Té Frío";
            case "23": return "Agua Pura";
            case "24": return "Tomate";
            case "25": return "Frijol";
            case "26": return "Helado";
            case "27": return "Pastel";
            case "28": return "Flan";
            case "29": return "Gelatina";
        }
return null;
    }
}