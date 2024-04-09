package com.ya.yausermain.entity;

import jakarta.persistence.*;
import kz.ya.yacommon.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user_membership_info")
public class UserMembershipInfo extends BaseEntity {

    private Boolean isActive;
    private Integer numberOfDays;
    private LocalDateTime activeBefore;

    @OneToOne(mappedBy = "user")
    private User user;
}
