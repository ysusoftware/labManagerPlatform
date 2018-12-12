package org.software.ysu.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyConfigurer extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        String result = propertyValue;
        if(propertyName.equals("jdbc.username")||propertyName.equals("jdbc.password")){
            result=DESUtils.decode(propertyValue);
        }
        return result;
    }
}
