public class StartWithSmarthome {
    public static void main (String[] args) {
        Smarthome shOn = new Smarthome.Builder()
                .heatingOn(23)
                .lightOn()
                .lightBrightness(56)
                .openWindow()
                .playMusic("Last Christmas")
                .speakWithAlexa("Wie warm ist es?")
                .build();

        Smarthome shOff = new Smarthome.Builder()
                .heatingOff()
                .lightOff()
                .stopMusic()
                .closeWindow()
                .stopMusic()
                .speakWithAlexa("Wird es heute noch regnen?")
                .build();
    }
}
