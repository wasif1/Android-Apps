
package com.ny.times.Models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("abstract")
    private String mAbstract;
    @SerializedName("adx_keywords")
    private String mAdxKeywords;
    @SerializedName("asset_id")
    private String mAssetId;
    @SerializedName("byline")
    private String mByline;
    @SerializedName("column")
    private String mColumn;
    @SerializedName("des_facet")
    private List<String> mDesFacet;
    @SerializedName("eta_id")
    private String mEtaId;
    @SerializedName("geo_facet")
    private List<String> mGeoFacet;
    @SerializedName("id")
    private String mId;
    @SerializedName("media")
    private List<Medium> mMedia;
    @SerializedName("nytdsection")
    private String mNytdsection;
    @SerializedName("org_facet")
    private List<String> mOrgFacet;
    @SerializedName("per_facet")
    private List<String> mPerFacet;
    @SerializedName("published_date")
    private String mPublishedDate;
    @SerializedName("section")
    private String mSection;
    @SerializedName("source")
    private String mSource;
    @SerializedName("subsection")
    private String mSubsection;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("updated")
    private String mUpdated;
    @SerializedName("uri")
    private String mUri;
    @SerializedName("url")
    private String mUrl;

    public String getAbstract() {
        return mAbstract;
    }

    public void setAbstract(String abstracts) {
        mAbstract = abstracts;
    }

    public String getAdxKeywords() {
        return mAdxKeywords;
    }

    public void setAdxKeywords(String adxKeywords) {
        mAdxKeywords = adxKeywords;
    }

    public String getAssetId() {
        return mAssetId;
    }

    public void setAssetId(String assetId) {
        mAssetId = assetId;
    }

    public String getByline() {
        return mByline;
    }

    public void setByline(String byline) {
        mByline = byline;
    }

    public String getColumn() {
        return mColumn;
    }

    public void setColumn(String column) {
        mColumn = column;
    }

    public List<String> getDesFacet() {
        return mDesFacet;
    }

    public void setDesFacet(List<String> desFacet) {
        mDesFacet = desFacet;
    }

    public String getEtaId() {
        return mEtaId;
    }

    public void setEtaId(String etaId) {
        mEtaId = etaId;
    }

    public List<String> getGeoFacet() {
        return mGeoFacet;
    }

    public void setGeoFacet(List<String> geoFacet) {
        mGeoFacet = geoFacet;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public List<Medium> getMedia() {
        return mMedia;
    }

    public void setMedia(List<Medium> media) {
        mMedia = media;
    }

    public String getNytdsection() {
        return mNytdsection;
    }

    public void setNytdsection(String nytdsection) {
        mNytdsection = nytdsection;
    }

    public List<String> getOrgFacet() {
        return mOrgFacet;
    }

    public void setOrgFacet(List<String> orgFacet) {
        mOrgFacet = orgFacet;
    }

    public List<String> getPerFacet() {
        return mPerFacet;
    }

    public void setPerFacet(List<String> perFacet) {
        mPerFacet = perFacet;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        mPublishedDate = publishedDate;
    }

    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }

    public String getSource() {
        return mSource;
    }

    public void setSource(String source) {
        mSource = source;
    }

    public String getSubsection() {
        return mSubsection;
    }

    public void setSubsection(String subsection) {
        mSubsection = subsection;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUpdated() {
        return mUpdated;
    }

    public void setUpdated(String updated) {
        mUpdated = updated;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
