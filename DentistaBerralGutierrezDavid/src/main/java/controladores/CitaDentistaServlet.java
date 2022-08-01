package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CitaDentistaServlet
 */
public class CitaDentistaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CitaDentistaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =	response.getWriter();
		
		String diacita = request.getParameter("diacita");
		String horacita = request.getParameter("horacita");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String centro = request.getParameter("centro");
		String tipo = request.getParameter("tipo");
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>"
				+ "<body>");
		
		
		out.println("<h1>Cita Dentista</h1>");
		out.println("<ul>");
		out.println("<li> Dia de la cita: "+diacita+"</li>");
		out.println("<li> Hora de la cita: "+horacita+"</li>");
		out.println("<li> Nombre: "+nombre+"</li>");
		out.println("<li> Apellidos: "+apellidos+"</li>");
		out.println("<li> Centro: "+centro+"</li>");
		out.println("<li> Tipo de cita: "+tipo+"</li>");
		out.println("</ul>");
		out.println("</body>"+"</html>");
	}
}
			
			
		
		
	
		
	


