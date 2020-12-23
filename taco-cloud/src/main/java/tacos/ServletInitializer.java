/**
 * 
 */
package tacos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
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
