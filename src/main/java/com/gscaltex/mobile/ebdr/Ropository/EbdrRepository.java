package com.gscaltex.mobile.ebdr.Ropository;

import com.gscaltex.mobile.ebdr.domains.EbdrHeader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EbdrRepository {

    private final EntityManager em;

    public void save(EbdrHeader ebdrHeader){
        em.persist(ebdrHeader);
    }

    public List<EbdrHeader> findAll(){

    }

}
