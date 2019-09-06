package ru.inovus.util.fnsi.client.service.api.dto.query;

public class VersionsQueryDto extends PageableQueryDto {

    private static final String QUERY_DTO_NAME = "versions";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQueryDtoName() {
        return QUERY_DTO_NAME;
    }
}
