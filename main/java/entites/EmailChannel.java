/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import entites.visitor.ChannelVisitor;

public class EmailChannel extends Channel {
    private String email;
    private String subject;


    public EmailChannel(String content, String email, String subject) {
        super(content);
        this.email = email;
        this.subject = subject;
    }

    @Override
    public <T> T accept(ChannelVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

}
