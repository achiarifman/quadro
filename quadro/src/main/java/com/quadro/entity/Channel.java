package com.quadro.entity;

import com.quadro.enums.EPG_PROVIDERS;
import org.bson.types.ObjectId;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Achia.Rifman on 03/06/2014.
 */
@Entity("channels")
public class Channel {

    @Id
    @JsonProperty("id")
    ObjectId id;

    @JsonProperty("name")
    private String name;
    @JsonProperty("number")
    private String number;
    @JsonProperty("url")
    private String url;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("epgProvider")
    private String epgProvider;
    @JsonProperty("epgId")
    private String epgId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId(){
        return id.toString();
    }

    @JsonProperty("id")
    public void setId(ObjectId id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("epgProvider")
    public String getEpgProvider() {
        return epgProvider;
    }

    @JsonProperty("epgProvider")
    public void setEpgProvider(String epgProvider) {
        this.epgProvider = epgProvider;
    }

    @JsonProperty("epgId")
    public String getEpgId() {
        return epgId;
    }

    @JsonProperty("epgId")
    public void setEpgId(String epgId) {
        this.epgId = epgId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
