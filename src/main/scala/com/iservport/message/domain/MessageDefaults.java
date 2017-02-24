package com.iservport.message.domain;

public class MessageDefaults {

    private String greeting = "Hello, ";

    private String apiHome = "https://localhost:8443";

    private String seeOnline = "See on-line";

    private String sentByText = "Sent by ";

    private String disclaimer = "&nbsp;";

    private String unsubscribeText = "&nbsp;";

    private String unsubscribeCaption = "&nbsp;";

    private String unsubscribeService = "unsubscribe";

    private String ensure = "&nbsp;";

    private String copyright = "&nbsp;";

    public MessageDefaults() {
    }


    public String getGreeting() {
        return this.greeting;
    }

    public String getApiHome() {
        return this.apiHome;
    }

    public String getSeeOnline() {
        return this.seeOnline;
    }

    public String getSentByText() {
        return this.sentByText;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public String getUnsubscribeText() {
        return this.unsubscribeText;
    }

    public String getUnsubscribeCaption() {
        return this.unsubscribeCaption;
    }

    public String getUnsubscribeService() {
        return this.unsubscribeService;
    }

    public String getEnsure() {
        return this.ensure;
    }

    public String getCopyright() {
        return this.copyright;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setApiHome(String apiHome) {
        this.apiHome = apiHome;
    }

    public void setSeeOnline(String seeOnline) {
        this.seeOnline = seeOnline;
    }

    public void setSentByText(String sentByText) {
        this.sentByText = sentByText;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public void setUnsubscribeText(String unsubscribeText) {
        this.unsubscribeText = unsubscribeText;
    }

    public void setUnsubscribeCaption(String unsubscribeCaption) {
        this.unsubscribeCaption = unsubscribeCaption;
    }

    public void setUnsubscribeService(String unsubscribeService) {
        this.unsubscribeService = unsubscribeService;
    }

    public void setEnsure(String ensure) {
        this.ensure = ensure;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageDefaults)) return false;
        final MessageDefaults other = (MessageDefaults) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$greeting = this.getGreeting();
        final Object other$greeting = other.getGreeting();
        if (this$greeting == null ? other$greeting != null : !this$greeting.equals(other$greeting)) return false;
        final Object this$apiHome = this.getApiHome();
        final Object other$apiHome = other.getApiHome();
        if (this$apiHome == null ? other$apiHome != null : !this$apiHome.equals(other$apiHome)) return false;
        final Object this$seeOnline = this.getSeeOnline();
        final Object other$seeOnline = other.getSeeOnline();
        if (this$seeOnline == null ? other$seeOnline != null : !this$seeOnline.equals(other$seeOnline)) return false;
        final Object this$sentByText = this.getSentByText();
        final Object other$sentByText = other.getSentByText();
        if (this$sentByText == null ? other$sentByText != null : !this$sentByText.equals(other$sentByText))
            return false;
        final Object this$disclaimer = this.getDisclaimer();
        final Object other$disclaimer = other.getDisclaimer();
        if (this$disclaimer == null ? other$disclaimer != null : !this$disclaimer.equals(other$disclaimer))
            return false;
        final Object this$unsubscribeText = this.getUnsubscribeText();
        final Object other$unsubscribeText = other.getUnsubscribeText();
        if (this$unsubscribeText == null ? other$unsubscribeText != null : !this$unsubscribeText.equals(other$unsubscribeText))
            return false;
        final Object this$unsubscribeCaption = this.getUnsubscribeCaption();
        final Object other$unsubscribeCaption = other.getUnsubscribeCaption();
        if (this$unsubscribeCaption == null ? other$unsubscribeCaption != null : !this$unsubscribeCaption.equals(other$unsubscribeCaption))
            return false;
        final Object this$unsubscribeService = this.getUnsubscribeService();
        final Object other$unsubscribeService = other.getUnsubscribeService();
        if (this$unsubscribeService == null ? other$unsubscribeService != null : !this$unsubscribeService.equals(other$unsubscribeService))
            return false;
        final Object this$ensure = this.getEnsure();
        final Object other$ensure = other.getEnsure();
        if (this$ensure == null ? other$ensure != null : !this$ensure.equals(other$ensure)) return false;
        final Object this$copyright = this.getCopyright();
        final Object other$copyright = other.getCopyright();
        if (this$copyright == null ? other$copyright != null : !this$copyright.equals(other$copyright)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $greeting = this.getGreeting();
        result = result * PRIME + ($greeting == null ? 43 : $greeting.hashCode());
        final Object $apiHome = this.getApiHome();
        result = result * PRIME + ($apiHome == null ? 43 : $apiHome.hashCode());
        final Object $seeOnline = this.getSeeOnline();
        result = result * PRIME + ($seeOnline == null ? 43 : $seeOnline.hashCode());
        final Object $sentByText = this.getSentByText();
        result = result * PRIME + ($sentByText == null ? 43 : $sentByText.hashCode());
        final Object $disclaimer = this.getDisclaimer();
        result = result * PRIME + ($disclaimer == null ? 43 : $disclaimer.hashCode());
        final Object $unsubscribeText = this.getUnsubscribeText();
        result = result * PRIME + ($unsubscribeText == null ? 43 : $unsubscribeText.hashCode());
        final Object $unsubscribeCaption = this.getUnsubscribeCaption();
        result = result * PRIME + ($unsubscribeCaption == null ? 43 : $unsubscribeCaption.hashCode());
        final Object $unsubscribeService = this.getUnsubscribeService();
        result = result * PRIME + ($unsubscribeService == null ? 43 : $unsubscribeService.hashCode());
        final Object $ensure = this.getEnsure();
        result = result * PRIME + ($ensure == null ? 43 : $ensure.hashCode());
        final Object $copyright = this.getCopyright();
        result = result * PRIME + ($copyright == null ? 43 : $copyright.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MessageDefaults;
    }

    public String toString() {
        return "com.iservport.message.domain.MessageDefaults(greeting=" + this.getGreeting() + ", apiHome=" + this.getApiHome() + ", seeOnline=" + this.getSeeOnline() + ", sentByText=" + this.getSentByText() + ", disclaimer=" + this.getDisclaimer() + ", unsubscribeText=" + this.getUnsubscribeText() + ", unsubscribeCaption=" + this.getUnsubscribeCaption() + ", unsubscribeService=" + this.getUnsubscribeService() + ", ensure=" + this.getEnsure() + ", copyright=" + this.getCopyright() + ")";
    }
}
