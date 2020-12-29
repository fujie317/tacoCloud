package tacos;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author Fujie Zhang
 *
 */
@Configuration
@EnableWebMvc
public class WebConfig
    implements WebMvcConfigurer
{
    @Override
    /**
     * Add formatters for HTML5 date and time strings
     */
    public void addFormatters(FormatterRegistry registry)
    {
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
        registrar.setUseIsoFormat(true);
        registrar.registerFormatters(registry);
    }
}
