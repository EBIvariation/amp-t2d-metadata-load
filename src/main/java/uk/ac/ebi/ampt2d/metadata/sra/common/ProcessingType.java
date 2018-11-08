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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIPELINE" type="{SRA.common}PipelineType" minOccurs="0"/>
 *         &lt;element name="DIRECTIVES" type="{SRA.common}SequencingDirectivesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingType", namespace = "SRA.common", propOrder = {
    "pipeline",
    "directives"
})
public class ProcessingType {

    @XmlElement(name = "PIPELINE")
    protected PipelineType pipeline;
    @XmlElement(name = "DIRECTIVES")
    protected SequencingDirectivesType directives;

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineType }
     *     
     */
    public PipelineType getPIPELINE() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineType }
     *     
     */
    public void setPIPELINE(PipelineType value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the directives property.
     * 
     * @return
     *     possible object is
     *     {@link SequencingDirectivesType }
     *     
     */
    public SequencingDirectivesType getDIRECTIVES() {
        return directives;
    }

    /**
     * Sets the value of the directives property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequencingDirectivesType }
     *     
     */
    public void setDIRECTIVES(SequencingDirectivesType value) {
        this.directives = value;
    }

}
