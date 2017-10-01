module HelloTest {
    requires junit;
    requires transitive Hello;
    exports com.example.junit to junit;
}
