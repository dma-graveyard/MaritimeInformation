package dk.dma.marinf.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import dk.dma.marinf.exchange.MaritimeInformationBundle;
import dk.dma.marinf.exchange.response.MaritimeInformationResponse;
import dk.dma.marinf.message.MsiMessage;

public class EncodeTest {
	
	@Test
	public void simpleEncode() throws JAXBException {
		MsiMessage msiMessage = new MsiMessage();
		msiMessage.setUid("TEST_MESSAGE");
		
		MaritimeInformationBundle bundle = new MaritimeInformationBundle();
		bundle.addMessage(msiMessage);
		
		MaritimeInformationResponse response = new MaritimeInformationResponse();
		response.setSendDate(new Date());
		response.setBundle(bundle);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(MaritimeInformationResponse.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		
		File file = new File("xml/response_example.xml");		
		jaxbMarshaller.marshal(response, file);
		jaxbMarshaller.marshal(response, System.out);
		
		
	}

}
