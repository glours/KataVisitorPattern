package services;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import dto.ChannelDTO;
import entites.*;

/**
 * Created by guillaumelours on 9/24/15.
 */
public class MessageServiceTest {

    public static final String CONTENT = "Blablah";
    public static final String EMAIL = "john@doe.com";
    public static final String SUBJECT = "subject";
    public static final String PHONE = "0101010101";
    private MessageService service;

    @Before
    public void setUp() throws Exception {
        service = new MessageService();
    }

    @Test
    public void should_transform_EmailChannel_to_ChannelDTO() {
        /* Given */
        Channel channel = new EmailChannel(CONTENT, EMAIL,SUBJECT);
        Message message = new Message(channel);

        /* When */
        ChannelDTO dto = service.createChannelDTO(message);

        /* Then */
        commonAssertions(dto, ChannelType.MAIL);
        assertThat(dto.getEmail()).isNotEmpty().isEqualTo(EMAIL);
        assertThat(dto.getSubject()).isEqualTo(SUBJECT);
        assertThat(dto.getPhone()).isNullOrEmpty();
    }

    @Test
    public void should_transform_FaxChannel_to_ChannelDTO() {
            /* Given */
        Channel channel = new FaxChannel(CONTENT, PHONE);
        Message message = new Message(channel);

            /* When */
        ChannelDTO dto = service.createChannelDTO(message);
            /* Then */
        commonAssertions(dto, ChannelType.FAX);
        assertThat(dto.getPhone()).isNotEmpty().isEqualTo(PHONE);
        assertThat(dto.getEmail()).isNullOrEmpty();

    }


    private void commonAssertions(ChannelDTO dto, ChannelType fax) {
        assertThat(dto.getType()).isEqualTo(fax);
        assertThat(dto.getContent()).isEqualTo(CONTENT);
    }
}