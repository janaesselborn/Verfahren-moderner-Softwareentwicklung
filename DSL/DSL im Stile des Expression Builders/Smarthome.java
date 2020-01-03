public class Smarthome {

    public static final boolean ON = true;
    public static final boolean OFF = false;

    static class Builder {
        private boolean light;
        private int brightness;
        private boolean heater;
        private int temperature;
        private boolean window;
        private boolean music;
        private String song;
        private String alexa;

        public Builder() {}

        // Control the light
        public Builder lightOn() {
            this.light = ON;
            return this;
        }

        public Builder lightOff() {
            this.light = OFF;
            return this;
        }

        public Builder lightBrightness(int b) {
            if (b > 100) b = 100;
            this.brightness = b;
            return this;
        }

        // Control the heater
        public Builder heatingOn (int temperature) {
            this.heater = ON;
            if (temperature > 25) temperature = 25;
            this.temperature = temperature;
            return this;
        }

        public Builder heatingOff () {
            this.heater = OFF;
            return this;
        }

        // Control the window
        public Builder openWindow () {
            this.window = ON;
            return this;
        }

        public Builder closeWindow () {
            this.window = OFF;
            return this;
        }

        // Control the music
        public Builder playMusic (String s) {
            this.music = ON;
            this.song = s;
            return this;
        }

        public Builder stopMusic () {
            this.music = OFF;
            return this;
        }

        // Speak with alexa
        public Builder speakWithAlexa (String a) {
            this.alexa = a;
            return this;
        }

        public Smarthome build () {
            return new Smarthome(this);
        }
    }
    private final boolean light;
    private final int brightness;
    private final boolean heater;
    private final int temperature;
    private final boolean window;
    private final boolean music;
    private final String song;
    private final String alexa;

    private Smarthome (Builder b) {
        light = b.light;
        brightness = b.brightness;
        heater = b.heater;
        temperature = b.temperature;
        window = b.window;
        music = b.music;
        song = b.song;
        alexa = b.alexa;
    }
}
