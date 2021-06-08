package com.gscaltex.mobile.ebdr.domains;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TB_BDR_INFO_SAMPLE")
public class EbdrSample {

    @Id
    private String B_BDRNO;
    @Id
    private String BDRNO_SMP_SEQ;
    private String B_DELINSTNO;
    private String MARPOL;
    private String QUALTY1;
    private String QUALTY2;
    private String REFERENCE;
    @Embedded
    private RegisterInfo registerInfo;

    @OneToOne(fetch = FetchType.LAZY)
    private EbdrProduct ebdrProduct;
}
