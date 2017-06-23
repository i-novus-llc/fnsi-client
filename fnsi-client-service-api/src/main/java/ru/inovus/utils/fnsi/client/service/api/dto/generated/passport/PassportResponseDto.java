
package ru.inovus.utils.fnsi.client.service.api.dto.generated.passport;

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
    "identifier",
    "oid",
    "version",
    "rowsCount",
    "createDate",
    "publishDate",
    "lastUpdate",
    "fullName",
    "shortName",
    "description",
    "structureNotes",
    "releaseNotes",
    "law",
    "respOrganizationId",
    "authOrganizationId",
    "typeId",
    "groupId",
    "approveDate",
    "fields",
    "keys",
    "codes",
    "archive",
    "hierarchical"
})
public class PassportResponseDto implements Serializable
{

    @JsonProperty("result")
    private String result;
    @JsonProperty("resultText")
    private String resultText;
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("oid")
    private String oid;
    @JsonProperty("version")
    private String version;
    @JsonProperty("rowsCount")
    private Integer rowsCount;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("publishDate")
    private String publishDate;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("structureNotes")
    private String structureNotes;
    @JsonProperty("releaseNotes")
    private String releaseNotes;
    @JsonProperty("law")
    private String law;
    @JsonProperty("respOrganizationId")
    private Integer respOrganizationId;
    @JsonProperty("authOrganizationId")
    private Integer authOrganizationId;
    @JsonProperty("typeId")
    private Integer typeId;
    @JsonProperty("groupId")
    private Integer groupId;
    @JsonProperty("approveDate")
    private String approveDate;
    @JsonProperty("fields")
    private List<FieldDto> fields = new ArrayList<FieldDto>();
    @JsonProperty("keys")
    private List<KeyDto> keys = new ArrayList<KeyDto>();
    @JsonProperty("codes")
    private List<CodeDto> codes = new ArrayList<CodeDto>();
    @JsonProperty("archive")
    private Boolean archive;
    @JsonProperty("hierarchical")
    private Boolean hierarchical;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8428412773917255036L;

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public PassportResponseDto withResult(String result) {
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

    public PassportResponseDto withResultText(String resultText) {
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

    public PassportResponseDto withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PassportResponseDto withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @JsonProperty("oid")
    public String getOid() {
        return oid;
    }

    @JsonProperty("oid")
    public void setOid(String oid) {
        this.oid = oid;
    }

    public PassportResponseDto withOid(String oid) {
        this.oid = oid;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public PassportResponseDto withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("rowsCount")
    public Integer getRowsCount() {
        return rowsCount;
    }

    @JsonProperty("rowsCount")
    public void setRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
    }

    public PassportResponseDto withRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
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

    public PassportResponseDto withCreateDate(String createDate) {
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

    public PassportResponseDto withPublishDate(String publishDate) {
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

    public PassportResponseDto withLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public PassportResponseDto withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public PassportResponseDto withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PassportResponseDto withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("structureNotes")
    public String getStructureNotes() {
        return structureNotes;
    }

    @JsonProperty("structureNotes")
    public void setStructureNotes(String structureNotes) {
        this.structureNotes = structureNotes;
    }

    public PassportResponseDto withStructureNotes(String structureNotes) {
        this.structureNotes = structureNotes;
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

    public PassportResponseDto withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }

    @JsonProperty("law")
    public String getLaw() {
        return law;
    }

    @JsonProperty("law")
    public void setLaw(String law) {
        this.law = law;
    }

    public PassportResponseDto withLaw(String law) {
        this.law = law;
        return this;
    }

    @JsonProperty("respOrganizationId")
    public Integer getRespOrganizationId() {
        return respOrganizationId;
    }

    @JsonProperty("respOrganizationId")
    public void setRespOrganizationId(Integer respOrganizationId) {
        this.respOrganizationId = respOrganizationId;
    }

    public PassportResponseDto withRespOrganizationId(Integer respOrganizationId) {
        this.respOrganizationId = respOrganizationId;
        return this;
    }

    @JsonProperty("authOrganizationId")
    public Integer getAuthOrganizationId() {
        return authOrganizationId;
    }

    @JsonProperty("authOrganizationId")
    public void setAuthOrganizationId(Integer authOrganizationId) {
        this.authOrganizationId = authOrganizationId;
    }

    public PassportResponseDto withAuthOrganizationId(Integer authOrganizationId) {
        this.authOrganizationId = authOrganizationId;
        return this;
    }

    @JsonProperty("typeId")
    public Integer getTypeId() {
        return typeId;
    }

    @JsonProperty("typeId")
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public PassportResponseDto withTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    @JsonProperty("groupId")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("groupId")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public PassportResponseDto withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    @JsonProperty("approveDate")
    public String getApproveDate() {
        return approveDate;
    }

    @JsonProperty("approveDate")
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public PassportResponseDto withApproveDate(String approveDate) {
        this.approveDate = approveDate;
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

    public PassportResponseDto withFields(List<FieldDto> fields) {
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

    public PassportResponseDto withKeys(List<KeyDto> keys) {
        this.keys = keys;
        return this;
    }

    @JsonProperty("codes")
    public List<CodeDto> getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(List<CodeDto> codes) {
        this.codes = codes;
    }

    public PassportResponseDto withCodes(List<CodeDto> codes) {
        this.codes = codes;
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

    public PassportResponseDto withArchive(Boolean archive) {
        this.archive = archive;
        return this;
    }

    @JsonProperty("hierarchical")
    public Boolean getHierarchical() {
        return hierarchical;
    }

    @JsonProperty("hierarchical")
    public void setHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public PassportResponseDto withHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
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

    public PassportResponseDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(result).append(resultText).append(resultCode).append(identifier).append(oid).append(version).append(rowsCount).append(createDate).append(publishDate).append(lastUpdate).append(fullName).append(shortName).append(description).append(structureNotes).append(releaseNotes).append(law).append(respOrganizationId).append(authOrganizationId).append(typeId).append(groupId).append(approveDate).append(fields).append(keys).append(codes).append(archive).append(hierarchical).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassportResponseDto) == false) {
            return false;
        }
        PassportResponseDto rhs = ((PassportResponseDto) other);
        return new EqualsBuilder().append(result, rhs.result).append(resultText, rhs.resultText).append(resultCode, rhs.resultCode).append(identifier, rhs.identifier).append(oid, rhs.oid).append(version, rhs.version).append(rowsCount, rhs.rowsCount).append(createDate, rhs.createDate).append(publishDate, rhs.publishDate).append(lastUpdate, rhs.lastUpdate).append(fullName, rhs.fullName).append(shortName, rhs.shortName).append(description, rhs.description).append(structureNotes, rhs.structureNotes).append(releaseNotes, rhs.releaseNotes).append(law, rhs.law).append(respOrganizationId, rhs.respOrganizationId).append(authOrganizationId, rhs.authOrganizationId).append(typeId, rhs.typeId).append(groupId, rhs.groupId).append(approveDate, rhs.approveDate).append(fields, rhs.fields).append(keys, rhs.keys).append(codes, rhs.codes).append(archive, rhs.archive).append(hierarchical, rhs.hierarchical).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
