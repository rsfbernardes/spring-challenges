package com.rsfbernardes.encryption.services;

import com.rsfbernardes.encryption.dtos.CreditCardDto;
import com.rsfbernardes.encryption.entities.CreditCard;

import java.util.Optional;

public interface CreditCardService {

    Optional<CreditCard> findById(Long id);

    void create(CreditCardDto creditCardDto);

}
