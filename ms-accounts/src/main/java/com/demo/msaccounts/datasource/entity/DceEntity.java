package com.demo.msaccounts.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "DCE")
public class DceEntity {
    @Id
    @Column(name = "DCE_KEY_IDCE")
    private String dceKeyIdce;
    private String dceIndCate;


    public String getDceKeyIdce() {
        return dceKeyIdce;
    }

    public void setDceKeyIdce(String dceKeyIdce) {
        this.dceKeyIdce = dceKeyIdce;
    }

    public String getDceIndCate() {
        return dceIndCate;
    }

    public void setDceIndCate(String dceIndCate) {
        this.dceIndCate = dceIndCate;
    }
}
