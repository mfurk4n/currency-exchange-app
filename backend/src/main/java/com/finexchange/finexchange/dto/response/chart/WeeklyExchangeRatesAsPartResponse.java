package com.finexchange.finexchange.dto.response.chart;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class WeeklyExchangeRatesAsPartResponse {
    String targetCurrency;
    List<ExchangeRatesForBaseCurrency> baseCurrencies;
}
