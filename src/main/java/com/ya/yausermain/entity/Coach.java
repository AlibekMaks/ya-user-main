package com.ya.yausermain.entity;

import com.ya.yausermain.enums.TraineeLevel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kz.ya.yacommon.BaseEntity;

@Entity
@Table(name = "coach")
public class Coach extends BaseEntity {
    private String name;
    private String phoneNumber;
    private TraineeLevel traineeLevel;

}
