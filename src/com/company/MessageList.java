package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by Jessica Qin on 2/2/2017.
 */
public class MessageList
{
    public ArrayList messages;

    ArrayList<Message> msgList = new ArrayList<Message>();
    public MessageList(ArrayList al)
    {
        messages = al;
    }

    public void addTime(Message m, ArrayList a)
    {
        String time = m.retrieveSendTime();
        a.add(time);

    }
}
