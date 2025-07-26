package com.rsfbernardes.encryption.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_document", nullable = false)
    private String userDocument;

    @Column(name = "credit_card_token", nullable = false)
    private String creditCardToken;

    @Column(name = "num_value", nullable = false)
    private Long value;

}
