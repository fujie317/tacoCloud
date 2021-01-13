package tacos;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller for presenting and processing taco orders
 * 
 * @author Fujie Zhang
 *
 */
@Controller
@Slf4j
@RequestMapping("/")
public class OrderController
{
    /**
     * @param model
     * @return order form view name
     */
    @GetMapping("orders/current")
    public String OrderForm(Model model)
    {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    /**
     * @param order
     * @return redirect to view name
     */
    @PostMapping("orders")
    public String processOrder(@Valid Order order, Errors errors)
    {
        if (errors.hasErrors()) {
            return "orderForm";
        }

        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
