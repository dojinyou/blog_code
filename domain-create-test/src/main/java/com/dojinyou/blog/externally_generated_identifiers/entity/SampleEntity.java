package com.dojinyou.blog.externally_generated_identifiers.entity;

import com.dojinyou.blog.externally_generated_identifiers.domain.Sample;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

@Entity(name = "sample")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SampleEntity implements Persistable<String> {

    @Id
    private String id;

    SampleEntity(String id) {
        this.id = id;
    }

    public static SampleEntity from(Sample domain) {
        return new SampleEntity(domain.getId());
    }

    @Transient
    private boolean isNew = true;

    @Override
    public boolean isNew() {
        return isNew;
    }

    @PostLoad
    @PostPersist
    protected void loadOrPersist() {
        this.isNew = false;
    }
}
