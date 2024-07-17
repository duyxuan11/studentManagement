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
 * Servlet implementation class findThongTinTotNghiepServlet
 */
@WebServlet("/findTTTN")
public class findThongTinTotNghiepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findThongTinTotNghiepServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = MyUtils.getStoredConnection(request);

		String errorString = null;
		List<SinhVienTotNghiep> list = null;
		try {
			list = SinhVienTotNghiepDAO.querySinhVienTotNghiep(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		} 
		
		request.setAttribute("errorString", errorString);
		request.setAttribute("sinhVienTotNghiepList", list);
		
		
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/findTTTNView.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		
		String errorString = null;
		List<SinhVienTotNghiep> list = null;
		String soCMND = (String) request.getParameter("soCMND");
		String hoTen = (String) request.getParameter("hoTen");
		String maTruong = (String) request.getParameter("maTruong");
		String maNganh = (String) request.getParameter("maNganh");
		String tenCongTy = (String) request.getParameter("tenCongTy");
		String thoiGianLamViec = (String) request.getParameter("thoiGianLamViec");
		SinhVienTotNghiep sinhVienTotNghiep = new SinhVienTotNghiep(soCMND,hoTen,maNganh,maTruong,maNganh,tenCongTy,thoiGianLamViec);
		try {
			list = SinhVienTotNghiepDAO.findSinhVienTotNghiep(conn, soCMND, hoTen, maNganh, maTruong, maNganh, tenCongTy, thoiGianLamViec);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}

		request.setAttribute("errorString", errorString);
		request.setAttribute("sinhVienTotNghiepList", list);
		request.setAttribute("sinhVienTotNghiep", sinhVienTotNghiep);
		
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/findTTTNView.jsp");
		dispatcher.forward(request, response);
	}

}
