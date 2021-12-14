package com.entelgy.reto.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:/application.properties", ignoreResourceNotFound=true)
public class ApiEndpoints {

	@Value("${api.regress.users}" )
	public String regressUsers;

}
