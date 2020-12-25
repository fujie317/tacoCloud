package tacos;

import lombok.Data;

/**
 * @author Fujie Zhang
 *
 */
@Data
public class Ingredient
{

    private final Long id;
    private final String name;
    private final Type type;

    /**
     * @author Fujie Zhang
     *
     */
    @SuppressWarnings("javadoc")
    public static enum Type
    {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
