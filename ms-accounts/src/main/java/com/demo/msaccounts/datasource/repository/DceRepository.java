package com.demo.msaccounts.datasource.repository;

import com.demo.msaccounts.datasource.entity.DceEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DceRepository extends R2dbcRepository<DceEntity, String> {
}
