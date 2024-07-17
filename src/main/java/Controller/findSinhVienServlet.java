package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

/**
 * Servlet implementation class findSinhVienServlet
 */
@WebServlet("/findSinhVien")
public class findSinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public findSinhVienServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = MyUtils.getStoredConnection(request);

		String errorString = null;
		List<SinhVien> list = null;
		try {
			list = SinhVienDAO.querySinhVien(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("sinhVienList", list);
		
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/findSinhVienView.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		
		String errorString = null;
		List<SinhVien> list = null;
		String soCMND = (String) request.getParameter("soCMND");
		String hoTen = (String) request.getParameter("hoTen");
		String email = (String) request.getParameter("email");
		String soDT = (String) request.getParameter("soDT");
		String diaChi = (String) request.getParameter("diaChi");
		
		SinhVien sinhVien = new SinhVien(soCMND,hoTen,email,soDT,diaChi);
		try {
			list = SinhVienDAO.findSinhVienList(conn, soCMND, hoTen, email, soDT, diaChi);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		
		request.setAttribute("errorString", errorString);
		request.setAttribute("sinhVienList", list);
		request.setAttribute("sinhVien", sinhVien);
			
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/findSinhVienView.jsp");
		dispatcher.forward(request, response);
		
	}
	

}
