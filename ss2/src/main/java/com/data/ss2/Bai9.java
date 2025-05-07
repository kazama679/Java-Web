package com.data.ss2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Bai9", value = "/Bai9")
public class Bai9 extends HttpServlet {
    List<String> danhSachTu = Arrays.asList("Hoa hồng", "Cuộc sống", "Nở hoa");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tuBiMat = danhSachTu.get((int) (Math.random() * danhSachTu.size()));
        HttpSession session = request.getSession();
        session.setAttribute("tuBiMat", tuBiMat);
        session.setAttribute("soLuot", 3);
        session.setAttribute("ketQua", null);
        request.setAttribute("tuDoan", getTuGachChan(tuBiMat, ""));
        request.setAttribute("soLuot", 3);
        request.setAttribute("ketQua", null);
        request.setAttribute("tuBiMat", tuBiMat);
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tuNguoiChoi = request.getParameter("tuNguoiChoi");
        HttpSession session = request.getSession();
        String tuBiMat = (String) session.getAttribute("tuBiMat");
        int soLuot = (int) session.getAttribute("soLuot");
        String ketQua = null;
        if (tuNguoiChoi.equalsIgnoreCase(tuBiMat)) {
            ketQua = "thang";
            soLuot = 0;
        } else {
            soLuot--;
            if (soLuot <= 0) {
                ketQua = "thua";
                soLuot = 0;
            }
        }
        session.setAttribute("soLuot", soLuot);
        session.setAttribute("ketQua", ketQua);
        request.setAttribute("tuBiMat", tuBiMat);
        request.setAttribute("soLuot", soLuot);
        request.setAttribute("ketQua", ketQua);
        request.setAttribute("tuDoan", ketQua == null ? getTuGachChan(tuBiMat, tuNguoiChoi) : tuBiMat);
        request.getRequestDispatcher("bai9.jsp").forward(request, response);
    }

    private String getTuGachChan(String tuGoc, String tuDoan) {
        StringBuilder sb = new StringBuilder();
        tuDoan = tuDoan.toLowerCase();
        for (char c : tuGoc.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
            } else if (tuDoan.indexOf(Character.toLowerCase(c)) >= 0) {
                sb.append(c);
            } else {
                sb.append("_");
            }
        }
        return sb.toString();
    }
}