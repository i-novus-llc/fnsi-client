package ru.inovus.util.fnsi.client.service.api.dto.query;

import java.util.Map;

public class PassportQueryDto extends IdentifiableQueryDto implements QueryDto {

    private static final String QUERY_DTO_NAME = "passport";

    /**
     * Версия справочника. По умолчанию текущая
     */
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
    public String getQueryDtoName() {
        return QUERY_DTO_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> buildParameterMap() {

        Map<String, String> built = super.buildParameterMap();
        if (version != null) {
            built.put("version", version);
        }
        return built;
    }
}
