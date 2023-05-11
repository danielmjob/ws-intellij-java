public class ConverterTemp {
    public static void main(String[] args) {

        double tempCelsius = 50.0;
        double tempFahrenheit = (tempCelsius * 1.8)+32;
        System.out.println("Temperatura em celsius: " + tempCelsius + " Temperatura em Fahrenheit " + tempFahrenheit);

        int tempFahrenheitInteiro = (int) tempFahrenheit;
        System.out.println(tempFahrenheitInteiro);

    }
}
