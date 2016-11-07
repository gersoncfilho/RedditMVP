package gersondeveloper.com.br.redditmvp.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gerso on 03/11/2016.
 */

public class Post implements Parcelable {



    private boolean contest_mode;
    private String banned_by;
    private String domain;
    private String subreddit;
    private String selftext_html;
    private String selftext;
    private String likes;
    private String suggested_sort;
    //private String[] user_reports;
    private String secure_media;
    private boolean saved;
    private String id;
    private int gilded;
    //private String[] secure_media_embed;
    private boolean clicked;
    private String report_reasons;
    private String author;
    private String media;
    private String name;
    private int score;
    private String approved_by;
    private boolean over_18;
    private String removal_reason;
    private boolean hidden;

    public boolean isContest_mode() {
        return contest_mode;
    }

    public void setContest_mode(boolean contest_mode) {
        this.contest_mode = contest_mode;
    }

    public String getBanned_by() {
        return banned_by;
    }

    public void setBanned_by(String banned_by) {
        this.banned_by = banned_by;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSelftext_html() {
        return selftext_html;
    }

    public void setSelftext_html(String selftext_html) {
        this.selftext_html = selftext_html;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getSuggested_sort() {
        return suggested_sort;
    }

    public void setSuggested_sort(String suggested_sort) {
        this.suggested_sort = suggested_sort;
    }

    /*public String[] getUser_reports() {
        return user_reports;
    }

    public void setUser_reports(String[] user_reports) {
        this.user_reports = user_reports;
    }*/

    public String getSecure_media() {
        return secure_media;
    }

    public void setSecure_media(String secure_media) {
        this.secure_media = secure_media;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    /*public String[] getSecure_media_embed() {
        return secure_media_embed;
    }

    public void setSecure_media_embed(String[] secure_media_embed) {
        this.secure_media_embed = secure_media_embed;
    }*/

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String getReport_reasons() {
        return report_reasons;
    }

    public void setReport_reasons(String report_reasons) {
        this.report_reasons = report_reasons;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(String approved_by) {
        this.approved_by = approved_by;
    }

    public boolean isOver_18() {
        return over_18;
    }

    public void setOver_18(boolean over_18) {
        this.over_18 = over_18;
    }

    public String getRemoval_reason() {
        return removal_reason;
    }

    public void setRemoval_reason(String removal_reason) {
        this.removal_reason = removal_reason;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    //Constructor

    public Post()
    {

    }

    public Post(boolean contest_mode,
                String banned_by,
                String domain,
                String subreddit,
                String selftext_html,
                String selftext,
                String likes,
                String suggested_sort,
                String secure_media,
                boolean saved,
                String id,
                int gilded,
                boolean clicked,
                String report_reasons,
                String author,
                String media,
                String name,
                int score,
                String approved_by,
                boolean over_18,
                String removal_reason,
                boolean hidden) {
        this.contest_mode = contest_mode;
        this.banned_by = banned_by;
        this.domain = domain;
        this.subreddit = subreddit;
        this.selftext_html = selftext_html;
        this.selftext = selftext;
        this.likes = likes;
        this.suggested_sort = suggested_sort;
        //this.user_reports = user_reports;
        this.secure_media = secure_media;
        this.saved = saved;
        this.id = id;
        this.gilded = gilded;
        //this.secure_media_embed = secure_media_embed;
        this.clicked = clicked;
        this.report_reasons = report_reasons;
        this.author = author;
        this.media = media;
        this.name = name;
        this.score = score;
        this.approved_by = approved_by;
        this.over_18 = over_18;
        this.removal_reason = removal_reason;
        this.hidden = hidden;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.contest_mode ? (byte) 1 : (byte) 0);
        dest.writeString(this.banned_by);
        dest.writeString(this.domain);
        dest.writeString(this.subreddit);
        dest.writeString(this.selftext_html);
        dest.writeString(this.selftext);
        dest.writeString(this.likes);
        dest.writeString(this.suggested_sort);
        //dest.writeStringArray(this.user_reports);
        dest.writeString(this.secure_media);
        dest.writeByte(this.saved ? (byte) 1 : (byte) 0);
        dest.writeString(this.id);
        dest.writeInt(this.gilded);
        //dest.writeStringArray(this.secure_media_embed);
        dest.writeByte(this.clicked ? (byte) 1 : (byte) 0);
        dest.writeString(this.report_reasons);
        dest.writeString(this.author);
        dest.writeString(this.media);
        dest.writeString(this.name);
        dest.writeInt(this.score);
        dest.writeString(this.approved_by);
        dest.writeByte(this.over_18 ? (byte) 1 : (byte) 0);
        dest.writeString(this.removal_reason);
        dest.writeByte(this.hidden ? (byte) 1 : (byte) 0);
    }

    protected Post(Parcel in) {
        this.contest_mode = in.readByte() != 0;
        this.banned_by = in.readString();
        this.domain = in.readString();
        this.subreddit = in.readString();
        this.selftext_html = in.readString();
        this.selftext = in.readString();
        this.likes = in.readString();
        this.suggested_sort = in.readString();
        //this.user_reports = in.createStringArray();
        this.secure_media = in.readString();
        this.saved = in.readByte() != 0;
        this.id = in.readString();
        this.gilded = in.readInt();
        //this.secure_media_embed = in.createStringArray();
        this.clicked = in.readByte() != 0;
        this.report_reasons = in.readString();
        this.author = in.readString();
        this.media = in.readString();
        this.name = in.readString();
        this.score = in.readInt();
        this.approved_by = in.readString();
        this.over_18 = in.readByte() != 0;
        this.removal_reason = in.readString();
        this.hidden = in.readByte() != 0;
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel source) {
            return new Post(source);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };
}
