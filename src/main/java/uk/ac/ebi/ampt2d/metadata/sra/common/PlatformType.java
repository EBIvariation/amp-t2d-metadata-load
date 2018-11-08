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

import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeAbiSolidModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeBGISEQModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeCGModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeCapillaryModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeHelicosModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeIlluminaModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeIontorrentModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypeOxfordNanoporeModel;
import uk.ac.ebi.ampt2d.metadata.sra.common.enums.TypePacBioModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  The PLATFORM record selects which sequencing platform and platform-specific runtime parameters. This will be
 *         determined by the Center. 
 * 
 * <p>Java class for PlatformType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LS454">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}type454Model"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ILLUMINA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeIlluminaModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HELICOS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeHelicosModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ABI_SOLID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeAbiSolidModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COMPLETE_GENOMICS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeCGModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BGISEQ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeBGISEQModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OXFORD_NANOPORE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeOxfordNanoporeModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PACBIO_SMRT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typePacBioModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ION_TORRENT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeIontorrentModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CAPILLARY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeCapillaryModel"/>
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
@XmlType(name = "PlatformType", namespace = "SRA.common", propOrder = {
    "ls454",
    "illumina",
    "helicos",
    "abisolid",
    "completegenomics",
    "bgiseq",
    "oxfordnanopore",
    "pacbiosmrt",
    "iontorrent",
    "capillary"
})
public class PlatformType {

    @XmlElement(name = "LS454")
    protected PlatformType.LS454 ls454;
    @XmlElement(name = "ILLUMINA")
    protected PlatformType.ILLUMINA illumina;
    @XmlElement(name = "HELICOS")
    protected PlatformType.HELICOS helicos;
    @XmlElement(name = "ABI_SOLID")
    protected PlatformType.ABISOLID abisolid;
    @XmlElement(name = "COMPLETE_GENOMICS")
    protected PlatformType.COMPLETEGENOMICS completegenomics;
    @XmlElement(name = "BGISEQ")
    protected PlatformType.BGISEQ bgiseq;
    @XmlElement(name = "OXFORD_NANOPORE")
    protected PlatformType.OXFORDNANOPORE oxfordnanopore;
    @XmlElement(name = "PACBIO_SMRT")
    protected PlatformType.PACBIOSMRT pacbiosmrt;
    @XmlElement(name = "ION_TORRENT")
    protected PlatformType.IONTORRENT iontorrent;
    @XmlElement(name = "CAPILLARY")
    protected PlatformType.CAPILLARY capillary;

    /**
     * Gets the value of the ls454 property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.LS454 }
     *     
     */
    public PlatformType.LS454 getLS454() {
        return ls454;
    }

    /**
     * Sets the value of the ls454 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.LS454 }
     *     
     */
    public void setLS454(PlatformType.LS454 value) {
        this.ls454 = value;
    }

    /**
     * Gets the value of the illumina property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.ILLUMINA }
     *     
     */
    public PlatformType.ILLUMINA getILLUMINA() {
        return illumina;
    }

    /**
     * Sets the value of the illumina property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.ILLUMINA }
     *     
     */
    public void setILLUMINA(PlatformType.ILLUMINA value) {
        this.illumina = value;
    }

    /**
     * Gets the value of the helicos property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.HELICOS }
     *     
     */
    public PlatformType.HELICOS getHELICOS() {
        return helicos;
    }

    /**
     * Sets the value of the helicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.HELICOS }
     *     
     */
    public void setHELICOS(PlatformType.HELICOS value) {
        this.helicos = value;
    }

    /**
     * Gets the value of the abisolid property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.ABISOLID }
     *     
     */
    public PlatformType.ABISOLID getABISOLID() {
        return abisolid;
    }

    /**
     * Sets the value of the abisolid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.ABISOLID }
     *     
     */
    public void setABISOLID(PlatformType.ABISOLID value) {
        this.abisolid = value;
    }

    /**
     * Gets the value of the completegenomics property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.COMPLETEGENOMICS }
     *     
     */
    public PlatformType.COMPLETEGENOMICS getCOMPLETEGENOMICS() {
        return completegenomics;
    }

    /**
     * Sets the value of the completegenomics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.COMPLETEGENOMICS }
     *     
     */
    public void setCOMPLETEGENOMICS(PlatformType.COMPLETEGENOMICS value) {
        this.completegenomics = value;
    }

    /**
     * Gets the value of the bgiseq property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.BGISEQ }
     *     
     */
    public PlatformType.BGISEQ getBGISEQ() {
        return bgiseq;
    }

    /**
     * Sets the value of the bgiseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.BGISEQ }
     *     
     */
    public void setBGISEQ(PlatformType.BGISEQ value) {
        this.bgiseq = value;
    }

    /**
     * Gets the value of the oxfordnanopore property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.OXFORDNANOPORE }
     *     
     */
    public PlatformType.OXFORDNANOPORE getOXFORDNANOPORE() {
        return oxfordnanopore;
    }

    /**
     * Sets the value of the oxfordnanopore property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.OXFORDNANOPORE }
     *     
     */
    public void setOXFORDNANOPORE(PlatformType.OXFORDNANOPORE value) {
        this.oxfordnanopore = value;
    }

    /**
     * Gets the value of the pacbiosmrt property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.PACBIOSMRT }
     *     
     */
    public PlatformType.PACBIOSMRT getPACBIOSMRT() {
        return pacbiosmrt;
    }

    /**
     * Sets the value of the pacbiosmrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.PACBIOSMRT }
     *     
     */
    public void setPACBIOSMRT(PlatformType.PACBIOSMRT value) {
        this.pacbiosmrt = value;
    }

    /**
     * Gets the value of the iontorrent property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.IONTORRENT }
     *     
     */
    public PlatformType.IONTORRENT getIONTORRENT() {
        return iontorrent;
    }

    /**
     * Sets the value of the iontorrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.IONTORRENT }
     *     
     */
    public void setIONTORRENT(PlatformType.IONTORRENT value) {
        this.iontorrent = value;
    }

    /**
     * Gets the value of the capillary property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.CAPILLARY }
     *     
     */
    public PlatformType.CAPILLARY getCAPILLARY() {
        return capillary;
    }

    /**
     * Sets the value of the capillary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.CAPILLARY }
     *     
     */
    public void setCAPILLARY(PlatformType.CAPILLARY value) {
        this.capillary = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeAbiSolidModel"/>
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
        "instrumentmodel"
    })
    public static class ABISOLID {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeAbiSolidModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeAbiSolidModel }
         *     
         */
        public TypeAbiSolidModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeAbiSolidModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeAbiSolidModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeBGISEQModel"/>
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
        "instrumentmodel"
    })
    public static class BGISEQ {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeBGISEQModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeBGISEQModel }
         *     
         */
        public TypeBGISEQModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeBGISEQModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeBGISEQModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeCapillaryModel"/>
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
        "instrumentmodel"
    })
    public static class CAPILLARY {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeCapillaryModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeCapillaryModel }
         *     
         */
        public TypeCapillaryModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCapillaryModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeCapillaryModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeCGModel"/>
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
        "instrumentmodel"
    })
    public static class COMPLETEGENOMICS {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeCGModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeCGModel }
         *     
         */
        public TypeCGModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCGModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeCGModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeHelicosModel"/>
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
        "instrumentmodel"
    })
    public static class HELICOS {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeHelicosModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeHelicosModel }
         *     
         */
        public TypeHelicosModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeHelicosModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeHelicosModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeIlluminaModel"/>
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
        "instrumentmodel"
    })
    public static class ILLUMINA {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeIlluminaModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeIlluminaModel }
         *     
         */
        public TypeIlluminaModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeIlluminaModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeIlluminaModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeIontorrentModel"/>
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
        "instrumentmodel"
    })
    public static class IONTORRENT {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeIontorrentModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeIontorrentModel }
         *     
         */
        public TypeIontorrentModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeIontorrentModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeIontorrentModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}type454Model"/>
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
        "instrumentmodel"
    })
    public static class LS454 {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        protected String instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRUMENTMODEL(String value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typeOxfordNanoporeModel"/>
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
        "instrumentmodel"
    })
    public static class OXFORDNANOPORE {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeOxfordNanoporeModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypeOxfordNanoporeModel }
         *     
         */
        public TypeOxfordNanoporeModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOxfordNanoporeModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeOxfordNanoporeModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{SRA.common}typePacBioModel"/>
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
        "instrumentmodel"
    })
    public static class PACBIOSMRT {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypePacBioModel instrumentmodel;

        /**
         * Gets the value of the instrumentmodel property.
         * 
         * @return
         *     possible object is
         *     {@link TypePacBioModel }
         *     
         */
        public TypePacBioModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Sets the value of the instrumentmodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePacBioModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypePacBioModel value) {
            this.instrumentmodel = value;
        }

    }

}
