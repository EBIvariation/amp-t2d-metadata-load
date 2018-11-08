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
 * Reference assembly and sequence details.                              
 * 
 * <p>Java class for ReferenceSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSEMBLY" type="{SRA.common}ReferenceAssemblyType" minOccurs="0"/>
 *         &lt;element name="SEQUENCE" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="accession" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ReferenceSequenceType", namespace = "SRA.common", propOrder = {
    "assembly",
    "sequence"
})
public class ReferenceSequenceType {

    @XmlElement(name = "ASSEMBLY")
    protected ReferenceAssemblyType assembly;
    @XmlElement(name = "SEQUENCE")
    protected List<ReferenceSequenceType.SEQUENCE> sequence;

    /**
     * Gets the value of the assembly property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAssemblyType }
     *     
     */
    public ReferenceAssemblyType getASSEMBLY() {
        return assembly;
    }

    /**
     * Sets the value of the assembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAssemblyType }
     *     
     */
    public void setASSEMBLY(ReferenceAssemblyType value) {
        this.assembly = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEQUENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceSequenceType.SEQUENCE }
     * 
     * 
     */
    public List<ReferenceSequenceType.SEQUENCE> getSEQUENCE() {
        if (sequence == null) {
            sequence = new ArrayList<ReferenceSequenceType.SEQUENCE>();
        }
        return this.sequence;
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
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SEQUENCE {

        @XmlAttribute(name = "refname")
        protected String refname;
        @XmlAttribute(name = "accession")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String accession;
        @XmlAttribute(name = "label")
        protected String label;

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

}
