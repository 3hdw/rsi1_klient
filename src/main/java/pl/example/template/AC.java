package pl.example.template;

import org.apache.xmlrpc.AsyncCallback;

import java.net.URL;

public class AC implements AsyncCallback {

    @Override
    public void handleResult(Object result, URL url, String method) {
        System.out.println("ODPOWIEDŹ ASYNC: "+(String) result);
    }

    @Override
    public void handleError(Exception e, URL url, String method) {
        System.out.println("Błąd");
        e.printStackTrace();
    }
}
