
package ru.inovus.util.fnsi.client.service.api.dto.generated.compare;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalProp1",
    "additionalProp2",
    "additionalProp3"
})
public class ListDto implements Serializable
{

    @JsonProperty("additionalProp1")
    private AdditionalProp1Dto additionalProp1;
    @JsonProperty("additionalProp2")
    private AdditionalProp2Dto additionalProp2;
    @JsonProperty("additionalProp3")
    private AdditionalProp3Dto additionalProp3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6246271595855988345L;

    @JsonProperty("additionalProp1")
    public AdditionalProp1Dto getAdditionalProp1() {
        return additionalProp1;
    }

    @JsonProperty("additionalProp1")
    public void setAdditionalProp1(AdditionalProp1Dto additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }

    public ListDto withAdditionalProp1(AdditionalProp1Dto additionalProp1) {
        this.additionalProp1 = additionalProp1;
        return this;
    }

    @JsonProperty("additionalProp2")
    public AdditionalProp2Dto getAdditionalProp2() {
        return additionalProp2;
    }

    @JsonProperty("additionalProp2")
    public void setAdditionalProp2(AdditionalProp2Dto additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }

    public ListDto withAdditionalProp2(AdditionalProp2Dto additionalProp2) {
        this.additionalProp2 = additionalProp2;
        return this;
    }

    @JsonProperty("additionalProp3")
    public AdditionalProp3Dto getAdditionalProp3() {
        return additionalProp3;
    }

    @JsonProperty("additionalProp3")
    public void setAdditionalProp3(AdditionalProp3Dto additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }

    public ListDto withAdditionalProp3(AdditionalProp3Dto additionalProp3) {
        this.additionalProp3 = additionalProp3;
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

    public ListDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProp1).append(additionalProp2).append(additionalProp3).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListDto) == false) {
            return false;
        }
        ListDto rhs = ((ListDto) other);
        return new EqualsBuilder().append(additionalProp1, rhs.additionalProp1).append(additionalProp2, rhs.additionalProp2).append(additionalProp3, rhs.additionalProp3).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
