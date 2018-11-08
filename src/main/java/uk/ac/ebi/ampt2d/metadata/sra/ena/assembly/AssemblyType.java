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
package uk.ac.ebi.ampt2d.metadata.sra.ena.assembly;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.IdentifierType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssemblyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ASSEMBLY_LEVEL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="complete genome"/>
 *               &lt;enumeration value="chromosome"/>
 *               &lt;enumeration value="scaffold"/>
 *               &lt;enumeration value="contig"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GENOME_REPRESENTATION">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="full"/>
 *               &lt;enumeration value="partial"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TAXON">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STRAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SAMPLE_REF" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{SRA.common}RefNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STUDY_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{SRA.common}RefNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WGS_SET" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CHROMOSOMES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="CHROMOSOME">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TYPE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="Plastid"/>
 *                                   &lt;enumeration value="Kinetoplast"/>
 *                                   &lt;enumeration value="Segment"/>
 *                                   &lt;enumeration value="Apicoplast"/>
 *                                   &lt;enumeration value="Virus"/>
 *                                   &lt;enumeration value="Mitochondrial Miscellaneous"/>
 *                                   &lt;enumeration value="Plasmid"/>
 *                                   &lt;enumeration value="Nucleomorph"/>
 *                                   &lt;enumeration value="Macronucleus"/>
 *                                   &lt;enumeration value="Chloroplast"/>
 *                                   &lt;enumeration value="Mitochondrion"/>
 *                                   &lt;enumeration value="Virus Chromosome"/>
 *                                   &lt;enumeration value="Extrachromosomal Element"/>
 *                                   &lt;enumeration value="Miscellaneous"/>
 *                                   &lt;enumeration value="Provirus"/>
 *                                   &lt;enumeration value="Chromosome"/>
 *                                   &lt;enumeration value="Non-nuclear Miscellaneous"/>
 *                                   &lt;enumeration value="Chromatophore"/>
 *                                   &lt;enumeration value="Provirus Chromosome"/>
 *                                   &lt;enumeration value="Mitochondrial Plasmid"/>
 *                                   &lt;enumeration value="Linkage Group"/>
 *                                   &lt;enumeration value="Cyanelle"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                           &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ASSEMBLY_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ASSEMBLY_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ASSEMBLY_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ASSEMBLY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
@XmlType(name = "AssemblyType", propOrder = {
    "title",
    "description",
    "name",
    "assemblylevel",
    "genomerepresentation",
    "taxon",
    "sampleref",
    "studyref",
    "wgsset",
    "chromosomes",
    "assemblylinks",
    "assemblyattributes"
})
public class AssemblyType
    extends ObjectType
{

    @XmlElement(name = "TITLE", required = true)
    protected String title;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "ASSEMBLY_LEVEL", required = true)
    protected String assemblylevel;
    @XmlElement(name = "GENOME_REPRESENTATION", required = true)
    protected String genomerepresentation;
    @XmlElement(name = "TAXON", required = true)
    protected AssemblyType.TAXON taxon;
    @XmlElement(name = "SAMPLE_REF")
    protected AssemblyType.SAMPLEREF sampleref;
    @XmlElement(name = "STUDY_REF", required = true)
    protected AssemblyType.STUDYREF studyref;
    @XmlElement(name = "WGS_SET")
    protected List<AssemblyType.WGSSET> wgsset;
    @XmlElement(name = "CHROMOSOMES")
    protected AssemblyType.CHROMOSOMES chromosomes;
    @XmlElement(name = "ASSEMBLY_LINKS")
    protected AssemblyType.ASSEMBLYLINKS assemblylinks;
    @XmlElement(name = "ASSEMBLY_ATTRIBUTES")
    protected AssemblyType.ASSEMBLYATTRIBUTES assemblyattributes;

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
     * Gets the value of the assemblylevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSEMBLYLEVEL() {
        return assemblylevel;
    }

    /**
     * Sets the value of the assemblylevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSEMBLYLEVEL(String value) {
        this.assemblylevel = value;
    }

    /**
     * Gets the value of the genomerepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENOMEREPRESENTATION() {
        return genomerepresentation;
    }

    /**
     * Sets the value of the genomerepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENOMEREPRESENTATION(String value) {
        this.genomerepresentation = value;
    }

    /**
     * Gets the value of the taxon property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.TAXON }
     *     
     */
    public AssemblyType.TAXON getTAXON() {
        return taxon;
    }

    /**
     * Sets the value of the taxon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.TAXON }
     *     
     */
    public void setTAXON(AssemblyType.TAXON value) {
        this.taxon = value;
    }

    /**
     * Gets the value of the sampleref property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.SAMPLEREF }
     *     
     */
    public AssemblyType.SAMPLEREF getSAMPLEREF() {
        return sampleref;
    }

    /**
     * Sets the value of the sampleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.SAMPLEREF }
     *     
     */
    public void setSAMPLEREF(AssemblyType.SAMPLEREF value) {
        this.sampleref = value;
    }

    /**
     * Gets the value of the studyref property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.STUDYREF }
     *     
     */
    public AssemblyType.STUDYREF getSTUDYREF() {
        return studyref;
    }

    /**
     * Sets the value of the studyref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.STUDYREF }
     *     
     */
    public void setSTUDYREF(AssemblyType.STUDYREF value) {
        this.studyref = value;
    }

    /**
     * Gets the value of the wgsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wgsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWGSSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyType.WGSSET }
     * 
     * 
     */
    public List<AssemblyType.WGSSET> getWGSSET() {
        if (wgsset == null) {
            wgsset = new ArrayList<AssemblyType.WGSSET>();
        }
        return this.wgsset;
    }

    /**
     * Gets the value of the chromosomes property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.CHROMOSOMES }
     *     
     */
    public AssemblyType.CHROMOSOMES getCHROMOSOMES() {
        return chromosomes;
    }

    /**
     * Sets the value of the chromosomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.CHROMOSOMES }
     *     
     */
    public void setCHROMOSOMES(AssemblyType.CHROMOSOMES value) {
        this.chromosomes = value;
    }

    /**
     * Gets the value of the assemblylinks property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.ASSEMBLYLINKS }
     *     
     */
    public AssemblyType.ASSEMBLYLINKS getASSEMBLYLINKS() {
        return assemblylinks;
    }

    /**
     * Sets the value of the assemblylinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.ASSEMBLYLINKS }
     *     
     */
    public void setASSEMBLYLINKS(AssemblyType.ASSEMBLYLINKS value) {
        this.assemblylinks = value;
    }

    /**
     * Gets the value of the assemblyattributes property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyType.ASSEMBLYATTRIBUTES }
     *     
     */
    public AssemblyType.ASSEMBLYATTRIBUTES getASSEMBLYATTRIBUTES() {
        return assemblyattributes;
    }

    /**
     * Sets the value of the assemblyattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyType.ASSEMBLYATTRIBUTES }
     *     
     */
    public void setASSEMBLYATTRIBUTES(AssemblyType.ASSEMBLYATTRIBUTES value) {
        this.assemblyattributes = value;
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
     *         &lt;element name="ASSEMBLY_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
        "assemblyattribute"
    })
    public static class ASSEMBLYATTRIBUTES {

        @XmlElement(name = "ASSEMBLY_ATTRIBUTE", required = true)
        protected List<AttributeType> assemblyattribute;

        /**
         * Gets the value of the assemblyattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assemblyattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSEMBLYATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getASSEMBLYATTRIBUTE() {
            if (assemblyattribute == null) {
                assemblyattribute = new ArrayList<AttributeType>();
            }
            return this.assemblyattribute;
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
     *         &lt;element name="ASSEMBLY_LINK" type="{SRA.common}LinkType"/>
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
        "assemblylink"
    })
    public static class ASSEMBLYLINKS {

        @XmlElement(name = "ASSEMBLY_LINK", required = true)
        protected List<LinkType> assemblylink;

        /**
         * Gets the value of the assemblylink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assemblylink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSEMBLYLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getASSEMBLYLINK() {
            if (assemblylink == null) {
                assemblylink = new ArrayList<LinkType>();
            }
            return this.assemblylink;
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
     *         &lt;element name="CHROMOSOME">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TYPE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="Plastid"/>
     *                         &lt;enumeration value="Kinetoplast"/>
     *                         &lt;enumeration value="Segment"/>
     *                         &lt;enumeration value="Apicoplast"/>
     *                         &lt;enumeration value="Virus"/>
     *                         &lt;enumeration value="Mitochondrial Miscellaneous"/>
     *                         &lt;enumeration value="Plasmid"/>
     *                         &lt;enumeration value="Nucleomorph"/>
     *                         &lt;enumeration value="Macronucleus"/>
     *                         &lt;enumeration value="Chloroplast"/>
     *                         &lt;enumeration value="Mitochondrion"/>
     *                         &lt;enumeration value="Virus Chromosome"/>
     *                         &lt;enumeration value="Extrachromosomal Element"/>
     *                         &lt;enumeration value="Miscellaneous"/>
     *                         &lt;enumeration value="Provirus"/>
     *                         &lt;enumeration value="Chromosome"/>
     *                         &lt;enumeration value="Non-nuclear Miscellaneous"/>
     *                         &lt;enumeration value="Chromatophore"/>
     *                         &lt;enumeration value="Provirus Chromosome"/>
     *                         &lt;enumeration value="Mitochondrial Plasmid"/>
     *                         &lt;enumeration value="Linkage Group"/>
     *                         &lt;enumeration value="Cyanelle"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *                 &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "chromosome"
    })
    public static class CHROMOSOMES {

        @XmlElement(name = "CHROMOSOME", required = true)
        protected List<AssemblyType.CHROMOSOMES.CHROMOSOME> chromosome;

        /**
         * Gets the value of the chromosome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chromosome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHROMOSOME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssemblyType.CHROMOSOMES.CHROMOSOME }
         * 
         * 
         */
        public List<AssemblyType.CHROMOSOMES.CHROMOSOME> getCHROMOSOME() {
            if (chromosome == null) {
                chromosome = new ArrayList<AssemblyType.CHROMOSOMES.CHROMOSOME>();
            }
            return this.chromosome;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TYPE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="Plastid"/>
         *               &lt;enumeration value="Kinetoplast"/>
         *               &lt;enumeration value="Segment"/>
         *               &lt;enumeration value="Apicoplast"/>
         *               &lt;enumeration value="Virus"/>
         *               &lt;enumeration value="Mitochondrial Miscellaneous"/>
         *               &lt;enumeration value="Plasmid"/>
         *               &lt;enumeration value="Nucleomorph"/>
         *               &lt;enumeration value="Macronucleus"/>
         *               &lt;enumeration value="Chloroplast"/>
         *               &lt;enumeration value="Mitochondrion"/>
         *               &lt;enumeration value="Virus Chromosome"/>
         *               &lt;enumeration value="Extrachromosomal Element"/>
         *               &lt;enumeration value="Miscellaneous"/>
         *               &lt;enumeration value="Provirus"/>
         *               &lt;enumeration value="Chromosome"/>
         *               &lt;enumeration value="Non-nuclear Miscellaneous"/>
         *               &lt;enumeration value="Chromatophore"/>
         *               &lt;enumeration value="Provirus Chromosome"/>
         *               &lt;enumeration value="Mitochondrial Plasmid"/>
         *               &lt;enumeration value="Linkage Group"/>
         *               &lt;enumeration value="Cyanelle"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/all>
         *       &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class CHROMOSOME {

            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "TYPE")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;
            @XmlAttribute(name = "accession", required = true)
            protected String accession;

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
             * Gets the value of the accession property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccession() {
                return accession;
            }

            /**
             * Sets the value of the accession property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccession(String value) {
                this.accession = value;
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
     *       &lt;sequence>
     *         &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{SRA.common}RefNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identifiers"
    })
    public static class SAMPLEREF {

        @XmlElement(name = "IDENTIFIERS")
        protected IdentifierType identifiers;
        @XmlAttribute(name = "refname")
        protected String refname;
        @XmlAttribute(name = "refcenter")
        protected String refcenter;
        @XmlAttribute(name = "accession")
        protected String accession;

        /**
         * Gets the value of the identifiers property.
         * 
         * @return
         *     possible object is
         *     {@link IdentifierType }
         *     
         */
        public IdentifierType getIDENTIFIERS() {
            return identifiers;
        }

        /**
         * Sets the value of the identifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentifierType }
         *     
         */
        public void setIDENTIFIERS(IdentifierType value) {
            this.identifiers = value;
        }

        /**
         * Gets the value of the refname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefname() {
            return refname;
        }

        /**
         * Sets the value of the refname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefname(String value) {
            this.refname = value;
        }

        /**
         * Gets the value of the refcenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefcenter() {
            return refcenter;
        }

        /**
         * Sets the value of the refcenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefcenter(String value) {
            this.refcenter = value;
        }

        /**
         * Gets the value of the accession property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccession() {
            return accession;
        }

        /**
         * Sets the value of the accession property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccession(String value) {
            this.accession = value;
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
     *         &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{SRA.common}RefNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identifiers"
    })
    public static class STUDYREF {

        @XmlElement(name = "IDENTIFIERS")
        protected IdentifierType identifiers;
        @XmlAttribute(name = "refname")
        protected String refname;
        @XmlAttribute(name = "refcenter")
        protected String refcenter;
        @XmlAttribute(name = "accession")
        protected String accession;

        /**
         * Gets the value of the identifiers property.
         * 
         * @return
         *     possible object is
         *     {@link IdentifierType }
         *     
         */
        public IdentifierType getIDENTIFIERS() {
            return identifiers;
        }

        /**
         * Sets the value of the identifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentifierType }
         *     
         */
        public void setIDENTIFIERS(IdentifierType value) {
            this.identifiers = value;
        }

        /**
         * Gets the value of the refname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefname() {
            return refname;
        }

        /**
         * Sets the value of the refname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefname(String value) {
            this.refname = value;
        }

        /**
         * Gets the value of the refcenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefcenter() {
            return refcenter;
        }

        /**
         * Sets the value of the refcenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefcenter(String value) {
            this.refcenter = value;
        }

        /**
         * Gets the value of the accession property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccession() {
            return accession;
        }

        /**
         * Sets the value of the accession property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccession(String value) {
            this.accession = value;
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
     *         &lt;element name="STRAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class TAXON {

        @XmlElement(name = "TAXON_ID")
        protected int taxonid;
        @XmlElement(name = "SCIENTIFIC_NAME")
        protected String scientificname;
        @XmlElement(name = "COMMON_NAME")
        protected String commonname;
        @XmlElement(name = "STRAIN")
        protected String strain;

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
         * Gets the value of the strain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTRAIN() {
            return strain;
        }

        /**
         * Sets the value of the strain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTRAIN(String value) {
            this.strain = value;
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
     *         &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "prefix",
        "version"
    })
    public static class WGSSET {

        @XmlElement(name = "PREFIX", required = true)
        protected String prefix;
        @XmlElement(name = "VERSION", required = true)
        protected BigInteger version;

        /**
         * Gets the value of the prefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPREFIX() {
            return prefix;
        }

        /**
         * Sets the value of the prefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPREFIX(String value) {
            this.prefix = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVERSION() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVERSION(BigInteger value) {
            this.version = value;
        }

    }

}
