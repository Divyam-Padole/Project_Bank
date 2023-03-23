package project2;

import java.sql.ResultSet;

public class detail {
    public String detail_screen(String id)
    {
        String str="\n\n\n        ERROR IN FETCHING\n " +
                "                   ACCOUNT DETAILS";
        String bank = "---";
        try {
            ResultSet result = connection_mysql.connectToDB("SELECT * FROM DETAIL WHERE ACCOUNT_NO=" + id + ";");
            assert result != null;
            result.next();
            str=null;
            String bank_code = result.getString(1);
            if(bank_code.equals("111111"))
            {
                bank="Axis Bank";
            } else if (bank_code.equals("101010")) {
                bank="State Bank of India";
            }
            else if(bank_code.equals("123123"))
            {
                bank="HDFC Bank";
            } else if (bank_code.equals("121212")) {
                bank="ICICI Bank";
            }
            String account_no=result.getString(2);
            String name = result.getString(4);
            String mobile= result.getString(5);
            String amount = result.getString(6);
            str="\n              ACCOUNT DETAILS\n\n" +
                    "    Bank name:   "+bank+"\n" +
                    "    Account No.: "+account_no+"\n" +
                    "    Name:           "+name+"\n" +
                    "    Mobile No.:   "+mobile+"\n" +
                    "    Amount:        "+amount+"\n";
            return str;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
