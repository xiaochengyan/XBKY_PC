package ikaoyaner.service.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionListener implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		synchronized (sessionEvent) {
		}
	}

}
