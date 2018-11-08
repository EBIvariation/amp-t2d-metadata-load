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
package uk.ac.ebi.ampt2d.metadata.sra;

import uk.ac.ebi.ampt2d.metadata.sra.common.AttributeType;
import uk.ac.ebi.ampt2d.metadata.sra.common.IdentifierType;
import uk.ac.ebi.ampt2d.metadata.sra.common.LinkType;
import uk.ac.ebi.ampt2d.metadata.sra.common.NameType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.PipelineType;
import uk.ac.ebi.ampt2d.metadata.sra.common.PlatformType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ProcessingType;
import uk.ac.ebi.ampt2d.metadata.sra.common.QualifiedNameType;
import uk.ac.ebi.ampt2d.metadata.sra.common.RefObjectType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ReferenceAssemblyType;
import uk.ac.ebi.ampt2d.metadata.sra.common.ReferenceSequenceType;
import uk.ac.ebi.ampt2d.metadata.sra.common.SequencingDirectivesType;
import uk.ac.ebi.ampt2d.metadata.sra.common.SpotDescriptorType;
import uk.ac.ebi.ampt2d.metadata.sra.common.URLType;
import uk.ac.ebi.ampt2d.metadata.sra.common.XRefType;
import uk.ac.ebi.ampt2d.metadata.sra.study.StudySetType;
import uk.ac.ebi.ampt2d.metadata.sra.study.StudyType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.ebi.ampt2d.metadata.sra package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _STUDY_QNAME = new QName("", "STUDY");
    private final static QName _STUDYSET_QNAME = new QName("", "STUDY_SET");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.ebi.ampt2d.metadata.sra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlatformType }
     * 
     */
    public PlatformType createPlatformType() {
        return new PlatformType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType }
     * 
     */
    public ReferenceAssemblyType createReferenceAssemblyType() {
        return new ReferenceAssemblyType();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.CUSTOM }
     * 
     */
    public ReferenceAssemblyType.CUSTOM createReferenceAssemblyTypeCUSTOM() {
        return new ReferenceAssemblyType.CUSTOM();
    }

    /**
     * Create an instance of {@link SpotDescriptorType }
     * 
     */
    public SpotDescriptorType createSpotDescriptorType() {
        return new SpotDescriptorType();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC createSpotDescriptorTypeSPOTDECODESPEC() {
        return new SpotDescriptorType.SPOTDECODESPEC();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC createSpotDescriptorTypeSPOTDECODESPECREADSPEC() {
        return new SpotDescriptorType.SPOTDECODESPEC.READSPEC();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE createSpotDescriptorTypeSPOTDECODESPECREADSPECEXPECTEDBASECALLTABLE() {
        return new SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE();
    }

    /**
     * Create an instance of {@link PipelineType }
     * 
     */
    public PipelineType createPipelineType() {
        return new PipelineType();
    }

    /**
     * Create an instance of {@link ReferenceSequenceType }
     * 
     */
    public ReferenceSequenceType createReferenceSequenceType() {
        return new ReferenceSequenceType();
    }

    /**
     * Create an instance of {@link StudyType }
     * 
     */
    public StudyType createStudyType() {
        return new StudyType();
    }

    /**
     * Create an instance of {@link StudyType.DESCRIPTOR }
     * 
     */
    public StudyType.DESCRIPTOR createStudyTypeDESCRIPTOR() {
        return new StudyType.DESCRIPTOR();
    }

    /**
     * Create an instance of {@link StudyType.DESCRIPTOR.RELATEDSTUDIES }
     * 
     */
    public StudyType.DESCRIPTOR.RELATEDSTUDIES createStudyTypeDESCRIPTORRELATEDSTUDIES() {
        return new StudyType.DESCRIPTOR.RELATEDSTUDIES();
    }

    /**
     * Create an instance of {@link StudySetType }
     * 
     */
    public StudySetType createStudySetType() {
        return new StudySetType();
    }

    /**
     * Create an instance of {@link SequencingDirectivesType }
     * 
     */
    public SequencingDirectivesType createSequencingDirectivesType() {
        return new SequencingDirectivesType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link XRefType }
     * 
     */
    public XRefType createXRefType() {
        return new XRefType();
    }

    /**
     * Create an instance of {@link QualifiedNameType }
     * 
     */
    public QualifiedNameType createQualifiedNameType() {
        return new QualifiedNameType();
    }

    /**
     * Create an instance of {@link ProcessingType }
     * 
     */
    public ProcessingType createProcessingType() {
        return new ProcessingType();
    }

    /**
     * Create an instance of {@link RefObjectType }
     * 
     */
    public RefObjectType createRefObjectType() {
        return new RefObjectType();
    }

    /**
     * Create an instance of {@link PlatformType.LS454 }
     * 
     */
    public PlatformType.LS454 createPlatformTypeLS454() {
        return new PlatformType.LS454();
    }

    /**
     * Create an instance of {@link PlatformType.ILLUMINA }
     * 
     */
    public PlatformType.ILLUMINA createPlatformTypeILLUMINA() {
        return new PlatformType.ILLUMINA();
    }

    /**
     * Create an instance of {@link PlatformType.HELICOS }
     * 
     */
    public PlatformType.HELICOS createPlatformTypeHELICOS() {
        return new PlatformType.HELICOS();
    }

    /**
     * Create an instance of {@link PlatformType.ABISOLID }
     * 
     */
    public PlatformType.ABISOLID createPlatformTypeABISOLID() {
        return new PlatformType.ABISOLID();
    }

    /**
     * Create an instance of {@link PlatformType.COMPLETEGENOMICS }
     * 
     */
    public PlatformType.COMPLETEGENOMICS createPlatformTypeCOMPLETEGENOMICS() {
        return new PlatformType.COMPLETEGENOMICS();
    }

    /**
     * Create an instance of {@link PlatformType.BGISEQ }
     * 
     */
    public PlatformType.BGISEQ createPlatformTypeBGISEQ() {
        return new PlatformType.BGISEQ();
    }

    /**
     * Create an instance of {@link PlatformType.OXFORDNANOPORE }
     * 
     */
    public PlatformType.OXFORDNANOPORE createPlatformTypeOXFORDNANOPORE() {
        return new PlatformType.OXFORDNANOPORE();
    }

    /**
     * Create an instance of {@link PlatformType.PACBIOSMRT }
     * 
     */
    public PlatformType.PACBIOSMRT createPlatformTypePACBIOSMRT() {
        return new PlatformType.PACBIOSMRT();
    }

    /**
     * Create an instance of {@link PlatformType.IONTORRENT }
     * 
     */
    public PlatformType.IONTORRENT createPlatformTypeIONTORRENT() {
        return new PlatformType.IONTORRENT();
    }

    /**
     * Create an instance of {@link PlatformType.CAPILLARY }
     * 
     */
    public PlatformType.CAPILLARY createPlatformTypeCAPILLARY() {
        return new PlatformType.CAPILLARY();
    }

    /**
     * Create an instance of {@link LinkType.URLLINK }
     * 
     */
    public LinkType.URLLINK createLinkTypeURLLINK() {
        return new LinkType.URLLINK();
    }

    /**
     * Create an instance of {@link LinkType.ENTREZLINK }
     * 
     */
    public LinkType.ENTREZLINK createLinkTypeENTREZLINK() {
        return new LinkType.ENTREZLINK();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.STANDARD }
     * 
     */
    public ReferenceAssemblyType.STANDARD createReferenceAssemblyTypeSTANDARD() {
        return new ReferenceAssemblyType.STANDARD();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.CUSTOM.URLLINK }
     * 
     */
    public ReferenceAssemblyType.CUSTOM.URLLINK createReferenceAssemblyTypeCUSTOMURLLINK() {
        return new ReferenceAssemblyType.CUSTOM.URLLINK();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER createSpotDescriptorTypeSPOTDECODESPECREADSPECRELATIVEORDER() {
        return new SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL createSpotDescriptorTypeSPOTDECODESPECREADSPECEXPECTEDBASECALLTABLEBASECALL() {
        return new SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL();
    }

    /**
     * Create an instance of {@link PipelineType.PIPESECTION }
     * 
     */
    public PipelineType.PIPESECTION createPipelineTypePIPESECTION() {
        return new PipelineType.PIPESECTION();
    }

    /**
     * Create an instance of {@link ReferenceSequenceType.SEQUENCE }
     * 
     */
    public ReferenceSequenceType.SEQUENCE createReferenceSequenceTypeSEQUENCE() {
        return new ReferenceSequenceType.SEQUENCE();
    }

    /**
     * Create an instance of {@link StudyType.STUDYLINKS }
     * 
     */
    public StudyType.STUDYLINKS createStudyTypeSTUDYLINKS() {
        return new StudyType.STUDYLINKS();
    }

    /**
     * Create an instance of {@link StudyType.STUDYATTRIBUTES }
     * 
     */
    public StudyType.STUDYATTRIBUTES createStudyTypeSTUDYATTRIBUTES() {
        return new StudyType.STUDYATTRIBUTES();
    }

    /**
     * Create an instance of {@link StudyType.DESCRIPTOR.STUDYTYPE }
     * 
     */
    public StudyType.DESCRIPTOR.STUDYTYPE createStudyTypeDESCRIPTORSTUDYTYPE() {
        return new StudyType.DESCRIPTOR.STUDYTYPE();
    }

    /**
     * Create an instance of {@link StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY }
     * 
     */
    public StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY createStudyTypeDESCRIPTORRELATEDSTUDIESRELATEDSTUDY() {
        return new StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STUDY")
    public JAXBElement<StudyType> createSTUDY(StudyType value) {
        return new JAXBElement<StudyType>(_STUDY_QNAME, StudyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudySetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STUDY_SET")
    public JAXBElement<StudySetType> createSTUDYSET(StudySetType value) {
        return new JAXBElement<StudySetType>(_STUDYSET_QNAME, StudySetType.class, null, value);
    }

}
