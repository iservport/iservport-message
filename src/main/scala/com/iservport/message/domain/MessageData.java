package com.iservport.message.domain;

public class MessageData {

    private String subject = "";

    private String title = "";

    private String procedure = "";

    private String callToAction = "";

    private String trailingInfo = "";

    public MessageData() {
    }

    public String getSubject() {
        return this.subject;
    }

    public String getTitle() {
        return this.title;
    }

    public String getProcedure() {
        return this.procedure;
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public String getTrailingInfo() {
        return this.trailingInfo;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public void setTrailingInfo(String trailingInfo) {
        this.trailingInfo = trailingInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageData)) return false;
        final MessageData other = (MessageData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$procedure = this.getProcedure();
        final Object other$procedure = other.getProcedure();
        if (this$procedure == null ? other$procedure != null : !this$procedure.equals(other$procedure)) return false;
        final Object this$callToAction = this.getCallToAction();
        final Object other$callToAction = other.getCallToAction();
        if (this$callToAction == null ? other$callToAction != null : !this$callToAction.equals(other$callToAction))
            return false;
        final Object this$trailingInfo = this.getTrailingInfo();
        final Object other$trailingInfo = other.getTrailingInfo();
        if (this$trailingInfo == null ? other$trailingInfo != null : !this$trailingInfo.equals(other$trailingInfo))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $procedure = this.getProcedure();
        result = result * PRIME + ($procedure == null ? 43 : $procedure.hashCode());
        final Object $callToAction = this.getCallToAction();
        result = result * PRIME + ($callToAction == null ? 43 : $callToAction.hashCode());
        final Object $trailingInfo = this.getTrailingInfo();
        result = result * PRIME + ($trailingInfo == null ? 43 : $trailingInfo.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MessageData;
    }

    public String toString() {
        return "com.iservport.message.domain.MessageData(subject=" + this.getSubject() + ", title=" + this.getTitle() + ", procedure=" + this.getProcedure() + ", callToAction=" + this.getCallToAction() + ", trailingInfo=" + this.getTrailingInfo() + ")";
    }
}
