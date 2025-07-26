package com.rsfbernardes.encryption.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CreditCardDto implements Serializable {

    Long id;
    String userDocument;
    String creditCardToken;
    Long value;

}
