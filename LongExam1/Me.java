public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Bohol bohol) {
        if (budget < bohol.airFare) {
            System.out.println("wala kang pang Bohol!");

        } else {
            System.out.println("yehey may pang Bohol na ako!");
            budget = budget - bohol.airFare;
        }
        checkBudget();

    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare) {
            System.out.println("di mo afford mag Boracay!");

        } else {
            System.out.println("ganda ng white sand dito sa Boracay!");
            budget = budget - boracay.airFare;
        }
        checkBudget();
    }

    public void visit(Cotabato cotabato) {
        if (budget < cotabato.airFare) {
            System.out.println("kulang ang budget for Cotabato!");

        } else {
            System.out.println("hello Cotabato! I'm here!");
            budget = budget - cotabato.airFare;
        }
        checkBudget();

    }

    public void visit(Isabela isabela) {

        if (budget < isabela.airFare) {
            System.out.println("Kulang ang pamasahe ko pa Isabela!");

        } else {
            System.out.println("Ganda ng falls dito sa Isabela!");
            budget = budget - isabela.airFare;
        }
        checkBudget();
    }

    public void visit(Surigao surigao) {

        if (budget < surigao.airFare) {
            System.out.println("Nagastos ko ang ipon ko for Surigao :((");

        } else {
            System.out.println("Ganda so much here sa Surigao!");
            budget = budget - surigao.airFare;
        }
        checkBudget();

    }

    public void visit(Zamboanga zamboanga) {

        if (budget < zamboanga.airFare) {
            System.out.println("Cenxia kana di mo pa afford Zamboanga!");

        } else {
            System.out.println("Zambonga here i come!");
            budget = budget - zamboanga.airFare;
        }
        checkBudget();

    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}