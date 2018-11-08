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
package uk.ac.ebi.ampt2d.metadata.sra.analysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisFileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisFileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filetype" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="tab"/>
 *             &lt;enumeration value="bam"/>
 *             &lt;enumeration value="bai"/>
 *             &lt;enumeration value="cram"/>
 *             &lt;enumeration value="crai"/>
 *             &lt;enumeration value="vcf"/>
 *             &lt;enumeration value="vcf_aggregate"/>
 *             &lt;enumeration value="bcf"/>
 *             &lt;enumeration value="tabix"/>
 *             &lt;enumeration value="wig"/>
 *             &lt;enumeration value="bed"/>
 *             &lt;enumeration value="gff"/>
 *             &lt;enumeration value="fasta"/>
 *             &lt;enumeration value="fastq"/>
 *             &lt;enumeration value="flatfile"/>
 *             &lt;enumeration value="chromosome_list"/>
 *             &lt;enumeration value="sample_list"/>
 *             &lt;enumeration value="readme_file"/>
 *             &lt;enumeration value="phenotype_file"/>
 *             &lt;enumeration value="BioNano_native"/>
 *             &lt;enumeration value="Kallisto_native"/>
 *             &lt;enumeration value="agp"/>
 *             &lt;enumeration value="unlocalised_list"/>
 *             &lt;enumeration value="info"/>
 *             &lt;enumeration value="manifest"/>
 *             &lt;enumeration value="other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="checksum_method" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="MD5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unencrypted_checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checklist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisFileType")
public class AnalysisFileType {

    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "filetype", required = true)
    protected String filetype;
    @XmlAttribute(name = "checksum_method", required = true)
    protected String checksumMethod;
    @XmlAttribute(name = "checksum", required = true)
    protected String checksum;
    @XmlAttribute(name = "unencrypted_checksum")
    protected String unencryptedChecksum;
    @XmlAttribute(name = "checklist")
    protected String checklist;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the filetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * Sets the value of the filetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiletype(String value) {
        this.filetype = value;
    }

    /**
     * Gets the value of the checksumMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumMethod() {
        return checksumMethod;
    }

    /**
     * Sets the value of the checksumMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumMethod(String value) {
        this.checksumMethod = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the unencryptedChecksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnencryptedChecksum() {
        return unencryptedChecksum;
    }

    /**
     * Sets the value of the unencryptedChecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnencryptedChecksum(String value) {
        this.unencryptedChecksum = value;
    }

    /**
     * Gets the value of the checklist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecklist() {
        return checklist;
    }

    /**
     * Sets the value of the checklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecklist(String value) {
        this.checklist = value;
    }

}
