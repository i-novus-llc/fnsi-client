
package ru.inovus.utils.fnsi.client.service.api.dto.generated.compare;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "operation"
})
public class FieldDto implements Serializable
{

    @JsonProperty("field")
    private FieldDto_ field;
    @JsonProperty("operation")
    private String operation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7377080874595179214L;

    @JsonProperty("field")
    public FieldDto_ getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(FieldDto_ field) {
        this.field = field;
    }

    public FieldDto withField(FieldDto_ field) {
        this.field = field;
        return this;
    }

    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public FieldDto withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public FieldDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(field).append(operation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FieldDto) == false) {
            return false;
        }
        FieldDto rhs = ((FieldDto) other);
        return new EqualsBuilder().append(field, rhs.field).append(operation, rhs.operation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
