package com.example.externalapi.data.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Getter
@RequiredArgsConstructor
public class AddCheckRequest {
    String title;
    String content;
    Instant startDate;
    Instant endDate;
}
