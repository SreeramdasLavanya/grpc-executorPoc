/*
package org.example;

import io.grpc.internal.ObjectPool;
import io.grpc.internal.ServerImpl;
import io.grpc.internal.ServerImplBuilder;
import java.util.concurrent.Executor;

public class SampleTestServer {

  private ServerImplBuilder builder;

  private ObjectPool<Executor> executorPool;

  private void createServer() {

    builder.fallbackHandlerRegistry(fallbackRegistry);
    builder.executorPool = executorPool;
    server = new ServerImpl(builder, transportServer, SERVER_CONTEXT);
  }
}
*/
