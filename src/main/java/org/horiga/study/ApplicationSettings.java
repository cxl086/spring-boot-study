package org.horiga.study;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("app")
public class ApplicationSettings extends AbstractSettings {
	
	private String name;
	private int number;
}
