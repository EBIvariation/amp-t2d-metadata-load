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
package uk.ac.ebi.ampt2d.metadata.sra.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLibrarySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLibrarySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENOMIC"/>
 *     &lt;enumeration value="GENOMIC SINGLE CELL"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC SINGLE CELL"/>
 *     &lt;enumeration value="METAGENOMIC"/>
 *     &lt;enumeration value="METATRANSCRIPTOMIC"/>
 *     &lt;enumeration value="SYNTHETIC"/>
 *     &lt;enumeration value="VIRAL RNA"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLibrarySource")
@XmlEnum
public enum TypeLibrarySource {


    /**
     *  Genomic DNA (includes PCR products from genomic DNA). 
     * 
     */
    GENOMIC("GENOMIC"),
    @XmlEnumValue("GENOMIC SINGLE CELL")
    GENOMIC_SINGLE_CELL("GENOMIC SINGLE CELL"),

    /**
     *  Transcription products or non genomic DNA (EST, cDNA, RT-PCR, screened libraries). 
     * 
     */
    TRANSCRIPTOMIC("TRANSCRIPTOMIC"),
    @XmlEnumValue("TRANSCRIPTOMIC SINGLE CELL")
    TRANSCRIPTOMIC_SINGLE_CELL("TRANSCRIPTOMIC SINGLE CELL"),

    /**
     *  Mixed material from metagenome. 
     * 
     */
    METAGENOMIC("METAGENOMIC"),

    /**
     *  Transcription products from community targets 
     * 
     */
    METATRANSCRIPTOMIC("METATRANSCRIPTOMIC"),

    /**
     *  Synthetic DNA. 
     * 
     */
    SYNTHETIC("SYNTHETIC"),

    /**
     *  Viral RNA. 
     * 
     */
    @XmlEnumValue("VIRAL RNA")
    VIRAL_RNA("VIRAL RNA"),

    /**
     *  Other, unspecified, or unknown library source material. 
     * 
     */
    OTHER("OTHER");
    private final String value;

    TypeLibrarySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLibrarySource fromValue(String v) {
        for (TypeLibrarySource c: TypeLibrarySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
