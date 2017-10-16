package com.wso2telco.dep.manageservice.resource.dao.rate;

/**
 * Created by manoj on 10/12/17.
 */


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rateDefId",
        "rateDefName",
        "rateDefDescription",
        "rateDefDefault",
        "currency",
        "rateType",
        "rateDefCategoryBase",
        "tariff",
        "createdBy"
})
public class RateDefinitionDAO {

    @JsonProperty("rateDefId")
    private Integer rateDefId;
    @JsonProperty("rateDefName")
    private String rateDefName;
    @JsonProperty("rateDefDescription")
    private String rateDefDescription;
    @JsonProperty("rateDefDefault")
    private Integer rateDefDefault;
    @JsonProperty("currency")
    private CurrencyDAO currency;
    @JsonProperty("rateType")
    private RateTypeDAO rateType;
    @JsonProperty("rateDefCategoryBase")
    private Integer rateDefCategoryBase;
    @JsonProperty("tariff")
    private TariffDAO tariff;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rateDefId")
    public Integer getRateDefId() {
        return rateDefId;
    }

    @JsonProperty("rateDefId")
    public void setRateDefId(Integer rateDefId) {
        this.rateDefId = rateDefId;
    }

    @JsonProperty("rateDefName")
    public String getRateDefName() {
        return rateDefName;
    }

    @JsonProperty("rateDefName")
    public void setRateDefName(String rateDefName) {
        this.rateDefName = rateDefName;
    }

    @JsonProperty("rateDefDescription")
    public String getRateDefDescription() {
        return rateDefDescription;
    }

    @JsonProperty("rateDefDescription")
    public void setRateDefDescription(String rateDefDescription) {
        this.rateDefDescription = rateDefDescription;
    }

    @JsonProperty("rateDefDefault")
    public Integer getRateDefDefault() {
        return rateDefDefault;
    }

    @JsonProperty("rateDefDefault")
    public void setRateDefDefault(Integer rateDefDefault) {
        this.rateDefDefault = rateDefDefault;
    }

    @JsonProperty("currency")
    public CurrencyDAO getCurrencyDAO() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrencyDAO(CurrencyDAO currency) {
        this.currency = currency;
    }

    @JsonProperty("rateType")
    public RateTypeDAO getRateTypeDAO() {
        return rateType;
    }

    @JsonProperty("rateType")
    public void setRateTypeDAO(RateTypeDAO rateType) {
        this.rateType = rateType;
    }

    @JsonProperty("rateDefCategoryBase")
    public Integer getRateDefCategoryBase() {
        return rateDefCategoryBase;
    }

    @JsonProperty("rateDefCategoryBase")
    public void setRateDefCategoryBase(Integer rateDefCategoryBase) {
        this.rateDefCategoryBase = rateDefCategoryBase;
    }

    @JsonProperty("tariff")
    public TariffDAO getTariffDAO() {
        return tariff;
    }

    @JsonProperty("tariff")
    public void setTariffDAO(TariffDAO tariff) {
        this.tariff = tariff;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}