package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Fujie Zhang
 *
 */
@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class TacoCloudApplication
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
