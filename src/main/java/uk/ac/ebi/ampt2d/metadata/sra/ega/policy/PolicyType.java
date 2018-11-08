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
package uk.ac.ebi.ampt2d.metadata.sra.ega.policy;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an object that contains data access policy information.
 * 
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DAC_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="POLICY_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="POLICY_FILE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="DATA_USES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="DATA_USE" type="{}DataUseType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POLICY_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="POLICY_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POLICY_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="POLICY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
@XmlType(name = "PolicyType", propOrder = {
    "title",
    "dacref",
    "policytext",
    "policyfile",
    "datauses",
    "policylinks",
    "policyattributes"
})
public class PolicyType
    extends ObjectType
{

    @XmlElement(name = "TITLE", required = true)
    protected String title;
    @XmlElement(name = "DAC_REF", required = true)
    protected PolicyType.DACREF dacref;
    @XmlElement(name = "POLICY_TEXT")
    protected String policytext;
    @XmlElement(name = "POLICY_FILE")
    protected String policyfile;
    @XmlElement(name = "DATA_USES")
    protected PolicyType.DATAUSES datauses;
    @XmlElement(name = "POLICY_LINKS")
    protected PolicyType.POLICYLINKS policylinks;
    @XmlElement(name = "POLICY_ATTRIBUTES")
    protected PolicyType.POLICYATTRIBUTES policyattributes;

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
     * Gets the value of the dacref property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.DACREF }
     *     
     */
    public PolicyType.DACREF getDACREF() {
        return dacref;
    }

    /**
     * Sets the value of the dacref property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.DACREF }
     *     
     */
    public void setDACREF(PolicyType.DACREF value) {
        this.dacref = value;
    }

    /**
     * Gets the value of the policytext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLICYTEXT() {
        return policytext;
    }

    /**
     * Sets the value of the policytext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLICYTEXT(String value) {
        this.policytext = value;
    }

    /**
     * Gets the value of the policyfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLICYFILE() {
        return policyfile;
    }

    /**
     * Sets the value of the policyfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLICYFILE(String value) {
        this.policyfile = value;
    }

    /**
     * Gets the value of the datauses property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.DATAUSES }
     *     
     */
    public PolicyType.DATAUSES getDATAUSES() {
        return datauses;
    }

    /**
     * Sets the value of the datauses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.DATAUSES }
     *     
     */
    public void setDATAUSES(PolicyType.DATAUSES value) {
        this.datauses = value;
    }

    /**
     * Gets the value of the policylinks property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.POLICYLINKS }
     *     
     */
    public PolicyType.POLICYLINKS getPOLICYLINKS() {
        return policylinks;
    }

    /**
     * Sets the value of the policylinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.POLICYLINKS }
     *     
     */
    public void setPOLICYLINKS(PolicyType.POLICYLINKS value) {
        this.policylinks = value;
    }

    /**
     * Gets the value of the policyattributes property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.POLICYATTRIBUTES }
     *     
     */
    public PolicyType.POLICYATTRIBUTES getPOLICYATTRIBUTES() {
        return policyattributes;
    }

    /**
     * Sets the value of the policyattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.POLICYATTRIBUTES }
     *     
     */
    public void setPOLICYATTRIBUTES(PolicyType.POLICYATTRIBUTES value) {
        this.policyattributes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{SRA.common}RefObjectType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DACREF
        extends RefObjectType
    {


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
     *         &lt;element name="DATA_USE" type="{}DataUseType"/>
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
        "datause"
    })
    public static class DATAUSES {

        @XmlElement(name = "DATA_USE", required = true)
        protected List<DataUseType> datause;

        /**
         * Gets the value of the datause property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datause property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAUSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataUseType }
         * 
         * 
         */
        public List<DataUseType> getDATAUSE() {
            if (datause == null) {
                datause = new ArrayList<DataUseType>();
            }
            return this.datause;
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
     *         &lt;element name="POLICY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
        "policyattribute"
    })
    public static class POLICYATTRIBUTES {

        @XmlElement(name = "POLICY_ATTRIBUTE", required = true)
        protected List<AttributeType> policyattribute;

        /**
         * Gets the value of the policyattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policyattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOLICYATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getPOLICYATTRIBUTE() {
            if (policyattribute == null) {
                policyattribute = new ArrayList<AttributeType>();
            }
            return this.policyattribute;
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
     *         &lt;element name="POLICY_LINK" type="{SRA.common}LinkType"/>
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
        "policylink"
    })
    public static class POLICYLINKS {

        @XmlElement(name = "POLICY_LINK", required = true)
        protected List<LinkType> policylink;

        /**
         * Gets the value of the policylink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policylink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOLICYLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getPOLICYLINK() {
            if (policylink == null) {
                policylink = new ArrayList<LinkType>();
            }
            return this.policylink;
        }

    }

}
