interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bohol bohol);

    void visit(Boracay boracay);

    void visit(Cotabato cotabato);

    void visit(Isabela isabela);

    void visit(Surigao surigao);

    void visit(Zamboanga zamboanga);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    }

    void checkBudget();
}
