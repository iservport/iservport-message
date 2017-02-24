package com.iservport.message.domain;

public class ContactData {

    private String contactEmail = "";

    private String contactName = "";

    private String entityName = "nbsp";

    private String imageUrl = "nbsp";

    private String address = "nbsp";

    public ContactData() {
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getAddress() {
        return this.address;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ContactData)) return false;
        final ContactData other = (ContactData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contactEmail = this.getContactEmail();
        final Object other$contactEmail = other.getContactEmail();
        if (this$contactEmail == null ? other$contactEmail != null : !this$contactEmail.equals(other$contactEmail))
            return false;
        final Object this$contactName = this.getContactName();
        final Object other$contactName = other.getContactName();
        if (this$contactName == null ? other$contactName != null : !this$contactName.equals(other$contactName))
            return false;
        final Object this$entityName = this.getEntityName();
        final Object other$entityName = other.getEntityName();
        if (this$entityName == null ? other$entityName != null : !this$entityName.equals(other$entityName))
            return false;
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contactEmail = this.getContactEmail();
        result = result * PRIME + ($contactEmail == null ? 43 : $contactEmail.hashCode());
        final Object $contactName = this.getContactName();
        result = result * PRIME + ($contactName == null ? 43 : $contactName.hashCode());
        final Object $entityName = this.getEntityName();
        result = result * PRIME + ($entityName == null ? 43 : $entityName.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ContactData;
    }

    public String toString() {
        return "com.iservport.message.domain.ContactData(contactEmail=" + this.getContactEmail() + ", contactName=" + this.getContactName() + ", entityName=" + this.getEntityName() + ", imageUrl=" + this.getImageUrl() + ", address=" + this.getAddress() + ")";
    }
}
