
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
    "key",
    "operation"
})
public class KeyDto implements Serializable
{

    @JsonProperty("key")
    private KeyDto_ key;
    @JsonProperty("operation")
    private String operation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8496855639636622454L;

    @JsonProperty("key")
    public KeyDto_ getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(KeyDto_ key) {
        this.key = key;
    }

    public KeyDto withKey(KeyDto_ key) {
        this.key = key;
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

    public KeyDto withOperation(String operation) {
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

    public KeyDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(key).append(operation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyDto) == false) {
            return false;
        }
        KeyDto rhs = ((KeyDto) other);
        return new EqualsBuilder().append(key, rhs.key).append(operation, rhs.operation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
