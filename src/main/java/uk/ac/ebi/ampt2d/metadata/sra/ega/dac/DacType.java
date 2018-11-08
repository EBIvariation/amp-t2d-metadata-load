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
package uk.ac.ebi.ampt2d.metadata.sra.ega.dac;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an object that contains data access comittee  information including contacts.
 *     
 * 
 * <p>Java class for DacType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DacType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTACTS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="CONTACT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="email" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="telephone_number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="organisation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="main_contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DAC_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="DAC_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DAC_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="DAC_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
@XmlType(name = "DacType", propOrder = {
    "title",
    "contacts",
    "daclinks",
    "dacattributes"
})
public class DacType
    extends ObjectType
{

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "CONTACTS", required = true)
    protected DacType.CONTACTS contacts;
    @XmlElement(name = "DAC_LINKS")
    protected DacType.DACLINKS daclinks;
    @XmlElement(name = "DAC_ATTRIBUTES")
    protected DacType.DACATTRIBUTES dacattributes;

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
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link DacType.CONTACTS }
     *     
     */
    public DacType.CONTACTS getCONTACTS() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DacType.CONTACTS }
     *     
     */
    public void setCONTACTS(DacType.CONTACTS value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the daclinks property.
     * 
     * @return
     *     possible object is
     *     {@link DacType.DACLINKS }
     *     
     */
    public DacType.DACLINKS getDACLINKS() {
        return daclinks;
    }

    /**
     * Sets the value of the daclinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DacType.DACLINKS }
     *     
     */
    public void setDACLINKS(DacType.DACLINKS value) {
        this.daclinks = value;
    }

    /**
     * Gets the value of the dacattributes property.
     * 
     * @return
     *     possible object is
     *     {@link DacType.DACATTRIBUTES }
     *     
     */
    public DacType.DACATTRIBUTES getDACATTRIBUTES() {
        return dacattributes;
    }

    /**
     * Sets the value of the dacattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DacType.DACATTRIBUTES }
     *     
     */
    public void setDACATTRIBUTES(DacType.DACATTRIBUTES value) {
        this.dacattributes = value;
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
     *         &lt;element name="CONTACT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="email" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="telephone_number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="organisation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="main_contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "contact"
    })
    public static class CONTACTS {

        @XmlElement(name = "CONTACT", required = true)
        protected List<DacType.CONTACTS.CONTACT> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DacType.CONTACTS.CONTACT }
         * 
         * 
         */
        public List<DacType.CONTACTS.CONTACT> getCONTACT() {
            if (contact == null) {
                contact = new ArrayList<DacType.CONTACTS.CONTACT>();
            }
            return this.contact;
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
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="email" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="telephone_number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="organisation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="main_contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTACT {

            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "email", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String email;
            @XmlAttribute(name = "telephone_number")
            protected String telephoneNumber;
            @XmlAttribute(name = "organisation", required = true)
            protected String organisation;
            @XmlAttribute(name = "main_contact")
            protected Boolean mainContact;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
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
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the telephoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumber() {
                return telephoneNumber;
            }

            /**
             * Sets the value of the telephoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumber(String value) {
                this.telephoneNumber = value;
            }

            /**
             * Gets the value of the organisation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganisation() {
                return organisation;
            }

            /**
             * Sets the value of the organisation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganisation(String value) {
                this.organisation = value;
            }

            /**
             * Gets the value of the mainContact property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMainContact() {
                return mainContact;
            }

            /**
             * Sets the value of the mainContact property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMainContact(Boolean value) {
                this.mainContact = value;
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
     *         &lt;element name="DAC_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
        "dacattribute"
    })
    public static class DACATTRIBUTES {

        @XmlElement(name = "DAC_ATTRIBUTE", required = true)
        protected List<AttributeType> dacattribute;

        /**
         * Gets the value of the dacattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dacattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDACATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getDACATTRIBUTE() {
            if (dacattribute == null) {
                dacattribute = new ArrayList<AttributeType>();
            }
            return this.dacattribute;
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
     *         &lt;element name="DAC_LINK" type="{SRA.common}LinkType"/>
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
        "daclink"
    })
    public static class DACLINKS {

        @XmlElement(name = "DAC_LINK", required = true)
        protected List<LinkType> daclink;

        /**
         * Gets the value of the daclink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the daclink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDACLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getDACLINK() {
            if (daclink == null) {
                daclink = new ArrayList<LinkType>();
            }
            return this.daclink;
        }

    }

}
