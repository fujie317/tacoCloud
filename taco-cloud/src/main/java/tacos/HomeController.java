package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Home page controller
 * 
 * @author Fujie Zhang
 * 
 */
@Controller
public class HomeController
{
    /**
     * @return: view page name
     */
    @GetMapping("/")
    public String home()
    {
        return "home";
    }
}
