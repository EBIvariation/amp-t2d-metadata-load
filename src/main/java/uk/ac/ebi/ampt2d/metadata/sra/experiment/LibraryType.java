/*
 *
 * Copyright 2018 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package uk.ac.ebi.ampt2d.metadata.sra.experiment;

import uk.ac.ebi.ampt2d.metadata.sra.common.SpotDescriptorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESIGN_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAMPLE_DESCRIPTOR" type="{}SampleDescriptorType"/>
 *         &lt;element name="LIBRARY_DESCRIPTOR" type="{}LibraryDescriptorType"/>
 *         &lt;element name="SPOT_DESCRIPTOR" type="{SRA.common}SpotDescriptorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryType", propOrder = {
    "designdescription",
    "sampledescriptor",
    "librarydescriptor",
    "spotdescriptor"
})
public class LibraryType {

    @XmlElement(name = "DESIGN_DESCRIPTION", required = true)
    protected String designdescription;
    @XmlElement(name = "SAMPLE_DESCRIPTOR", required = true)
    protected SampleDescriptorType sampledescriptor;
    @XmlElement(name = "LIBRARY_DESCRIPTOR", required = true)
    protected LibraryDescriptorType librarydescriptor;
    @XmlElement(name = "SPOT_DESCRIPTOR")
    protected SpotDescriptorType spotdescriptor;

    /**
     * Gets the value of the designdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESIGNDESCRIPTION() {
        return designdescription;
    }

    /**
     * Sets the value of the designdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESIGNDESCRIPTION(String value) {
        this.designdescription = value;
    }

    /**
     * Gets the value of the sampledescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SampleDescriptorType }
     *     
     */
    public SampleDescriptorType getSAMPLEDESCRIPTOR() {
        return sampledescriptor;
    }

    /**
     * Sets the value of the sampledescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleDescriptorType }
     *     
     */
    public void setSAMPLEDESCRIPTOR(SampleDescriptorType value) {
        this.sampledescriptor = value;
    }

    /**
     * Gets the value of the librarydescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType }
     *     
     */
    public LibraryDescriptorType getLIBRARYDESCRIPTOR() {
        return librarydescriptor;
    }

    /**
     * Sets the value of the librarydescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType }
     *     
     */
    public void setLIBRARYDESCRIPTOR(LibraryDescriptorType value) {
        this.librarydescriptor = value;
    }

    /**
     * Gets the value of the spotdescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SpotDescriptorType }
     *     
     */
    public SpotDescriptorType getSPOTDESCRIPTOR() {
        return spotdescriptor;
    }

    /**
     * Sets the value of the spotdescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotDescriptorType }
     *     
     */
    public void setSPOTDESCRIPTOR(SpotDescriptorType value) {
        this.spotdescriptor = value;
    }

}
