/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.marinf.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dk.dma.marinf.exchange.MaritimeInformationBundle;
import dk.dma.marinf.exchange.response.MaritimeInformationResponse;
import dk.dma.marinf.message.MaritimeInformationMessage;
import dk.dma.marinf.message.MsiMessage;
import dk.dma.marinf.message.NoticeMessage;

/**
 * Testing of response class
 */
public class ResponseTest {
	
	private Date sentDate;
	
	@Before
	public void init() {
		sentDate = new Date(1343214765519L);
	}

	@Test
	public void simpleEncode() throws JAXBException {
		// Make an MsiMessage
		MsiMessage msiMessage = new MsiMessage();
		msiMessage.setUid("SOME_MSI");
		// Make a NoticeMessage
		NoticeMessage noticeMessage = new NoticeMessage();
		noticeMessage.setUid("SOME_NOTICE");
		
		// Make a bundle of messages and add messages
		MaritimeInformationBundle bundle = new MaritimeInformationBundle();
		bundle.addMessage(msiMessage);
		bundle.addMessage(noticeMessage);

		// Make a response and add bundle
		MaritimeInformationResponse response = new MaritimeInformationResponse();
		System.out.println("Using sendDate: " + sentDate);
		response.setSendDate(sentDate);
		response.setBundle(bundle);

		// Marshall to XML
		JAXBContext jaxbContext = JAXBContext.newInstance(MaritimeInformationResponse.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

		File file = new File("xml/response_example.xml");
		jaxbMarshaller.marshal(response, file);
		jaxbMarshaller.marshal(response, System.out);

	}

	@Test
	public void simpleDecode() throws JAXBException {
		// Unmarshall 
		File file = new File("xml/response_example.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(MaritimeInformationResponse.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		MaritimeInformationResponse response = (MaritimeInformationResponse) jaxbUnmarshaller.unmarshal(file);
		
		Assert.assertEquals(sentDate.getTime(), response.getSendDate().getTime());
		
		MaritimeInformationBundle bundle = response.getBundle();
		for (MaritimeInformationMessage message : bundle.getMessages()) {
			if (message instanceof MsiMessage) {
				Assert.assertTrue(((MsiMessage)message).getUid().equals("SOME_MSI"));
			}
			if (message instanceof NoticeMessage) {
				Assert.assertTrue(((NoticeMessage)message).getUid().equals("SOME_NOTICE"));
			}
		}

	}

}
