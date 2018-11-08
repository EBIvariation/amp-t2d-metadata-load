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
 * <p>Java class for typeIontorrentModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeIontorrentModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ion Torrent PGM"/>
 *     &lt;enumeration value="Ion Torrent Proton"/>
 *     &lt;enumeration value="Ion Torrent S5"/>
 *     &lt;enumeration value="Ion Torrent S5 XL"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeIontorrentModel", namespace = "SRA.common")
@XmlEnum
public enum TypeIontorrentModel {

    @XmlEnumValue("Ion Torrent PGM")
    ION_TORRENT_PGM("Ion Torrent PGM"),
    @XmlEnumValue("Ion Torrent Proton")
    ION_TORRENT_PROTON("Ion Torrent Proton"),
    @XmlEnumValue("Ion Torrent S5")
    ION_TORRENT_S_5("Ion Torrent S5"),
    @XmlEnumValue("Ion Torrent S5 XL")
    ION_TORRENT_S_5_XL("Ion Torrent S5 XL"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeIontorrentModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeIontorrentModel fromValue(String v) {
        for (TypeIontorrentModel c: TypeIontorrentModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
