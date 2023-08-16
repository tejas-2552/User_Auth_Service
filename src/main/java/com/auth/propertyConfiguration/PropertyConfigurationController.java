package com.auth.propertyConfiguration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/service")
public class PropertyConfigurationController {
	
	
	
	// Service info api
	@GetMapping(value = "/service-info", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ObjectNode getProjectConfigurationDetails() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		ObjectNode responseNode = mapper.createObjectNode();
		objectNode.put("active-profile", "DEV");
		objectNode.put("application-name", "user-authentication-service");
		objectNode.put("version", "1.0");
		objectNode.put("active-profile", "DEV");
		//objectNode.put("service-uptime", SecurityUtil.getInstance().getSetting("SERVICE_TIME"));
		responseNode.put("RESP_CODE", 200);
		responseNode.put("RESPONSE", "SUCCESS");
		responseNode.put("RESP_MSG", "Request Successfully Proccessed.");

		responseNode.set("DATA", objectNode);
		
		return responseNode;

	}

}
