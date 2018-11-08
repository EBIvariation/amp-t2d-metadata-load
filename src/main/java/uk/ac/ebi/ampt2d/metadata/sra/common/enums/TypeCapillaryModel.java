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
 * <p>Java class for typeCapillaryModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCapillaryModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB 3730xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3730 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3500xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3500 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3130xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3130 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 310 Genetic Analyzer"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCapillaryModel", namespace = "SRA.common")
@XmlEnum
public enum TypeCapillaryModel {

    @XmlEnumValue("AB 3730xL Genetic Analyzer")
    AB_3730_X_L_GENETIC_ANALYZER("AB 3730xL Genetic Analyzer"),
    @XmlEnumValue("AB 3730 Genetic Analyzer")
    AB_3730_GENETIC_ANALYZER("AB 3730 Genetic Analyzer"),
    @XmlEnumValue("AB 3500xL Genetic Analyzer")
    AB_3500_X_L_GENETIC_ANALYZER("AB 3500xL Genetic Analyzer"),
    @XmlEnumValue("AB 3500 Genetic Analyzer")
    AB_3500_GENETIC_ANALYZER("AB 3500 Genetic Analyzer"),
    @XmlEnumValue("AB 3130xL Genetic Analyzer")
    AB_3130_X_L_GENETIC_ANALYZER("AB 3130xL Genetic Analyzer"),
    @XmlEnumValue("AB 3130 Genetic Analyzer")
    AB_3130_GENETIC_ANALYZER("AB 3130 Genetic Analyzer"),
    @XmlEnumValue("AB 310 Genetic Analyzer")
    AB_310_GENETIC_ANALYZER("AB 310 Genetic Analyzer"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeCapillaryModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCapillaryModel fromValue(String v) {
        for (TypeCapillaryModel c: TypeCapillaryModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
