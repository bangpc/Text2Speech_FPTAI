/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BangPC
 */
public class ControlSevlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        if (request.getParameter("submit") != null) {
            String text = request.getParameter("text");
            String voice = request.getParameter("voice");
            String speed = request.getParameter("speed");
            String prosody;
            if (request.getParameter("prosody") != null) {
                prosody = "1";
            } else {
                prosody = "0";
            }

            try (OutputStreamWriter writer
                    = new OutputStreamWriter(new FileOutputStream("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\text.txt"), StandardCharsets.UTF_8)) {
                writer.append(text);
            }
            
            BufferedWriter voiceWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\voice.txt"));
            BufferedWriter speedWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\speed.txt"));
            BufferedWriter prosodyWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\prosody.txt"));

            voiceWT.write(voice);
            speedWT.write(speed);
            prosodyWT.write(prosody);
            voiceWT.close();
            speedWT.close();
            prosodyWT.close();

            try {
                Runtime.getRuntime().exec("cmd /c start /min cmd.exe /K  \"cd C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S && start.py && exit()\"");

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlSevlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\url.txt"));
            String link = br.readLine();
            request.setAttribute("link", link);
            RequestDispatcher rd = request.getRequestDispatcher("t2s.jsp");
            rd.forward(request, response);

        }
        
        String start_name = (String)request.getAttribute("start_name");
        try (OutputStreamWriter writer
                = new OutputStreamWriter(new FileOutputStream("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\text.txt"), StandardCharsets.UTF_8)) {
            writer.append("Chào mừng "+start_name+" đến với ứng dụng đọc văn bản tự động ");
        }

        BufferedWriter voiceWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\voice.txt"));
        BufferedWriter speedWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\speed.txt"));
        BufferedWriter prosodyWT = new BufferedWriter(new FileWriter("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\prosody.txt"));

        voiceWT.write("banmai");
        speedWT.write("0");
        prosodyWT.write("1");
        voiceWT.close();
        speedWT.close();
        prosodyWT.close();
        try {
            Runtime.getRuntime().exec("cmd /c start /min cmd.exe /K  \"cd C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S && start.py && exit()\"");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControlSevlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\BangPC\\Desktop\\FPT\\Fall2019\\NWC\\MyT2S\\url.txt"));
        String link = br.readLine();
        request.setAttribute("link", link);
        request.setAttribute("autoplay", "true");
        RequestDispatcher rd = request.getRequestDispatcher("t2s.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
