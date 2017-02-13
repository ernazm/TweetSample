package com.ernazm.twittersample.datamodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class User implements Parcelable {

    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_background_tile")
    @Expose
    private boolean profileBackgroundTile;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("follow_request_sent")
    @Expose
    private boolean followRequestSent;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("is_translator")
    @Expose
    private boolean isTranslator;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("entities")
    @Expose
    private Entities entities;
    @SerializedName("default_profile")
    @Expose
    private boolean defaultProfile;
    @SerializedName("contributors_enabled")
    @Expose
    private boolean contributorsEnabled;
    @SerializedName("favourites_count")
    @Expose
    private long favouritesCount;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("utc_offset")
    @Expose
    private long utcOffset;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("profile_use_background_image")
    @Expose
    private boolean profileUseBackgroundImage;
    @SerializedName("listed_count")
    @Expose
    private long listedCount;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("followers_count")
    @Expose
    private long followersCount;
    @SerializedName("protected")
    @Expose
    private boolean _protected;
    @SerializedName("notifications")
    @Expose
    private Object notifications;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @SerializedName("verified")
    @Expose
    private boolean verified;
    @SerializedName("geo_enabled")
    @Expose
    private boolean geoEnabled;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("default_profile_image")
    @Expose
    private boolean defaultProfileImage;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("statuses_count")
    @Expose
    private long statusesCount;
    @SerializedName("friends_count")
    @Expose
    private long friendsCount;
    @SerializedName("following")
    @Expose
    private Object following;
    @SerializedName("show_all_inline_media")
    @Expose
    private boolean showAllInlineMedia;
    @SerializedName("screen_name")
    @Expose
    private String screenName;

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public boolean isIsTranslator() {
        return isTranslator;
    }

    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
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

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public long getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public long getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(long utcOffset) {
        this.utcOffset = utcOffset;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public long getListedCount() {
        return listedCount;
    }

    public void setListedCount(long listedCount) {
        this.listedCount = listedCount;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(long followersCount) {
        this.followersCount = followersCount;
    }

    public boolean isProtected() {
        return _protected;
    }

    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    public Object getNotifications() {
        return notifications;
    }

    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public long getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public long getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Object getFollowing() {
        return following;
    }

    public void setFollowing(Object following) {
        this.following = following;
    }

    public boolean isShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    public void setShowAllInlineMedia(boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public static class Entities implements Parcelable {

        @SerializedName("url")
        @Expose
        private Url_ url;
        @SerializedName("description")
        @Expose
        private Description description;

        public Url_ getUrl() {
            return url;
        }

        public void setUrl(Url_ url) {
            this.url = url;
        }

        public Description getDescription() {
            return description;
        }

        public void setDescription(Description description) {
            this.description = description;
        }

        public static class Url_ implements Parcelable {

            @SerializedName("urls")
            @Expose
            private List<Url> urls = null;

            public List<Url> getUrls() {
                return urls;
            }

            public void setUrls(List<Url> urls) {
                this.urls = urls;
            }

            protected Url_(Parcel in) {
                if (in.readByte() == 0x01) {
                    urls = new ArrayList<>();
                    in.readList(urls, Url.class.getClassLoader());
                } else {
                    urls = null;
                }
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                if (urls == null) {
                    dest.writeByte((byte) (0x00));
                } else {
                    dest.writeByte((byte) (0x01));
                    dest.writeList(urls);
                }
            }

            @SuppressWarnings("unused")
            public static final Parcelable.Creator<Url_> CREATOR = new Parcelable.Creator<Url_>() {
                @Override
                public Url_ createFromParcel(Parcel in) {
                    return new Url_(in);
                }

                @Override
                public Url_[] newArray(int size) {
                    return new Url_[size];
                }
            };
        }

        protected Entities(Parcel in) {
            url = (Url_) in.readValue(Url_.class.getClassLoader());
            description = (Description) in.readValue(Description.class.getClassLoader());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeValue(url);
            dest.writeValue(description);
        }

        @SuppressWarnings("unused")
        public static final Parcelable.Creator<Entities> CREATOR = new Parcelable.Creator<Entities>() {
            @Override
            public Entities createFromParcel(Parcel in) {
                return new Entities(in);
            }

            @Override
            public Entities[] newArray(int size) {
                return new Entities[size];
            }
        };
    }

    protected User(Parcel in) {
        profileSidebarFillColor = in.readString();
        profileSidebarBorderColor = in.readString();
        profileBackgroundTile = in.readByte() != 0x00;
        name = in.readString();
        profileImageUrl = in.readString();
        createdAt = in.readString();
        location = in.readString();
        followRequestSent = in.readByte() != 0x00;
        profileLinkColor = in.readString();
        isTranslator = in.readByte() != 0x00;
        idStr = in.readString();
        entities = (Entities) in.readValue(Entities.class.getClassLoader());
        defaultProfile = in.readByte() != 0x00;
        contributorsEnabled = in.readByte() != 0x00;
        favouritesCount = in.readLong();
        url = in.readString();
        profileImageUrlHttps = in.readString();
        utcOffset = in.readLong();
        id = in.readLong();
        profileUseBackgroundImage = in.readByte() != 0x00;
        listedCount = in.readLong();
        profileTextColor = in.readString();
        lang = in.readString();
        followersCount = in.readLong();
        _protected = in.readByte() != 0x00;
        notifications = (Object) in.readValue(Object.class.getClassLoader());
        profileBackgroundImageUrlHttps = in.readString();
        profileBackgroundColor = in.readString();
        verified = in.readByte() != 0x00;
        geoEnabled = in.readByte() != 0x00;
        timeZone = in.readString();
        description = in.readString();
        defaultProfileImage = in.readByte() != 0x00;
        profileBackgroundImageUrl = in.readString();
        statusesCount = in.readLong();
        friendsCount = in.readLong();
        following = (Object) in.readValue(Object.class.getClassLoader());
        showAllInlineMedia = in.readByte() != 0x00;
        screenName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(profileSidebarFillColor);
        dest.writeString(profileSidebarBorderColor);
        dest.writeByte((byte) (profileBackgroundTile ? 0x01 : 0x00));
        dest.writeString(name);
        dest.writeString(profileImageUrl);
        dest.writeString(createdAt);
        dest.writeString(location);
        dest.writeByte((byte) (followRequestSent ? 0x01 : 0x00));
        dest.writeString(profileLinkColor);
        dest.writeByte((byte) (isTranslator ? 0x01 : 0x00));
        dest.writeString(idStr);
        dest.writeValue(entities);
        dest.writeByte((byte) (defaultProfile ? 0x01 : 0x00));
        dest.writeByte((byte) (contributorsEnabled ? 0x01 : 0x00));
        dest.writeLong(favouritesCount);
        dest.writeString(url);
        dest.writeString(profileImageUrlHttps);
        dest.writeLong(utcOffset);
        dest.writeLong(id);
        dest.writeByte((byte) (profileUseBackgroundImage ? 0x01 : 0x00));
        dest.writeLong(listedCount);
        dest.writeString(profileTextColor);
        dest.writeString(lang);
        dest.writeLong(followersCount);
        dest.writeByte((byte) (_protected ? 0x01 : 0x00));
        dest.writeValue(notifications);
        dest.writeString(profileBackgroundImageUrlHttps);
        dest.writeString(profileBackgroundColor);
        dest.writeByte((byte) (verified ? 0x01 : 0x00));
        dest.writeByte((byte) (geoEnabled ? 0x01 : 0x00));
        dest.writeString(timeZone);
        dest.writeString(description);
        dest.writeByte((byte) (defaultProfileImage ? 0x01 : 0x00));
        dest.writeString(profileBackgroundImageUrl);
        dest.writeLong(statusesCount);
        dest.writeLong(friendsCount);
        dest.writeValue(following);
        dest.writeByte((byte) (showAllInlineMedia ? 0x01 : 0x00));
        dest.writeString(screenName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}