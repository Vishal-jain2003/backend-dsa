package com.dsatrackeradv.dsa_tracker_adv.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "app_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; // Will be hashed by Spring Security

    private String imageUrl;

    private Integer streakCount = 0;
    private LocalDate lastActiveDate;
    private LocalDate lastReminderSent;
}