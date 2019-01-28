package com.example.demo;

import com.example.demo.core.JdbcDaoSupport;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private JdbcDaoSupport jdbcDaoSupport;

    @Test
    public void contextLoads() throws Exception {

//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//
//        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:/Users/dell/Desktop/aa.xlsx"));
//
//        int sheetNum = workbook.getNumCellStyles();
//
//        if(sheetNum > 0){
//
//            XSSFSheet sheet = workbook.getSheetAt(0);
//
//            int rowNum = sheet.getPhysicalNumberOfRows();
//
//            for (int i = 0 ; i < rowNum ; i++) {
//
//                Row row = sheet.getRow(i);
//
//                Map<String,Object> map = new HashMap<String, Object>();
//
//                Cell cell1 = row.getCell(0);
//                String cellValue1 = cell1.getStringCellValue();
//
//                map.put("ip_from",cellValue1);
//
//                Cell cell2 = row.getCell(1);
//                String cellValue2 = cell2.getStringCellValue();
//
//                map.put("ip_to",cellValue2);
//
//                Cell cell3 = row.getCell(2);
//                String cellValue3 = cell3.getStringCellValue();
//
//                map.put("internet_no",cellValue3);
//
//                Cell cell4 = row.getCell(3);
//                String cellValue4 = cell4.getStringCellValue();
//
//                map.put("no",cellValue4);
//
//                Cell cell5 = row.getCell(4);
//                String cellValue5 = cell5.getStringCellValue();
//
//                map.put("alias_one",cellValue5);
//
//                Cell cell6 = row.getCell(5);
//                String cellValue6 = cell6.getStringCellValue();
//
//                map.put("alias_two",cellValue6);
//
//                Cell cell7 = row.getCell(6);
//                String cellValue7 = cell1.getStringCellValue();
//
//                map.put("country_name",cellValue7);
//
//
//                jdbcDaoSupport.insertTable("t_country_ip",map);
//
//            }
//        }

    }
}

