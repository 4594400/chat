package ua.goit.chat;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 18.08.16.
 */
@ManagedBean
@SessionScoped
public class ClientBean {
    List<Sms> smsList = new ArrayList<Sms>();

    public List<Sms> getSmsList() {
        return smsList;
    }

    public void setSmsList(List<Sms> smsList) {
        this.smsList = smsList;
    }

    @PostConstruct
    public void createSms() {
        Sms sms1 = new Sms(1, "message 1");
        Sms sms2 = new Sms(2, "message 2");
        smsList.add(sms1);
        smsList.add(sms2);

    }

    public void add () {
        Sms sms = new Sms(3, "TEXT");
        smsList.add(sms);
        for (Sms item : smsList) {
            System.out.println(item.toString());
        }
    }
    public void add2 () {
        Sms sms = new Sms(4, "TEXT4");
        smsList.add(sms);
        for (Sms item : smsList) {
            System.out.println(item.toString());
        }

    }
}
