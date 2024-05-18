package org.example.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import org.example.model.ParkInfoVO;
import org.example.service.ParkingSearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import javax.annotation.Resource;
import java.net.URLEncoder;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ParkingSearchController {

    @RequestMapping(value = "/parkingInfo")
    public String parkingInfo() {
        return "parkingInfo"; // parkingInfo.html 파일의 이름을 리턴.
    }


    @RequestMapping(value = "/parkingsearch")
    public String parkingSearchList(String keyword, Model m) throws IOException {

        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088"); /*URL*/
        urlBuilder.append("/" +  URLEncoder.encode("4f7344547a77686434344441594476","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" +  URLEncoder.encode("json","UTF-8") ); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("GetParkingInfo","UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode("1000","UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/
        // 상위 5개는 필수적으로 순서바꾸지 않고 호출해야 합니다.

        // 서비스별 추가 요청 인자이며 자세한 내용은 각 서비스별 '요청인자'부분에 자세히 나와 있습니다.
        urlBuilder.append("/" + URLEncoder.encode(keyword,"UTF-8")); /* 서비스별 추가 요청인자들*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/xml");
        System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
        BufferedReader rd;


        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        StringBuilder combinedSB = new StringBuilder();
        combinedSB.append(sb.toString());
        String combinedString = combinedSB.toString();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(combinedString);

        // JSON에서 필요한 데이터를 추출하여 모델에 추가
        JsonNode parkingInfoNode = rootNode.path("GetParkingInfo");
        JsonNode parkingInfoArrayNode = parkingInfoNode.path("row");
        System.out.println(combinedSB);
        List<ParkInfoVO> parkingInfoList = new ArrayList<>();

        for (JsonNode parkingNode : parkingInfoArrayNode) {
            String parkingName = parkingNode.path("PARKING_NAME").asText();
            String address = parkingNode.path("ADDR").asText();
            String lat = parkingNode.path("LAT").asText();
            String lng = parkingNode.path("LNG").asText();
            Integer capacity = parkingNode.path("CAPACITY").asInt();
            String curTime = parkingNode.path("CUR_PARKING_TIME").asText();
            Integer curParking = parkingNode.path("CUR_PARKING").asInt();
            String pay = parkingNode.path("PAY_YN").asText();
            String wdBegin = parkingNode.path("WEEKDAY_BEGIN_TIME").asText();
            String wdEnd = parkingNode.path("WEEKDAY_END_TIME").asText();
            String weBegin = parkingNode.path("WEEKEND_BEGIN_TIME").asText();
            String weEnd = parkingNode.path("WEEKEND_END_TIME").asText();
            String rates = parkingNode.path("RATES").asText();
            String timeRate = parkingNode.path("TIME_RATE").asText();
            String addRates = parkingNode.path("ADD_RATES").asText();
            String addTimeRate = parkingNode.path("ADD_TIME_RATE").asText();
            String dayMax = parkingNode.path("DAY_MAXIMUM").asText();
            // 주차장 정보 객체 생성
            ParkInfoVO parkingInfo = new ParkInfoVO(parkingName, address, lat, lng, capacity, curTime, curParking, pay, wdBegin, wdEnd, weBegin, weEnd, rates, timeRate, addRates, addTimeRate, dayMax);
            parkingInfoList.add(parkingInfo);
        }

        // 모델에 주차장 정보 리스트 추가
        m.addAttribute("parkingInfoList", parkingInfoList);

        // View로 이동
        return "parkingInfo";

        }
    }