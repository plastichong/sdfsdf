package example;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());

        System.out.println("=======구분선=======");

        LoginServlet l = new LoginServlet();
        l.service();

        FileDownloadServlet f = new FileDownloadServlet();
        f.service();

    }

    static void method(HttpServlet servlet){
        servlet.service();
    }
}
