package com.example.AzureIotSwitchIntegration.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class DeviceTelemetry extends TableServiceEntity {
    public DeviceTelemetry(String deviceId, String data) {
        this.partitionKey = deviceId;
        this.rowKey = data;
    }

    public DeviceTelemetry() { }

    String Partition;
    String Data;
    public String getPartition() {
		return Partition;
	}

	public void setPartition(String partition) {
		Partition = partition;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	

}

