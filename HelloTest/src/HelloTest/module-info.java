
module HelloTest
{
    requires static HelloLogger;
    uses com.example.logger.HelloLogger;

    requires junit;
    requires transitive Hello;
    exports com.example.junit to junit;
}
