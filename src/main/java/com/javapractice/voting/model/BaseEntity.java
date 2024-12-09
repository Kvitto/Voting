package com.javapractice.voting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.domain.Persistable;
import org.springframework.util.Assert;

import javax.persistence.*;

import static org.hibernate.proxy.HibernateProxyHelper.getClassWithoutInitializingProxy;

@MappedSuperclass
@Access(AccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public abstract class BaseEntity implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    // doesn't work for hibernate lazy proxy
    public long id() {
        Assert.notNull(id, "Entity must have id");
        return id;
    }

    @JsonIgnore
    @Override
    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClassWithoutInitializingProxy(this) != getClassWithoutInitializingProxy(o)) return false;
        return getId() != null && getId().equals(((BaseEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
