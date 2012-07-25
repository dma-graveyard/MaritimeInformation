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
package dk.dma.marinf.exchange.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import dk.dma.marinf.exchange.MaritimeInformationBundle;
import dk.dma.marinf.message.MsiMessage;
import dk.dma.marinf.message.NoticeMessage;

/**
 * A response containing a bundle of maritime information messages
 */

@XmlRootElement
@XmlSeeAlso({MsiMessage.class, NoticeMessage.class})
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
