package ru.inovus.utils.fnsi.client.service.api.dto.exception;

import ru.inovus.utils.fnsi.client.service.api.dto.SettingDto;

import javax.validation.ConstraintViolation;
import java.util.HashSet;
import java.util.Set;

public class ValidationsException extends Exception {
    private Set<ConstraintViolation<SettingDto>> settingsViolations;
    private Set<ConstraintViolation> queryViolations;

    public ValidationsException() {
        super("There are found malformed fields");
    }

    public Set<ConstraintViolation<SettingDto>> getSettingsViolations() {
        if (settingsViolations == null) {
            this.queryViolations = new HashSet<>();
        }
        return settingsViolations;
    }

    public void setSettingsViolations(Set<ConstraintViolation<SettingDto>> settingsViolations) {

        this.settingsViolations = settingsViolations;
    }

    public Set<ConstraintViolation> getQueryViolations() {
        if (queryViolations == null) {
            this.queryViolations = new HashSet<>();
        }
        return queryViolations;
    }

    public void setQueryViolations(Set<ConstraintViolation> queryViolations) {
        this.queryViolations = queryViolations;
    }
}
