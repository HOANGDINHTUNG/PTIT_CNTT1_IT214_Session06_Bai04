package com.vietmart.common.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ProductInfoMigration(
    Long id,
    @JsonAlias({"name", "productName"})
    String name,
    Long price
) {}
