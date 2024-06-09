package com.example.externalapi.data.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Table(name = "YW_CHECK")
@NoArgsConstructor
public class CheckEntity  {
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private Boolean isChecked;
    @Column
    private Instant date;

    @Builder
    public CheckEntity(Long id, String title, Boolean isChecked, Instant date) {
        this.id = id;
        this.title = title;
        this.isChecked = isChecked;
        this.date = date;
    }
}
