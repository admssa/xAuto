package xAuto.domain;

import java.util.List;

/**
 * Created by admssa on 05.05.2016.
 */
public class RequestForm {
    private String email;
    private String addrJson;
    private String date_timepicker_start;
    private String date_timepicker_end;
    private String phoneNumber;

    public RequestForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddrJson() {
        return addrJson;
    }

    public void setAddrJson(String addrJson) {
        this.addrJson = addrJson;
    }

    public String getDate_timepicker_start() {
        return date_timepicker_start;
    }

    public void setDate_timepicker_start(String date_timepicker_start) {
        this.date_timepicker_start = date_timepicker_start;
    }

    public String getDate_timepicker_end() {
        return date_timepicker_end;
    }

    public void setDate_timepicker_end(String date_timepicker_end) {
        this.date_timepicker_end = date_timepicker_end;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
