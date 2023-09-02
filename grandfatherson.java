class Grandfather {
    private double propertyValue;

    public Grandfather(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public double getProperty() {
        return propertyValue;
    }

    public void givePropertyToGrandson(Grandson grandson) {
        grandson.receiveProperty(propertyValue);
    }
}

class Grandson {
    private double receivedProperty = 0;

    public double getReceivedProperty() {
        return receivedProperty;
    }

    public void receiveProperty(double propertyValue) {
        receivedProperty += propertyValue;
    }
}

public class Main {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather(5000000000.0); // 500Cr = 500 * 10^6
        Grandson grandson = new Grandson();

        grandfather.givePropertyToGrandson(grandson);

        System.out.println("Grandson's received property value: " + grandson.getReceivedProperty() + "Cr");
    }
}