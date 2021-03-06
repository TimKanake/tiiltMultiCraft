package com.timkanake.multicraft;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.simple.JSONObject;


public class CommandsQueue {
	Queue<JSONObject> commandsQ = new ConcurrentLinkedQueue<JSONObject>();
	Queue<String> commands = new ConcurrentLinkedQueue<String>();
	private static CommandsQueue instance = null;
	
	public static CommandsQueue getInstance() {
		if(instance == null) {
			instance = new CommandsQueue();
		}
		return instance;
	}
}
