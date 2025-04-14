class Thermostat{
    private int currentTemperature=14;
    private int previousTemperature=14;
    public void setTemperature(int temperature){
        previousTemperature= currentTemperature;
        currentTemperature= temperature;
        System.out.println("[Thermostat] Setting temperature to "+ currentTemperature+ "°C");
    }
    public void revertTemperature(){
        System.out.println("[Thermostat] Reverting to previous temperature: "+previousTemperature+ "°C");
        currentTemperature= previousTemperature;
    }
}
