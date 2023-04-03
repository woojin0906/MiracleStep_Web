package kr.spring.miraclestep_web.admin.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final JdbcTemplate jdbcTemplate;

    public TestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // hosting 업체 문제로 외부에서 MySQL접근 불가,,, ㅅㅂ
    @GetMapping("/test")
    public String test() {
        int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM User", Integer.class);
        return "Total rows: " + count;
    }
}