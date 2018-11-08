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

import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SampleDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleDescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}RefObjectType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="POOL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEFAULT_MEMBER" type="{}PoolMemberType" minOccurs="0"/>
 *                   &lt;element name="MEMBER" type="{}PoolMemberType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleDescriptorType", propOrder = {
    "pool"
})
public class SampleDescriptorType
    extends RefObjectType
{

    @XmlElement(name = "POOL")
    protected SampleDescriptorType.POOL pool;

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link SampleDescriptorType.POOL }
     *     
     */
    public SampleDescriptorType.POOL getPOOL() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleDescriptorType.POOL }
     *     
     */
    public void setPOOL(SampleDescriptorType.POOL value) {
        this.pool = value;
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
     *         &lt;element name="DEFAULT_MEMBER" type="{}PoolMemberType" minOccurs="0"/>
     *         &lt;element name="MEMBER" type="{}PoolMemberType" maxOccurs="unbounded"/>
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
        "defaultmember",
        "member"
    })
    public static class POOL {

        @XmlElement(name = "DEFAULT_MEMBER")
        protected PoolMemberType defaultmember;
        @XmlElement(name = "MEMBER", required = true)
        protected List<PoolMemberType> member;

        /**
         * Gets the value of the defaultmember property.
         * 
         * @return
         *     possible object is
         *     {@link PoolMemberType }
         *     
         */
        public PoolMemberType getDEFAULTMEMBER() {
            return defaultmember;
        }

        /**
         * Sets the value of the defaultmember property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoolMemberType }
         *     
         */
        public void setDEFAULTMEMBER(PoolMemberType value) {
            this.defaultmember = value;
        }

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoolMemberType }
         * 
         * 
         */
        public List<PoolMemberType> getMEMBER() {
            if (member == null) {
                member = new ArrayList<PoolMemberType>();
            }
            return this.member;
        }

    }

}
