package com.deliveroo.deliveroo.entity.audit;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class) //we need this to automatically fill the datas(auditing fields),createdBy and updateBy
@MappedSuperclass //so this will not implement table in databse but if u inherit from this class fields of this class will be mapped in their table
public abstract class UserAudit {

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String updatedBy;

}
