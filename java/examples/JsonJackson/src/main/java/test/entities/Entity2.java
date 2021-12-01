package test.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entity2 extends BaseEntity {

    @JsonProperty("entity2_name")
    private String name;
    @JsonProperty("entities_3_list")
    private List<Entity3> entity3s;
}
