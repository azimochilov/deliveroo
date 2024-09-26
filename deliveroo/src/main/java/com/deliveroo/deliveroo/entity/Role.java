package com.deliveroo.deliveroo.entity;

import com.deliveroo.deliveroo.entity.enums.RoleName;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private RoleName name;
    @Override
    public String getAuthority(){
        return name.name();
    }

}

//why we implemented here GrantedAuthority? because when we use spring security , it represents that authority
//granted to authenticated user, by implementing it we enable role class to be treated like authority in context
//of spring security, it plays big role to give specific access to role,if u got admin role u will be able to access
//things that only allowed for ADMIN role.
//getAuthority spring uses that method to identify name of role assigned to user.
