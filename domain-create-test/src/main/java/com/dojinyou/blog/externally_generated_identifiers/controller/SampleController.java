package com.dojinyou.blog.externally_generated_identifiers.controller;

import com.dojinyou.blog.externally_generated_identifiers.domain.Sample;
import com.dojinyou.blog.externally_generated_identifiers.entity.SampleEntity;
import com.dojinyou.blog.externally_generated_identifiers.repository.SampleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleRepository sampleRepository;

    @Transactional
    @GetMapping("/create/{id}")
    public Sample create(@PathVariable String id) {
        // create domain
        var domain = new Sample(id);

        // convert entity
        var entity = SampleEntity.from(domain);

        // persist
        sampleRepository.save(entity);

        return domain;
    }
}
