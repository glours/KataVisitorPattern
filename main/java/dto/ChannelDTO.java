/**
 * Created by guillaumelours on 9/21/15.
 */
package dto;

import entites.ChannelType;

public class ChannelDTO {
    ChannelType type;
    String subject;
    String content;
    String email;
    String phone;

    public ChannelDTO() { }

    public ChannelDTO(ChannelType type, String content) {
        this.type = type;
        this.content = content;
    }

    public ChannelType getType() {
        return type;
    }

    public void setType(ChannelType type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
