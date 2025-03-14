package com.ecommerce.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;


@MappedSuperclass
public class AbstractEntity {

    @JsonIgnore
    private LocalDateTime cdate;

    @JsonIgnore
    private LocalDateTime udate;

    @PrePersist
    public void prePersist() {
        this.cdate = LocalDateTime.now();
        this.udate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.udate = LocalDateTime.now();
    }

    public AbstractEntity() {
    }

    public AbstractEntity(LocalDateTime cdate, LocalDateTime udate) {
        this.cdate = cdate;
        this.udate = udate;
    }

    public LocalDateTime getCdate() {
        return cdate;
    }

    public void setCdate(LocalDateTime cdate) {
        this.cdate = cdate;
    }

    public LocalDateTime getUdate() {
        return udate;
    }

    public void setUdate(LocalDateTime udate) {
        this.udate = udate;
    }
}
