package basicServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.manager.CommonUseManager;
import com.highradius.model.CMSUserCallerID;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/SquareServlet")
public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SquareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		CommonUseManager manager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
	HttpSession session = request.getSession(false);
	String callerId = request.getParameter("callerId");
	response.setContentType("text/event-stream");

	((ServletRequest) response).setCharacterEncoding("UTF-8");
	PrintWriter out = response.getWriter();
	long lastTime = System.currentTimeMillis();
	boolean lastStatus = false;
	for (int i = 0; i < 60; i++) {
		try {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Exception while thread sleep "+e);
			}
			if(System.currentTimeMillis() - lastTime >= 120000 && lastStatus == false) {
				out.write("event: "+callerId+"\n");
				out.write("data: " + "VERIFICATION_FAILED" + "\n\n");
				out.flush();
				out.close();
				break;
			}
				try {
					CMSUserCallerID cmsUserCallerId = manager.getCountry(Integer.valueOf(callerId));//collectionAdminManager.getUserCallerIdDetails(userObj.getAccountId(), userObj.getUserId());
					System.out.println(cmsUserCallerId.getIsVerified());
					System.out.println(callerId);
					if(cmsUserCallerId != null && cmsUserCallerId.getIsVerified()){
						out.write("event: "+callerId+"\n");
						out.write("data: " + "VERIFICATION_SUCCESSFULL" + "\n\n");
						System.out.println("VERIFICATION_SUCCESSFULL");
						out.flush();
						out.close();
						break;
					}else {
						out.write("event: "+callerId+"\n");
						out.write("data: " + "VERIFICATION_ON_HOLD" + "\n\n");
						lastStatus = cmsUserCallerId.getIsVerified();
						System.out.println("VERIFICATION_ON_HOLD");
						out.flush();
					}
				} catch (Exception e) {
					out.write("event: "+callerId+"\n");
					out.write("data: " + "EXCEPTION_OCCURED" + "\n\n");
					out.flush();
					System.out.println("EXCEPTION_OCCURED");
					System.out.println("Exception while fetching caller id details !!! ");
				}
			
		}catch(Exception e) {
			out.write("event: "+callerId+"\n");
			out.write("data: " + "VERIFICATION_FAILED" + "\n\n");
			out.flush();
			System.out.println("VERIFICATION_FAILED");
			out.close();
			System.out.println("Exception while fetching caller id details !!! ");
		}
	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
