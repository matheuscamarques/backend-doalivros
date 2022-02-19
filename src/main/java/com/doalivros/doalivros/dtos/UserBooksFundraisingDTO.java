package com.doalivros.doalivros.dtos;

import java.util.UUID;

public class UserBooksFundraisingDTO {
    private UUID createdBy;
    private UUID userBookId;
    private Integer assetValue;

    // Getters
    public UUID getCreatedBy() {
        return createdBy;
    }

    public UUID getUserBookId() {
        return userBookId;
    }

    public Integer getAssetValue() {
        return assetValue;
    }

    // Setters
    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }

    public void setUserBookId(UUID userBookId) {
        this.userBookId = userBookId;
    }

    public void setAssetValue(Integer assetValue) {
        this.assetValue = assetValue;
    }

}
