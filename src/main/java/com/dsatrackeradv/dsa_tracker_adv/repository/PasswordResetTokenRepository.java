package com.dsatrackeradv.dsa_tracker_adv.repository;

import com.dsatrackeradv.dsa_tracker_adv.entity.PasswordResetToken;
import com.dsatrackeradv.dsa_tracker_adv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
    Optional<PasswordResetToken> findByUser(User user);
}