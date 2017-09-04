
package ru.inovus.util.fnsi.client.service.api.dto.generated.versions;

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
    "total",
    "list"
})
public class VersionsResponseDto implements Serializable
{

    @JsonProperty("result")
    private String result;
    @JsonProperty("resultText")
    private String resultText;
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("list")
    private List<ListDto> list = new ArrayList<ListDto>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8272666752196860816L;

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public VersionsResponseDto withResult(String result) {
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

    public VersionsResponseDto withResultText(String resultText) {
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

    public VersionsResponseDto withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public VersionsResponseDto withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("list")
    public List<ListDto> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(List<ListDto> list) {
        this.list = list;
    }

    public VersionsResponseDto withList(List<ListDto> list) {
        this.list = list;
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

    public VersionsResponseDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(result).append(resultText).append(resultCode).append(total).append(list).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionsResponseDto) == false) {
            return false;
        }
        VersionsResponseDto rhs = ((VersionsResponseDto) other);
        return new EqualsBuilder().append(result, rhs.result).append(resultText, rhs.resultText).append(resultCode, rhs.resultCode).append(total, rhs.total).append(list, rhs.list).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
