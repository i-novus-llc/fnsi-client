package ru.inovus.util.fnsi.client.service.impl;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.inovus.util.fnsi.client.service.api.dto.SettingDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.FieldValueBuilder;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class RestClient<QueryDto extends FieldValueBuilder> {

    private static final Logger logger = LoggerFactory.getLogger(RestClient.class);
    private final String CHARSET = "charset=UTF-8";

    public String receiveResponse(QueryDto query, SettingDto settings) {
        ResteasyClient client = new ResteasyClientBuilder()
                .establishConnectionTimeout(settings.getConnectionTimeOut(), TimeUnit.MILLISECONDS)
                .socketTimeout(settings.getSocketTimeOut(), TimeUnit.MILLISECONDS)
                .hostnameVerification(ResteasyClientBuilder.HostnameVerificationPolicy.ANY)
                .build();


        WebTarget target = client.target(settings.getServiceUrl());
        Map<String, String> parameters = query.buildFieldValueMap();
        for (String parameter : parameters.keySet()) {
            try {
                target = target.queryParam(parameter, parameters.get(parameter));
            } catch (NullPointerException e) {
                logger.warn("The value of parameter " + parameter + " was null");
            }
        }
        return target.request().accept(MediaType.APPLICATION_JSON + ";" + CHARSET).get(String.class);

    }

}
