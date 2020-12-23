/**
 * 
 */
package tacos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Turn this into a web application
 * 
 * @author Fujie Zhang
 *
 */
public class ServletInitializer
    extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder aBuilder)
    {
        return aBuilder.sources(TacoCloudApplication.class);
    }
}
