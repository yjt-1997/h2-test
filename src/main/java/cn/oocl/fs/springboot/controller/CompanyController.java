package cn.oocl.fs.springboot.controller;

import cn.oocl.fs.springboot.entity.Company;
import cn.oocl.fs.springboot.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/companies")
    public ResponseEntity<Company> save(@RequestBody Company company) {
        return ResponseEntity.status(HttpStatus.CREATED).body(companyService.save(company));
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findAll());
    }

}
