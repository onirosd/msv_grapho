package com.demo.msaccounts.service;

import com.demo.msaccounts.datasource.repository.DBCRepository;
import com.demo.msaccounts.datasource.repository.DcpRepository;
import com.demo.msaccounts.datasource.repository.DceRepository;
import com.demo.msaccounts.model.Dbc;
import com.demo.msaccounts.model.Dce;
import com.demo.msaccounts.model.Dcp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DbcServiceImpl implements DBCService{
    @Autowired
    private DBCRepository dbcRepository;
    @Autowired
    private DcpRepository dcpRepository;
    @Autowired
    private DceRepository dceRepository;
    @Override
    public Mono<Dbc> findById(String idDbc) {
        System.out.println("idDbc ->" + idDbc);
        return this.dbcRepository.findById(idDbc).map(result -> {
            System.out.println("DEVUELVO ESTO");
            System.out.println(BeanMapper.mapToGraphql(result));
            return BeanMapper.mapToGraphql(result);
        });
    }

    @Override
    public Mono<Dcp> findDcpByIdDbc(String idDbc) {
        return dcpRepository.findById(idDbc).map(BeanMapper::mapToGraphql);
    }

    @Override
    public Mono<Dce> findDceByIdDbc(String idDbc) {
        return dceRepository.findById(idDbc).map(BeanMapper::mapToGraphql);
    }
}
