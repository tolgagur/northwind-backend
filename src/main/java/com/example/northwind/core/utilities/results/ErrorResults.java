package com.example.northwind.core.utilities.results;

public class ErrorResults extends Result{


    public ErrorResults() {
        super(false);
    }

    public ErrorResults(String message) {
        super(false, message);
    }
}
