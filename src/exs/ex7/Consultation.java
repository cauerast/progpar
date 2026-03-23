package exs.ex7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consultation {
    private LocalDateTime date;
    private float price;
    private Doctor doctor;
    private Patient patient;

    public Consultation(LocalDateTime date, float price, Doctor doctor, Patient patient) {
        this.date = date;
        this.price = price;
        this.doctor = doctor;
        this.patient = patient;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' HH:mm");

        return "\nConsultation ->" +
                "\n\tdate: " + this.date.format(formatter) +
                "\n\tprice: " + this.price +
                "\n\tdoctor: " + this.doctor.getName() +
                "\n\tpatient: " + this.patient.getName();
    }
}
