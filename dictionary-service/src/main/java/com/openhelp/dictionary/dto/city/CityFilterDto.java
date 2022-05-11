package com.openhelp.dictionary.dto.city;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.openhelp.dictionary.dto.FilterDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Pavel Ravvich.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityFilterDto extends FilterDto {

    @JsonProperty("title")
    private String title;

    @JsonProperty("phoneCode")
    private String phoneCode;

    @JsonProperty("countryId")
    private Long countryId;
}
