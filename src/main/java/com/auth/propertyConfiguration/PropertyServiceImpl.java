package com.auth.propertyConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.springframework.stereotype.Component;


@Component
public class PropertyServiceImpl {

	public PropertyServiceImpl() {
	}

	public Properties getDefaultProperties() {
		Properties map = new Properties();
		// Setting Default properties
		map.put("Admin", "admin@123");
		map.put("role-user", "user@123");
		map.put("SERVICE_TIME", "2023/08/12" /* new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date()) */);
		return map;
	}

	public void initDefaultProperties() {
		//SecurityUtil.getInstance().initProperties(getDefaultProperties());
	}
}
