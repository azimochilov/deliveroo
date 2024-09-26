package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.enums.OrderStatus;
import com.deliveroo.deliveroo.entity.templete.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "orders")
public class Order extends BaseEntity {

    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "order_cost")
    private BigDecimal orderCost;

    @Column(name = "shipping_cost")
    private BigDecimal shippingCost;

    @Column(name = "user")
    @ManyToOne
    private User user;

    @Column(name = "branch")
    @ManyToOne
    private Branch branch;

    @Column(name = "order_items")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.PENDING;
}
