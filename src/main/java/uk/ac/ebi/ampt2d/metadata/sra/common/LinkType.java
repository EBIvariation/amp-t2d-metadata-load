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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Reusable external links type to encode URL links, Entrez links, and db_xref links.
 *             
 * 
 * <p>Java class for LinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="URL_LINK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="XREF_LINK" type="{SRA.common}XRefType"/>
 *         &lt;element name="ENTREZ_LINK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;choice>
 *                     &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;element name="QUERY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/choice>
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LinkType", namespace = "SRA.common", propOrder = {
    "urllink",
    "xreflink",
    "entrezlink"
})
public class LinkType {

    @XmlElement(name = "URL_LINK")
    protected LinkType.URLLINK urllink;
    @XmlElement(name = "XREF_LINK")
    protected XRefType xreflink;
    @XmlElement(name = "ENTREZ_LINK")
    protected LinkType.ENTREZLINK entrezlink;

    /**
     * Gets the value of the urllink property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType.URLLINK }
     *     
     */
    public LinkType.URLLINK getURLLINK() {
        return urllink;
    }

    /**
     * Sets the value of the urllink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType.URLLINK }
     *     
     */
    public void setURLLINK(LinkType.URLLINK value) {
        this.urllink = value;
    }

    /**
     * Gets the value of the xreflink property.
     * 
     * @return
     *     possible object is
     *     {@link XRefType }
     *     
     */
    public XRefType getXREFLINK() {
        return xreflink;
    }

    /**
     * Sets the value of the xreflink property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRefType }
     *     
     */
    public void setXREFLINK(XRefType value) {
        this.xreflink = value;
    }

    /**
     * Gets the value of the entrezlink property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType.ENTREZLINK }
     *     
     */
    public LinkType.ENTREZLINK getENTREZLINK() {
        return entrezlink;
    }

    /**
     * Sets the value of the entrezlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType.ENTREZLINK }
     *     
     */
    public void setENTREZLINK(LinkType.ENTREZLINK value) {
        this.entrezlink = value;
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
     *         &lt;element name="DB" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;choice>
     *           &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;element name="QUERY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;/choice>
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "db",
        "id",
        "query",
        "label"
    })
    public static class ENTREZLINK {

        @XmlElement(name = "DB", required = true)
        protected String db;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "QUERY")
        protected String query;
        @XmlElement(name = "LABEL")
        protected String label;

        /**
         * Gets the value of the db property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDB() {
            return db;
        }

        /**
         * Sets the value of the db property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDB(String value) {
            this.db = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }

        /**
         * Gets the value of the query property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUERY() {
            return query;
        }

        /**
         * Sets the value of the query property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUERY(String value) {
            this.query = value;
        }

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
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

        @XmlElement(name = "LABEL", required = true)
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
