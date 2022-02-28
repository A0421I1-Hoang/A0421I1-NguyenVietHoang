package com.codegym.service;

import com.codegym.model.Mail;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MailService implements IMailService{
    private static List<Mail> mailList= new ArrayList<>();
    static {
        mailList.add(new Mail(1,"English",2,true,"John","Hello, i'm John"));
        mailList.add(new Mail(2,"Japanese",3,false,"Jill","Hello, i'm Jill Valentine"));
        mailList.add(new Mail(3,"Vietnamese",1,true,"Chris","Hello, I'm Chris"));
        mailList.add(new Mail(4,"Chinese",2,true,"Leon","Hello, i'm Leon"));
        mailList.add(new Mail(5,"English",5,false,"Ada","Hello, i'm Ada Wong"));
    }

    @Override
    public List<Mail> getMailList() {
        return mailList;
    }

    @Override
    public void saveMail(Mail mail) {
        mailList.add(mail);
    }

    @Override
    public void deleteMail(int id) {

    }
}
