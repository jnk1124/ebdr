package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Embeddable
@NoArgsConstructor
public class ProductId implements Serializable {
    private String B_BDRNO;
    private String BDRNO_PRD_SEQ;

    public ProductId(String bdrno, String seq){
        this.B_BDRNO = bdrno;
        this.BDRNO_PRD_SEQ = seq;
    }
}
