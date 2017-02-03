package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by Jessica Qin on 2/2/2017.
 */
public class Message
{
    private String message;
    private String phoneNum;
    private String timeSent;

    public Message(String num, String msg)
    {
        phoneNum = num;
        message = msg;
    }
    public String getNum()
    {
        return phoneNum;
    }
    public String getMessage()
    {
        return message;
    }
    public void setSendTime()
    {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        timeSent = (dtf.format(now));
    }
    public String retrieveSendTime()
    {
        return timeSent;
    }

}
