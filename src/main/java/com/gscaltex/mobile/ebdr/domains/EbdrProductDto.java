package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EbdrProductDto {
    private String B_BDRNO;
    private String BDRNO_PRD_SEQ;
    private String B_DELINSTNO;
    private String B_PRODCODE;
    private String B_PRODNAME;
    private String B_TEMP;
    private String B_B60VOL;
    private String B_TONQTY;
    private String B_L15QTY;
    private String B_DENSITY;
    private String B_VISCOSITY;
    private String B_FLASH;
    private String B_SEDIMENT;
    private String B_SULFUR;

    public EbdrProductDto(EbdrProduct p){
        B_BDRNO = p.getB_BDRNO();
        BDRNO_PRD_SEQ = p.getBDRNO_PRD_SEQ();
        B_DELINSTNO = p.getB_DELINSTNO();
        B_PRODCODE = p.getB_PRODCODE();
        B_PRODNAME = p.getB_PRODNAME();
        B_TEMP = p.getB_TEMP();
        B_B60VOL = p.getB_B60VOL();
        B_TONQTY = p.getB_TONQTY();
        B_L15QTY = p.getB_L15QTY();
        B_DENSITY = p.getB_DENSITY();
        B_VISCOSITY = p.getB_VISCOSITY();
        B_FLASH = p.getB_FLASH();
        B_SEDIMENT = p.getB_SEDIMENT();
        B_SULFUR = p.getB_SULFUR();
        System.out.println("=============productDto");
    }
}
