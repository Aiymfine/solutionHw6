public class SmartHomeSystem{
    public static void main(String[] args){
        Light livingRoomLight=new Light();
        Thermostat thermostat=new Thermostat();

        Command turnOnLight=new TurnOnLightCommand(livingRoomLight);
        Command setThermostat= new SetThermostatCommand(thermostat, 22);
        
        SmartHomeRemoteControl remote= new SmartHomeRemoteControl();
        remote.setCommand("light_on", turnOnLight);
        remote.setCommand("temp_set", setThermostat);
        remote.pressButton("light_on");
        remote.pressButton("temp_set");
        remote.undoButton(); 
    }
}
