package com.xiaomi.mistatistic.sdk;

import com.xiaomi.mistatistic.sdk.controller.j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class MIStatsHttpClientHelper {
    private static int a(Object obj) {
        if (!(obj instanceof HttpResponse)) {
            return 0;
        }
        StatusLine statusLine = ((HttpResponse) obj).getStatusLine();
        return statusLine == null ? 0 : statusLine.getStatusCode();
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpHost, httpRequest, responseHandler);
            j.a().a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (IOException e) {
            j.a().a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpHost, httpRequest, responseHandler, httpContext);
            j.a().a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (ClientProtocolException e) {
            j.a().a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        } catch (IOException e2) {
            j.a().a(new HttpEvent(str, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        String uri = httpUriRequest.getURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpUriRequest, responseHandler);
            j.a().a(new HttpEvent(uri, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (IOException e) {
            j.a().a(new HttpEvent(uri, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        String url = httpUriRequest.getURI().toURL().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpUriRequest, responseHandler, httpContext);
            j.a().a(new HttpEvent(url, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (ClientProtocolException e) {
            j.a().a(new HttpEvent(url, e.getClass().getSimpleName()));
            throw e;
        } catch (IOException e2) {
            j.a().a(new HttpEvent(url, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            j.a().a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (IOException e) {
            j.a().a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            j.a().a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (IOException e) {
            j.a().a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        String url = httpUriRequest.getURI().toURL().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpUriRequest);
            j.a().a(new HttpEvent(url, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (ClientProtocolException e) {
            j.a().a(new HttpEvent(url, e.getClass().getSimpleName()));
            throw e;
        } catch (IOException e2) {
            j.a().a(new HttpEvent(url, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        String uri = httpUriRequest.getURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            j.a().a(new HttpEvent(uri, System.currentTimeMillis() - currentTimeMillis, a(execute), null));
            return execute;
        } catch (IOException e) {
            j.a().a(new HttpEvent(uri, e.getClass().getSimpleName()));
            throw e;
        }
    }
}
