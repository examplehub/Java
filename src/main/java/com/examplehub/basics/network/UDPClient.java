package com.examplehub.basics.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPClient {
  public static void main(String[] args) throws IOException {
    DatagramSocket datagramSocket = new DatagramSocket();
    byte[] buffer = "123".getBytes(StandardCharsets.UTF_8);
    DatagramPacket datagramPacket =
        new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 6666);
    datagramSocket.send(datagramPacket);

    byte[] bytes = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
    datagramSocket.receive(dp);
    System.out.println("[server]: " + new String(bytes, 0, dp.getLength()));
  }
}
