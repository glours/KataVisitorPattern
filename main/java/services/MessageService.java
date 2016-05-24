package services;/*
 * Copyright (C) by Guillaume Lours, All Rights Reserved.
 */

import dto.ChannelDTO;
import entites.Message;
import entites.visitor.ChannelToChannelDTO;

public class MessageService {

    public ChannelDTO createChannelDTO(Message message) {
        return message.getChannel().accept(new ChannelToChannelDTO());
    }
}
