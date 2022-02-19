package com.doalivros.doalivros.dtos;

import javax.validation.constraints.NotBlank;

public class UserBooksDTO {

    @NotBlank
    private Integer totalAssetValue;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

}
