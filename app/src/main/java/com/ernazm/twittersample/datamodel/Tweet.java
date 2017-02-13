
package com.ernazm.twittersample.datamodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tweet implements Parcelable {

    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("favorited")
    @Expose
    private boolean favorited;
    @SerializedName("truncated")
    @Expose
    private boolean truncated;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("entities")
    @Expose
    private Entities entities;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("retweet_count")
    @Expose
    private long retweetCount;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("retweeted")
    @Expose
    private boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    private boolean possiblySensitive;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }


    protected Tweet(Parcel in) {
        coordinates = (Object) in.readValue(Object.class.getClassLoader());
        favorited = in.readByte() != 0x00;
        truncated = in.readByte() != 0x00;
        createdAt = in.readString();
        idStr = in.readString();
        entities = (Entities) in.readValue(Entities.class.getClassLoader());
        inReplyToUserIdStr = in.readValue(Object.class.getClassLoader());
        contributors = in.readValue(Object.class.getClassLoader());
        text = in.readString();
        retweetCount = in.readLong();
        inReplyToStatusIdStr = in.readValue(Object.class.getClassLoader());
        id = in.readLong();
        geo = in.readValue(Object.class.getClassLoader());
        retweeted = in.readByte() != 0x00;
        possiblySensitive = in.readByte() != 0x00;
        inReplyToUserId = in.readValue(Object.class.getClassLoader());
        place = in.readValue(Object.class.getClassLoader());
        user = (User) in.readValue(User.class.getClassLoader());
        inReplyToScreenName = in.readValue(Object.class.getClassLoader());
        source = in.readString();
        inReplyToStatusId = in.readValue(Object.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(coordinates);
        dest.writeByte((byte) (favorited ? 0x01 : 0x00));
        dest.writeByte((byte) (truncated ? 0x01 : 0x00));
        dest.writeString(createdAt);
        dest.writeString(idStr);
        dest.writeValue(entities);
        dest.writeValue(inReplyToUserIdStr);
        dest.writeValue(contributors);
        dest.writeString(text);
        dest.writeLong(retweetCount);
        dest.writeValue(inReplyToStatusIdStr);
        dest.writeLong(id);
        dest.writeValue(geo);
        dest.writeByte((byte) (retweeted ? 0x01 : 0x00));
        dest.writeByte((byte) (possiblySensitive ? 0x01 : 0x00));
        dest.writeValue(inReplyToUserId);
        dest.writeValue(place);
        dest.writeValue(user);
        dest.writeValue(inReplyToScreenName);
        dest.writeString(source);
        dest.writeValue(inReplyToStatusId);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Tweet> CREATOR = new Parcelable.Creator<Tweet>() {
        @Override
        public Tweet createFromParcel(Parcel in) {
            return new Tweet(in);
        }

        @Override
        public Tweet[] newArray(int size) {
            return new Tweet[size];
        }
    };
}
