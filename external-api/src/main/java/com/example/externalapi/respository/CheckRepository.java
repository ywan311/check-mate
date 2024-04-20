package com.example.externalapi.respository;


import com.example.externalapi.data.entity.CheckEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CheckRepository extends ReactiveCrudRepository<CheckEntity,Long> {

    Mono<CheckEntity> findCheckEntityById(Long id);
}
