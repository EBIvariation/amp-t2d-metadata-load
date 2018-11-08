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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reference assembly details.
 * 
 * <p>Java class for ReferenceAssemblyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAssemblyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="STANDARD">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="accession" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CUSTOM">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="URL_LINK" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ReferenceAssemblyType", namespace = "SRA.common", propOrder = {
    "standard",
    "custom"
})
public class ReferenceAssemblyType {

    @XmlElement(name = "STANDARD")
    protected ReferenceAssemblyType.STANDARD standard;
    @XmlElement(name = "CUSTOM")
    protected ReferenceAssemblyType.CUSTOM custom;

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAssemblyType.STANDARD }
     *     
     */
    public ReferenceAssemblyType.STANDARD getSTANDARD() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAssemblyType.STANDARD }
     *     
     */
    public void setSTANDARD(ReferenceAssemblyType.STANDARD value) {
        this.standard = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAssemblyType.CUSTOM }
     *     
     */
    public ReferenceAssemblyType.CUSTOM getCUSTOM() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAssemblyType.CUSTOM }
     *     
     */
    public void setCUSTOM(ReferenceAssemblyType.CUSTOM value) {
        this.custom = value;
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
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="URL_LINK" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                 &lt;/all>
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
        "description",
        "urllink"
    })
    public static class CUSTOM {

        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "URL_LINK", required = true)
        protected List<ReferenceAssemblyType.CUSTOM.URLLINK> urllink;

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
         * Gets the value of the urllink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the urllink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getURLLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceAssemblyType.CUSTOM.URLLINK }
         * 
         * 
         */
        public List<ReferenceAssemblyType.CUSTOM.URLLINK> getURLLINK() {
            if (urllink == null) {
                urllink = new ArrayList<ReferenceAssemblyType.CUSTOM.URLLINK>();
            }
            return this.urllink;
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
         *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
        public static class URLLINK {

            @XmlElement(name = "LABEL")
            protected String label;
            @XmlElement(name = "URL", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String url;

            /**
             * Gets the value of the label property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLABEL() {
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
            public void setLABEL(String value) {
                this.label = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
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
     *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="accession" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class STANDARD {

        @XmlAttribute(name = "refname")
        protected String refname;
        @XmlAttribute(name = "accession")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String accession;

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
