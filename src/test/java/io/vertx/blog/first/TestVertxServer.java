package io.vertx.blog.first;

import io.vertx.core.Vertx;

public class TestVertxServer {

	public static void main(String[] args) throws Exception {
		MyFirstVerticle v = new MyFirstVerticle();
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(v);

	}

}
