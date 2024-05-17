package com.demo.msaccounts.service;

import com.demo.msaccounts.model.Dbc;
import com.demo.msaccounts.model.Dce;
import com.demo.msaccounts.model.Dcp;
import reactor.core.publisher.Mono;

public interface DBCService {
    Mono<Dbc> findById(String id);

    Mono<Dcp> findDcpByIdDbc(String idDbc);

    Mono<Dce> findDceByIdDbc(String idDbc);
}
