package com.formation.app;

public class HelloWorld {

    public void coveredByUnitTest() {
        System.out.println("coveredByUnitTest1");
        System.out.println("coveredByUnitTest2");
    }

    public void coveredByIntegrationTest() {
        System.out.println("covered-By-IntegrationTest1");
        System.out.println("covered-By-IntegrationTest2");
        System.out.println("covered-ByIntegrationTest3");
    }

    public void notCovered() {
        System.out.println("notCovered");
    }
}
