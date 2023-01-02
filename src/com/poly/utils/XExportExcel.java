package com.poly.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XExportExcel {
    private static String url = "";
    
//    static {
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException ex) {
//            throw new RuntimeException(ex);
//        }
//    }
//    
//    public static 
    
//    try {
//            XSSFWorkbook workbook = new XSSFWorkbook();
//            XSSFSheet sheet = workbook.createSheet("danhsach");
//            XSSFRow row = null;
//            Cell cell = null;
//            row = sheet.createRow(2);
//            cell = row.createCell(0, CellType.STRING);
//            cell.setCellValue("DANH SACH SINH VIEN");
//
//            row = sheet.createRow(3);
//            cell = row.createCell(0, CellType.STRING);
//            cell.setCellValue("STT");
//
//            cell = row.createCell(1, CellType.STRING);
//            cell.setCellValue("ID");
//
//            cell = row.createCell(2, CellType.STRING);
//            cell.setCellValue("FULL NAME");
//
//            cell = row.createCell(3, CellType.STRING);
//            cell.setCellValue("Diem Tieng Anh");
//
//            cell = row.createCell(4, CellType.STRING);
//            cell.setCellValue("Diem Tin Hoc");
//
//            cell = row.createCell(5, CellType.STRING);
//            cell.setCellValue("Diem GDTC");
//
//            cell = row.createCell(6, CellType.STRING);
//            cell.setCellValue("Diem TB");
//            for (int i = 0; i < list.size(); i++) {
//                //Modelbook book =arr.get(i);
//                row = sheet.createRow(4 + i);
//
//                cell = row.createCell(0, CellType.NUMERIC);
//                cell.setCellValue(i + 1);
//
//                cell = row.createCell(1, CellType.STRING);
//                cell.setCellValue(list.get(i).getMaSV());
//
//                cell = row.createCell(2, CellType.STRING);
//                cell.setCellValue(list.get(i).getHoTen());
//
//                cell = row.createCell(3, CellType.STRING);
//                cell.setCellValue(list.get(i).getDiemTA());
//
//                cell = row.createCell(4, CellType.STRING);
//                cell.setCellValue(list.get(i).getDiemTH());
//
//                cell = row.createCell(5, CellType.STRING);
//                cell.setCellValue(list.get(i).getDiemGDTC());
//
//                cell = row.createCell(6, CellType.STRING);
//                cell.setCellValue(list.get(i).getDiemTB());
//            }
//
//            File f = new File("..\\PS21684_Nguyen Xuan Cuong_Assignment\\DanhSachDiemSV.xlsx");
//            try {
//                FileOutputStream fis = new FileOutputStream(f);
//                workbook.write(fis);
//                fis.close();
//            } catch (FileNotFoundException ex) {
//                ex.printStackTrace();
//
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//
//            JOptionPane.showMessageDialog(this, "Export Successfully !");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error Open File");
//        }
}
