package services;/*
 * Copyright (C) by Guillaume Lours, All Rights Reserved.
 */

import dto.ChannelDTO;
import entites.Message;

public class MessageService {

    public ChannelDTO createChannelDTO(Message message) {
        return message.getChannel().toChannelDTO();
    }
}
