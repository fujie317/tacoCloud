/**
 * 
 */
package tacos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Turn this into a web application Spring boot does not seem to product this file automatically
 * anymore
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
