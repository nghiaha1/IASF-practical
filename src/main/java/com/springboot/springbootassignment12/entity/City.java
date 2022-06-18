package com.springboot.springbootassignment12.entity;

import com.springboot.springbootassignment12.entity.base.BaseEntity;
import lombok.*;

import javax.naming.Name;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "cities")
public class City extends BaseEntity {
    @Id
    private String id;
    private String name;
}
