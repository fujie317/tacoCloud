package tacos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Ingredient.Type;

@Slf4j
@Controller
@RequestMapping(path = "/design")
public class DesignController
{
    /**
     * @param model
     * @return
     */
    @GetMapping
    public String showDesignForm(Model model)
    {
        List<Ingredient> ingredients = new ArrayList<Ingredient>()
        {
            {
                add(new Ingredient(1L, "Flour Tortilla", Type.WRAP));
                add(new Ingredient(2L, "Corn Tortilla", Type.WRAP));
                add(new Ingredient(3L, "Ground Beef", Type.PROTEIN));
                add(new Ingredient(4L, "Carnitas", Type.PROTEIN));
                add(new Ingredient(5L, "Diced Tomatoes", Type.VEGGIES));
                add(new Ingredient(6L, "Lettuce", Type.VEGGIES));
                add(new Ingredient(7L, "Cheddar", Type.CHEESE));
                add(new Ingredient(8L, "Monterrey Jack", Type.CHEESE));
                add(new Ingredient(9L, "Salsa", Type.SAUCE));
                add(new Ingredient(10L, "Sour Cream", Type.SAUCE));
            }
        };
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
        model.addAttribute("taco", new Taco());
        return "design";
    }

    /**
     * @param design
     * @return redirect page view after processing taco design
     */
    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors)
    {
        if (errors.hasErrors()) {
            return "design";
        }
        // Save taco design
        log.info("Processing design: " + design);
        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type)
    {
        return ingredients.stream().filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
