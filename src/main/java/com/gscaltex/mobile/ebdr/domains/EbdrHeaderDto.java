package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
public class EbdrHeaderDto {
    private String B_BDRNO;
    private String B_DELINSTNO;
    private String B_VESSEL;
    private String B_OWNER;
    private String B_NOMI;
    private String B_TML;
    private String B_PORT;
    private String B_TRANSMODE;
    private String PUMPING_START1;
    private String PUMPING_FINISH1;
    private String B_ORDERREFNO;
    private String B_BARGENM;
    private String B_AGENT;
    private String IMO_NO               ;
    private String DELIVERY_DATE        ;
    private String SPECIFIED_LIMIT_VALUE;
    private String REMARK               ;
    private String PUMPING_START2       ;
    private String PUMPING_FINISH2      ;
    private String MOBILE_EMAIL1        ;
    private String MOBILE_EMAIL2        ;
    private String MOBILE_EMAIL3        ;
    private String MOBILE_EMAIL4        ;
    private String MOBILE_EMAIL5        ;
    private String SIGN1                ;
    private String SIGN2                ;
    private String SIGN3                ;
    private String STATUS               ;
    private String WERKS                ;
    private String MARPOL_OPTION        ;
    private String REG_CARRIER          ;

    private List<EbdrProductDto> productDto;
    //private List<EbdrSampleDto> sampleDto;

    public EbdrHeaderDto(String b_BDRNO, String b_DELINSTNO, String b_VESSEL, String b_OWNER, String b_NOMI, String b_TML, String b_PORT, String b_TRANSMODE, String PUMPING_START1, String PUMPING_FINISH1, String b_ORDERREFNO, String b_BARGENM, String b_AGENT, String IMO_NO, String DELIVERY_DATE, String SPECIFIED_LIMIT_VALUE, String REMARK, String PUMPING_START2, String PUMPING_FINISH2, String MOBILE_EMAIL1, String MOBILE_EMAIL2, String MOBILE_EMAIL3, String MOBILE_EMAIL4, String MOBILE_EMAIL5, String SIGN1, String SIGN2, String SIGN3, String STATUS, String WERKS, String MARPOL_OPTION, String REG_CARRIER) {
        this.B_BDRNO = b_BDRNO;
        this.B_DELINSTNO = b_DELINSTNO;
        this.B_VESSEL = b_VESSEL;
        this.B_OWNER = b_OWNER;
        this.B_NOMI = b_NOMI;
        this.B_TML = b_TML;
        this.B_PORT = b_PORT;
        this.B_TRANSMODE = b_TRANSMODE;
        this.PUMPING_START1 = PUMPING_START1;
        this.PUMPING_FINISH1 = PUMPING_FINISH1;
        this.B_ORDERREFNO = b_ORDERREFNO;
        this.B_BARGENM = b_BARGENM;
        this.B_AGENT = b_AGENT;
        this.IMO_NO = IMO_NO;
        this.DELIVERY_DATE = DELIVERY_DATE;
        this.SPECIFIED_LIMIT_VALUE = SPECIFIED_LIMIT_VALUE;
        this.REMARK = REMARK;
        this.PUMPING_START2 = PUMPING_START2;
        this.PUMPING_FINISH2 = PUMPING_FINISH2;
        this.MOBILE_EMAIL1 = MOBILE_EMAIL1;
        this.MOBILE_EMAIL2 = MOBILE_EMAIL2;
        this.MOBILE_EMAIL3 = MOBILE_EMAIL3;
        this.MOBILE_EMAIL4 = MOBILE_EMAIL4;
        this.MOBILE_EMAIL5 = MOBILE_EMAIL5;
        this.SIGN1 = SIGN1;
        this.SIGN2 = SIGN2;
        this.SIGN3 = SIGN3;
        this.STATUS = STATUS;
        this.WERKS = WERKS;
        this.MARPOL_OPTION = MARPOL_OPTION;
        this.REG_CARRIER = REG_CARRIER;
    }

    public EbdrHeaderDto(EbdrHeader h){
        this.B_BDRNO = h.getB_BDRNO();
        this.B_DELINSTNO = h.getB_DELINSTNO();
        this.B_VESSEL = h.getB_VESSEL();
        this.B_OWNER = h.getB_OWNER();
        this.B_NOMI = h.getB_NOMI();
        this.B_TML = h.getB_TML();
        this.B_PORT = h.getB_PORT();
        this.B_TRANSMODE = h.getB_TRANSMODE();
        this.PUMPING_START1 = h.getPUMPING_START1();
        this.PUMPING_FINISH1 = h.getPUMPING_FINISH1();
        this.B_ORDERREFNO = h.getB_ORDERREFNO();
        this.B_BARGENM = h.getB_BARGENM();
        this.B_AGENT = h.getB_AGENT();
        this.IMO_NO = h.getIMO_NO();
        this.DELIVERY_DATE = h.getDELIVERY_DATE();
        this.SPECIFIED_LIMIT_VALUE = h.getSPECIFIED_LIMIT_VALUE();
        this.REMARK = h.getREMARK();
        this.PUMPING_START2 = h.getPUMPING_START2();
        this.PUMPING_FINISH2 = h.getPUMPING_FINISH2();
        this.MOBILE_EMAIL1 = h.getMOBILE_EMAIL1();
        this.MOBILE_EMAIL2 = h.getMOBILE_EMAIL2();
        this.MOBILE_EMAIL3 = h.getMOBILE_EMAIL3();
        this.MOBILE_EMAIL4 = h.getMOBILE_EMAIL4();
        this.MOBILE_EMAIL5 = h.getMOBILE_EMAIL5();
        this.SIGN1 = h.getSIGN1();
        this.SIGN2 = h.getSIGN2();
        this.SIGN3 = h.getSIGN3();
        this.STATUS = h.getSTATUS();
        this.WERKS = h.getWERKS();
        this.MARPOL_OPTION = h.getMARPOL_OPTION();
        this.REG_CARRIER = h.getREG_CARRIER();

        System.out.println("=============headerDto 1");

        this.productDto = h.getProducts().stream()
                .map(p -> new EbdrProductDto(p)).collect(Collectors.toList());

        System.out.println("=============headerDto 2");

   /*     this.sampleDto = h.getProducts().stream()
                .map(p -> new EbdrSampleDto(p.getEbdrSample())).collect(Collectors.toList());
*/
    }

}
