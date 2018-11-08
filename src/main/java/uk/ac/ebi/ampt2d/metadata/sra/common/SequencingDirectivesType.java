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
package uk.ac.ebi.ampt2d.metadata.sra.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequencingDirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequencingDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SAMPLE_DEMUX_DIRECTIVE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="leave_as_pool"/>
 *               &lt;enumeration value="submitter_demultiplexed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequencingDirectivesType", namespace = "SRA.common", propOrder = {

})
public class SequencingDirectivesType {

    @XmlElement(name = "SAMPLE_DEMUX_DIRECTIVE")
    protected String sampledemuxdirective;

    /**
     * Gets the value of the sampledemuxdirective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMPLEDEMUXDIRECTIVE() {
        return sampledemuxdirective;
    }

    /**
     * Sets the value of the sampledemuxdirective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMPLEDEMUXDIRECTIVE(String value) {
        this.sampledemuxdirective = value;
    }

}
