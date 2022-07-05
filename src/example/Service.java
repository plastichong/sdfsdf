package example;

import protectedEx.pack1.A;
import protectedEx.pack2.C;

public class Service {
    public void login() {
        System.out.println("로그인");
    }
}

class MemberService extends Service {
    public void login() {
        System.out.println("멤버 로그인");
    }
}

class Aservice extends MemberService {
    public void login() {
        System.out.println("A로그인");
    }

    public void superLogin() {
        super.login();
    }
}

class Controller {
    MemberService service;

    public void setService(MemberService service) {
        this.service = service;
    }

    public MemberService getService() {
        return service;
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        MemberService m = new MemberService();
        c.setService(m);
        c.getService().login();
        MemberService a = new Aservice();
        c.setService(a);
        c.getService().login();

        Aservice a2 = new Aservice();
        a2.superLogin();


    }
}