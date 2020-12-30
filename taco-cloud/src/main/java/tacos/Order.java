package tacos;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order entity
 * 
 * @author Fujie Zhang
 *
 */
@Data
@NoArgsConstructor
public class Order
{
    @NotBlank(message = "Order name cannot be empty")
    private String name;

    @NotBlank(message = "Street name and/or number required")
    private String street;

    @NotBlank(message = "Name of city required")
    private String city;

    @NotBlank(message = "State is a required field")
    private String state;

    @Pattern(regexp = "[0-9]{5}([ -]+[0-9]{4})?", message = "Zip code is 5 digits optionally followed with space dash and 4 more digits")
    private String zip;

    @CreditCardNumber(message = "A proper credit card number is required")
    private String ccNumber;

    @Future(message = "A date in the future is required")
    private Date ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "CVV not valid")
    private String ccCVV;
}
