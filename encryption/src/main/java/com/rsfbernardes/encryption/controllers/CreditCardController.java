package com.rsfbernardes.encryption.controllers;

import com.rsfbernardes.encryption.dtos.CreditCardDto;
import com.rsfbernardes.encryption.entities.CreditCard;
import com.rsfbernardes.encryption.services.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/credit-cards")
public class CreditCardController {

    private final CreditCardService creditCardService;

    @GetMapping("/{id}")
    public Optional<CreditCard> getCreditCard(@PathVariable("id") Long id) {
        return creditCardService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Object> createCreditCard(@RequestBody CreditCardDto creditCardDto) {
        try {
            creditCardService.create(creditCardDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
