package com.codegym.service;

import com.codegym.model.Mail;
import java.util.List;

public interface IMailService {

    List<Mail> getMailList();

    void saveMail(Mail mail);

    void deleteMail(int id);
}
