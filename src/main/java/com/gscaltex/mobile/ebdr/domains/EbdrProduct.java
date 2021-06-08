package com.gscaltex.mobile.ebdr.domains;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TB_BDR_INFO_PROD")
public class EbdrProduct {
    @Id
    private String B_BDRNO;
    @Id
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
    @Embedded
    private RegisterInfo registerInfo;

    @JoinColumn(name="B_BDRNO")
    @ManyToOne(fetch = FetchType.LAZY)
    private EbdrHeader ebdrHeader;

    @OneToOne(mappedBy = "ebdrProduct")
    @JoinColumn(name = "BDRNO_SMP_SEQ")
    private EbdrSample ebdrSample;


}
