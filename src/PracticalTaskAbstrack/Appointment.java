package PracticalTaskAbstrack;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Appointment {

    public List<AppointmentDetails> appointmentDetailsList;

    public List<AppointmentDetails> getAppointmentDetailsList() {
        return appointmentDetailsList;
    }

    public void setAppointmentDetailsList(List<AppointmentDetails> appointmentDetailsList) {
        this.appointmentDetailsList = appointmentDetailsList;
    }
}
