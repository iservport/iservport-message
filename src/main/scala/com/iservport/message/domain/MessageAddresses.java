package com.iservport.message.domain;

public class MessageAddresses {

    private ContactData sender;

    private ContactData recipient;

    public MessageAddresses() {
        super();
    }

    public MessageAddresses(ContactData sender) {
        this();
        setSender(sender);
    }

    public MessageAddresses(ContactData sender, ContactData recipient) {
        this(sender);
        setRecipient(recipient);
    }

    public ContactData getSender() {
        return this.sender;
    }

    public ContactData getRecipient() {
        return this.recipient;
    }

    public void setSender(ContactData sender) {
        this.sender = sender;
    }

    public void setRecipient(ContactData recipient) {
        this.recipient = recipient;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageAddresses)) return false;
        final MessageAddresses other = (MessageAddresses) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sender = this.getSender();
        final Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final Object this$recipient = this.getRecipient();
        final Object other$recipient = other.getRecipient();
        if (this$recipient == null ? other$recipient != null : !this$recipient.equals(other$recipient)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final Object $recipient = this.getRecipient();
        result = result * PRIME + ($recipient == null ? 43 : $recipient.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MessageAddresses;
    }

    public String toString() {
        return "com.iservport.agro.MailAddresses(sender=" + this.getSender() + ", recipient=" + this.getRecipient() + ")";
    }
}
