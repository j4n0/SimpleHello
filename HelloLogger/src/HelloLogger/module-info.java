
module HelloLogger {
    exports com.example.logger;
    opens com.example.logger;
    provides com.example.logger.HelloLogger with com.example.logger.HelloLogger;
}