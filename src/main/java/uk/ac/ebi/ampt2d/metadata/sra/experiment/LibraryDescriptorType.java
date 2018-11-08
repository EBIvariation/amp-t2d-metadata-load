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

import uk.ac.ebi.ampt2d.metadata.sra.common.TypeLibrarySource;
import uk.ac.ebi.ampt2d.metadata.sra.common.TypeLibraryStrategy;
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
 *  The LIBRARY_DESCRIPTOR specifies the origin of the material being
 *         sequenced and any treatments that the material might have undergone that affect the
 *         sequencing result. This specification is needed even if the platform does not
 *         require a library construction step per se. 
 * 
 * <p>Java class for LibraryDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIBRARY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIBRARY_STRATEGY" type="{}typeLibraryStrategy"/>
 *         &lt;element name="LIBRARY_SOURCE" type="{}typeLibrarySource"/>
 *         &lt;element name="LIBRARY_SELECTION" type="{}typeLibrarySelection"/>
 *         &lt;element name="LIBRARY_LAYOUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SINGLE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PAIRED">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TARGETED_LOCI" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOCUS" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="locus_name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="16S rRNA"/>
 *                                 &lt;enumeration value="18S rRNA"/>
 *                                 &lt;enumeration value="RBCL"/>
 *                                 &lt;enumeration value="matK"/>
 *                                 &lt;enumeration value="COX1"/>
 *                                 &lt;enumeration value="ITS1-5.8S-ITS2"/>
 *                                 &lt;enumeration value="exome"/>
 *                                 &lt;enumeration value="other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POOLING_STRATEGY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIBRARY_CONSTRUCTION_PROTOCOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryDescriptorType", propOrder = {
    "libraryname",
    "librarystrategy",
    "librarysource",
    "libraryselection",
    "librarylayout",
    "targetedloci",
    "poolingstrategy",
    "libraryconstructionprotocol"
})
public class LibraryDescriptorType {

    @XmlElement(name = "LIBRARY_NAME")
    protected String libraryname;
    @XmlElement(name = "LIBRARY_STRATEGY", required = true)
    @XmlSchemaType(name = "string")
    protected TypeLibraryStrategy librarystrategy;
    @XmlElement(name = "LIBRARY_SOURCE", required = true)
    @XmlSchemaType(name = "string")
    protected TypeLibrarySource librarysource;
    @XmlElement(name = "LIBRARY_SELECTION", required = true)
    protected String libraryselection;
    @XmlElement(name = "LIBRARY_LAYOUT", required = true)
    protected LibraryDescriptorType.LIBRARYLAYOUT librarylayout;
    @XmlElement(name = "TARGETED_LOCI")
    protected LibraryDescriptorType.TARGETEDLOCI targetedloci;
    @XmlElement(name = "POOLING_STRATEGY")
    protected String poolingstrategy;
    @XmlElement(name = "LIBRARY_CONSTRUCTION_PROTOCOL")
    protected String libraryconstructionprotocol;

    /**
     * Gets the value of the libraryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYNAME() {
        return libraryname;
    }

    /**
     * Sets the value of the libraryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYNAME(String value) {
        this.libraryname = value;
    }

    /**
     * Gets the value of the librarystrategy property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    public TypeLibraryStrategy getLIBRARYSTRATEGY() {
        return librarystrategy;
    }

    /**
     * Sets the value of the librarystrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    public void setLIBRARYSTRATEGY(TypeLibraryStrategy value) {
        this.librarystrategy = value;
    }

    /**
     * Gets the value of the librarysource property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibrarySource }
     *     
     */
    public TypeLibrarySource getLIBRARYSOURCE() {
        return librarysource;
    }

    /**
     * Sets the value of the librarysource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibrarySource }
     *     
     */
    public void setLIBRARYSOURCE(TypeLibrarySource value) {
        this.librarysource = value;
    }

    /**
     * Gets the value of the libraryselection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYSELECTION() {
        return libraryselection;
    }

    /**
     * Sets the value of the libraryselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYSELECTION(String value) {
        this.libraryselection = value;
    }

    /**
     * Gets the value of the librarylayout property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    public LibraryDescriptorType.LIBRARYLAYOUT getLIBRARYLAYOUT() {
        return librarylayout;
    }

    /**
     * Sets the value of the librarylayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    public void setLIBRARYLAYOUT(LibraryDescriptorType.LIBRARYLAYOUT value) {
        this.librarylayout = value;
    }

    /**
     * Gets the value of the targetedloci property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    public LibraryDescriptorType.TARGETEDLOCI getTARGETEDLOCI() {
        return targetedloci;
    }

    /**
     * Sets the value of the targetedloci property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    public void setTARGETEDLOCI(LibraryDescriptorType.TARGETEDLOCI value) {
        this.targetedloci = value;
    }

    /**
     * Gets the value of the poolingstrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOOLINGSTRATEGY() {
        return poolingstrategy;
    }

    /**
     * Sets the value of the poolingstrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOOLINGSTRATEGY(String value) {
        this.poolingstrategy = value;
    }

    /**
     * Gets the value of the libraryconstructionprotocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYCONSTRUCTIONPROTOCOL() {
        return libraryconstructionprotocol;
    }

    /**
     * Sets the value of the libraryconstructionprotocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYCONSTRUCTIONPROTOCOL(String value) {
        this.libraryconstructionprotocol = value;
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
     *         &lt;element name="SINGLE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PAIRED">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
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
        "single",
        "paired"
    })
    public static class LIBRARYLAYOUT {

        @XmlElement(name = "SINGLE")
        protected LibraryDescriptorType.LIBRARYLAYOUT.SINGLE single;
        @XmlElement(name = "PAIRED")
        protected LibraryDescriptorType.LIBRARYLAYOUT.PAIRED paired;

        /**
         * Gets the value of the single property.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        public LibraryDescriptorType.LIBRARYLAYOUT.SINGLE getSINGLE() {
            return single;
        }

        /**
         * Sets the value of the single property.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        public void setSINGLE(LibraryDescriptorType.LIBRARYLAYOUT.SINGLE value) {
            this.single = value;
        }

        /**
         * Gets the value of the paired property.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        public LibraryDescriptorType.LIBRARYLAYOUT.PAIRED getPAIRED() {
            return paired;
        }

        /**
         * Sets the value of the paired property.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        public void setPAIRED(LibraryDescriptorType.LIBRARYLAYOUT.PAIRED value) {
            this.paired = value;
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
         *       &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PAIRED {

            @XmlAttribute(name = "NOMINAL_LENGTH")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nominallength;
            @XmlAttribute(name = "NOMINAL_SDEV")
            protected Double nominalsdev;

            /**
             * Gets the value of the nominallength property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNOMINALLENGTH() {
                return nominallength;
            }

            /**
             * Sets the value of the nominallength property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNOMINALLENGTH(BigInteger value) {
                this.nominallength = value;
            }

            /**
             * Gets the value of the nominalsdev property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNOMINALSDEV() {
                return nominalsdev;
            }

            /**
             * Sets the value of the nominalsdev property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNOMINALSDEV(Double value) {
                this.nominalsdev = value;
            }

        }


        /**
         * 
         *                     Reads are unpaired (usual case).
         *                   
         * 
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
        public static class SINGLE {


        }

    }


    /**
     * 
     *               Names the gene(s) or locus(loci) or other genomic feature(s) targeted by the sequence.
     *             
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LOCUS" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="locus_name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="16S rRNA"/>
     *                       &lt;enumeration value="18S rRNA"/>
     *                       &lt;enumeration value="RBCL"/>
     *                       &lt;enumeration value="matK"/>
     *                       &lt;enumeration value="COX1"/>
     *                       &lt;enumeration value="ITS1-5.8S-ITS2"/>
     *                       &lt;enumeration value="exome"/>
     *                       &lt;enumeration value="other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "locus"
    })
    public static class TARGETEDLOCI {

        @XmlElement(name = "LOCUS", required = true)
        protected List<LibraryDescriptorType.TARGETEDLOCI.LOCUS> locus;

        /**
         * Gets the value of the locus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LibraryDescriptorType.TARGETEDLOCI.LOCUS }
         * 
         * 
         */
        public List<LibraryDescriptorType.TARGETEDLOCI.LOCUS> getLOCUS() {
            if (locus == null) {
                locus = new ArrayList<LibraryDescriptorType.TARGETEDLOCI.LOCUS>();
            }
            return this.locus;
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
         *         &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="locus_name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="16S rRNA"/>
         *             &lt;enumeration value="18S rRNA"/>
         *             &lt;enumeration value="RBCL"/>
         *             &lt;enumeration value="matK"/>
         *             &lt;enumeration value="COX1"/>
         *             &lt;enumeration value="ITS1-5.8S-ITS2"/>
         *             &lt;enumeration value="exome"/>
         *             &lt;enumeration value="other"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "probeset"
        })
        public static class LOCUS {

            @XmlElement(name = "PROBE_SET")
            protected XRefType probeset;
            @XmlAttribute(name = "locus_name")
            protected String locusName;
            @XmlAttribute(name = "description")
            protected String description;

            /**
             * Gets the value of the probeset property.
             * 
             * @return
             *     possible object is
             *     {@link XRefType }
             *     
             */
            public XRefType getPROBESET() {
                return probeset;
            }

            /**
             * Sets the value of the probeset property.
             * 
             * @param value
             *     allowed object is
             *     {@link XRefType }
             *     
             */
            public void setPROBESET(XRefType value) {
                this.probeset = value;
            }

            /**
             * Gets the value of the locusName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocusName() {
                return locusName;
            }

            /**
             * Sets the value of the locusName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocusName(String value) {
                this.locusName = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
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
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }

}
