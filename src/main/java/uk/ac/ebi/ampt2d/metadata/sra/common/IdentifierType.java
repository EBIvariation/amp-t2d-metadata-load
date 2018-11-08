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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of record identifiers.
 * 
 * <p>Java class for IdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRIMARY_ID" type="{SRA.common}NameType" minOccurs="0"/>
 *         &lt;element name="SECONDARY_ID" type="{SRA.common}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXTERNAL_ID" type="{SRA.common}QualifiedNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SUBMITTER_ID" type="{SRA.common}QualifiedNameType" minOccurs="0"/>
 *         &lt;element name="UUID" type="{SRA.common}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", namespace = "SRA.common", propOrder = {
    "primaryid",
    "secondaryid",
    "externalid",
    "submitterid",
    "uuid"
})
public class IdentifierType {

    @XmlElement(name = "PRIMARY_ID")
    protected NameType primaryid;
    @XmlElement(name = "SECONDARY_ID")
    protected List<NameType> secondaryid;
    @XmlElement(name = "EXTERNAL_ID")
    protected List<QualifiedNameType> externalid;
    @XmlElement(name = "SUBMITTER_ID")
    protected QualifiedNameType submitterid;
    @XmlElement(name = "UUID")
    protected List<NameType> uuid;

    /**
     * Gets the value of the primaryid property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getPRIMARYID() {
        return primaryid;
    }

    /**
     * Sets the value of the primaryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setPRIMARYID(NameType value) {
        this.primaryid = value;
    }

    /**
     * Gets the value of the secondaryid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECONDARYID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getSECONDARYID() {
        if (secondaryid == null) {
            secondaryid = new ArrayList<NameType>();
        }
        return this.secondaryid;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedNameType }
     * 
     * 
     */
    public List<QualifiedNameType> getEXTERNALID() {
        if (externalid == null) {
            externalid = new ArrayList<QualifiedNameType>();
        }
        return this.externalid;
    }

    /**
     * Gets the value of the submitterid property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedNameType }
     *     
     */
    public QualifiedNameType getSUBMITTERID() {
        return submitterid;
    }

    /**
     * Sets the value of the submitterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedNameType }
     *     
     */
    public void setSUBMITTERID(QualifiedNameType value) {
        this.submitterid = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getUUID() {
        if (uuid == null) {
            uuid = new ArrayList<NameType>();
        }
        return this.uuid;
    }

}
