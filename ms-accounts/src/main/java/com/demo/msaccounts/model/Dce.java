package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dce {
    private String personId;
    private DebtorCategory debtorCategory;
}
