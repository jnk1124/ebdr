package com.gscaltex.mobile.ebdr.Controller;

import com.gscaltex.mobile.ebdr.Service.EbdrService;
import com.gscaltex.mobile.ebdr.domains.EbdrHeader;
import com.gscaltex.mobile.ebdr.domains.EbdrHeaderDto;
import com.gscaltex.mobile.ebdr.domains.ResponseResult;
import lombok.*;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class EbdrController {

    private final EbdrService ebdrService;

    @PostMapping("/EBDR/requestEBDRInsertUpdate.do")
    public ResponseResult requestEBDRInsertUpdate(
            @RequestBody JSONObject requstData
            ){

        ResponseResult responseResult = ebdrService.saveEbdr(requstData);

        return responseResult;
    }

    @PostMapping("/api/selectList")
    public Result selectList(
            @RequestBody SelectParam selectParam
    ){
        System.out.println("selectParam = " + selectParam.toString());

        List<EbdrHeaderDto> list = ebdrService.getList(selectParam.getStartDt(), selectParam.getEndDt(), selectParam.getStatus()
                                                        ,selectParam.getWerks(), selectParam.getUserId());

        return new Result(list, list.size());
    }

    @AllArgsConstructor
    private class Result<T>{
        private T data;
        private int count;
    }

    @Getter @Setter
    static class SelectParam {
        private String startDt;
        private String endDt;
        private String werks;
        private String userId;
        private String status;

        @Override
        public String toString() {
            return "SelectParam{" +
                    "startDt='" + startDt + '\'' +
                    ", endDt='" + endDt + '\'' +
                    ", werks='" + werks + '\'' +
                    ", userId='" + userId + '\'' +
                    '}';
        }
    }
}
