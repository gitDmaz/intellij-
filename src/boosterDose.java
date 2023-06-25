abstract class Vaccine {
    public void firstDose() {
        // implementation goes here
    }

    public void secondDose() {
        // implementation goes here
    }

    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    public void boosterDose() {
        // implementation goes here
    }
}