
package ru.inovus.util.fnsi.client.service.api.dto.generated.compare;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "name",
    "type",
    "components"
})
public class KeyDto_ implements Serializable
{

    @JsonProperty("number")
    private Integer number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("components")
    private List<ComponentDto> components = new ArrayList<ComponentDto>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8786181474853961562L;

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public KeyDto_ withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public KeyDto_ withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public KeyDto_ withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("components")
    public List<ComponentDto> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<ComponentDto> components) {
        this.components = components;
    }

    public KeyDto_ withComponents(List<ComponentDto> components) {
        this.components = components;
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

    public KeyDto_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(name).append(type).append(components).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyDto_) == false) {
            return false;
        }
        KeyDto_ rhs = ((KeyDto_) other);
        return new EqualsBuilder().append(number, rhs.number).append(name, rhs.name).append(type, rhs.type).append(components, rhs.components).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
