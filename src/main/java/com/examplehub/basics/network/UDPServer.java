package com.examplehub.basics.network;

import com.examplehub.strings.ReverseString;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UDPServer {
  public static void main(String[] args) throws IOException {
    int port = 6666;
    try(DatagramSocket datagramSocket = new DatagramSocket(port)) {
      System.out.println("server started! listen on: " + port);
      byte[] buffer = new byte[1024];
      DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
      datagramSocket.receive(datagramPacket);
      System.out.println("[client]: " + new String(buffer, 0, datagramPacket.getLength()));

      byte[] bytes = ReverseString.reverse(new String(buffer, 0, datagramPacket.getLength()))
              .getBytes(StandardCharsets.UTF_8);
      System.out.println(new String(bytes));
      DatagramPacket dp = new DatagramPacket(bytes, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
      datagramSocket.send(dp);
    }
  }
}
