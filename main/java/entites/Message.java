/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import java.time.LocalDateTime;

public class Message {
    private Channel channel;
    private LocalDateTime creationDate;
    private String user;

    public Message(Channel channel) {
        this.channel = channel;
        this.creationDate = LocalDateTime.now();
    }

    public Message(Channel channel, String user) {
        this(channel);
        this.user = user;
    }

    public Channel getChannel() { return channel; }

    public void setChannel(Channel channel) { this.channel = channel; }

    public LocalDateTime getCreationDate() { return creationDate; }

    public void setCreationDate(LocalDateTime creationDate) { this.creationDate = creationDate; }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; }
}
