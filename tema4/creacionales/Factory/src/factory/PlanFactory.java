package factory;

public class PlanFactory {

    public IPlan getPlan(String plan) {
        switch (plan) {
            case "mensual":
                return new PlanMensual();
            case "anual":
                return new PlanAnual();

        }
        return null;

    }
}
