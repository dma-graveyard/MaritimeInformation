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
package dk.dma.marinf.exchange.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import dk.dma.marinf.geo.Surface;
import dk.dma.marinf.message.MaritimeMainArea;

/**
 * A request for maritime information messages
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MaritimeInformationRequest {
	
	private Date lastUpdate;
	private Set<String> sourceNames = new HashSet<String>();
	private Set<String> countries = new HashSet<String>();
	private Set<MaritimeMainArea> mainAreas = new HashSet<MaritimeMainArea>();
	private List<Surface> areas = new ArrayList<Surface>();
	
	public MaritimeInformationRequest() {
		
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set<String> getSourceNames() {
		return sourceNames;
	}

	public void setSourceNames(Set<String> sourceNames) {
		this.sourceNames = sourceNames;
	}

	public Set<String> getCountries() {
		return countries;
	}

	public void setCountries(Set<String> countries) {
		this.countries = countries;
	}

	public Set<MaritimeMainArea> getMainAreas() {
		return mainAreas;
	}

	public void setMainAreas(Set<MaritimeMainArea> mainAreas) {
		this.mainAreas = mainAreas;
	}

	public List<Surface> getAreas() {
		return areas;
	}

	public void setAreas(List<Surface> areas) {
		this.areas = areas;
	}
	
}
