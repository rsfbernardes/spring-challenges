package com.rsfbernardes.encryption.repositories;

import com.rsfbernardes.encryption.entities.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

    Optional<CreditCard> findById(Long id);

    CreditCard save(CreditCard creditCard);

}
