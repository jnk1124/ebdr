package com.gscaltex.mobile.ebdr.domains;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@NoArgsConstructor
@Table(name = "TB_BDR_INFO")
public class EbdrHeader {
    @Id
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
    @Lob
    private String SIGN1                ;
    @Lob
    private String SIGN2                ;
    @Lob
    private String SIGN3                ;
    private String STATUS               ;
    private String WERKS                ;
    private String MARPOL_OPTION        ;
    @Embedded
    private RegisterInfo registerInfo;
    private String REG_CARRIER;

    @OneToMany(mappedBy = "ebdrHeader")
    private List<EbdrProduct> products = new ArrayList<>();
}
