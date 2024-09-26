package com.deliveroo.deliveroo.entity;


import com.deliveroo.deliveroo.entity.templete.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attachment extends BaseEntity {

    @Column(name = "file_path")
    private String filePath;

}
