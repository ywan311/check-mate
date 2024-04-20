package com.example.externalapi.service;


import com.example.externalapi.data.dto.AddCheckRequest;
import com.example.externalapi.data.entity.CheckEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CheckService {

    Flux<CheckEntity> getChecks();

    Mono<CheckEntity> getCheck(Long id);

    Flux<CheckEntity> addCheckByDateRange(AddCheckRequest request);
}
