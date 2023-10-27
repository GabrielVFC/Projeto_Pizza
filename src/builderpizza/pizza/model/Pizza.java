package builderpizza.pizza.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private ArrayList<String> quatroQueijo = new ArrayList<String>(List.of(
            "Queijo Provolone", "Queijo parmesão", "Queijo prata", "Queijo mussarela",
            "molho de tomate", "massa da pizza", "orégano"
    ));
    private ArrayList<String> portuguesa = new ArrayList<String>(List.of(
            "Queijo mussarela", "molho de tomate", "azeitona preta", "massa da pizza",
            "ovo", "cebola", "tomate","orégano"
    ));
    private ArrayList<String> frangoComCatupiry = new ArrayList<String>(List.of(
            "Frango desfiado", "queijo mussarela", "molho de tomate", "massa da pizza",
            "catupiry", "orégano"
    ));

    private String tamanho = "P, M, G";

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionarIngredientesQuatroQueijo(String ingrediente){
        quatroQueijo.add(ingrediente);
    }
    public void adicionarIngredientesPortuguesa(String ingrediente){
        portuguesa.add(ingrediente);
    }
    public void adicionarIngredientesFrangoComCatupiry(String ingrediente){
        frangoComCatupiry.add(ingrediente);
    }

}
