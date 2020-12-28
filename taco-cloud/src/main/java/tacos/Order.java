package tacos;

import java.util.Date;

import lombok.Data;

/**
 * Order entity
 * 
 * @author Fujie Zhang
 *
 */
@Data
public class Order
{

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private Date ccExpiration;
    private String ccCVV;
}
