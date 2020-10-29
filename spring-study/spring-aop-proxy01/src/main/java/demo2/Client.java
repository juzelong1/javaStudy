package demo2;

import demo1.Rent;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandle proxyInvocationHandle = new ProxyInvocationHandle();
        proxyInvocationHandle.setTarget(host);
        Rent rent = (Rent) proxyInvocationHandle.getProxy();
        rent.rent();
    }
}
