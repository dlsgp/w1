package org.example.w1;

// 필요한 클래스들을 임포트합니다.
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet 어노테이션을 사용하여 이 클래스가 서블릿임을 나타내고, URL 패턴을 설정합니다.
@WebServlet(name = "myServlet", urlPatterns = "/my")
public class MyServlet extends HttpServlet {

    // HTTP GET 요청을 처리하기 위해 doGet 메서드를 오버라이드합니다.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // 응답의 컨텐츠 타입을 "text/html"로 설정합니다. 이는 응답이 HTML 문서임을 브라우저에 알립니다.
        resp.setContentType("text/html");

        // 응답에 쓸 PrintWriter 객체를 얻습니다.
        PrintWriter out = resp.getWriter();
        // HTML 문서의 시작 태그를 작성합니다.
        out.println("<html><body>");
        // HTML 문서 안에 H1 태그로 제목을 추가합니다.
        out.println("<h1>MyServlet</h1>");
        // HTML 문서의 종료 태그를 작성합니다.
        out.println("</body></html>");
    }

}
