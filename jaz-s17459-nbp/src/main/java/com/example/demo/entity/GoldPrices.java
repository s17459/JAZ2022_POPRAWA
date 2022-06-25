package com.example.demo.entity;

import com.example.demo.config.RestTemplateConfig;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class GoldPrices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Id number", required = true, dataType = "Long")
    private Long id;
    @ApiModelProperty(notes = "Date From: format 2020-01-01", required = true, dataType = "LocalDate")
    private LocalDate dateFrom = RestTemplateConfig.getDate();
    @ApiModelProperty(notes = "Date To: format 2020-01-01", required = true, dataType = "LocalDate")
    private LocalDate dateTo = RestTemplateConfig.getDate();
    private LocalDate searchTime;

    public GoldPricesRepository(LocalDate dateFrom, LocalDate dateTo) {

        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}
