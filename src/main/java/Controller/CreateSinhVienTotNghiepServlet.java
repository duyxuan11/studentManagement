package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

/**
 * Servlet implementation class CreateSinhVienTotNghiepServlet
 */
@WebServlet("/khaibao")
public class CreateSinhVienTotNghiepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSinhVienTotNghiepServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String errorString = null;
		List<Truong> list1 = null;
		List<Nganh> list2 = null;
		try {
			list1 = TruongDAO.queryTruong(conn);
			list2 = NganhDAO.queryNganh(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("truongList", list1);
		request.setAttribute("nganhList", list2);
		
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/khaiBaoTotNghiepView.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);

		String soCMND = (String) request.getParameter("soCMND");
		String hoTen = (String) request.getParameter("hoTen");
		String email = (String) request.getParameter("email");
		String soDT = (String) request.getParameter("soDT");
		String diaChi = (String) request.getParameter("diaChi");
		String maTruong = (String) request.getParameter("maTruong");
		String maNganh = (String) request.getParameter("maNganh");
		String heTN = (String) request.getParameter("heTN");
		String ngayTN = (String) request.getParameter("ngayTN");
		String loaiTN = (String) request.getParameter("loaiTN");
		String ngayVaoCongTy = (String) request.getParameter("ngayVaoCongTy");
		String tenCongViec = (String) request.getParameter("tenCongViec");
		String tenCongTy = (String) request.getParameter("tenCongTy");
		String diaChiCongTy = (String) request.getParameter("diaChiCongTy");
		String thoiGianLamViec = (String) request.getParameter("thoiGianLamViec");
		
		SinhVien sinhVien = new SinhVien(soCMND, hoTen, email,soDT,diaChi);
		TotNghiep totNghiep = new TotNghiep(soCMND,maTruong,maNganh,heTN,ngayTN,loaiTN);
		CongViec congViec = new CongViec(soCMND, ngayVaoCongTy, maNganh, tenCongViec, tenCongTy, diaChiCongTy, thoiGianLamViec);
		String errorString = null;

		try {
			SinhVienDAO.insertSinhVien(conn, sinhVien);
			TotNghiepDAO.insertTotNghiep(conn, totNghiep);
			CongViecDAO.insertTotNghiep(conn, congViec);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		
		List<Truong> list1 = null;
		List<Nganh> list2 = null;
		try {
			list1 = TruongDAO.queryTruong(conn);
			list2 = NganhDAO.queryNganh(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("truongList", list1);
		request.setAttribute("nganhList", list2);
		request.setAttribute("sinhVien", sinhVien);
		request.setAttribute("totNghiep", totNghiep);
		request.setAttribute("congViec", congViec);

		
		if (errorString != null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/khaiBaoTotNghiepView.jsp");
			dispatcher.forward(request, response);
		}
		
		else {
			response.sendRedirect(request.getContextPath() + "/home");
		}
		

		
	}
	

}
