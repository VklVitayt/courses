package com.iba.courses.service;

import javax.xml.bind.DataBindingException;
import java.sql.SQLException;

public class TerminalService {

    public String ImsTerminal(String command) {
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        try {
            imsConnectionService.init(new ImsParameters());
            imsConnectionService.connect();
            String outPut =  imsConnectionService.execute(command);
         //   System.out.println(outPut);
            return  outPut;
        } catch (ImsInteractionException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String Db2Terminal(String command) {
        try {
            DB2Connect db2Connect = new DB2Connect();
            db2Connect.init(new db2Parameters());
            String db2Message = db2Connect.execute(command);
            System.out.println(db2Message);
            //   System.out.println(outPut);
            return db2Message;
        } catch (DataBindingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
