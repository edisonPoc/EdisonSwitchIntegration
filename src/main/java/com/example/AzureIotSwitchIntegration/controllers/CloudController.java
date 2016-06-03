package com.example.AzureIotSwitchIntegration.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.AzureIotSwitchIntegration.service.CloudService;
import com.google.gson.Gson;

@Controller
public class CloudController {
	private final static Logger LOGGER = Logger.getLogger(CloudController.class.getName());

	@Autowired
	CloudService cloudService;

	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value ="/goToDashboard",method = RequestMethod.POST)
    public String goToDashboard() {
        return "dashboard";
    }
	
	@ResponseBody
	@RequestMapping(value = "/sendCommand", method = RequestMethod.POST)
	public void sendCommand(@RequestParam("deviceStatus") String data, @RequestParam("deviceId") String deviceId,
			@RequestParam("gladiusChildFlag") boolean gladiusChildFlag) throws Exception {
		LOGGER.info("Sending data to Azure IOT Hub");
		cloudService.sendCommandToDevice(data, deviceId, gladiusChildFlag);
	}

	@RequestMapping(value = "/getDeviceList", method = RequestMethod.GET)
	public ModelAndView getDeviceList() throws Exception {
		ModelAndView model = new ModelAndView();
		LOGGER.info("Getting list of devices running on the Azure IOT Hub");
		List<Object> deviceList = cloudService.getAllDevices();
		HashMap<String, String> devices = (HashMap<String, String>) deviceList.get(0);
		HashMap<String, String> gladiusChildDevices = (HashMap<String, String>) deviceList.get(1);
		LOGGER.info("size of devices is "+devices.size());
		model.addObject("devices", devices);
		model.addObject("gladiusChildDevices", gladiusChildDevices);
		model.setViewName("switchControl");
		return model;
	}

	@ResponseBody
	@RequestMapping(value = "/showActivity", method = RequestMethod.GET)
	public String showActivity(@RequestParam("deviceId") String deviceId) throws Exception {
		LOGGER.info("Getting list of device activity");
		JSONArray deviceData = cloudService.getDeviceActivity(deviceId);
		String json = new Gson().toJson(deviceData);
		return json;
	}
}