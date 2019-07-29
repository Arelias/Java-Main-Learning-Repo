package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private boolean bunSesame;
    private Integer burgers;
    private String sauce;
    private List<String> ingredients;
    private static final ArrayList<String> possibleIngredients = new ArrayList<>(Arrays.asList("LETTUCE", "ONION", "BACON", "CUCUMBER", "CHILLI", "MUSHROOMS", "SHRIMP", "CHEESE"));
    private static final ArrayList<String> possibleSauce =  new ArrayList<>(Arrays.asList("STANDARD", "ISLANDS", "BBQ"));

    public static class BigmacBuilder {
        private boolean bunSesame = true;
        private Integer burgers = 1;
        private String sauce = "STANDARD";
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bunSesame(boolean bunSesame) {
            this.bunSesame = bunSesame;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(Bigmac.possibleSauce.contains(sauce)){
                this.sauce = sauce;

            } else {
                throw new IllegalStateException("Invalid sauce type");
            }

            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            if(burgers > 0 && burgers < 6){
                this.burgers = burgers;
            } else {
                throw new IllegalStateException("Invalid burger amount");
            }

            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(Bigmac.possibleIngredients.contains(ingredient)){
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {

            return new Bigmac(bunSesame, burgers, sauce, ingredients);
        }

    }

    private Bigmac(boolean bunSesame, Integer burgers, String sauce, List<String> ingredients) {
        this.bunSesame = bunSesame;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean isBunSesame() {
        return bunSesame;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun sesame='" + bunSesame + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
