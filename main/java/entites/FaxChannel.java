/**
 * Created by guillaumelours on 9/21/15.
 */
package entites;

import dto.ChannelDTO;

public class FaxChannel extends Channel {

    private String faxNumber;

    public FaxChannel(String content, String faxNumber) {
        super(content);
        this.faxNumber = faxNumber;
    }

    public String getFaxNumber() { return faxNumber; }

    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }

    @Override
    public ChannelDTO toChannelDTO() {
        ChannelDTO dto = new ChannelDTO(ChannelType.FAX, this.getContent());
        dto.setPhone(this.faxNumber);
        return dto;
    }
}
