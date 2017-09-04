
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
    "result",
    "resultText",
    "resultCode",
    "fields",
    "keys",
    "data"
})
public class CompareResponseDto implements Serializable
{

    @JsonProperty("result")
    private String result;
    @JsonProperty("resultText")
    private String resultText;
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("fields")
    private List<FieldDto> fields = new ArrayList<FieldDto>();
    @JsonProperty("keys")
    private List<KeyDto> keys = new ArrayList<KeyDto>();
    @JsonProperty("data")
    private DataDto data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8268417893451980905L;

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public CompareResponseDto withResult(String result) {
        this.result = result;
        return this;
    }

    @JsonProperty("resultText")
    public String getResultText() {
        return resultText;
    }

    @JsonProperty("resultText")
    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public CompareResponseDto withResultText(String resultText) {
        this.resultText = resultText;
        return this;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public CompareResponseDto withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    @JsonProperty("fields")
    public List<FieldDto> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<FieldDto> fields) {
        this.fields = fields;
    }

    public CompareResponseDto withFields(List<FieldDto> fields) {
        this.fields = fields;
        return this;
    }

    @JsonProperty("keys")
    public List<KeyDto> getKeys() {
        return keys;
    }

    @JsonProperty("keys")
    public void setKeys(List<KeyDto> keys) {
        this.keys = keys;
    }

    public CompareResponseDto withKeys(List<KeyDto> keys) {
        this.keys = keys;
        return this;
    }

    @JsonProperty("data")
    public DataDto getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(DataDto data) {
        this.data = data;
    }

    public CompareResponseDto withData(DataDto data) {
        this.data = data;
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

    public CompareResponseDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(result).append(resultText).append(resultCode).append(fields).append(keys).append(data).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompareResponseDto) == false) {
            return false;
        }
        CompareResponseDto rhs = ((CompareResponseDto) other);
        return new EqualsBuilder().append(result, rhs.result).append(resultText, rhs.resultText).append(resultCode, rhs.resultCode).append(fields, rhs.fields).append(keys, rhs.keys).append(data, rhs.data).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
