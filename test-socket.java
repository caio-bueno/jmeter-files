	Socket socket = new Socket();
	socket.setSoTimeout(10000);
	socket.connect(new InetSocketAddress("10.103.240.8", 1433), 10000);
	log.info("OK");
	socket.close();
