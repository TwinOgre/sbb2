package com.to3.sbb2.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;
    @Column(unique = true)
    private String email;

    @CreatedDate
    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;

}
