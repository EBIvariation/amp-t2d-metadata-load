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
package uk.ac.ebi.ampt2d.metadata.sra.run;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.PlatformType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ProcessingType;
import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ReferenceSequenceType;
import uk.ac.ebi.ampt2d.metadata.sra.common.SpotDescriptorType;

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
 * 
 *                 A run contains a group of reads generated for a particular experiment.
 *             
 * 
 * <p>Java class for RunType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPERIMENT_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{SRA.common}RefObjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SPOT_DESCRIPTOR" type="{SRA.common}SpotDescriptorType" minOccurs="0"/>
 *         &lt;element name="PLATFORM" type="{SRA.common}PlatformType" minOccurs="0"/>
 *         &lt;element name="PROCESSING" type="{SRA.common}ProcessingType" minOccurs="0"/>
 *         &lt;element name="RUN_TYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="REFERENCE_ALIGNMENT" type="{SRA.common}ReferenceSequenceType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="DATA_BLOCK" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="FILES">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="FILE" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="filetype" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="sra"/>
 *                                             &lt;enumeration value="srf"/>
 *                                             &lt;enumeration value="sff"/>
 *                                             &lt;enumeration value="fastq"/>
 *                                             &lt;enumeration value="fasta"/>
 *                                             &lt;enumeration value="tab"/>
 *                                             &lt;enumeration value="454_native"/>
 *                                             &lt;enumeration value="454_native_seq"/>
 *                                             &lt;enumeration value="454_native_qual"/>
 *                                             &lt;enumeration value="Helicos_native"/>
 *                                             &lt;enumeration value="Illumina_native"/>
 *                                             &lt;enumeration value="Illumina_native_seq"/>
 *                                             &lt;enumeration value="Illumina_native_prb"/>
 *                                             &lt;enumeration value="Illumina_native_int"/>
 *                                             &lt;enumeration value="Illumina_native_qseq"/>
 *                                             &lt;enumeration value="Illumina_native_scarf"/>
 *                                             &lt;enumeration value="SOLiD_native"/>
 *                                             &lt;enumeration value="SOLiD_native_csfasta"/>
 *                                             &lt;enumeration value="SOLiD_native_qual"/>
 *                                             &lt;enumeration value="PacBio_HDF5"/>
 *                                             &lt;enumeration value="bam"/>
 *                                             &lt;enumeration value="cram"/>
 *                                             &lt;enumeration value="CompleteGenomics_native"/>
 *                                             &lt;enumeration value="OxfordNanopore_native"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="quality_scoring_system">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="phred"/>
 *                                             &lt;enumeration value="log-odds"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="quality_encoding">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="ascii"/>
 *                                             &lt;enumeration value="decimal"/>
 *                                             &lt;enumeration value="hexadecimal"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ascii_offset">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="!"/>
 *                                             &lt;enumeration value="@"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="checksum_method" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="MD5"/>
 *                                             &lt;enumeration value="SHA-256"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="unencrypted_checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="RUN_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUN_LINK" type="{SRA.common}LinkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RUN_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUN_ATTRIBUTE" type="{SRA.common}AttributeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="run_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="run_center" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunType", propOrder = {
    "title",
    "experimentref",
    "spotdescriptor",
    "platform",
    "processing",
    "runtype",
    "datablock",
    "runlinks",
    "runattributes"
})
public class RunType
    extends ObjectType
{

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "EXPERIMENT_REF", required = true)
    protected RunType.EXPERIMENTREF experimentref;
    @XmlElement(name = "SPOT_DESCRIPTOR")
    protected SpotDescriptorType spotdescriptor;
    @XmlElement(name = "PLATFORM")
    protected PlatformType platform;
    @XmlElement(name = "PROCESSING")
    protected ProcessingType processing;
    @XmlElement(name = "RUN_TYPE")
    protected RunType.RUNTYPE runtype;
    @XmlElement(name = "DATA_BLOCK")
    protected RunType.DATABLOCK datablock;
    @XmlElement(name = "RUN_LINKS")
    protected RunType.RUNLINKS runlinks;
    @XmlElement(name = "RUN_ATTRIBUTES")
    protected RunType.RUNATTRIBUTES runattributes;
    @XmlAttribute(name = "run_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDate;
    @XmlAttribute(name = "run_center")
    protected String runCenter;

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
     * Gets the value of the experimentref property.
     * 
     * @return
     *     possible object is
     *     {@link RunType.EXPERIMENTREF }
     *     
     */
    public RunType.EXPERIMENTREF getEXPERIMENTREF() {
        return experimentref;
    }

    /**
     * Sets the value of the experimentref property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.EXPERIMENTREF }
     *     
     */
    public void setEXPERIMENTREF(RunType.EXPERIMENTREF value) {
        this.experimentref = value;
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
     * Gets the value of the runtype property.
     * 
     * @return
     *     possible object is
     *     {@link RunType.RUNTYPE }
     *     
     */
    public RunType.RUNTYPE getRUNTYPE() {
        return runtype;
    }

    /**
     * Sets the value of the runtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.RUNTYPE }
     *     
     */
    public void setRUNTYPE(RunType.RUNTYPE value) {
        this.runtype = value;
    }

    /**
     * Gets the value of the datablock property.
     * 
     * @return
     *     possible object is
     *     {@link RunType.DATABLOCK }
     *     
     */
    public RunType.DATABLOCK getDATABLOCK() {
        return datablock;
    }

    /**
     * Sets the value of the datablock property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.DATABLOCK }
     *     
     */
    public void setDATABLOCK(RunType.DATABLOCK value) {
        this.datablock = value;
    }

    /**
     * Gets the value of the runlinks property.
     * 
     * @return
     *     possible object is
     *     {@link RunType.RUNLINKS }
     *     
     */
    public RunType.RUNLINKS getRUNLINKS() {
        return runlinks;
    }

    /**
     * Sets the value of the runlinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.RUNLINKS }
     *     
     */
    public void setRUNLINKS(RunType.RUNLINKS value) {
        this.runlinks = value;
    }

    /**
     * Gets the value of the runattributes property.
     * 
     * @return
     *     possible object is
     *     {@link RunType.RUNATTRIBUTES }
     *     
     */
    public RunType.RUNATTRIBUTES getRUNATTRIBUTES() {
        return runattributes;
    }

    /**
     * Sets the value of the runattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.RUNATTRIBUTES }
     *     
     */
    public void setRUNATTRIBUTES(RunType.RUNATTRIBUTES value) {
        this.runattributes = value;
    }

    /**
     * Gets the value of the runDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDate() {
        return runDate;
    }

    /**
     * Sets the value of the runDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDate(XMLGregorianCalendar value) {
        this.runDate = value;
    }

    /**
     * Gets the value of the runCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunCenter() {
        return runCenter;
    }

    /**
     * Sets the value of the runCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunCenter(String value) {
        this.runCenter = value;
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
     *         &lt;element name="FILES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FILE" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="filetype" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="sra"/>
     *                                 &lt;enumeration value="srf"/>
     *                                 &lt;enumeration value="sff"/>
     *                                 &lt;enumeration value="fastq"/>
     *                                 &lt;enumeration value="fasta"/>
     *                                 &lt;enumeration value="tab"/>
     *                                 &lt;enumeration value="454_native"/>
     *                                 &lt;enumeration value="454_native_seq"/>
     *                                 &lt;enumeration value="454_native_qual"/>
     *                                 &lt;enumeration value="Helicos_native"/>
     *                                 &lt;enumeration value="Illumina_native"/>
     *                                 &lt;enumeration value="Illumina_native_seq"/>
     *                                 &lt;enumeration value="Illumina_native_prb"/>
     *                                 &lt;enumeration value="Illumina_native_int"/>
     *                                 &lt;enumeration value="Illumina_native_qseq"/>
     *                                 &lt;enumeration value="Illumina_native_scarf"/>
     *                                 &lt;enumeration value="SOLiD_native"/>
     *                                 &lt;enumeration value="SOLiD_native_csfasta"/>
     *                                 &lt;enumeration value="SOLiD_native_qual"/>
     *                                 &lt;enumeration value="PacBio_HDF5"/>
     *                                 &lt;enumeration value="bam"/>
     *                                 &lt;enumeration value="cram"/>
     *                                 &lt;enumeration value="CompleteGenomics_native"/>
     *                                 &lt;enumeration value="OxfordNanopore_native"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="quality_scoring_system">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="phred"/>
     *                                 &lt;enumeration value="log-odds"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="quality_encoding">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="ascii"/>
     *                                 &lt;enumeration value="decimal"/>
     *                                 &lt;enumeration value="hexadecimal"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ascii_offset">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="!"/>
     *                                 &lt;enumeration value="@"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="checksum_method" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="MD5"/>
     *                                 &lt;enumeration value="SHA-256"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="unencrypted_checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "files"
    })
    public static class DATABLOCK {

        @XmlElement(name = "FILES", required = true)
        protected RunType.DATABLOCK.FILES files;
        @XmlAttribute(name = "member_name")
        protected String memberName;

        /**
         * Gets the value of the files property.
         * 
         * @return
         *     possible object is
         *     {@link RunType.DATABLOCK.FILES }
         *     
         */
        public RunType.DATABLOCK.FILES getFILES() {
            return files;
        }

        /**
         * Sets the value of the files property.
         * 
         * @param value
         *     allowed object is
         *     {@link RunType.DATABLOCK.FILES }
         *     
         */
        public void setFILES(RunType.DATABLOCK.FILES value) {
            this.files = value;
        }

        /**
         * Gets the value of the memberName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberName() {
            return memberName;
        }

        /**
         * Sets the value of the memberName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberName(String value) {
            this.memberName = value;
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
         *         &lt;element name="FILE" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="filetype" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="sra"/>
         *                       &lt;enumeration value="srf"/>
         *                       &lt;enumeration value="sff"/>
         *                       &lt;enumeration value="fastq"/>
         *                       &lt;enumeration value="fasta"/>
         *                       &lt;enumeration value="tab"/>
         *                       &lt;enumeration value="454_native"/>
         *                       &lt;enumeration value="454_native_seq"/>
         *                       &lt;enumeration value="454_native_qual"/>
         *                       &lt;enumeration value="Helicos_native"/>
         *                       &lt;enumeration value="Illumina_native"/>
         *                       &lt;enumeration value="Illumina_native_seq"/>
         *                       &lt;enumeration value="Illumina_native_prb"/>
         *                       &lt;enumeration value="Illumina_native_int"/>
         *                       &lt;enumeration value="Illumina_native_qseq"/>
         *                       &lt;enumeration value="Illumina_native_scarf"/>
         *                       &lt;enumeration value="SOLiD_native"/>
         *                       &lt;enumeration value="SOLiD_native_csfasta"/>
         *                       &lt;enumeration value="SOLiD_native_qual"/>
         *                       &lt;enumeration value="PacBio_HDF5"/>
         *                       &lt;enumeration value="bam"/>
         *                       &lt;enumeration value="cram"/>
         *                       &lt;enumeration value="CompleteGenomics_native"/>
         *                       &lt;enumeration value="OxfordNanopore_native"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="quality_scoring_system">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="phred"/>
         *                       &lt;enumeration value="log-odds"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="quality_encoding">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="ascii"/>
         *                       &lt;enumeration value="decimal"/>
         *                       &lt;enumeration value="hexadecimal"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ascii_offset">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="!"/>
         *                       &lt;enumeration value="@"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="checksum_method" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="MD5"/>
         *                       &lt;enumeration value="SHA-256"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="unencrypted_checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            protected List<RunType.DATABLOCK.FILES.FILE> file;

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
             * {@link RunType.DATABLOCK.FILES.FILE }
             * 
             * 
             */
            public List<RunType.DATABLOCK.FILES.FILE> getFILE() {
                if (file == null) {
                    file = new ArrayList<RunType.DATABLOCK.FILES.FILE>();
                }
                return this.file;
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
             *         &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="filetype" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="sra"/>
             *             &lt;enumeration value="srf"/>
             *             &lt;enumeration value="sff"/>
             *             &lt;enumeration value="fastq"/>
             *             &lt;enumeration value="fasta"/>
             *             &lt;enumeration value="tab"/>
             *             &lt;enumeration value="454_native"/>
             *             &lt;enumeration value="454_native_seq"/>
             *             &lt;enumeration value="454_native_qual"/>
             *             &lt;enumeration value="Helicos_native"/>
             *             &lt;enumeration value="Illumina_native"/>
             *             &lt;enumeration value="Illumina_native_seq"/>
             *             &lt;enumeration value="Illumina_native_prb"/>
             *             &lt;enumeration value="Illumina_native_int"/>
             *             &lt;enumeration value="Illumina_native_qseq"/>
             *             &lt;enumeration value="Illumina_native_scarf"/>
             *             &lt;enumeration value="SOLiD_native"/>
             *             &lt;enumeration value="SOLiD_native_csfasta"/>
             *             &lt;enumeration value="SOLiD_native_qual"/>
             *             &lt;enumeration value="PacBio_HDF5"/>
             *             &lt;enumeration value="bam"/>
             *             &lt;enumeration value="cram"/>
             *             &lt;enumeration value="CompleteGenomics_native"/>
             *             &lt;enumeration value="OxfordNanopore_native"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="quality_scoring_system">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="phred"/>
             *             &lt;enumeration value="log-odds"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="quality_encoding">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="ascii"/>
             *             &lt;enumeration value="decimal"/>
             *             &lt;enumeration value="hexadecimal"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ascii_offset">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="!"/>
             *             &lt;enumeration value="@"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="checksum_method" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="MD5"/>
             *             &lt;enumeration value="SHA-256"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="unencrypted_checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "readlabel"
            })
            public static class FILE {

                @XmlElement(name = "READ_LABEL")
                protected List<String> readlabel;
                @XmlAttribute(name = "filename", required = true)
                protected String filename;
                @XmlAttribute(name = "filetype", required = true)
                protected String filetype;
                @XmlAttribute(name = "quality_scoring_system")
                protected String qualityScoringSystem;
                @XmlAttribute(name = "quality_encoding")
                protected String qualityEncoding;
                @XmlAttribute(name = "ascii_offset")
                protected String asciiOffset;
                @XmlAttribute(name = "checksum_method", required = true)
                protected String checksumMethod;
                @XmlAttribute(name = "checksum", required = true)
                protected String checksum;
                @XmlAttribute(name = "unencrypted_checksum")
                protected String unencryptedChecksum;

                /**
                 * Gets the value of the readlabel property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the readlabel property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getREADLABEL().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getREADLABEL() {
                    if (readlabel == null) {
                        readlabel = new ArrayList<String>();
                    }
                    return this.readlabel;
                }

                /**
                 * Gets the value of the filename property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFilename() {
                    return filename;
                }

                /**
                 * Sets the value of the filename property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFilename(String value) {
                    this.filename = value;
                }

                /**
                 * Gets the value of the filetype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFiletype() {
                    return filetype;
                }

                /**
                 * Sets the value of the filetype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFiletype(String value) {
                    this.filetype = value;
                }

                /**
                 * Gets the value of the qualityScoringSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualityScoringSystem() {
                    return qualityScoringSystem;
                }

                /**
                 * Sets the value of the qualityScoringSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualityScoringSystem(String value) {
                    this.qualityScoringSystem = value;
                }

                /**
                 * Gets the value of the qualityEncoding property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualityEncoding() {
                    return qualityEncoding;
                }

                /**
                 * Sets the value of the qualityEncoding property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualityEncoding(String value) {
                    this.qualityEncoding = value;
                }

                /**
                 * Gets the value of the asciiOffset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAsciiOffset() {
                    return asciiOffset;
                }

                /**
                 * Sets the value of the asciiOffset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAsciiOffset(String value) {
                    this.asciiOffset = value;
                }

                /**
                 * Gets the value of the checksumMethod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChecksumMethod() {
                    return checksumMethod;
                }

                /**
                 * Sets the value of the checksumMethod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChecksumMethod(String value) {
                    this.checksumMethod = value;
                }

                /**
                 * Gets the value of the checksum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChecksum() {
                    return checksum;
                }

                /**
                 * Sets the value of the checksum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChecksum(String value) {
                    this.checksum = value;
                }

                /**
                 * Gets the value of the unencryptedChecksum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnencryptedChecksum() {
                    return unencryptedChecksum;
                }

                /**
                 * Sets the value of the unencryptedChecksum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnencryptedChecksum(String value) {
                    this.unencryptedChecksum = value;
                }

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
     *         &lt;element name="RUN_ATTRIBUTE" type="{SRA.common}AttributeType" maxOccurs="unbounded"/>
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
        "runattribute"
    })
    public static class RUNATTRIBUTES {

        @XmlElement(name = "RUN_ATTRIBUTE", required = true)
        protected List<AttributeType> runattribute;

        /**
         * Gets the value of the runattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getRUNATTRIBUTE() {
            if (runattribute == null) {
                runattribute = new ArrayList<AttributeType>();
            }
            return this.runattribute;
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
     *         &lt;element name="RUN_LINK" type="{SRA.common}LinkType" maxOccurs="unbounded"/>
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
        "runlink"
    })
    public static class RUNLINKS {

        @XmlElement(name = "RUN_LINK", required = true)
        protected List<LinkType> runlink;

        /**
         * Gets the value of the runlink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runlink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getRUNLINK() {
            if (runlink == null) {
                runlink = new ArrayList<LinkType>();
            }
            return this.runlink;
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
        "referencealignment"
    })
    public static class RUNTYPE {

        @XmlElement(name = "REFERENCE_ALIGNMENT")
        protected ReferenceSequenceType referencealignment;

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

    }

}
