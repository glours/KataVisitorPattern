/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import java.time.LocalDateTime;

import entites.visitor.ChannelVisitor;

public abstract class Channel {
    private String content;
    private LocalDateTime validityDate;

    public Channel(String content) {
        this.content = content;
        this.validityDate = LocalDateTime.now().plusHours(1);
    }

    public abstract  <T> T accept(ChannelVisitor<T> visitor);

    public String getContent() {return content; }

    public void setContent(String content) { this.content = content; }

    public LocalDateTime getValidityDate() { return validityDate; }

    public void setValidityDate(LocalDateTime validityDate) { this.validityDate = validityDate; }

}
