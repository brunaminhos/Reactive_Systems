package controllers;


import model.Account;
import model.AccountDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAllAccounts", value = "/ShowAllAccounts")
public class ShowAllAccounts extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String address;

        try{
            List<Account> list = AccountDB.getAllAccounts();

            if(list == null || list.isEmpty()){
                address = "/Error.jsp";
            } else {

                address = "/ShowAllAccounts.jsp";
                request.setAttribute("list", list);
            }
        }
        catch (Exception ex){
            address = "/Error.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);

    }
}
