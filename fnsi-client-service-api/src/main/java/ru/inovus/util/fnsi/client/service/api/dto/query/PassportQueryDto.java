package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Map;

public class PassportQueryDto extends IdentifiableQueryDto implements FieldValueBuilder {
    /**
     * Версия справочника. По умолчанию текущая
     */
    @NotBlank
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> buildFieldValueMap() {
        Map<String, String> built = super.buildFieldValueMap();
        if (version != null) {
            built.put("version", version);
        }
        return built;
    }
}
