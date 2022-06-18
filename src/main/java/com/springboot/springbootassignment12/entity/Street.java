package com.springboot.springbootassignment12.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.springboot.springbootassignment12.entity.base.BaseEntity;
import com.springboot.springbootassignment12.entity.enums.StreetSimpleStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "streets")
public class Street extends BaseEntity {
    @Id
    private String id;
    private String districtId;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "street_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private District district;

    @Enumerated(EnumType.ORDINAL)
    private StreetSimpleStatus status;
}
