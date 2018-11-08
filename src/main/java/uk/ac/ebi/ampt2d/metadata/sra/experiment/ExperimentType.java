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

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.PlatformType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ProcessingType;
import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An Experiment specifies of what will be sequenced and how the sequencing will be performed.
 *         It does not contain results.
 *         An Experiment is composed of a design, a platform selection, and processing parameters.
 *       
 * 
 * <p>Java class for ExperimentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUDY_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESIGN" type="{}LibraryType"/>
 *         &lt;element name="PLATFORM" type="{SRA.common}PlatformType"/>
 *         &lt;element name="PROCESSING" type="{SRA.common}ProcessingType" minOccurs="0"/>
 *         &lt;element name="EXPERIMENT_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXPERIMENT_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
@XmlType(name = "ExperimentType", propOrder = {
    "title",
    "studyref",
    "design",
    "platform",
    "processing",
    "experimentlinks",
    "experimentattributes"
})
public class ExperimentType
    extends ObjectType
{

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "STUDY_REF", required = true)
    protected ExperimentType.STUDYREF studyref;
    @XmlElement(name = "DESIGN", required = true)
    protected LibraryType design;
    @XmlElement(name = "PLATFORM", required = true)
    protected PlatformType platform;
    @XmlElement(name = "PROCESSING")
    protected ProcessingType processing;
    @XmlElement(name = "EXPERIMENT_LINKS")
    protected ExperimentType.EXPERIMENTLINKS experimentlinks;
    @XmlElement(name = "EXPERIMENT_ATTRIBUTES")
    protected ExperimentType.EXPERIMENTATTRIBUTES experimentattributes;

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
     * Gets the value of the studyref property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.STUDYREF }
     *     
     */
    public ExperimentType.STUDYREF getSTUDYREF() {
        return studyref;
    }

    /**
     * Sets the value of the studyref property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.STUDYREF }
     *     
     */
    public void setSTUDYREF(ExperimentType.STUDYREF value) {
        this.studyref = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryType }
     *     
     */
    public LibraryType getDESIGN() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryType }
     *     
     */
    public void setDESIGN(LibraryType value) {
        this.design = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType }
     *     
     */
    public PlatformType getPLATFORM() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType }
     *     
     */
    public void setPLATFORM(PlatformType value) {
        this.platform = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingType }
     *     
     */
    public ProcessingType getPROCESSING() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingType }
     *     
     */
    public void setPROCESSING(ProcessingType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the experimentlinks property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.EXPERIMENTLINKS }
     *     
     */
    public ExperimentType.EXPERIMENTLINKS getEXPERIMENTLINKS() {
        return experimentlinks;
    }

    /**
     * Sets the value of the experimentlinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.EXPERIMENTLINKS }
     *     
     */
    public void setEXPERIMENTLINKS(ExperimentType.EXPERIMENTLINKS value) {
        this.experimentlinks = value;
    }

    /**
     * Gets the value of the experimentattributes property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.EXPERIMENTATTRIBUTES }
     *     
     */
    public ExperimentType.EXPERIMENTATTRIBUTES getEXPERIMENTATTRIBUTES() {
        return experimentattributes;
    }

    /**
     * Sets the value of the experimentattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.EXPERIMENTATTRIBUTES }
     *     
     */
    public void setEXPERIMENTATTRIBUTES(ExperimentType.EXPERIMENTATTRIBUTES value) {
        this.experimentattributes = value;
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
     *         &lt;element name="EXPERIMENT_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
        "experimentattribute"
    })
    public static class EXPERIMENTATTRIBUTES {

        @XmlElement(name = "EXPERIMENT_ATTRIBUTE", required = true)
        protected List<AttributeType> experimentattribute;

        /**
         * Gets the value of the experimentattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getEXPERIMENTATTRIBUTE() {
            if (experimentattribute == null) {
                experimentattribute = new ArrayList<AttributeType>();
            }
            return this.experimentattribute;
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
     *         &lt;element name="EXPERIMENT_LINK" type="{SRA.common}LinkType"/>
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
        "experimentlink"
    })
    public static class EXPERIMENTLINKS {

        @XmlElement(name = "EXPERIMENT_LINK", required = true)
        protected List<LinkType> experimentlink;

        /**
         * Gets the value of the experimentlink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentlink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getEXPERIMENTLINK() {
            if (experimentlink == null) {
                experimentlink = new ArrayList<LinkType>();
            }
            return this.experimentlink;
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
    public static class STUDYREF
        extends RefObjectType
    {


    }

}
