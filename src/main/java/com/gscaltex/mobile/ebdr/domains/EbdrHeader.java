package com.gscaltex.mobile.ebdr.domains;

import lombok.*;

import javax.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Entity
@Getter @Setter
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
    private String REG_CARRIER;

    @Embedded
    private RegisterInfo registerInfo;

    @OneToMany(mappedBy = "ebdrHeader")
    private List<EbdrProduct> products = new ArrayList<>();

    public void setProducts(List<EbdrProduct> products){
        this.products = products;
    }

    public void setProduct(EbdrProduct product) {
        this.products.add(product);
    }

    public EbdrHeader(Map<String, String> header){
        this.B_BDRNO = header.get("B_BDRNO");
        this.B_DELINSTNO = header.get("B_DELINSTNO");
        this.B_VESSEL = header.get("B_VESSEL");
        this.B_OWNER = header.get("B_OWNER");
        this.B_NOMI = header.get("B_NOMI");
        this.B_TML = header.get("B_TML");
        this.B_PORT = header.get("B_PORT");
        this.B_TRANSMODE = header.get("B_TRANSMODE");
        this.PUMPING_START1 = header.get("PUMPING_START1");
        this.PUMPING_FINISH1 = header.get("PUMPING_FINISH1");
        this.B_ORDERREFNO = header.get("B_ORDERREFNO");
        this.B_BARGENM = header.get("B_BARGENM");
        this.B_AGENT = header.get("B_AGENT");
        this.IMO_NO  = header.get("IMO_NO");
        this.DELIVERY_DATE = header.get("DELIVERY_DATE");
        this.SPECIFIED_LIMIT_VALUE = header.get("SPECIFIED_LIMIT_VALUE");
        this.REMARK = header.get("REMARK");
        this.PUMPING_START2 = header.get("PUMPING_START2");
        this.PUMPING_FINISH2 = header.get("PUMPING_FINISH2");
        this.MOBILE_EMAIL1 = header.get("MOBILE_EMAIL1");
        this.MOBILE_EMAIL2 = header.get("MOBILE_EMAIL2");
        this.MOBILE_EMAIL3 = header.get("MOBILE_EMAIL3");
        this.MOBILE_EMAIL4 = header.get("MOBILE_EMAIL4");
        this.MOBILE_EMAIL5 = header.get("MOBILE_EMAIL5");
        this.SIGN1 = header.get("SIGN1");
        this.SIGN2 = header.get("SIGN2");
        this.SIGN3 = header.get("SIGN3");
        this.STATUS = header.get("STATUS");
        this.WERKS = header.get("WERKS");
        this.MARPOL_OPTION = header.get("MARPOL_OPTION");
        this.REG_CARRIER = header.get("REG_ID");
    }
/*
    public EbdrHeader(Map<String, String> sapItem){
        this.B_BDRNO = sapItem.get("B_BDRNO");
        this.B_DELINSTNO = sapItem.get("B_DELINSTNO");
        this.B_VESSEL = sapItem.get("B_VESSEL");
        this.B_OWNER = sapItem.get("B_OWNER");
        this.B_NOMI = sapItem.get("B_NOMI");
        this.B_TML = sapItem.get("B_TML");
        this.B_PORT = sapItem.get("B_PORT");
        this.B_TRANSMODE = sapItem.get("B_TRANSMODE");
        this.PUMPING_START1 = "";
        this.PUMPING_FINISH1 = "";
        this.B_ORDERREFNO = sapItem.get("B_ORDERREFNO");
        this.B_BARGENM = sapItem.get("B_BARGENM");
        this.B_AGENT = sapItem.get("B_AGENT");
        this.IMO_NO  = "";
        this.DELIVERY_DATE = "";
        this.SPECIFIED_LIMIT_VALUE = "";
        this.REMARK = "";
        this.PUMPING_START2 = "";
        this.PUMPING_FINISH2 = "";
        this.MOBILE_EMAIL1 = sapItem.get("LIFNR_MAIL");
        this.MOBILE_EMAIL2 = sapItem.get("KUNAG_MAIL");
        this.MOBILE_EMAIL3 = "";
        this.MOBILE_EMAIL4 = "";
        this.MOBILE_EMAIL5 = "";
        this.SIGN1 = "";
        this.SIGN2 = "";
        this.SIGN3 = "";
        this.STATUS = "";
        this.WERKS = sapItem.get("WERKS");
        this.MARPOL_OPTION = "";
        this.REG_CARRIER = sapItem.get("CARRIER").substring(4);
    }*/

    /*public EbdrHeader(ResultSet rs, String romys){
        this.B_BDRNO = "";
        this.B_DELINSTNO = "";
        this.B_VESSEL = "";
        this.B_OWNER = "";
        this.B_NOMI = "";
        this.B_TML = "";
        this.B_PORT = "";
        this.B_TRANSMODE = "";
        this.PUMPING_START1 = "";
        this.PUMPING_FINISH1 = "";
        this.B_ORDERREFNO = "";
        this.B_BARGENM = "";
        this.B_AGENT = "";
        this.IMO_NO  = "";
        this.DELIVERY_DATE = "";
        this.SPECIFIED_LIMIT_VALUE = "";
        this.REMARK = "";
        this.PUMPING_START2 = "";
        this.PUMPING_FINISH2 = "";
        this.MOBILE_EMAIL1 = "";
        this.MOBILE_EMAIL2 = "";
        this.MOBILE_EMAIL3 = "";
        this.MOBILE_EMAIL4 = "";
        this.MOBILE_EMAIL5 = "";
        this.SIGN1 = "";
        this.SIGN2 = "";
        this.SIGN3 = "";
        this.STATUS = "";
        this.WERKS = "";
        this.MARPOL_OPTION = "";
        this.REG_CARRIER = "";
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EbdrHeader that = (EbdrHeader) o;
        return B_BDRNO.equals(that.B_BDRNO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(B_BDRNO);
    }
}
