package io.mosip.kernel.keymigrate.dto;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Component("authorizedRoles")
@ConfigurationProperties(prefix = "mosip.role.keymanager")
@Getter
@Setter
public class AuthorizedRolesDTO {

   	##keymigratorcontroller
	
	private List<String> postmigratebasekey;
	
	private List<String> getzktempcertificate;
	
	private List<String> postmigratezkkeys;
	

}
}