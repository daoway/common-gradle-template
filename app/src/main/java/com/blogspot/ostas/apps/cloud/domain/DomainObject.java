package com.blogspot.ostas.apps.cloud.domain;

import java.time.Instant;

import lombok.Data;

@Data
public class DomainObject {

	private Long id;

	private String payload;

	private Instant timestamp;

}
