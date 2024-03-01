package com.learning.microservices.limitsservice.bean;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    private int minimum;
    private int maximum;
}
