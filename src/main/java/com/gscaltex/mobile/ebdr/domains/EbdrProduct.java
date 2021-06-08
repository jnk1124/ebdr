package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TB_BDR_INFO_PROD")
public class EbdrProduct implements Serializable{

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "B_BDRNO", referencedColumnName = "B_BDRNO"),
            @JoinColumn(name = "BDRNO_PRD_SEQ", referencedColumnName = "BDRNO_SMP_SEQ")}
    )
    private EbdrSample ebdrSample;
}
