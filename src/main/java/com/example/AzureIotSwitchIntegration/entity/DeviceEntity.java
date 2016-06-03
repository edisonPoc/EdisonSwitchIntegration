package com.example.AzureIotSwitchIntegration.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class DeviceEntity extends TableServiceEntity {
    public DeviceEntity(String azureIotAccount,String deviceId) {
        this.partitionKey = azureIotAccount;
        this.rowKey = deviceId;
    }

    public DeviceEntity() { }

    String Type;
    String gatewayDeviceId;
    
    String gatewayParentId;
    

	String configuration;
	
    public String getGatewayDeviceId() {
		return gatewayDeviceId;
	}

	public void setGatewayDeviceId(String gatewayDeviceId) {
		this.gatewayDeviceId = gatewayDeviceId;
	}

	public String getGatewayParentId() {
		return gatewayParentId;
	}

	public void setGatewayParentId(String gatewayParentId) {
		this.gatewayParentId = gatewayParentId;
	}

	
    

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

}