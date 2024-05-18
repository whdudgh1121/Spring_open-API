package org.example.model;

import java.util.List;

public class ParkInfoVO {

        private String PARKING_CODE; //주차장 코드
        private String PARKING_NAME; //주차장 명                                             a
        private String ADDR; //주소
        private String QUE_STATUS; //주차현황 정보 제공 여부
        private String QUE_STATUS_NM; //주차현황 정보 제공 여부명
        private Integer CAPACITY; //총 주차면
        private Integer CUR_PARKING; //현재 주차 차량수
        private String CUR_PARKING_TIME; //현재 주차 차량수 업데이트 시간
        private String PAY_YN; //유무료구분
        private String WEEKDAY_BEGIN_TIME; //  평일 운영 시작시각(HHMM)
        private String WEEKDAY_END_TIME; //  평일 운영 종료시각(HHMM)
        private String WEEKEND_BEGIN_TIME; //  주말 운영 시작시각(HHMM)
        private String WEEKEND_END_TIME; //   주말 운영 종료시각(HHMM)
        private String HOLIDAY_BEGIN_TIME; //   공휴일 운영 시작시각(HHMM)
        private String HOLIDAY_END_TIME; //   공휴일 운영 종료시각(HHMM)
        private String SATURDAY_PAY_YN; //   토요일 유,무료 구분
        private String HOLIDAY_PAY_YN; //   공휴일 유,무료 구분
        private String RATES; //   기본 주차 요금
        private String TIME_RATE; //   기본 주차 시간(분 단위)
        private String ADD_RATES; //   추가 단위 요금
        private String ADD_TIME_RATE; //   추가 단위 시간(분 단위)
        private String DAY_MAXIMUM; //   일 최대 요금
        private String LAT; // 주차장 위치 좌표 위도
        private String LNG; // 주차장 위치 좌표 경도
        private List<ParkInfoVO> items;

        public String getPARKING_CODE() {return PARKING_CODE;}
        public void setPARKING_CODE(String PARKING_CODE) {this.PARKING_CODE = PARKING_CODE;}
        public String getPARKING_NAME() {return PARKING_NAME;}
        public void setPARKING_NAME(String PARKING_NAME) {this.PARKING_NAME = PARKING_NAME;}
        public String getADDR() {return ADDR;}
        public void setADDR(String ADDR) {this.ADDR = ADDR;}
        public String getQUE_STATUS() {return QUE_STATUS;}
        public void setQUE_STATUS(String QUE_STATUS) {this.QUE_STATUS = QUE_STATUS;}
        public String getQUE_STATUS_NM() {return QUE_STATUS_NM;}
        public void setQUE_STATUS_NM(String QUE_STATUS_NM){this.QUE_STATUS_NM = QUE_STATUS_NM;}
        public Integer getCAPACITY() {return CAPACITY;}
        public void setCAPACITY(Integer CAPACITY) {this.CAPACITY = CAPACITY;}
        public Integer getCUR_PARKING() {return CUR_PARKING;}
        public void setCUR_PARKING(Integer CUR_PARKING){this.CUR_PARKING = CUR_PARKING;}
        public String getCUR_PARKING_TIME() {return CUR_PARKING_TIME;}
        public void setCUR_PARKING_TIME(String CUR_PARKING_TIME) {this.CUR_PARKING_TIME = CUR_PARKING_TIME;}
        public String getPAY_YN() {return PAY_YN;}
        public void setPAY_YN(String PAY_YN) {this.PAY_YN = PAY_YN;}
        public String getWEEKDAY_BEGIN_TIME() {return WEEKDAY_BEGIN_TIME;}
        public void setWEEKDAY_BEGIN_TIME(String WEEKDAY_BEGIN_TIME) {this.WEEKDAY_BEGIN_TIME = WEEKDAY_BEGIN_TIME;}
        public String getWEEKDAY_END_TIME() {return WEEKDAY_END_TIME;}
        public void setWEEKDAY_END_TIME(String WEEKDAY_END_TIME) {this.WEEKDAY_END_TIME = WEEKDAY_END_TIME;}
        public String getWEEKEND_BEGIN_TIME() {return WEEKEND_BEGIN_TIME;}
        public void setWEEKEND_BEGIN_TIME(String WEEKEND_BEGIN_TIME) {this.WEEKEND_BEGIN_TIME = WEEKEND_BEGIN_TIME;}
        public String getWEEKEND_END_TIME() {return WEEKEND_END_TIME;}
        public void setWEEKEND_END_TIME(String WEEKEND_END_TIME) {this.WEEKEND_END_TIME = WEEKEND_END_TIME;}
        public String getHOLIDAY_BEGIN_TIME() {return HOLIDAY_BEGIN_TIME;}
        public void setHOLIDAY_BEGIN_TIME(String HOLIDAY_BEGIN_TIME) {this.HOLIDAY_BEGIN_TIME = HOLIDAY_BEGIN_TIME;}
        public String getHOLIDAY_END_TIME() {return HOLIDAY_END_TIME;}
        public void setHOLIDAY_END_TIME(String HOLIDAY_END_TIME) {this.HOLIDAY_END_TIME = HOLIDAY_END_TIME;}
        public String getSATURDAY_PAY_YN() {return SATURDAY_PAY_YN;}
        public void setSATURDAY_PAY_YN(String SATURDAY_PAY_YN) {this.SATURDAY_PAY_YN = SATURDAY_PAY_YN;}
        public String getHOLIDAY_PAY_YN() {return HOLIDAY_PAY_YN;}
        public void setHOLIDAY_PAY_YN(String HOLIDAY_PAY_YN) {this.HOLIDAY_PAY_YN = HOLIDAY_PAY_YN;}
        public String getRATES() {return RATES;}
        public void setRATES(String RATES) {this.RATES = RATES;}
        public String getTIME_RATE() {return TIME_RATE;}
        public void setTIME_RATE(String TIME_RATE) {this.TIME_RATE = TIME_RATE;}
        public String getADD_RATES() {return ADD_RATES;}
        public void setADD_RATES(String ADD_RATES) {this.ADD_RATES = ADD_RATES;}
        public String getADD_TIME_RATE() {return ADD_TIME_RATE;}
        public void setADD_TIME_RATE(String ADD_TIME_RATE) {this.ADD_TIME_RATE = ADD_TIME_RATE;}
        public String getDAY_MAXIMUM() {return DAY_MAXIMUM;}
        public void setDAY_MAXIMUM(String DAY_MAXIMUM) {this.DAY_MAXIMUM = DAY_MAXIMUM;}
        public String getLAT() {return LAT;}
        public void setLAT(String LAT) {this.LAT = LAT;}
        public String getLNG() {return LNG;}
        public void setLNG(String LNG) {this.LNG = LNG;}
        public ParkInfoVO (String PARKING_NAME, String ADDR, String LAT, String LNG, Integer CAPACITY, String CUR_PARKING_TIME, Integer CUR_PARKING, String PAY_YN, String WEEKDAY_BEGIN_TIME, String WEEKDAY_END_TIME, String WEEKEND_BEGIN_TIME, String WEEKEND_END_TIME, String RATES, String TIME_RATE, String ADD_RATES, String ADD_TIME_RATE, String DAY_MAXIMUM){
                this.PARKING_NAME = PARKING_NAME;
                this.ADDR = ADDR;
                this.LAT = LAT;
                this.LNG = LNG;
                this.CAPACITY = CAPACITY;
                this.CUR_PARKING_TIME = CUR_PARKING_TIME;
                this.CUR_PARKING = CUR_PARKING;
                this.PAY_YN = PAY_YN;
                this.WEEKDAY_BEGIN_TIME = WEEKDAY_BEGIN_TIME;
                this.WEEKDAY_END_TIME = WEEKDAY_END_TIME;
                this.WEEKEND_BEGIN_TIME = WEEKEND_BEGIN_TIME;
                this.WEEKEND_END_TIME = WEEKEND_END_TIME;
                this.RATES = RATES;
                this.TIME_RATE = TIME_RATE;
                this.ADD_RATES = ADD_RATES;
                this.ADD_TIME_RATE = ADD_TIME_RATE;
                this.DAY_MAXIMUM = DAY_MAXIMUM;

        }
        public List<ParkInfoVO> getItems() {
                return items;
        }

        public String toString(){
                return "PrkinfoVO [PARKING_CODE=" + PARKING_CODE + ", PARKING_NAME=" + PARKING_NAME + ", ADDR=" + ADDR + ", QUE_STATUS=" + QUE_STATUS + ", QUE_STATUS_NM=" + QUE_STATUS_NM + ", CAPACITY=" + CAPACITY + ", CUR_PARKING=" + CUR_PARKING + ", CUR_PARKING_TIME=" + CUR_PARKING_TIME + ", PAY_YN=" + PAY_YN + "WEEKDAY_BEGIN_TIME=" + WEEKDAY_BEGIN_TIME + "WEEKDAY_END_TIME=" + WEEKDAY_END_TIME + "WEEKEND_BEGIN_TIME=" + WEEKEND_BEGIN_TIME + "WEEKEND_END_TIME=" + WEEKEND_END_TIME + "HOLIDAY_BEGIN_TIME=" + HOLIDAY_BEGIN_TIME + "HOLIDAY_END_TIME=" + HOLIDAY_END_TIME + "SATURDAY_PAY_YN=" + SATURDAY_PAY_YN + "HOLIDAY_PAY_YN=" + HOLIDAY_PAY_YN + "RATES=" + RATES + "TIME_RATE=" + TIME_RATE + "ADD_RATES=" + ADD_RATES + "ADD_TIME_RATE" + ADD_TIME_RATE + "DAY_MAXIMUM=" + DAY_MAXIMUM + "LAT=" + LAT + "LNG=" + LNG + "]";
        }
}

