package my.domain;

import lombok.Data;

import java.time.Instant;

@Data
public class DomainObject {

	private Long id;

	private String payload;

	private Instant timestamp;

}
