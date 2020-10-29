package demo1;

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        look();
        this.host.rent();
    }

    public void look() {
        System.out.println("看看");
    }
}
