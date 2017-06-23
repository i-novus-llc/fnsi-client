
package ru.inovus.utils.fnsi.client.service.api.dto.generated.compare;

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
    "total",
    "list"
})
public class DataDto implements Serializable
{

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("list")
    private List<ListDto> list = new ArrayList<ListDto>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6439728418332504751L;

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public DataDto withTotal(Integer total) {
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

    public DataDto withList(List<ListDto> list) {
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

    public DataDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(list).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataDto) == false) {
            return false;
        }
        DataDto rhs = ((DataDto) other);
        return new EqualsBuilder().append(total, rhs.total).append(list, rhs.list).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
