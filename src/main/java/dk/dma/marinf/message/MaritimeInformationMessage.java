/* Copyright (c) 2012 Danish Maritime Authority
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
package dk.dma.marinf.message;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Base abstract class for maritime information messages
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class MaritimeInformationMessage {

	@XmlAttribute(required = true)
	protected String uid;	
	@XmlAttribute(required = true)
	protected int version;	
	@XmlAttribute(required = true)
	protected String refNo;
	@XmlAttribute(required = true)
	protected MaritimeInformationMessageStatus status;
	@XmlAttribute(required = true)
	protected String text;
	protected String localText;	
	protected Date validFrom;	
	protected Date validTo;
	protected Set<MaritimeInformationMessageSource> sources = new HashSet<MaritimeInformationMessageSource>();
	protected MaritimeInformationMessagePublisher publisher;
	protected List<String> charts = new ArrayList<String>();	
	protected Date updated;	
	protected Date cancelled;	
	@XmlAttribute(required = true)
	protected Date created;
	protected List<MaritimeInformationMessage> references = new ArrayList<MaritimeInformationMessage>();
	protected List<MaritimeInformationMessageLocation> locations = new ArrayList<MaritimeInformationMessageLocation>();
	
	public MaritimeInformationMessage() {
		
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLocalText() {
		return localText;
	}

	public void setLocalText(String localText) {
		this.localText = localText;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public List<String> getCharts() {
		return charts;
	}

	public void setCharts(List<String> charts) {
		this.charts = charts;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getCancelled() {
		return cancelled;
	}

	public void setCancelled(Date cancelled) {
		this.cancelled = cancelled;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public List<MaritimeInformationMessage> getReferences() {
		return references;
	}
	
	public void setReferences(List<MaritimeInformationMessage> references) {
		this.references = references;
	}
	
	public MaritimeInformationMessageStatus getStatus() {
		return status;
	}
	
	public void setStatus(MaritimeInformationMessageStatus status) {
		this.status = status;
	}
	
	public Set<MaritimeInformationMessageSource> getSources() {
		return sources;
	}

	public void setSources(Set<MaritimeInformationMessageSource> sources) {
		this.sources = sources;
	}

	public MaritimeInformationMessagePublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(MaritimeInformationMessagePublisher publisher) {
		this.publisher = publisher;
	}

	public List<MaritimeInformationMessageLocation> getLocations() {
		return locations;
	}
	
	public void setLocations(List<MaritimeInformationMessageLocation> locations) {
		this.locations = locations;
	}
	
}
