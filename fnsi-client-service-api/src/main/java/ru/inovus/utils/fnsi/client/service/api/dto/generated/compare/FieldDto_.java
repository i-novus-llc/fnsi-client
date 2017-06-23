
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
    "Name",
    "Alias",
    "Description",
    "DataType",
    "ContentType",
    "Number",
    "EmptyAllowed",
    "Visible",
    "MinLength",
    "MaxLength"
})
public class FieldDto_ implements Serializable
{

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Alias")
    private String alias;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DataType")
    private String dataType;
    @JsonProperty("ContentType")
    private String contentType;
    @JsonProperty("Number")
    private Integer number;
    @JsonProperty("EmptyAllowed")
    private Boolean emptyAllowed;
    @JsonProperty("Visible")
    private Boolean visible;
    @JsonProperty("MinLength")
    private Integer minLength;
    @JsonProperty("MaxLength")
    private Integer maxLength;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6125326692006600539L;

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public FieldDto_ withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("Alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public FieldDto_ withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FieldDto_ withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("DataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("DataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public FieldDto_ withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    @JsonProperty("ContentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public FieldDto_ withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    @JsonProperty("Number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public FieldDto_ withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("EmptyAllowed")
    public Boolean getEmptyAllowed() {
        return emptyAllowed;
    }

    @JsonProperty("EmptyAllowed")
    public void setEmptyAllowed(Boolean emptyAllowed) {
        this.emptyAllowed = emptyAllowed;
    }

    public FieldDto_ withEmptyAllowed(Boolean emptyAllowed) {
        this.emptyAllowed = emptyAllowed;
        return this;
    }

    @JsonProperty("Visible")
    public Boolean getVisible() {
        return visible;
    }

    @JsonProperty("Visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public FieldDto_ withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    @JsonProperty("MinLength")
    public Integer getMinLength() {
        return minLength;
    }

    @JsonProperty("MinLength")
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public FieldDto_ withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonProperty("MaxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    @JsonProperty("MaxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public FieldDto_ withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
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

    public FieldDto_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(alias).append(description).append(dataType).append(contentType).append(number).append(emptyAllowed).append(visible).append(minLength).append(maxLength).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FieldDto_) == false) {
            return false;
        }
        FieldDto_ rhs = ((FieldDto_) other);
        return new EqualsBuilder().append(name, rhs.name).append(alias, rhs.alias).append(description, rhs.description).append(dataType, rhs.dataType).append(contentType, rhs.contentType).append(number, rhs.number).append(emptyAllowed, rhs.emptyAllowed).append(visible, rhs.visible).append(minLength, rhs.minLength).append(maxLength, rhs.maxLength).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
