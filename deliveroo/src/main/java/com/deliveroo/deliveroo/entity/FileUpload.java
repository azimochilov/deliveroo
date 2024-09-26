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
public class FileUpload extends BaseEntity {
    @Column(name = "object_name")
    private String objectName;

    @Column(name = "content_type")
    private String contentType;

    @Column(name = "size")
    private Long size;

    @Column(name = "url", columnDefinition = "varchar")
    private String url;

    @Column(name = "entity_id")
    private Long entityId;

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }
}
