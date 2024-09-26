package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.templete.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Branch extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "working_time")
    private String workingTime;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

}
