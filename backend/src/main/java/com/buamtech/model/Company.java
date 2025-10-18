package com.buamtech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private String name;
    private String callingName;
    private String motto;
    private String headquarters;
    private String missionStatement;
}
