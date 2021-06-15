package com.gscaltex.mobile.ebdr.Ropository;

import com.gscaltex.mobile.ebdr.domains.EbdrHeader;
import com.gscaltex.mobile.ebdr.domains.EbdrHeaderDto;
import com.gscaltex.mobile.ebdr.domains.EbdrProduct;
import com.gscaltex.mobile.ebdr.domains.EbdrSample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EbdrRepository {

    private final EntityManager em;

    public void save(EbdrHeader ebdrHeader, List<EbdrProduct> ebdrProducts, List<EbdrSample> ebdrSamples){

    }

    public List<EbdrHeader> getBdrList(LocalDateTime startDt, LocalDateTime endDt, String status,String werks, String userId){

        return em.createQuery("select distinct h" +
                        " from EbdrHeader h" +
                        " join fetch h.products p " +
                        //" join fetch p.ebdrSample s" +
                        " where h.WERKS = :werks" +
                        " and h.registerInfo.REG_DATE between :startDt and :endDt" +
                        //" and h.STATUS = :status" +
                        " and h.registerInfo.REG_ID = :userId ", EbdrHeader.class)
                .setParameter("userId", userId)
                .setParameter("startDt", startDt)
                .setParameter("endDt", endDt)
                .setParameter("werks", werks)
                .getResultList();

    }

}
