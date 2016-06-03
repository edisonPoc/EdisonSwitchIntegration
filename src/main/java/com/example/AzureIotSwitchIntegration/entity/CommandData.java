package com.example.AzureIotSwitchIntegration.entity;

import java.util.HashMap;

import com.google.gson.Gson;

public class CommandData {
String Name;
String MessageId;
String CreatedTime;
String GladiusParameters;

HashMap<String,Object> Parameters;
public String serialize() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
public String getGladiusParameters() {
	return GladiusParameters;
}
public void setGladiusParameters(String gladiusParameters) {
	GladiusParameters = gladiusParameters;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMessageId() {
	return MessageId;
}
public void setMessageId(String messageId) {
	MessageId = messageId;
}
public String getCreatedTime() {
	return CreatedTime;
}
public void setCreatedTime(String createdTime) {
	CreatedTime = createdTime;
}
public HashMap<String, Object> getParameters() {
	return Parameters;
}
public void setParameters(HashMap<String, Object> parameters) {
	Parameters = parameters;
}
}
