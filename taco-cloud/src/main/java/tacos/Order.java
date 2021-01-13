package tacos;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

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
    private Long id;

    @NotBlank(message = "Order name cannot be empty")
    private String name;

    @Valid // Enable validation on nested property
    private Address address;

    @CreditCardNumber(message = "A proper credit card number is required")
    private String ccNumber;

    @Future(message = "A date in the future is required")
    private Date ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "CVV not valid")
    private String ccCVV;

    private Date placedAt;
}
