
module Hello {
    requires java.logging;
    requires algorithms;
    exports com.example.app;
    uses algorithms.sort.Sortable;
}
