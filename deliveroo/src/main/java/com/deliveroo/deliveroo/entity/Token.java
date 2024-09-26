package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.enums.TokenType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Token {

    @Id
    @GeneratedValue
    public Long id;

    @Column(unique = true, columnDefinition = "text")
    public String token;

    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;

    public boolean revoked;

    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    public User user;

}
