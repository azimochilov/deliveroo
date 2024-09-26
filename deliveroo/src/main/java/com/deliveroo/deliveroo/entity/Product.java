package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.templete.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Product extends BaseEntity {

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "attachment_id")
    private Long attachmentId;
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "attachment_id",insertable = false)
    private Attachment attachment;

    @Column(name = "category_id")
    private Long categoryId;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",insertable = false)
    private Category category;

}

//@DynamicUpdate when hibernate do request for update for entity, it includes all fields while updating.
//to overcome this we use this annotation, so hibernate update only modified fields.
//@Cache is used to enable caching in Hibernate, it will store data in the memory, instead of going to database everytime
//NONSTRICT_READ_WRITE means it is good for reading data from database but cache will be updated with delay.
//when to use, where read occurs frequent, but data is not often updated and it is okay if few users get old data
//for short period, but it will update cache.