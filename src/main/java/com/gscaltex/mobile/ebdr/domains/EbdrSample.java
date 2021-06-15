package com.gscaltex.mobile.ebdr.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TB_BDR_INFO_SAMPLE")
public class EbdrSample implements Serializable {

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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "ebdrSample")
    private EbdrProduct ebdrProduct;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EbdrSample that = (EbdrSample) o;
        return B_BDRNO.equals(that.B_BDRNO) && BDRNO_SMP_SEQ.equals(that.BDRNO_SMP_SEQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(B_BDRNO, BDRNO_SMP_SEQ);
    }

    public void setProduct(EbdrProduct product) {
        this.ebdrProduct = product;
    }

    public EbdrSample(Map<String, String> sample){
        B_BDRNO = sample.get("B_BDRNO");
        BDRNO_SMP_SEQ = sample.get("B_BDRNO");
        B_DELINSTNO = sample.get("B_BDRNO");
        MARPOL= sample.get("B_BDRNO");
        QUALTY1= sample.get("B_BDRNO");
        QUALTY2= sample.get("B_BDRNO");
        REFERENCE= sample.get("B_BDRNO");
    }
}
