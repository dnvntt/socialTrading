package vn.com.vndirect.socialtrading.websocket;

import java.io.IOException;
import java.util.Map;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

import vn.com.vndirect.socialtrading.App;

@WebSocket
public class StockServiceWebSocket {
 
    private Session session;
 
    // called when the socket connection with the browser is established
    @OnWebSocketConnect
    public void handleConnect(Session session) {
        this.session = session;
    }
 
    public static Object getKeyFromValue(Map<String, Session> hm, Object value) {
        for (Object o : hm.keySet()) {
          if (hm.get(o).equals(value)) {
            return o;
          }
        }
        return null;
      }
    
    // called when the connection closed
    @OnWebSocketClose
    public void handleClose(int statusCode, String reason) {
        System.out.println("Connection closed with statusCode=" + statusCode + ", reason=" + reason);
        String clientId= (String) getKeyFromValue(App.mapOfSession,this.session);  
        App.mapOfSession.remove(clientId);
    }
 
    // called when a message received from the browser
    @OnWebSocketMessage
    public void handleMessage(String message) {
        if( message.contains("sendidclient")){
        	 String clientId= message.substring(13).trim(); //client send id in format:  sendidclient:clientId
             App.mapOfSession.put(clientId, this.session);
        }
        
    }
 
    // called in case of an error
    @OnWebSocketError
    public void handleError(Throwable error) {
        error.printStackTrace();    
    }
 
    // sends message to browser
    public void send(String message) {
        try {
            if (session.isOpen()) {
                session.getRemote().sendString(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}