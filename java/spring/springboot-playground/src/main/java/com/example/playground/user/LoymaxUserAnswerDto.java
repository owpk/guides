package com.example.playground.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Vorobyev Vyacheslav
 */
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class LoymaxUserAnswerDto {
    private Long questionId;
    private List<Long> fixedAnswerIds;
    private String value;
    private String tag;
    private String questionGroupId;
}
