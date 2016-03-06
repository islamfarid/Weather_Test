
package com.example.islam.weather.models.weather;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "timezone",
    "offset",
    "currently",
    "minutely",
    "hourly",
    "daily",
    "flags"
})
public class WeatherModel {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("offset")
    private Long offset;
    @JsonProperty("currently")
    private CurrentlyModel currentlyModel;
    @JsonProperty("minutely")
    private MinutelyModel minutelyModel;
    @JsonProperty("hourly")
    private HourlyModel hourlyModel;
    @JsonProperty("daily")
    private DailyModel dailyModel;
    @JsonProperty("flags")
    private FlagsModel flagsModel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The offset
     */
    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The currently
     */
    @JsonProperty("currently")
    public CurrentlyModel getCurrentlyModel() {
        return currentlyModel;
    }

    /**
     * 
     * @param currentlyModel
     *     The currently
     */
    @JsonProperty("currently")
    public void setCurrentlyModel(CurrentlyModel currentlyModel) {
        this.currentlyModel = currentlyModel;
    }

    /**
     * 
     * @return
     *     The minutely
     */
    @JsonProperty("minutely")
    public MinutelyModel getMinutelyModel() {
        return minutelyModel;
    }

    /**
     * 
     * @param minutelyModel
     *     The minutely
     */
    @JsonProperty("minutely")
    public void setMinutelyModel(MinutelyModel minutelyModel) {
        this.minutelyModel = minutelyModel;
    }

    /**
     * 
     * @return
     *     The hourly
     */
    @JsonProperty("hourly")
    public HourlyModel getHourlyModel() {
        return hourlyModel;
    }

    /**
     * 
     * @param hourlyModel
     *     The hourly
     */
    @JsonProperty("hourly")
    public void setHourlyModel(HourlyModel hourlyModel) {
        this.hourlyModel = hourlyModel;
    }

    /**
     * 
     * @return
     *     The daily
     */
    @JsonProperty("daily")
    public DailyModel getDailyModel() {
        return dailyModel;
    }

    /**
     * 
     * @param dailyModel
     *     The daily
     */
    @JsonProperty("daily")
    public void setDailyModel(DailyModel dailyModel) {
        this.dailyModel = dailyModel;
    }

    /**
     * 
     * @return
     *     The flags
     */
    @JsonProperty("flags")
    public FlagsModel getFlagsModel() {
        return flagsModel;
    }

    /**
     * 
     * @param flagsModel
     *     The flags
     */
    @JsonProperty("flags")
    public void setFlagsModel(FlagsModel flagsModel) {
        this.flagsModel = flagsModel;
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
