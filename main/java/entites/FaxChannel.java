/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import entites.visitor.ChannelVisitor;

public class FaxChannel extends Channel {

    private String faxNumber;

    public FaxChannel(String content, String faxNumber) {
        super(content);
        this.faxNumber = faxNumber;
    }

    @Override
    public <T> T accept(ChannelVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getFaxNumber() { return faxNumber; }

    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }

}
