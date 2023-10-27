package builderpizza.pizza.builders;

import builderpizza.pizza.builders.interfaces.Builder;
import builderpizza.pizza.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements Builder {
    private List<Pizza> pizzas = new ArrayList<Pizza>();
    @Override
    public void setPizza(Pizza pizza, String tamanho) {
        pizza.setTamanho(tamanho);
        this.pizzas.add(pizza);
    }

    public void buildPizza(String ingrediente){
       Pizza pizza = new Pizza();
       pizza.adicionarIngredientesQuatroQueijo(ingrediente);
       pizza.adicionarIngredientesPortuguesa(ingrediente);
       pizza.adicionarIngredientesFrangoComCatupiry(ingrediente);
       pizzas.add(pizza);
    }

    public void buildTamanho (String tamanhos){
        Pizza tamanho = new Pizza();
        tamanho.getTamanho();
    }

}
