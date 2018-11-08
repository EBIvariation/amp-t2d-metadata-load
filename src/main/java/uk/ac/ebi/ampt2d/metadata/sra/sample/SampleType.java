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
package uk.ac.ebi.ampt2d.metadata.sra.sample;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A Sample defines an isolate of sequenceable material upon which
 *         sequencing experiments can be based.  The Sample object may be a surrogate for taxonomy
 *         accession or an anonymized individual identifier.  Or, it may fully specify
 *         provenance and isolation method of the starting material.
 *       
 * 
 * <p>Java class for SampleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_NAME">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="display_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SAMPLE_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_ATTRIBUTE" type="{SRA.common}AttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType", propOrder = {
    "title",
    "samplename",
    "description",
    "samplelinks",
    "sampleattributes"
})
public class SampleType
    extends ObjectType
{

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "SAMPLE_NAME", required = true)
    protected SampleType.SAMPLENAME samplename;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "SAMPLE_LINKS")
    protected SampleType.SAMPLELINKS samplelinks;
    @XmlElement(name = "SAMPLE_ATTRIBUTES")
    protected SampleType.SAMPLEATTRIBUTES sampleattributes;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the samplename property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLENAME }
     *     
     */
    public SampleType.SAMPLENAME getSAMPLENAME() {
        return samplename;
    }

    /**
     * Sets the value of the samplename property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLENAME }
     *     
     */
    public void setSAMPLENAME(SampleType.SAMPLENAME value) {
        this.samplename = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the samplelinks property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLELINKS }
     *     
     */
    public SampleType.SAMPLELINKS getSAMPLELINKS() {
        return samplelinks;
    }

    /**
     * Sets the value of the samplelinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLELINKS }
     *     
     */
    public void setSAMPLELINKS(SampleType.SAMPLELINKS value) {
        this.samplelinks = value;
    }

    /**
     * Gets the value of the sampleattributes property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLEATTRIBUTES }
     *     
     */
    public SampleType.SAMPLEATTRIBUTES getSAMPLEATTRIBUTES() {
        return sampleattributes;
    }

    /**
     * Sets the value of the sampleattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLEATTRIBUTES }
     *     
     */
    public void setSAMPLEATTRIBUTES(SampleType.SAMPLEATTRIBUTES value) {
        this.sampleattributes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_ATTRIBUTE" type="{SRA.common}AttributeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sampleattribute"
    })
    public static class SAMPLEATTRIBUTES {

        @XmlElement(name = "SAMPLE_ATTRIBUTE", required = true)
        protected List<AttributeType> sampleattribute;

        /**
         * Gets the value of the sampleattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sampleattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLEATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSAMPLEATTRIBUTE() {
            if (sampleattribute == null) {
                sampleattribute = new ArrayList<AttributeType>();
            }
            return this.sampleattribute;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_LINK" type="{SRA.common}LinkType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "samplelink"
    })
    public static class SAMPLELINKS {

        @XmlElement(name = "SAMPLE_LINK", required = true)
        protected List<LinkType> samplelink;

        /**
         * Gets the value of the samplelink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the samplelink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLELINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getSAMPLELINK() {
            if (samplelink == null) {
                samplelink = new ArrayList<LinkType>();
            }
            return this.samplelink;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="display_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SAMPLENAME {

        @XmlElement(name = "TAXON_ID")
        protected int taxonid;
        @XmlElement(name = "SCIENTIFIC_NAME")
        protected String scientificname;
        @XmlElement(name = "COMMON_NAME")
        protected String commonname;
        @XmlAttribute(name = "display_name")
        protected String displayName;

        /**
         * Gets the value of the taxonid property.
         * 
         */
        public int getTAXONID() {
            return taxonid;
        }

        /**
         * Sets the value of the taxonid property.
         * 
         */
        public void setTAXONID(int value) {
            this.taxonid = value;
        }

        /**
         * Gets the value of the scientificname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCIENTIFICNAME() {
            return scientificname;
        }

        /**
         * Sets the value of the scientificname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCIENTIFICNAME(String value) {
            this.scientificname = value;
        }

        /**
         * Gets the value of the commonname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMONNAME() {
            return commonname;
        }

        /**
         * Sets the value of the commonname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMONNAME(String value) {
            this.commonname = value;
        }

        /**
         * Gets the value of the displayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Sets the value of the displayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
        }

    }

}
