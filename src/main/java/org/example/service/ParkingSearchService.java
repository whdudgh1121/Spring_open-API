package org.example.service;

import org.example.model.ParkInfoVO;

import java.util.List;
import java.util.Map;

public interface ParkingSearchService {

    public List<ParkInfoVO> searchBookList (String uri, Map<String, String> requestHeaders) throws Exception;
}
