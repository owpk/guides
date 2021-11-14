package test.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UtilEntity {

    @JsonProperty("util_name")
    private String name;
}
