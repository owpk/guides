package test.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entity1 extends BaseEntity {

    @JsonProperty("entity1_name")
    private String name;
    @JsonProperty("entities_2_list")
    private List<Entity2> entity2s;
}
