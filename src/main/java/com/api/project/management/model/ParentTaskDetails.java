package com.api.project.management.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Parent Task Model
 * @author Narasimha Kishore Kaipa
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
public class ParentTaskDetails {
	@JsonProperty("parentId")
	private int parentId;

	@JsonProperty("parentTask")
	private String parentTask;
	
	@JsonProperty("project")
	private ProjectDetails project;
}