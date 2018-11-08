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
package uk.ac.ebi.ampt2d.metadata.sra.analysis;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ReferenceSequenceType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A SRA analysis object captures sequence analysis results including sequence alignments, sequence variations and sequence annotations.
 *             
 * 
 * <p>Java class for AnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUDY_REF" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SAMPLE_REF" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXPERIMENT_REF" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RUN_REF" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ANALYSIS_REF" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ANALYSIS_TYPE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="REFERENCE_ALIGNMENT" type="{SRA.common}ReferenceSequenceType"/>
 *                   &lt;element name="SEQUENCE_VARIATION">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{SRA.common}ReferenceSequenceType">
 *                           &lt;sequence>
 *                             &lt;element name="EXPERIMENT_TYPE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Whole genome sequencing"/>
 *                                   &lt;enumeration value="Whole transcriptome sequencing"/>
 *                                   &lt;enumeration value="Exome sequencing"/>
 *                                   &lt;enumeration value="Genotyping by array"/>
 *                                   &lt;enumeration value="transcriptomics"/>
 *                                   &lt;enumeration value="Curation"/>
 *                                   &lt;enumeration value="Genotyping by sequencing"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IMPUTATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SEQUENCE_ASSEMBLY">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TYPE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="clone or isolate"/>
 *                                   &lt;enumeration value="primary metagenome"/>
 *                                   &lt;enumeration value="binned metagenome"/>
 *                                   &lt;enumeration value="Metagenome-Assembled Genome (MAG)"/>
 *                                   &lt;enumeration value="Environmental Single-Cell Amplified Genome (SAG)"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PARTIAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="COVERAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MIN_GAP_LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MOL_TYPE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="genomic DNA"/>
 *                                   &lt;enumeration value="genomic RNA"/>
 *                                   &lt;enumeration value="viral cRNA"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SEQUENCE_FLATFILE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="SEQUENCE_ANNOTATION">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="REFERENCE_SEQUENCE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SAMPLE_PHENOTYPE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PROCESSED_READS" type="{SRA.common}ReferenceSequenceType"/>
 *                   &lt;element name="GENOME_MAP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PLATFORM">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="BioNano"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AMR_ANTIBIOGRAM" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="PATHOGEN_ANALYSIS" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="TRANSCRIPTOME_ASSEMBLY">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="FILES">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="FILE" type="{}AnalysisFileType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="ANALYSIS_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ANALYSIS_LINK" type="{SRA.common}LinkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ANALYSIS_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ANALYSIS_ATTRIBUTE" type="{SRA.common}AttributeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="analysis_center" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="analysis_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisType", propOrder = {
    "title",
    "description",
    "studyref",
    "sampleref",
    "experimentref",
    "runref",
    "analysisref",
    "analysistype",
    "files",
    "analysislinks",
    "analysisattributes"
})
public class AnalysisType
    extends ObjectType
{

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "STUDY_REF")
    protected AnalysisType.STUDYREF studyref;
    @XmlElement(name = "SAMPLE_REF")
    protected List<AnalysisType.SAMPLEREF> sampleref;
    @XmlElement(name = "EXPERIMENT_REF")
    protected List<AnalysisType.EXPERIMENTREF> experimentref;
    @XmlElement(name = "RUN_REF")
    protected List<AnalysisType.RUNREF> runref;
    @XmlElement(name = "ANALYSIS_REF")
    protected List<AnalysisType.ANALYSISREF> analysisref;
    @XmlElement(name = "ANALYSIS_TYPE", required = true)
    protected AnalysisType.ANALYSISTYPE analysistype;
    @XmlElement(name = "FILES", required = true)
    protected AnalysisType.FILES files;
    @XmlElement(name = "ANALYSIS_LINKS")
    protected AnalysisType.ANALYSISLINKS analysislinks;
    @XmlElement(name = "ANALYSIS_ATTRIBUTES")
    protected AnalysisType.ANALYSISATTRIBUTES analysisattributes;
    @XmlAttribute(name = "analysis_center")
    protected String analysisCenter;
    @XmlAttribute(name = "analysis_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar analysisDate;

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
     * Gets the value of the studyref property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.STUDYREF }
     *     
     */
    public AnalysisType.STUDYREF getSTUDYREF() {
        return studyref;
    }

    /**
     * Sets the value of the studyref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.STUDYREF }
     *     
     */
    public void setSTUDYREF(AnalysisType.STUDYREF value) {
        this.studyref = value;
    }

    /**
     * Gets the value of the sampleref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAMPLEREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisType.SAMPLEREF }
     * 
     * 
     */
    public List<AnalysisType.SAMPLEREF> getSAMPLEREF() {
        if (sampleref == null) {
            sampleref = new ArrayList<AnalysisType.SAMPLEREF>();
        }
        return this.sampleref;
    }

    /**
     * Gets the value of the experimentref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXPERIMENTREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisType.EXPERIMENTREF }
     * 
     * 
     */
    public List<AnalysisType.EXPERIMENTREF> getEXPERIMENTREF() {
        if (experimentref == null) {
            experimentref = new ArrayList<AnalysisType.EXPERIMENTREF>();
        }
        return this.experimentref;
    }

    /**
     * Gets the value of the runref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRUNREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisType.RUNREF }
     * 
     * 
     */
    public List<AnalysisType.RUNREF> getRUNREF() {
        if (runref == null) {
            runref = new ArrayList<AnalysisType.RUNREF>();
        }
        return this.runref;
    }

    /**
     * Gets the value of the analysisref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANALYSISREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisType.ANALYSISREF }
     * 
     * 
     */
    public List<AnalysisType.ANALYSISREF> getANALYSISREF() {
        if (analysisref == null) {
            analysisref = new ArrayList<AnalysisType.ANALYSISREF>();
        }
        return this.analysisref;
    }

    /**
     * Gets the value of the analysistype property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISTYPE }
     *     
     */
    public AnalysisType.ANALYSISTYPE getANALYSISTYPE() {
        return analysistype;
    }

    /**
     * Sets the value of the analysistype property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISTYPE }
     *     
     */
    public void setANALYSISTYPE(AnalysisType.ANALYSISTYPE value) {
        this.analysistype = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.FILES }
     *     
     */
    public AnalysisType.FILES getFILES() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.FILES }
     *     
     */
    public void setFILES(AnalysisType.FILES value) {
        this.files = value;
    }

    /**
     * Gets the value of the analysislinks property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISLINKS }
     *     
     */
    public AnalysisType.ANALYSISLINKS getANALYSISLINKS() {
        return analysislinks;
    }

    /**
     * Sets the value of the analysislinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISLINKS }
     *     
     */
    public void setANALYSISLINKS(AnalysisType.ANALYSISLINKS value) {
        this.analysislinks = value;
    }

    /**
     * Gets the value of the analysisattributes property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISATTRIBUTES }
     *     
     */
    public AnalysisType.ANALYSISATTRIBUTES getANALYSISATTRIBUTES() {
        return analysisattributes;
    }

    /**
     * Sets the value of the analysisattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISATTRIBUTES }
     *     
     */
    public void setANALYSISATTRIBUTES(AnalysisType.ANALYSISATTRIBUTES value) {
        this.analysisattributes = value;
    }

    /**
     * Gets the value of the analysisCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisCenter() {
        return analysisCenter;
    }

    /**
     * Sets the value of the analysisCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisCenter(String value) {
        this.analysisCenter = value;
    }

    /**
     * Gets the value of the analysisDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnalysisDate() {
        return analysisDate;
    }

    /**
     * Sets the value of the analysisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnalysisDate(XMLGregorianCalendar value) {
        this.analysisDate = value;
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
     *       &lt;sequence>
     *         &lt;element name="ANALYSIS_ATTRIBUTE" type="{SRA.common}AttributeType" maxOccurs="unbounded"/>
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
        "analysisattribute"
    })
    public static class ANALYSISATTRIBUTES {

        @XmlElement(name = "ANALYSIS_ATTRIBUTE", required = true)
        protected List<AttributeType> analysisattribute;

        /**
         * Gets the value of the analysisattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysisattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANALYSISATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getANALYSISATTRIBUTE() {
            if (analysisattribute == null) {
                analysisattribute = new ArrayList<AttributeType>();
            }
            return this.analysisattribute;
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
     *       &lt;sequence>
     *         &lt;element name="ANALYSIS_LINK" type="{SRA.common}LinkType" maxOccurs="unbounded"/>
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
        "analysislink"
    })
    public static class ANALYSISLINKS {

        @XmlElement(name = "ANALYSIS_LINK", required = true)
        protected List<LinkType> analysislink;

        /**
         * Gets the value of the analysislink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysislink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANALYSISLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getANALYSISLINK() {
            if (analysislink == null) {
                analysislink = new ArrayList<LinkType>();
            }
            return this.analysislink;
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
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ANALYSISREF
        extends RefObjectType
    {

        @XmlAttribute(name = "label")
        protected String label;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
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
     *       &lt;choice>
     *         &lt;element name="REFERENCE_ALIGNMENT" type="{SRA.common}ReferenceSequenceType"/>
     *         &lt;element name="SEQUENCE_VARIATION">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{SRA.common}ReferenceSequenceType">
     *                 &lt;sequence>
     *                   &lt;element name="EXPERIMENT_TYPE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Whole genome sequencing"/>
     *                         &lt;enumeration value="Whole transcriptome sequencing"/>
     *                         &lt;enumeration value="Exome sequencing"/>
     *                         &lt;enumeration value="Genotyping by array"/>
     *                         &lt;enumeration value="transcriptomics"/>
     *                         &lt;enumeration value="Curation"/>
     *                         &lt;enumeration value="Genotyping by sequencing"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IMPUTATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SEQUENCE_ASSEMBLY">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TYPE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="clone or isolate"/>
     *                         &lt;enumeration value="primary metagenome"/>
     *                         &lt;enumeration value="binned metagenome"/>
     *                         &lt;enumeration value="Metagenome-Assembled Genome (MAG)"/>
     *                         &lt;enumeration value="Environmental Single-Cell Amplified Genome (SAG)"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PARTIAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="COVERAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MIN_GAP_LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MOL_TYPE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="genomic DNA"/>
     *                         &lt;enumeration value="genomic RNA"/>
     *                         &lt;enumeration value="viral cRNA"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SEQUENCE_FLATFILE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="SEQUENCE_ANNOTATION">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="REFERENCE_SEQUENCE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SAMPLE_PHENOTYPE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PROCESSED_READS" type="{SRA.common}ReferenceSequenceType"/>
     *         &lt;element name="GENOME_MAP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PLATFORM">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="BioNano"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AMR_ANTIBIOGRAM" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="PATHOGEN_ANALYSIS" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="TRANSCRIPTOME_ASSEMBLY">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referencealignment",
        "sequencevariation",
        "sequenceassembly",
        "sequenceflatfile",
        "sequenceannotation",
        "referencesequence",
        "samplephenotype",
        "processedreads",
        "genomemap",
        "amrantibiogram",
        "pathogenanalysis",
        "transcriptomeassembly"
    })
    public static class ANALYSISTYPE {

        @XmlElement(name = "REFERENCE_ALIGNMENT")
        protected ReferenceSequenceType referencealignment;
        @XmlElement(name = "SEQUENCE_VARIATION")
        protected AnalysisType.ANALYSISTYPE.SEQUENCEVARIATION sequencevariation;
        @XmlElement(name = "SEQUENCE_ASSEMBLY")
        protected AnalysisType.ANALYSISTYPE.SEQUENCEASSEMBLY sequenceassembly;
        @XmlElement(name = "SEQUENCE_FLATFILE")
        protected Object sequenceflatfile;
        @XmlElement(name = "SEQUENCE_ANNOTATION")
        protected AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION sequenceannotation;
        @XmlElement(name = "REFERENCE_SEQUENCE")
        protected AnalysisType.ANALYSISTYPE.REFERENCESEQUENCE referencesequence;
        @XmlElement(name = "SAMPLE_PHENOTYPE")
        protected AnalysisType.ANALYSISTYPE.SAMPLEPHENOTYPE samplephenotype;
        @XmlElement(name = "PROCESSED_READS")
        protected ReferenceSequenceType processedreads;
        @XmlElement(name = "GENOME_MAP")
        protected AnalysisType.ANALYSISTYPE.GENOMEMAP genomemap;
        @XmlElement(name = "AMR_ANTIBIOGRAM")
        protected Object amrantibiogram;
        @XmlElement(name = "PATHOGEN_ANALYSIS")
        protected Object pathogenanalysis;
        @XmlElement(name = "TRANSCRIPTOME_ASSEMBLY")
        protected AnalysisType.ANALYSISTYPE.TRANSCRIPTOMEASSEMBLY transcriptomeassembly;

        /**
         * Gets the value of the referencealignment property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceSequenceType }
         *     
         */
        public ReferenceSequenceType getREFERENCEALIGNMENT() {
            return referencealignment;
        }

        /**
         * Sets the value of the referencealignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceSequenceType }
         *     
         */
        public void setREFERENCEALIGNMENT(ReferenceSequenceType value) {
            this.referencealignment = value;
        }

        /**
         * Gets the value of the sequencevariation property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEVARIATION }
         *     
         */
        public AnalysisType.ANALYSISTYPE.SEQUENCEVARIATION getSEQUENCEVARIATION() {
            return sequencevariation;
        }

        /**
         * Sets the value of the sequencevariation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEVARIATION }
         *     
         */
        public void setSEQUENCEVARIATION(AnalysisType.ANALYSISTYPE.SEQUENCEVARIATION value) {
            this.sequencevariation = value;
        }

        /**
         * Gets the value of the sequenceassembly property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEASSEMBLY }
         *     
         */
        public AnalysisType.ANALYSISTYPE.SEQUENCEASSEMBLY getSEQUENCEASSEMBLY() {
            return sequenceassembly;
        }

        /**
         * Sets the value of the sequenceassembly property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEASSEMBLY }
         *     
         */
        public void setSEQUENCEASSEMBLY(AnalysisType.ANALYSISTYPE.SEQUENCEASSEMBLY value) {
            this.sequenceassembly = value;
        }

        /**
         * Gets the value of the sequenceflatfile property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSEQUENCEFLATFILE() {
            return sequenceflatfile;
        }

        /**
         * Sets the value of the sequenceflatfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSEQUENCEFLATFILE(Object value) {
            this.sequenceflatfile = value;
        }

        /**
         * Gets the value of the sequenceannotation property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION }
         *     
         */
        public AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION getSEQUENCEANNOTATION() {
            return sequenceannotation;
        }

        /**
         * Sets the value of the sequenceannotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION }
         *     
         */
        public void setSEQUENCEANNOTATION(AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION value) {
            this.sequenceannotation = value;
        }

        /**
         * Gets the value of the referencesequence property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.REFERENCESEQUENCE }
         *     
         */
        public AnalysisType.ANALYSISTYPE.REFERENCESEQUENCE getREFERENCESEQUENCE() {
            return referencesequence;
        }

        /**
         * Sets the value of the referencesequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.REFERENCESEQUENCE }
         *     
         */
        public void setREFERENCESEQUENCE(AnalysisType.ANALYSISTYPE.REFERENCESEQUENCE value) {
            this.referencesequence = value;
        }

        /**
         * Gets the value of the samplephenotype property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.SAMPLEPHENOTYPE }
         *     
         */
        public AnalysisType.ANALYSISTYPE.SAMPLEPHENOTYPE getSAMPLEPHENOTYPE() {
            return samplephenotype;
        }

        /**
         * Sets the value of the samplephenotype property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.SAMPLEPHENOTYPE }
         *     
         */
        public void setSAMPLEPHENOTYPE(AnalysisType.ANALYSISTYPE.SAMPLEPHENOTYPE value) {
            this.samplephenotype = value;
        }

        /**
         * Gets the value of the processedreads property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceSequenceType }
         *     
         */
        public ReferenceSequenceType getPROCESSEDREADS() {
            return processedreads;
        }

        /**
         * Sets the value of the processedreads property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceSequenceType }
         *     
         */
        public void setPROCESSEDREADS(ReferenceSequenceType value) {
            this.processedreads = value;
        }

        /**
         * Gets the value of the genomemap property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.GENOMEMAP }
         *     
         */
        public AnalysisType.ANALYSISTYPE.GENOMEMAP getGENOMEMAP() {
            return genomemap;
        }

        /**
         * Sets the value of the genomemap property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.GENOMEMAP }
         *     
         */
        public void setGENOMEMAP(AnalysisType.ANALYSISTYPE.GENOMEMAP value) {
            this.genomemap = value;
        }

        /**
         * Gets the value of the amrantibiogram property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAMRANTIBIOGRAM() {
            return amrantibiogram;
        }

        /**
         * Sets the value of the amrantibiogram property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAMRANTIBIOGRAM(Object value) {
            this.amrantibiogram = value;
        }

        /**
         * Gets the value of the pathogenanalysis property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPATHOGENANALYSIS() {
            return pathogenanalysis;
        }

        /**
         * Sets the value of the pathogenanalysis property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPATHOGENANALYSIS(Object value) {
            this.pathogenanalysis = value;
        }

        /**
         * Gets the value of the transcriptomeassembly property.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.TRANSCRIPTOMEASSEMBLY }
         *     
         */
        public AnalysisType.ANALYSISTYPE.TRANSCRIPTOMEASSEMBLY getTRANSCRIPTOMEASSEMBLY() {
            return transcriptomeassembly;
        }

        /**
         * Sets the value of the transcriptomeassembly property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.TRANSCRIPTOMEASSEMBLY }
         *     
         */
        public void setTRANSCRIPTOMEASSEMBLY(AnalysisType.ANALYSISTYPE.TRANSCRIPTOMEASSEMBLY value) {
            this.transcriptomeassembly = value;
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
         *       &lt;sequence>
         *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PLATFORM">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="BioNano"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "program",
            "platform",
            "description"
        })
        public static class GENOMEMAP {

            @XmlElement(name = "PROGRAM", required = true)
            protected String program;
            @XmlElement(name = "PLATFORM", required = true)
            protected String platform;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROGRAM() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROGRAM(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the platform property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLATFORM() {
                return platform;
            }

            /**
             * Sets the value of the platform property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLATFORM(String value) {
                this.platform = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class REFERENCESEQUENCE {


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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SAMPLEPHENOTYPE {


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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SEQUENCEANNOTATION {


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
         *       &lt;sequence>
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TYPE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="clone or isolate"/>
         *               &lt;enumeration value="primary metagenome"/>
         *               &lt;enumeration value="binned metagenome"/>
         *               &lt;enumeration value="Metagenome-Assembled Genome (MAG)"/>
         *               &lt;enumeration value="Environmental Single-Cell Amplified Genome (SAG)"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PARTIAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="COVERAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MIN_GAP_LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MOL_TYPE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="genomic DNA"/>
         *               &lt;enumeration value="genomic RNA"/>
         *               &lt;enumeration value="viral cRNA"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "name",
            "type",
            "partial",
            "coverage",
            "program",
            "platform",
            "mingaplength",
            "moltype",
            "tpa"
        })
        public static class SEQUENCEASSEMBLY {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "PARTIAL")
            protected boolean partial;
            @XmlElement(name = "COVERAGE", required = true)
            protected String coverage;
            @XmlElement(name = "PROGRAM", required = true)
            protected String program;
            @XmlElement(name = "PLATFORM", required = true)
            protected String platform;
            @XmlElement(name = "MIN_GAP_LENGTH")
            protected BigInteger mingaplength;
            @XmlElement(name = "MOL_TYPE")
            protected String moltype;
            @XmlElement(name = "TPA")
            protected Boolean tpa;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the partial property.
             * 
             */
            public boolean isPARTIAL() {
                return partial;
            }

            /**
             * Sets the value of the partial property.
             * 
             */
            public void setPARTIAL(boolean value) {
                this.partial = value;
            }

            /**
             * Gets the value of the coverage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOVERAGE() {
                return coverage;
            }

            /**
             * Sets the value of the coverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOVERAGE(String value) {
                this.coverage = value;
            }

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROGRAM() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROGRAM(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the platform property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLATFORM() {
                return platform;
            }

            /**
             * Sets the value of the platform property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLATFORM(String value) {
                this.platform = value;
            }

            /**
             * Gets the value of the mingaplength property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMINGAPLENGTH() {
                return mingaplength;
            }

            /**
             * Sets the value of the mingaplength property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMINGAPLENGTH(BigInteger value) {
                this.mingaplength = value;
            }

            /**
             * Gets the value of the moltype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOLTYPE() {
                return moltype;
            }

            /**
             * Sets the value of the moltype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOLTYPE(String value) {
                this.moltype = value;
            }

            /**
             * Gets the value of the tpa property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTPA() {
                return tpa;
            }

            /**
             * Sets the value of the tpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTPA(Boolean value) {
                this.tpa = value;
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
         *     &lt;extension base="{SRA.common}ReferenceSequenceType">
         *       &lt;sequence>
         *         &lt;element name="EXPERIMENT_TYPE" maxOccurs="unbounded" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Whole genome sequencing"/>
         *               &lt;enumeration value="Whole transcriptome sequencing"/>
         *               &lt;enumeration value="Exome sequencing"/>
         *               &lt;enumeration value="Genotyping by array"/>
         *               &lt;enumeration value="transcriptomics"/>
         *               &lt;enumeration value="Curation"/>
         *               &lt;enumeration value="Genotyping by sequencing"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IMPUTATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "experimenttype",
            "program",
            "platform",
            "imputation"
        })
        public static class SEQUENCEVARIATION
            extends ReferenceSequenceType
        {

            @XmlElement(name = "EXPERIMENT_TYPE")
            protected List<String> experimenttype;
            @XmlElement(name = "PROGRAM")
            protected String program;
            @XmlElement(name = "PLATFORM")
            protected String platform;
            @XmlElement(name = "IMPUTATION")
            protected Boolean imputation;

            /**
             * Gets the value of the experimenttype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the experimenttype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEXPERIMENTTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getEXPERIMENTTYPE() {
                if (experimenttype == null) {
                    experimenttype = new ArrayList<String>();
                }
                return this.experimenttype;
            }

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROGRAM() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROGRAM(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the platform property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLATFORM() {
                return platform;
            }

            /**
             * Sets the value of the platform property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLATFORM(String value) {
                this.platform = value;
            }

            /**
             * Gets the value of the imputation property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIMPUTATION() {
                return imputation;
            }

            /**
             * Sets the value of the imputation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIMPUTATION(Boolean value) {
                this.imputation = value;
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
         *       &lt;sequence>
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "name",
            "program",
            "platform",
            "tpa"
        })
        public static class TRANSCRIPTOMEASSEMBLY {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "PROGRAM", required = true)
            protected String program;
            @XmlElement(name = "PLATFORM", required = true)
            protected String platform;
            @XmlElement(name = "TPA")
            protected Boolean tpa;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROGRAM() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROGRAM(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the platform property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLATFORM() {
                return platform;
            }

            /**
             * Sets the value of the platform property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLATFORM(String value) {
                this.platform = value;
            }

            /**
             * Gets the value of the tpa property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTPA() {
                return tpa;
            }

            /**
             * Sets the value of the tpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTPA(Boolean value) {
                this.tpa = value;
            }

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
    public static class EXPERIMENTREF
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
     *       &lt;sequence>
     *         &lt;element name="FILE" type="{}AnalysisFileType" maxOccurs="unbounded"/>
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
        "file"
    })
    public static class FILES {

        @XmlElement(name = "FILE", required = true)
        protected List<AnalysisFileType> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFILE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnalysisFileType }
         * 
         * 
         */
        public List<AnalysisFileType> getFILE() {
            if (file == null) {
                file = new ArrayList<AnalysisFileType>();
            }
            return this.file;
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
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RUNREF
        extends RefObjectType
    {

        @XmlAttribute(name = "label")
        protected String label;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
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
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SAMPLEREF
        extends RefObjectType
    {

        @XmlAttribute(name = "label")
        protected String label;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
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
