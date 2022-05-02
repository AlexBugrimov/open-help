package com.openhelp.story.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pavel Ravvich.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoryDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;

    @JsonProperty("status")
    private String status;

    @JsonProperty("description")
    private String description;

    @JsonProperty("createdAt")
    private Long createdAt;

    @JsonProperty("updatedAt")
    private Long updatedAt;

    @JsonProperty("closedAt")
    private Long closedAt;

    @JsonProperty("authorId")
    private Long authorId;

    @JsonProperty("currentLocationId")
    private Long currentLocationId;

    @JsonProperty("exodusLocationId")
    private Long exodusLocationId;

    @JsonProperty("targetLocationId")
    private Long targetLocationId;
}
