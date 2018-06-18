class SpaceAge {

    private double seconds;
    private double earthYear = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds / this.earthYear;
    }

    double onMercury() {
        return this.seconds / (this.earthYear * 0.2408467);
    }

    double onVenus() {
        return this.seconds / (this.earthYear * 0.61519726);
    }

    double onMars() {
        return this.seconds / (this.earthYear * 1.8808158);
    }

    double onJupiter() {
        return this.seconds / (this.earthYear * 11.862615);
    }

    double onSaturn() {
        return this.seconds / (this.earthYear * 29.447498);
    }

    double onUranus() {
        return this.seconds / (this.earthYear * 84.016846);
    }

    double onNeptune() {
        return this.seconds / (this.earthYear * 164.79132);
    }

}
