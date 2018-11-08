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
 * <p>Java class for typeOxfordNanoporeModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOxfordNanoporeModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinION"/>
 *     &lt;enumeration value="GridION"/>
 *     &lt;enumeration value="PromethION"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOxfordNanoporeModel", namespace = "SRA.common")
@XmlEnum
public enum TypeOxfordNanoporeModel {

    @XmlEnumValue("MinION")
    MIN_ION("MinION"),
    @XmlEnumValue("GridION")
    GRID_ION("GridION"),
    @XmlEnumValue("PromethION")
    PROMETH_ION("PromethION"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeOxfordNanoporeModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOxfordNanoporeModel fromValue(String v) {
        for (TypeOxfordNanoporeModel c: TypeOxfordNanoporeModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
