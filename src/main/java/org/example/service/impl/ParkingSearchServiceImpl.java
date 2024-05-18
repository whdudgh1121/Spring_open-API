package org.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.adapter.ParkingInfoSearchInterface;
import org.example.model.ParkInfoVO;
import org.example.service.ParkingSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("parkingSearchService")
public class ParkingSearchServiceImpl implements ParkingSearchService {
    ParkingInfoSearchInterface bookSearchInterface = new ParkingInfoSearchInterface();

    @Override
    public List<ParkInfoVO> searchBookList (String url, Map<String, String> requestHeaders) throws Exception {

        String responseBody =  bookSearchInterface.getParkingInfo(url, requestHeaders);
        ObjectMapper mapper = new ObjectMapper();
        ParkInfoVO resultVO  = null;

        try {
            resultVO = mapper.readValue(responseBody, ParkInfoVO.class);

        } catch (JsonMappingException e) {
            throw new Exception("JSON 에러 : " + e);
        } catch (JsonProcessingException e) {
            throw new Exception("JSON 에러 : " + e);
        }

        List<ParkInfoVO> parks =resultVO.getItems();


        for (int i=0 ; i < parks.size(); i++) {
            ParkInfoVO parkInfo = parks.get(i);
            System.out.println(i+" ==> "+parkInfo.getPARKING_CODE());
        }

        return  parks;

    }
}
