package com.ecommerce.site.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;


@MappedSuperclass
public class AbstractEntity {

    private LocalDateTime cdate;
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
