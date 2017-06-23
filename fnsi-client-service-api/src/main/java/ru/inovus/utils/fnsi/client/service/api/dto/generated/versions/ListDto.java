
package ru.inovus.utils.fnsi.client.service.api.dto.generated.versions;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "createDate",
    "publishDate",
    "lastUpdate",
    "releaseNotes",
    "passport",
    "archive"
})
public class ListDto implements Serializable
{

    @JsonProperty("version")
    private String version;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("publishDate")
    private String publishDate;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("releaseNotes")
    private String releaseNotes;
    @JsonProperty("passport")
    private PassportDto passport;
    @JsonProperty("archive")
    private Boolean archive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6565809047063154007L;

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public ListDto withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public ListDto withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    @JsonProperty("publishDate")
    public String getPublishDate() {
        return publishDate;
    }

    @JsonProperty("publishDate")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public ListDto withPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ListDto withLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @JsonProperty("releaseNotes")
    public String getReleaseNotes() {
        return releaseNotes;
    }

    @JsonProperty("releaseNotes")
    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public ListDto withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }

    @JsonProperty("passport")
    public PassportDto getPassport() {
        return passport;
    }

    @JsonProperty("passport")
    public void setPassport(PassportDto passport) {
        this.passport = passport;
    }

    public ListDto withPassport(PassportDto passport) {
        this.passport = passport;
        return this;
    }

    @JsonProperty("archive")
    public Boolean getArchive() {
        return archive;
    }

    @JsonProperty("archive")
    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public ListDto withArchive(Boolean archive) {
        this.archive = archive;
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
        return new HashCodeBuilder().append(version).append(createDate).append(publishDate).append(lastUpdate).append(releaseNotes).append(passport).append(archive).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(version, rhs.version).append(createDate, rhs.createDate).append(publishDate, rhs.publishDate).append(lastUpdate, rhs.lastUpdate).append(releaseNotes, rhs.releaseNotes).append(passport, rhs.passport).append(archive, rhs.archive).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
