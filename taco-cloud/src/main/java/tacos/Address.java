package tacos;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address
{
    @NotBlank(message = "{notblank.address.street}")
    private String street;

    @NotBlank(message = "{notblank.address.city}")
    private String city;

    @NotBlank(message = "{notblank.address.state}")
    private String state;

    @Pattern(regexp = "[0-9]{5}([ -]+[0-9]{4})?", message = "{pattern.address.zip}")
    private String zip;
}
