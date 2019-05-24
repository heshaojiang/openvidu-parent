package io.openvidu.server.test;

import com.google.gson.JsonObject;
import org.junit.Test;
import org.kurento.jsonrpc.client.JsonRpcClient;
import org.kurento.jsonrpc.client.JsonRpcClientNettyWebSocket;
import org.kurento.jsonrpc.message.Request;
import org.kurento.jsonrpc.message.Response;

import java.io.IOException;


public class SocketTest {
	@Test
	public void test() {
		JsonRpcClient client = new JsonRpcClientNettyWebSocket("wss://localhost:4443/openvidu");
		client.setRequestTimeout(1000*10);
		Request<JsonObject> request = new Request<>();
		request.setMethod("joinRoom");
		JsonObject params = new JsonObject();
		params.addProperty("session", "omyjfwq59oo9yd4j");
		params.addProperty("token","kgysvosir49nykyv");
		params.addProperty("secret","MY_SECRET");
		params.addProperty("platform","chome");
		params.addProperty("metadata","1");
		request.setParams(params);
		try {
			Response response = client.sendRequest(request);
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
