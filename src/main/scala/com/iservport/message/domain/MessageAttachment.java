package com.iservport.message.domain;

public class MessageAttachment {

    private String content = "";

    private String filename = "";

    private String type = "";

    private String disposition = "";

    private String content_id = "";

    public MessageAttachment() {
    }

    public String getContent() {
        return this.content;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getType() {
        return this.type;
    }

    public String getDisposition() {
        return this.disposition;
    }

    public String getContent_id() {
        return this.content_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public MessageAttachment content(String content) {
        this.content = content;
        return this;
    }

    public MessageAttachment filename(String filename) {
        this.filename = filename;
        return this;
    }

    public MessageAttachment type(String type) {
        this.type = type;
        return this;
    }

    public MessageAttachment disposition(String disposition) {
        this.disposition = disposition;
        return this;
    }

    public MessageAttachment content_id(String content_id) {
        this.content_id = content_id;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageAttachment)) return false;
        final MessageAttachment other = (MessageAttachment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$filename = this.getFilename();
        final Object other$filename = other.getFilename();
        if (this$filename == null ? other$filename != null : !this$filename.equals(other$filename)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$disposition = this.getDisposition();
        final Object other$disposition = other.getDisposition();
        if (this$disposition == null ? other$disposition != null : !this$disposition.equals(other$disposition))
            return false;
        final Object this$content_id = this.getContent_id();
        final Object other$content_id = other.getContent_id();
        if (this$content_id == null ? other$content_id != null : !this$content_id.equals(other$content_id))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $filename = this.getFilename();
        result = result * PRIME + ($filename == null ? 43 : $filename.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $disposition = this.getDisposition();
        result = result * PRIME + ($disposition == null ? 43 : $disposition.hashCode());
        final Object $content_id = this.getContent_id();
        result = result * PRIME + ($content_id == null ? 43 : $content_id.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MessageAttachment;
    }

    public String toString() {
        return "com.iservport.message.domain.MessageAttachment(content=" + this.getContent() + ", filename=" + this.getFilename() + ", type=" + this.getType() + ", disposition=" + this.getDisposition() + ", content_id=" + this.getContent_id() + ")";
    }
}
