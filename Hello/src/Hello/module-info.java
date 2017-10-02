
module Hello {
    requires java.logging;
    requires Algorithms;
    exports com.example.app;
    uses algorithms.sort.Sortable;
}
