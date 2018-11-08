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
package uk.ac.ebi.ampt2d.metadata.sra.study;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.XRefType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           A Study is a container for a sequencing investigation that may comprise multiple experiments.
 *           The Study has an overall goal, but is otherwise minimally defined in the SRA. 
 *           A Study is composed of a descriptor, zero or more experiments, and zero or more analyses.
 *           The submitter may decorate the Study with web links and properties.
 *       
 * 
 * <p>Java class for StudyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudyType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTOR">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all minOccurs="0">
 *                   &lt;element name="STUDY_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STUDY_TYPE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="existing_study_type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Whole Genome Sequencing"/>
 *                                 &lt;enumeration value="Metagenomics"/>
 *                                 &lt;enumeration value="Transcriptome Analysis"/>
 *                                 &lt;enumeration value="Resequencing"/>
 *                                 &lt;enumeration value="Epigenetics"/>
 *                                 &lt;enumeration value="Synthetic Genomics"/>
 *                                 &lt;enumeration value="Forensic or Paleo-genomics"/>
 *                                 &lt;enumeration value="Gene Regulation Study"/>
 *                                 &lt;enumeration value="Cancer Genomics"/>
 *                                 &lt;enumeration value="Population Genomics"/>
 *                                 &lt;enumeration value="RNASeq"/>
 *                                 &lt;enumeration value="Exome Sequencing"/>
 *                                 &lt;enumeration value="Pooled Clone Sequencing"/>
 *                                 &lt;enumeration value="Transcriptome Sequencing"/>
 *                                 &lt;enumeration value="Other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="STUDY_ABSTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CENTER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CENTER_PROJECT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROJECT_ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="RELATED_STUDIES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RELATED_LINK" type="{SRA.common}XRefType"/>
 *                                       &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="STUDY_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STUDY_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="STUDY_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STUDY_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="STUDY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
@XmlType(name = "StudyType", propOrder = {
    "descriptor",
    "studylinks",
    "studyattributes"
})
public class StudyType
    extends ObjectType
{

    @XmlElement(name = "DESCRIPTOR", required = true)
    protected StudyType.DESCRIPTOR descriptor;
    @XmlElement(name = "STUDY_LINKS")
    protected StudyType.STUDYLINKS studylinks;
    @XmlElement(name = "STUDY_ATTRIBUTES")
    protected StudyType.STUDYATTRIBUTES studyattributes;

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.DESCRIPTOR }
     *     
     */
    public StudyType.DESCRIPTOR getDESCRIPTOR() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.DESCRIPTOR }
     *     
     */
    public void setDESCRIPTOR(StudyType.DESCRIPTOR value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the studylinks property.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.STUDYLINKS }
     *     
     */
    public StudyType.STUDYLINKS getSTUDYLINKS() {
        return studylinks;
    }

    /**
     * Sets the value of the studylinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.STUDYLINKS }
     *     
     */
    public void setSTUDYLINKS(StudyType.STUDYLINKS value) {
        this.studylinks = value;
    }

    /**
     * Gets the value of the studyattributes property.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.STUDYATTRIBUTES }
     *     
     */
    public StudyType.STUDYATTRIBUTES getSTUDYATTRIBUTES() {
        return studyattributes;
    }

    /**
     * Sets the value of the studyattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.STUDYATTRIBUTES }
     *     
     */
    public void setSTUDYATTRIBUTES(StudyType.STUDYATTRIBUTES value) {
        this.studyattributes = value;
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
     *       &lt;all minOccurs="0">
     *         &lt;element name="STUDY_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="STUDY_TYPE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="existing_study_type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Whole Genome Sequencing"/>
     *                       &lt;enumeration value="Metagenomics"/>
     *                       &lt;enumeration value="Transcriptome Analysis"/>
     *                       &lt;enumeration value="Resequencing"/>
     *                       &lt;enumeration value="Epigenetics"/>
     *                       &lt;enumeration value="Synthetic Genomics"/>
     *                       &lt;enumeration value="Forensic or Paleo-genomics"/>
     *                       &lt;enumeration value="Gene Regulation Study"/>
     *                       &lt;enumeration value="Cancer Genomics"/>
     *                       &lt;enumeration value="Population Genomics"/>
     *                       &lt;enumeration value="RNASeq"/>
     *                       &lt;enumeration value="Exome Sequencing"/>
     *                       &lt;enumeration value="Pooled Clone Sequencing"/>
     *                       &lt;enumeration value="Transcriptome Sequencing"/>
     *                       &lt;enumeration value="Other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="STUDY_ABSTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CENTER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CENTER_PROJECT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROJECT_ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="RELATED_STUDIES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RELATED_LINK" type="{SRA.common}XRefType"/>
     *                             &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="STUDY_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
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
    public static class DESCRIPTOR {

        @XmlElement(name = "STUDY_TITLE")
        protected String studytitle;
        @XmlElement(name = "STUDY_TYPE")
        protected StudyType.DESCRIPTOR.STUDYTYPE studytype;
        @XmlElement(name = "STUDY_ABSTRACT")
        protected String studyabstract;
        @XmlElement(name = "CENTER_NAME")
        protected String centername;
        @XmlElement(name = "CENTER_PROJECT_NAME")
        protected String centerprojectname;
        @XmlElement(name = "PROJECT_ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger projectid;
        @XmlElement(name = "RELATED_STUDIES")
        protected StudyType.DESCRIPTOR.RELATEDSTUDIES relatedstudies;
        @XmlElement(name = "STUDY_DESCRIPTION")
        protected String studydescription;

        /**
         * Gets the value of the studytitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYTITLE() {
            return studytitle;
        }

        /**
         * Sets the value of the studytitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYTITLE(String value) {
            this.studytitle = value;
        }

        /**
         * Gets the value of the studytype property.
         * 
         * @return
         *     possible object is
         *     {@link StudyType.DESCRIPTOR.STUDYTYPE }
         *     
         */
        public StudyType.DESCRIPTOR.STUDYTYPE getSTUDYTYPE() {
            return studytype;
        }

        /**
         * Sets the value of the studytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link StudyType.DESCRIPTOR.STUDYTYPE }
         *     
         */
        public void setSTUDYTYPE(StudyType.DESCRIPTOR.STUDYTYPE value) {
            this.studytype = value;
        }

        /**
         * Gets the value of the studyabstract property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYABSTRACT() {
            return studyabstract;
        }

        /**
         * Sets the value of the studyabstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYABSTRACT(String value) {
            this.studyabstract = value;
        }

        /**
         * Gets the value of the centername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCENTERNAME() {
            return centername;
        }

        /**
         * Sets the value of the centername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCENTERNAME(String value) {
            this.centername = value;
        }

        /**
         * Gets the value of the centerprojectname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCENTERPROJECTNAME() {
            return centerprojectname;
        }

        /**
         * Sets the value of the centerprojectname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCENTERPROJECTNAME(String value) {
            this.centerprojectname = value;
        }

        /**
         * Gets the value of the projectid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPROJECTID() {
            return projectid;
        }

        /**
         * Sets the value of the projectid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPROJECTID(BigInteger value) {
            this.projectid = value;
        }

        /**
         * Gets the value of the relatedstudies property.
         * 
         * @return
         *     possible object is
         *     {@link StudyType.DESCRIPTOR.RELATEDSTUDIES }
         *     
         */
        public StudyType.DESCRIPTOR.RELATEDSTUDIES getRELATEDSTUDIES() {
            return relatedstudies;
        }

        /**
         * Sets the value of the relatedstudies property.
         * 
         * @param value
         *     allowed object is
         *     {@link StudyType.DESCRIPTOR.RELATEDSTUDIES }
         *     
         */
        public void setRELATEDSTUDIES(StudyType.DESCRIPTOR.RELATEDSTUDIES value) {
            this.relatedstudies = value;
        }

        /**
         * Gets the value of the studydescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYDESCRIPTION() {
            return studydescription;
        }

        /**
         * Sets the value of the studydescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYDESCRIPTION(String value) {
            this.studydescription = value;
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
         *         &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RELATED_LINK" type="{SRA.common}XRefType"/>
         *                   &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
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
            "relatedstudy"
        })
        public static class RELATEDSTUDIES {

            @XmlElement(name = "RELATED_STUDY", required = true)
            protected List<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY> relatedstudy;

            /**
             * Gets the value of the relatedstudy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relatedstudy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRELATEDSTUDY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY }
             * 
             * 
             */
            public List<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY> getRELATEDSTUDY() {
                if (relatedstudy == null) {
                    relatedstudy = new ArrayList<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY>();
                }
                return this.relatedstudy;
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
             *         &lt;element name="RELATED_LINK" type="{SRA.common}XRefType"/>
             *         &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "relatedlink",
                "isprimary"
            })
            public static class RELATEDSTUDY {

                @XmlElement(name = "RELATED_LINK", required = true)
                protected XRefType relatedlink;
                @XmlElement(name = "IS_PRIMARY")
                protected boolean isprimary;

                /**
                 * Gets the value of the relatedlink property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XRefType }
                 *     
                 */
                public XRefType getRELATEDLINK() {
                    return relatedlink;
                }

                /**
                 * Sets the value of the relatedlink property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XRefType }
                 *     
                 */
                public void setRELATEDLINK(XRefType value) {
                    this.relatedlink = value;
                }

                /**
                 * Gets the value of the isprimary property.
                 * 
                 */
                public boolean isISPRIMARY() {
                    return isprimary;
                }

                /**
                 * Sets the value of the isprimary property.
                 * 
                 */
                public void setISPRIMARY(boolean value) {
                    this.isprimary = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="existing_study_type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Whole Genome Sequencing"/>
         *             &lt;enumeration value="Metagenomics"/>
         *             &lt;enumeration value="Transcriptome Analysis"/>
         *             &lt;enumeration value="Resequencing"/>
         *             &lt;enumeration value="Epigenetics"/>
         *             &lt;enumeration value="Synthetic Genomics"/>
         *             &lt;enumeration value="Forensic or Paleo-genomics"/>
         *             &lt;enumeration value="Gene Regulation Study"/>
         *             &lt;enumeration value="Cancer Genomics"/>
         *             &lt;enumeration value="Population Genomics"/>
         *             &lt;enumeration value="RNASeq"/>
         *             &lt;enumeration value="Exome Sequencing"/>
         *             &lt;enumeration value="Pooled Clone Sequencing"/>
         *             &lt;enumeration value="Transcriptome Sequencing"/>
         *             &lt;enumeration value="Other"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class STUDYTYPE {

            @XmlAttribute(name = "existing_study_type", required = true)
            protected String existingStudyType;
            @XmlAttribute(name = "new_study_type")
            protected String newStudyType;

            /**
             * Gets the value of the existingStudyType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistingStudyType() {
                return existingStudyType;
            }

            /**
             * Sets the value of the existingStudyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistingStudyType(String value) {
                this.existingStudyType = value;
            }

            /**
             * Gets the value of the newStudyType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewStudyType() {
                return newStudyType;
            }

            /**
             * Sets the value of the newStudyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewStudyType(String value) {
                this.newStudyType = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="STUDY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
        "studyattribute"
    })
    public static class STUDYATTRIBUTES {

        @XmlElement(name = "STUDY_ATTRIBUTE", required = true)
        protected List<AttributeType> studyattribute;

        /**
         * Gets the value of the studyattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studyattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTUDYATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSTUDYATTRIBUTE() {
            if (studyattribute == null) {
                studyattribute = new ArrayList<AttributeType>();
            }
            return this.studyattribute;
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
     *         &lt;element name="STUDY_LINK" type="{SRA.common}LinkType"/>
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
        "studylink"
    })
    public static class STUDYLINKS {

        @XmlElement(name = "STUDY_LINK", required = true)
        protected List<LinkType> studylink;

        /**
         * Gets the value of the studylink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studylink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTUDYLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getSTUDYLINK() {
            if (studylink == null) {
                studylink = new ArrayList<LinkType>();
            }
            return this.studylink;
        }

    }

}