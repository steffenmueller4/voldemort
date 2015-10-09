package voldemort.server.socket;

import javax.net.ssl.SSLContext;

import voldemort.server.protocol.RequestHandlerFactory;

@Deprecated
public class AdminService extends SocketService {

    public AdminService(RequestHandlerFactory requestHandlerFactory,
                        SSLContext sslContext,
                        int port,
                        int coreConnections,
                        int maxConnections,
                        int socketBufferSize,
                        String serviceName,
                        boolean enableJmx) {
        super(requestHandlerFactory,
              sslContext,
              port,
              coreConnections,
              maxConnections,
              socketBufferSize,
              serviceName,
              enableJmx);
    }

}
