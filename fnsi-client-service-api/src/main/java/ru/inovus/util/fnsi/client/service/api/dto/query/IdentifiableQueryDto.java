package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

public abstract class IdentifiableQueryDto implements FieldValueBuilder {
    /**
     * Идентификатор справочника. Обязательное поле.
     */
    @NotBlank(message = "Identifier of resource must be present")
    @Pattern(regexp = "(\\d+?\\.){8,10}\\d+", message = "Identifier must contain numbers divided by dot")
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> buildFieldValueMap() {
        Map<String, String> built = new HashMap<>();
        if (identifier != null) {
            built.put("identifier", identifier);
        }
        return built;
    }
}
