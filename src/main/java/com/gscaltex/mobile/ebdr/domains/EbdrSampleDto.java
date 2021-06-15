package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EbdrSampleDto {
    private String B_BDRNO;
    private String BDRNO_SMP_SEQ;
    private String B_DELINSTNO;
    private String MARPOL;
    private String QUALTY1;
    private String QUALTY2;
    private String REFERENCE;

    public EbdrSampleDto(EbdrSample s){
        this.BDRNO_SMP_SEQ = s.getBDRNO_SMP_SEQ();
        this.B_BDRNO = s.getB_BDRNO();
        this.B_DELINSTNO = s.getB_DELINSTNO();
        this.MARPOL = s.getMARPOL();
        this.QUALTY1 = s.getQUALTY1();
        this.QUALTY2 = s.getQUALTY2();
        this.REFERENCE = s.getREFERENCE();

        System.out.println("=============sampleDto");
    }
}
