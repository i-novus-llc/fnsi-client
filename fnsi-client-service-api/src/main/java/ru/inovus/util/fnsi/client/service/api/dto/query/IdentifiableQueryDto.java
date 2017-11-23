package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class IdentifiableQueryDto implements FieldValueBuilder {
    /**
     * Идентификатор справочника. Обязательное поле.
     */
    @NotBlank(message = "Identifier of resource must be present")
    @Pattern(regexp = "(\\d+?\\.){8,10}\\d+", message = "Identifier must contain numbers divided by dot")
    private String identifier;

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
    public Map<String, String> buildFieldValueMap() {
        Map<String, String> built = new HashMap<>();
        if (identifier != null) {
            built.put("identifier", identifier);
        }
        Optional.ofNullable(userKey).ifPresent(v -> built.put("userKey", v));
        return built;
    }
}
