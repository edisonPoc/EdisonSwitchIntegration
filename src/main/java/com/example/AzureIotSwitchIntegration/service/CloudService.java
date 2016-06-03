package com.example.AzureIotSwitchIntegration.service;

import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.util.List;

import org.json.simple.JSONArray;

import com.microsoft.azure.storage.StorageException;

public interface CloudService {

	// private static final IotHubServiceClientProtocol
	// iotHubServiceClientProtocol = IotHubServiceClientProtocol.AMQPS_WS;
	String storageConnectionString = "DefaultEndpointsProtocol=http;" + "AccountName=lediotsolution;"
			+ "AccountKey=4UmXKhpd+9VUL3usGRVj3hspk+oP85YIzxEiVwjWQNjzZLz7tfuNTAD+a3BuAReG0YLCJ7yjam/1Ywsw3TveXQ==";

	List<Object> getAllDevices() throws Exception;

	void sendCommandToDevice(String data, String deviceId, boolean gladiusChildFlag) throws Exception;

	JSONArray getDeviceActivity(String deviceId) throws InvalidKeyException, URISyntaxException, StorageException;

}