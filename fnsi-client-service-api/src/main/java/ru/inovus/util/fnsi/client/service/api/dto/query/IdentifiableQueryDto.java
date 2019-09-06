package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

public abstract class IdentifiableQueryDto implements QueryDto {

    /**
     * Идентификатор справочника.
     * <p>
     * Обязательное поле.
     */
    @NotBlank(message = "Identifier of resource must be present")
    @Pattern(regexp = "(\\d+?\\.){8,10}\\d+",
            message = "Identifier must contain numbers divided by dot")
    private String identifier;

    /**
     * Ключ пользователя.
     * <p>
     * Маркер безопасности.
     */
    private String userKey;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> buildParameterMap() {

        Map<String, String> built = new HashMap<>();

        if (identifier != null) {
            built.put("identifier", identifier);
        }

        if (!StringUtils.isEmpty(userKey)) {
            built.put("userKey", userKey);
        }

        return built;
    }
}
