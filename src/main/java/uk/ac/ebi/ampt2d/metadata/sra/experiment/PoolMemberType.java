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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PoolMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{SRA.common}RefObjectType">
 *       &lt;sequence>
 *         &lt;element name="READ_LABEL" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proportion" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolMemberType", propOrder = {
    "readlabel"
})
public class PoolMemberType
    extends RefObjectType
{

    @XmlElement(name = "READ_LABEL")
    protected List<PoolMemberType.READLABEL> readlabel;
    @XmlAttribute(name = "member_name")
    protected String memberName;
    @XmlAttribute(name = "proportion")
    protected Float proportion;

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
     * {@link PoolMemberType.READLABEL }
     * 
     * 
     */
    public List<PoolMemberType.READLABEL> getREADLABEL() {
        if (readlabel == null) {
            readlabel = new ArrayList<PoolMemberType.READLABEL>();
        }
        return this.readlabel;
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
     * Gets the value of the proportion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProportion() {
        return proportion;
    }

    /**
     * Sets the value of the proportion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProportion(Float value) {
        this.proportion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class READLABEL {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "read_group_tag")
        protected String readGroupTag;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the readGroupTag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReadGroupTag() {
            return readGroupTag;
        }

        /**
         * Sets the value of the readGroupTag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReadGroupTag(String value) {
            this.readGroupTag = value;
        }

    }

}
