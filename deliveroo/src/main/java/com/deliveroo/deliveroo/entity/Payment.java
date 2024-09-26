package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.enums.PaymentType;
import com.deliveroo.deliveroo.entity.templete.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Payment extends BaseEntity {

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "order")
    @OneToOne
    private Order order;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

}
