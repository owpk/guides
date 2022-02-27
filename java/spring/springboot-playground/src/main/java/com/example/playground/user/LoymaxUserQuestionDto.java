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
public class LoymaxUserQuestionDto {
    private String type;
    private String questionType;
    private String logicalName;
    private String regexp;
    private String regexpErrorMessage;
    private String isRequired;
    private String isReadOnly;
    private String isMultiSelect;
    private List<LoymaxFixedAnswer> fixedAnswers;
    private LoymaxUserAnswerDto answer;
}
