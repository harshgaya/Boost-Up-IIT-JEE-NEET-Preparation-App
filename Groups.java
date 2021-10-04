package com.harsh.jeephysics;

public class Groups {

    public String groupImage,groupName,groupLastMessage,groupLastMessageTime;

    public Groups()
    {

    }

    public Groups(String groupImage, String groupName, String groupLastMessage, String groupLastMessageTime) {
        this.groupImage = groupImage;
        this.groupName = groupName;
        this.groupLastMessage = groupLastMessage;
        this.groupLastMessageTime = groupLastMessageTime;
    }

    public String getGroupImage() {
        return groupImage;
    }

    public void setGroupImage(String groupImage) {
        this.groupImage = groupImage;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupLastMessage() {
        return groupLastMessage;
    }

    public void setGroupLastMessage(String groupLastMessage) {
        this.groupLastMessage = groupLastMessage;
    }

    public String getGroupLastMessageTime() {
        return groupLastMessageTime;
    }

    public void setGroupLastMessageTime(String groupLastMessageTime) {
        this.groupLastMessageTime = groupLastMessageTime;
    }
}

