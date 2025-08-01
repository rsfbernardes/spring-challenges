package com.rsfbernardes.encryption.services.impl;

import com.rsfbernardes.encryption.dtos.CreditCardDto;
import com.rsfbernardes.encryption.entities.CreditCard;
import com.rsfbernardes.encryption.repositories.CreditCardRepository;
import com.rsfbernardes.encryption.services.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;
    private final Pbkdf2PasswordEncoderServiceImpl passwordEncoderService;

    @Override
    public Optional<CreditCard> findById(Long id) {
        return Optional.ofNullable(creditCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credit card not found with id: " + id)));
    }

    @Override
    public void create(CreditCardDto creditCardDto) {
        CreditCard creditCard = new CreditCard();
        BeanUtils.copyProperties(creditCardDto, creditCard);
        String encryptedDocument = passwordEncoderService.encoder.encode(creditCard.getUserDocument());
        String encryptedToken = passwordEncoderService.encoder.encode(creditCard.getCreditCardToken());
        creditCard.setUserDocument(encryptedDocument);
        creditCard.setCreditCardToken(encryptedToken);
        creditCardRepository.save(creditCard);
    }

}
