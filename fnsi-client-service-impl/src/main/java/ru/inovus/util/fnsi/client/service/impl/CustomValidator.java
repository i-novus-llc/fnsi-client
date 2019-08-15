package ru.inovus.util.fnsi.client.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.inovus.util.fnsi.client.service.api.dto.SettingDto;
import ru.inovus.util.fnsi.client.service.api.dto.exception.ValidationsException;
import ru.inovus.util.fnsi.client.service.api.dto.query.IdentifiableQueryDto;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
@SuppressWarnings({"unused", "WeakerAccess"})
public class CustomValidator<Q extends IdentifiableQueryDto> {

    private static final Logger logger = LoggerFactory.getLogger(CustomValidator.class);

    @Autowired
    private Validator validator;

    @SuppressWarnings("squid:S2589")
    public void doValidation(Q query, SettingDto settings) throws ValidationsException {

        ValidationsException validationsException = null;
        Set<ConstraintViolation<Q>> queryViolations = validator.validate(query);

        if (!queryViolations.isEmpty()) {
            if (validationsException == null) {
                validationsException = new ValidationsException();
            }
            for (ConstraintViolation<Q> queryViolation : queryViolations) {
                logger.warn("Malformed query's fields. {}", queryViolation);
                validationsException.getQueryViolations().add(queryViolation);
            }
        }

        Set<ConstraintViolation<SettingDto>> settingsViolations = validator.validate(settings);
        if (!settingsViolations.isEmpty()) {
            if (validationsException == null) {
                validationsException = new ValidationsException();
            }
            for (ConstraintViolation<SettingDto> settingsViolation : settingsViolations) {
                logger.warn("Malformed setting's fields. {}", settingsViolation);
                validationsException.getSettingsViolations().add(settingsViolation);
            }
        }

        if (validationsException != null)
            throw validationsException;
    }
}
