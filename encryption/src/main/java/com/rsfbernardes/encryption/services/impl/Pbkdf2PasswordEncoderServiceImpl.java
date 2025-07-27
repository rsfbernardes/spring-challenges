package com.rsfbernardes.encryption.services.impl;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Pbkdf2PasswordEncoderServiceImpl {

    public final Pbkdf2PasswordEncoder encoder = Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();

}
