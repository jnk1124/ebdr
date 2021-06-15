package com.gscaltex.mobile.ebdr.Service;

import com.gscaltex.mobile.ebdr.Ropository.EbdrRepository;
import com.gscaltex.mobile.ebdr.domains.*;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EbdrService {

    private final EbdrRepository ebdrRepository;

    public List<EbdrHeaderDto> getList(String startDt, String endDt, String status, String werks, String userId){

        List<EbdrHeader> bdrList
                = ebdrRepository.getBdrList(LocalDateTime.parse(startDt + "T00:00:00"),
                                            LocalDateTime.parse(endDt + "T23:59:59"),
                                            status, werks, userId);

        List<EbdrHeaderDto> collect = bdrList.stream().map(h -> new EbdrHeaderDto(h)).collect(Collectors.toList());

        return collect;
    }

    @Transactional
    public ResponseResult saveEbdr(JSONObject requestData) {

        //linkedHashMap
        Map<String, String> header = (HashMap<String, String>)requestData.get("Header");
        //ArrayList<linkedHashMap>
        List<Map<String, String>> products = (List<Map<String, String>>)requestData.get("Product");
        //ArrayList<linkedHashMap>
        List<Map<String, String>> samples = (List<Map<String, String>>)requestData.get("Sample");


        EbdrHeader ebdrHeader1 = new EbdrHeader(header);
        EbdrHeader ebdrHeader = ebdrHeader1;

        List<EbdrProduct> ebdrProducts
                = products.stream().map(p -> new EbdrProduct(p)).collect(Collectors.toList());

        List<EbdrSample> ebdrSamples
                = samples.stream().map(s -> new EbdrSample(s)).collect(Collectors.toList());


        if("2".equals(header.get("STATUS"))){
            // 메일발송 및 저장
        }else{
           // ebdrRepository.save(header, products, samples);
        }

        String code = "";
        String message = "";

        return new ResponseResult(code, message);
    }
}
