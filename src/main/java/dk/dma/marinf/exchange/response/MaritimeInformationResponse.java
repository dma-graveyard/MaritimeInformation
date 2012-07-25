package dk.dma.marinf.exchange.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import dk.dma.marinf.exchange.MaritimeInformationBundle;

@XmlRootElement
public class MaritimeInformationResponse {

	private Date sendDate;
	private MaritimeInformationBundle bundle;
	
	public MaritimeInformationResponse() {
		
	}
	
	public Date getSendDate() {
		return sendDate;
	}
	
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	public MaritimeInformationBundle getBundle() {
		return bundle;
	}
	
	public void setBundle(MaritimeInformationBundle bundle) {
		this.bundle = bundle;
	}	

}
