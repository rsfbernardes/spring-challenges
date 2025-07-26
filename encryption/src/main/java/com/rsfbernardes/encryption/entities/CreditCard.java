package com.rsfbernardes.encryption.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

    private Long id;
    private String userDocument;
    private String creditCardToken;
    private Long value;

}
