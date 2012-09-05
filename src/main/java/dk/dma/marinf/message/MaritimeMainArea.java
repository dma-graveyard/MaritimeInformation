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

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import dk.dma.marinf.geo.Surface;

/**
 * Class representing a maritime main area 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MaritimeMainArea {
	
	@XmlAttribute(required = true)
	private int id;
	@XmlAttribute(required = true)
	private String name;
	@XmlAttribute(required = true)
	private String description;
	private Set<String> country = new HashSet<String>();
	private Set<Surface> surfaces = new HashSet<Surface>();
	
	public MaritimeMainArea() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<String> getCountry() {
		return country;
	}

	public void setCountry(Set<String> country) {
		this.country = country;
	}
	
	public Set<Surface> getSurfaces() {
		return surfaces;
	}
	
	public void setSurfaces(Set<Surface> surfaces) {
		this.surfaces = surfaces;
	}
	
}
