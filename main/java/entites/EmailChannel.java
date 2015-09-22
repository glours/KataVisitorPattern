/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import dto.ChannelDTO;

public class EmailChannel extends Channel {
    private String email;
    private String subject;


    public EmailChannel(String content, String email, String subject) {
        super(content);
        this.email = email;
        this.subject = subject;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public ChannelDTO toChannelDTO() {
        ChannelDTO dto = new ChannelDTO(ChannelType.MAIL, this.getContent());
        dto.setSubject(this.subject);
        dto.setEmail(this.email);
        return dto;
    }
}
