package com.rsfbernardes.encryption.controllers;

import com.rsfbernardes.encryption.dtos.CreditCardDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit-cards")
public class CreditCardController {

    private CreditCardService creditCardService;

    @GetMapping("/{id}")
    public CreditCard getCreditCard(@PathVariable("id") Long id) {
        return creditCardService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Object> createCreditCard(CreditCardDto creditCardDto) {
        try {
            creditCardService.create(creditCardDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
