package dk.dma.marinf.exchange;

import java.util.ArrayList;
import java.util.List;

import dk.dma.marinf.message.MaritimeInformationMessage;

public class MaritimeInformationBundle {
	
	private List<MaritimeInformationMessage> messages = new ArrayList<MaritimeInformationMessage>();
	
	public MaritimeInformationBundle() {		
	}
	
	public List<MaritimeInformationMessage> getMessages() {
		return messages;
	}
	
	public void addMessage(MaritimeInformationMessage message) {
		messages.add(message);
	}	

}
