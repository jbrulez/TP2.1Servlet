package TP.istic.dudcl.TP2.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Personnes;
	
@WebServlet(name = "getPerson", urlPatterns = { "/getPersons" })

public class GetPersonnes extends HttpServlet{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		MyService serv = null;

		@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
			super.init();
			serv = MyService.getInstance();
		}

		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter p = new PrintWriter(resp.getOutputStream());
			
			p.println("<html><body>");
			for (Personnes p1 : serv.getAllPersons()){
				p.println("<h1> "+ p1.getNom() + " " + p1.getPrenom() +"</h1><BR>");
				
			}
			p.println("</body></html>");
			
			p.flush();
		}
		
}
