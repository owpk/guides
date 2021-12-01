package test.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ValueObject {
//    List<UtilEntity> utilEntities;
//    List<BaseEntity> baseEntities;
    List<Entity1> entity1s;
//    List<Entity2> entity2s;

    @JsonCreator
    ValueObject(
//        @JsonProperty("util_entities") List<UtilEntity> utilEntities,
//        @JsonProperty("base_entities") List<BaseEntity> baseEntities,
        @JsonProperty("1_entities") List<Entity1> entity1s
//        @JsonProperty("2_entities") List<Entity2> entity2s
    ) {
//        this.utilEntities = utilEntities;
//        this.baseEntities = baseEntities;
        this.entity1s = entity1s;
//        this.entity2s = entity2s;
    }
}
