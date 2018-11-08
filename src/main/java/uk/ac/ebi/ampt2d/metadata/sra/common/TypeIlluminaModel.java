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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeIlluminaModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeIlluminaModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HiSeq X Five"/>
 *     &lt;enumeration value="HiSeq X Ten"/>
 *     &lt;enumeration value="Illumina Genome Analyzer"/>
 *     &lt;enumeration value="Illumina Genome Analyzer II"/>
 *     &lt;enumeration value="Illumina Genome Analyzer IIx"/>
 *     &lt;enumeration value="Illumina HiScanSQ"/>
 *     &lt;enumeration value="Illumina HiSeq 1000"/>
 *     &lt;enumeration value="Illumina HiSeq 1500"/>
 *     &lt;enumeration value="Illumina HiSeq 2000"/>
 *     &lt;enumeration value="Illumina HiSeq 2500"/>
 *     &lt;enumeration value="Illumina HiSeq 3000"/>
 *     &lt;enumeration value="Illumina HiSeq 4000"/>
 *     &lt;enumeration value="Illumina MiSeq"/>
 *     &lt;enumeration value="Illumina MiniSeq"/>
 *     &lt;enumeration value="Illumina NovaSeq 6000"/>
 *     &lt;enumeration value="NextSeq 500"/>
 *     &lt;enumeration value="NextSeq 550"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeIlluminaModel", namespace = "SRA.common")
@XmlEnum
public enum TypeIlluminaModel {

    @XmlEnumValue("HiSeq X Five")
    HI_SEQ_X_FIVE("HiSeq X Five"),
    @XmlEnumValue("HiSeq X Ten")
    HI_SEQ_X_TEN("HiSeq X Ten"),
    @XmlEnumValue("Illumina Genome Analyzer")
    ILLUMINA_GENOME_ANALYZER("Illumina Genome Analyzer"),
    @XmlEnumValue("Illumina Genome Analyzer II")
    ILLUMINA_GENOME_ANALYZER_II("Illumina Genome Analyzer II"),
    @XmlEnumValue("Illumina Genome Analyzer IIx")
    ILLUMINA_GENOME_ANALYZER_I_IX("Illumina Genome Analyzer IIx"),
    @XmlEnumValue("Illumina HiScanSQ")
    ILLUMINA_HI_SCAN_SQ("Illumina HiScanSQ"),
    @XmlEnumValue("Illumina HiSeq 1000")
    ILLUMINA_HI_SEQ_1000("Illumina HiSeq 1000"),
    @XmlEnumValue("Illumina HiSeq 1500")
    ILLUMINA_HI_SEQ_1500("Illumina HiSeq 1500"),
    @XmlEnumValue("Illumina HiSeq 2000")
    ILLUMINA_HI_SEQ_2000("Illumina HiSeq 2000"),
    @XmlEnumValue("Illumina HiSeq 2500")
    ILLUMINA_HI_SEQ_2500("Illumina HiSeq 2500"),
    @XmlEnumValue("Illumina HiSeq 3000")
    ILLUMINA_HI_SEQ_3000("Illumina HiSeq 3000"),
    @XmlEnumValue("Illumina HiSeq 4000")
    ILLUMINA_HI_SEQ_4000("Illumina HiSeq 4000"),
    @XmlEnumValue("Illumina MiSeq")
    ILLUMINA_MI_SEQ("Illumina MiSeq"),
    @XmlEnumValue("Illumina MiniSeq")
    ILLUMINA_MINI_SEQ("Illumina MiniSeq"),
    @XmlEnumValue("Illumina NovaSeq 6000")
    ILLUMINA_NOVA_SEQ_6000("Illumina NovaSeq 6000"),
    @XmlEnumValue("NextSeq 500")
    NEXT_SEQ_500("NextSeq 500"),
    @XmlEnumValue("NextSeq 550")
    NEXT_SEQ_550("NextSeq 550"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeIlluminaModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeIlluminaModel fromValue(String v) {
        for (TypeIlluminaModel c: TypeIlluminaModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
