package com.school.dataserv.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.domain.MarkVO;
import com.school.dataserv.domain.StudentVO;
import com.school.dataserv.model.StudenBO;
@Component
public class XLsReader {
	
	public List<StudentVO> getStudentDetails(MultipartFile file) {
		List<StudentVO>getStudentDetailsList=new ArrayList<StudentVO>();
		try {
			//FileInputStream inputStream = new FileInputStream(new File(file.getInputStream()));
	        Workbook workbook = new XSSFWorkbook(file.getInputStream());
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            if(nextRow.getRowNum()!=0) {
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            StudentVO bo=new StudentVO();
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getColumnIndex()) {
	                case 0:
	                	bo.setRollNumber((int) cell.getNumericCellValue());
	                	break;
	                case 1:
	                	bo.setStudentName(cell.getStringCellValue());
	                	break;
	                case 2:
	                	bo.setFatherName(cell.getStringCellValue());
	                	break;
	                case 3:
	                	bo.setSection(cell.getStringCellValue());
	                	break;
	                case 4:
	                	bo.setClas((int)(cell.getNumericCellValue()));
	                	break;
	                case 5:
	                	bo.setContactNumber(cell.getStringCellValue());
	                	break;
	                case 6:
	                	bo.setAddress(cell.getStringCellValue());
	                	break;
	                }
	                
	                }
	            getStudentDetailsList.add(bo);
	            }
	                }
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		return getStudentDetailsList;
		
	}

	
	public List<MarkVO> getStudentMarkDetails(MultipartFile file) {
		List<MarkVO>getStudentDetailsList=new ArrayList<MarkVO>();
		try {
			//FileInputStream inputStream = new FileInputStream(new File(file.getInputStream()));
	        Workbook workbook = new XSSFWorkbook(file.getInputStream());
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            if(nextRow.getRowNum()!=0) {
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            MarkVO bo=new MarkVO();
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getColumnIndex()) {
	                case 0:
	                	StudentVO vo=new StudentVO();
	                	vo.setRollNumber((int) cell.getNumericCellValue());
	                	bo.setStudentVO(vo);
	                	break;
	                case 1:
	                	bo.setTamil((int) cell.getNumericCellValue());
	                	break;
	                case 2:
	                	bo.setEnglish((int) cell.getNumericCellValue());
	                	break;
	                case 3:
	                	bo.setMathes((int) cell.getNumericCellValue());
	                	break;
	                case 4:
	                	bo.setSciences((int) cell.getNumericCellValue());
	                	break;
	                case 5:
	                	bo.setS_sci((int) cell.getNumericCellValue());
	                	break;
	                case 6:
	                	bo.setTotal((int) cell.getNumericCellValue());
	                	break;
	                case 7:
	                	bo.setSem((int) cell.getNumericCellValue());
	                	break;
	                }
	                
	                }
	            getStudentDetailsList.add(bo);
	            }
	                }
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		return getStudentDetailsList;
		
	}
}
