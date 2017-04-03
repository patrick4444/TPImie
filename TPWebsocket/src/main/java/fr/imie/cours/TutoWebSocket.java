package fr.imie.cours;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/tuto")
public class TutoWebSocket {

	static List<Session> sessions = new ArrayList<Session>();

	@OnOpen
	public void onOpen(Session session) {
		// System.out.println(session.getId());
		sessions.add(session);
		try {
			String string = Json.createObjectBuilder().add("msg", "Hello")
					// .add("d","test")
					.build().toString();
			session.getBasicRemote().sendText(string);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@OnClose
	public void onClose(Session session) {
		//System.out.println(session.getId());
		sessions.remove(session);
	}

	@OnMessage
	public void onMessage(String message, Session session) {
		// System.out.println(message);
		JsonObject json = Json.createReader(new StringReader(message)).readObject();
		// System.out.println(json.getInt("a"));
		// System.out.println(json.getString("b"));
		String msg = json.getString("msg");
		String string = Json.createObjectBuilder().add("msg", msg)
				// .add("d","test")
				.build().toString();
		for (Session sessionL : sessions) {
			if (sessionL.getId() != session.getId())
				try {
					sessionL.getBasicRemote().sendText(string);
				} catch (IOException ex) {
					sessions.remove(session);
				}
		}

	}
}
