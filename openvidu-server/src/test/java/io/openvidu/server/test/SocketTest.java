package io.openvidu.server.test;

import java.io.IOException;

import org.junit.Test;
import org.kurento.jsonrpc.client.JsonRpcClient;
import org.kurento.jsonrpc.client.JsonRpcClientWebSocket;

public class SocketTest {
	@Test
	private void test() {
		JsonRpcClient client = new JsonRpcClientWebSocket("ws://localhost:4443/echo");
		try {
			client.sendRequest("test");
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
