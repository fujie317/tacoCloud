package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository
{
    Ingredient findOne(Long id);

    Iterable<Ingredient> findAll();

    Ingredient save(Ingredient ingredient);
}
