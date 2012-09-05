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
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * A location of a maritime information message
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MaritimeInformationMessageLocation {

	private String subArea;
	private String label;
	private String details;
	private List<MaritimeMainArea> mainAreas = new ArrayList<MaritimeMainArea>();
	private List<MaritimeInformationMessagePosition> positions = new ArrayList<MaritimeInformationMessagePosition>();
	@XmlAttribute(required = true)
	private MaritimeInformationMessageLocationType type;

	// TODO optional references to ENC elements (does these elements have a
	// unique id?)

	public MaritimeInformationMessageLocation() {

	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<MaritimeMainArea> getMainAreas() {
		return mainAreas;
	}

	public void setMainAreas(List<MaritimeMainArea> mainAreas) {
		this.mainAreas = mainAreas;
	}

	public List<MaritimeInformationMessagePosition> getPositions() {
		return positions;
	}

	public void setPositions(List<MaritimeInformationMessagePosition> positions) {
		this.positions = positions;
	}

	public MaritimeInformationMessageLocationType getType() {
		return type;
	}

	public void setType(MaritimeInformationMessageLocationType type) {
		this.type = type;
	}

}
