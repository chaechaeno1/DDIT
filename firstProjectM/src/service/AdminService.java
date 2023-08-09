package service;

import dao.AdminDAO;
import dao.BusDAO;
import util.ScanUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminService {
    //싱글톤 패턴
    private static AdminService instance = null;

    private AdminService() {
    }

    public static AdminService getInstance() {
        if (instance == null) instance = new AdminService();
        return instance;
    }

    //AdminDAO 호출 생성
    AdminDAO dao = AdminDAO.getInstance();
    BusDAO busDAO = BusDAO.getInstance();

    //AdminService의 메인
    public int list() {
        System.out.println("===============노선을 선택해주세요 (노선 아이디를 입력해주세요) ===============");
        //Todo 값에 맞게 수정해줘 ^_^....
        System.out.println("노선아이디\t\t노선명\t\t운행날짜\t\t운행시간\t\t등록일");
        System.out.println("===================================");
        List<Map<String, Object>> list = dao.list();

        if (list == null) {
            System.out.println("등록된 버스 배차 목록이 없습니다.");
            System.out.println("==========================================================");
            System.out.println("2.버스등록 0.종료");
            //todo 홈으로 이동
            return 1;
        } else {
            //버스노선 리스트들이 출력됨
            for (Map<String, Object> item : list) {
                System.out.print(item.get("rt_id"));
                System.out.print("\t\t" + item.get("rt_name"));
                System.out.print("\t\t" + item.get("rt_price"));
                System.out.print("\t\t" + item.get("rt_pnum"));
                System.out.print("\t\t" + item.get("rt_time"));
                System.out.print("\t\t" + item.get("st_start_name"));
                System.out.print("\t\t" + item.get("st_end_name"));
                System.out.println();
            }
            List<Object> param = new ArrayList<>();


            String routeInput = ScanUtil.nextLine();
            System.out.println("입력값 : " + routeInput);
            param.add(routeInput);

            //todo routeInput 값 잘못됐으면 잘못됐다고 알려주기!!

            System.out.println("===============날짜를 선택해주세요 (ex)20230810) ===============");

            String dateInput = ScanUtil.nextLine();
            System.out.println("입력값 : " + dateInput);

            if (dateInput.length() != 8) {
                //todo dateInput 값잘못됐다고 알려주기!!
            }

            //패턴을 알려주는애 -> yyyyMMdd 라는 format이 있어!
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

            //입력값(String)이 formatter 패턴으로 들어올건데 LocalDate(날짜) 로 바꿔줘
            LocalDate date = LocalDate.parse(dateInput, formatter);

            System.out.println("===============시간을 입력 해주세요 (ex)06:00) ===============");

            //새벽 6시 ~ 23시 30분
            getTime();

            String timeInput = ScanUtil.nextLine();
            System.out.println("입력값 : " + timeInput);

            LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.parse(timeInput));

            param.add(dateTime);

            System.out.println("===============시간대 등록할 버스를 입력해주세요 ===============");
            //todo 버스 조회
            List<Map<String, Object>> busList = busDAO.list();

            System.out.println("버스아이디\t\t차량번호\t\t버스등급");

            for (Map<String, Object> item : busList) {
                System.out.print(item.get("bus_id"));
                System.out.print("\t\t" + item.get("bus_num"));
                System.out.print("\t\t" + item.get("bus_grade"));
                System.out.println();
            }

            String busInput = ScanUtil.nextLine();
            System.out.println("입력값 : " + busInput);

            param.add(busInput);

            //아이디 생성
            String result = routeInput+dateTime.format(formatter);

            param.add(result);

            //todo 운행 테이블에 저장
            System.out.println("==========저장될 데이터========");
            for (Object p : param) {
                System.out.println(p);
            }

            //id 10글자
            //노선ID+날짜
            //DC08100630
        }

        return 1;
    }

    private void getTime() {
        //초기값 설정
        LocalTime time = LocalTime.of(6, 0);

        //00시가 아닐때까지 시간 출력 6시~23시 30분까지
        while (!(time.equals(LocalTime.MIDNIGHT))) {
            System.out.print(time + " | ");
//            time = time.plusMinutes(30);
            time = time.plusHours(1);
        }
        System.out.println();
    }

}
