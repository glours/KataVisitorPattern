/**
 * Created by guillaumelours on 9/24/15.
 */
package entites.visitor;

import dto.ChannelDTO;
import entites.*;

public class ChannelToChannelDTO implements ChannelVisitor<ChannelDTO> {

    @Override
    public ChannelDTO visit(EmailChannel emailChannel) {
        ChannelDTO dto = new ChannelDTO(ChannelType.MAIL, emailChannel.getContent());
        dto.setEmail(emailChannel.getEmail());
        dto.setSubject(emailChannel.getSubject());
        return dto;
    }

    @Override
    public ChannelDTO visit(FaxChannel faxChannel) {
        ChannelDTO dto = new ChannelDTO(ChannelType.FAX, faxChannel.getContent());
        dto.setPhone(faxChannel.getFaxNumber());
        return dto;
    }
}
