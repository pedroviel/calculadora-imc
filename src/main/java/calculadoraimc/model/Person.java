package calculadoraimc.model;

public class Person {
    private double weight;
    private double height;

    public double calculateBMI() {
        return getWeight() / Math.pow(getHeight(), 2);
    }

    public String getClassification() {
        double BMI = calculateBMI();

        if (BMI <= 0) return "Inválido!";
        if (BMI < 16) return "Magreza grave!";
        if (BMI < 17) return "Magreza moderada!";
        if (BMI < 18.5) return "Magreza leve!";
        if (BMI < 25) return "Saudável!";
        if (BMI < 30) return "Sobrepeso!";
        if (BMI < 35) return "Obesidade grau I!";
        if (BMI < 40) return "Obesidade grau II!";

        return "Obesidade grau III!";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
