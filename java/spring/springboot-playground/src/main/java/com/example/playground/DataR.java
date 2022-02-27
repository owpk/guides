package com.example.playground;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vorobyev Vyacheslav
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataR <T> {
    T data;
}
