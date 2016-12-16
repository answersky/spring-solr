package com.java.domain;

import org.apache.solr.client.solrj.beans.Field;

/**
 * Created by liuf on 2016/12/16.
 */
public class SolrResult {
    @Field("id")
    private String id;
    @Field("chineseName")
    private String chineseName;
    @Field("parentId")
    private String parentId;
    @Field("isValid")
    private String isValid;
    @Field("englishName")
    private String englishName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public String toString() {
        return "SolrResult{" +
                "id=" + id +
                ", chineseName='" + chineseName + '\'' +
                ", parentId=" + parentId +
                ", isValid='" + isValid + '\'' +
                ", englishName='" + englishName + '\'' +
                '}';
    }
}
