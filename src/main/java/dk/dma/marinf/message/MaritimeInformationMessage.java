package dk.dma.marinf.message;

public abstract class MaritimeInformationMessage {
	
	protected String uid;
	
	public MaritimeInformationMessage() {
		
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}

}
