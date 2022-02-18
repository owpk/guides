package com.example.playground.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vorobyev Vyacheslav
 */
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class LoymaxFixedAnswer {
    private Long id;
    private String type;
    private Boolean isCustom;
    private Boolean isSelected;
    private String name;
}
