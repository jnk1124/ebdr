package com.gscaltex.mobile.ebdr.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Objects;

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

    public void setHeader(EbdrHeader header){
        this.ebdrHeader = header;
        header.getProducts().add(this);
    }

    public void setSample(EbdrSample sample){
        this.ebdrSample = sample;
        ebdrSample.setProduct(this);
    }

    public EbdrProduct(ResultSet rs) throws SQLException {
        this.B_BDRNO        = rs.getString("B_BDRNO");
        this.BDRNO_PRD_SEQ  = rs.getString("BDRNO_PRD_SEQ");
        this.B_DELINSTNO    = rs.getString("B_DELINSTNO");
        this.B_PRODCODE     = rs.getString("B_PRODCODE");
        this.B_PRODNAME     = rs.getString("B_PRODNAME");
        this.B_TEMP         = rs.getString("B_TEMP");
        this.B_B60VOL       = rs.getString("B_B60VOL");
        this.B_TONQTY       = rs.getString("B_TONQTY");
        this.B_L15QTY       = rs.getString("B_L15QTY");
        this.B_DENSITY      = rs.getString("B_DENSITY");
        this.B_VISCOSITY    = rs.getString("B_VISCOSITY");
        this.B_FLASH        = rs.getString("B_FLASH");
        this.B_SEDIMENT     = rs.getString("B_SEDIMENT");
        this.B_SULFUR       = rs.getString("B_SULFUR");
    }

    public EbdrProduct(Map<String, String> product){
        this.B_BDRNO        = product.get("B_BDRNO");
        this.BDRNO_PRD_SEQ  = product.get("BDRNO_PRD_SEQ");
        this.B_DELINSTNO    = product.get("B_DELINSTNO");
        this.B_PRODCODE     = product.get("B_PRODCODE");
        this.B_PRODNAME     = product.get("B_PRODNAME");
        this.B_TEMP         = product.get("B_TEMP");
        this.B_B60VOL       = product.get("B_BDRNO");
        this.B_TONQTY       = product.get("B_TONQTY");
        this.B_L15QTY       = product.get("B_L15QTY");
        this.B_DENSITY      = product.get("B_DENSITY");
        this.B_VISCOSITY    = product.get("B_VISCOSITY");
        this.B_FLASH        = product.get("B_FLASH");
        this.B_SEDIMENT     = product.get("B_SEDIMENT");
        this.B_SULFUR       = product.get("B_SULFUR");
    }

    public EbdrProduct(Map<String, String> sapItem, String sap){
        this.B_BDRNO        = sapItem.get("B_BDRNO");
        this.BDRNO_PRD_SEQ  = "";
        this.B_DELINSTNO    = sapItem.get("B_DELINSTNO");
        this.B_PRODCODE     = sapItem.get("B_PRODCODE");
        this.B_PRODNAME     = sapItem.get("B_PRODNAME");
        this.B_TEMP         = sapItem.get("B_TEMP");
        this.B_B60VOL       = "";
        this.B_TONQTY       = sapItem.get("B_TONQTY");
        this.B_L15QTY       = sapItem.get("B_L15QTY");
        this.B_DENSITY      = sapItem.get("B_DENSITY");
        this.B_VISCOSITY    = sapItem.get("B_VISCOSITY");
        this.B_FLASH        = sapItem.get("B_FLASH");
        this.B_SEDIMENT     = sapItem.get("B_SEDIMENT");
        this.B_SULFUR       = sapItem.get("B_SULFUR");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EbdrProduct that = (EbdrProduct) o;
        return B_BDRNO.equals(that.B_BDRNO) && BDRNO_PRD_SEQ.equals(that.BDRNO_PRD_SEQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(B_BDRNO, BDRNO_PRD_SEQ);
    }
}
