/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idevexpert.managementwarehousestore.model;

import com.idevexpert.managementwarehousestore.controller.ControllerAdministrator;
import com.idevexpert.managementwarehousestore.data.ConnectionDb;
import com.idevexpert.managementwarehousestore.data.dbQueries.LoginService;
import com.idevexpert.managementwarehousestore.utils.JpanelDarkUtil;
import com.idevexpert.managementwarehousestore.view.administrator.JpanelJdesktopBody;
import com.idevexpert.managementwarehousestore.view.login.JframeLogin;
import com.idevexpert.managementwarehousestore.view.login.component.JpanelCentralLogin;
import java.awt.Color;
import java.awt.Insets;
import java.sql.Connection;
import javax.swing.JLayeredPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;


public class ModelLogin {

    protected ConnectionDb connectionDb = new ConnectionDb();
    protected JpanelCentralLogin jpanelCentralLogin = new JpanelCentralLogin();
    protected JframeLogin jframeLogin = new JframeLogin();
    protected JpanelDarkUtil jpanelDarkUtil = new JpanelDarkUtil();
    private LoginService loginService = new LoginService(connectionDb.connectionDb());
    private ControllerAdministrator controllerAdministrator;
    private final MigLayout layout = new MigLayout("fill, insets 0");

    public void init() {
        jframeLogin.jLayeredPane1.setLayout(layout);
        jframeLogin.setBackground(Color.WHITE);
        jpanelDarkUtil.add(jpanelCentralLogin);
        jframeLogin.jLayeredPane1.setLayer(jpanelDarkUtil, JLayeredPane.PALETTE_LAYER);
        jframeLogin.jLayeredPane1.add(jpanelDarkUtil, "pos 0 0 100% 100%");
        jframeLogin.setSize(1200, 800);
        jframeLogin.jMenuBar1.setVisible(false);
        jframeLogin.setLocationRelativeTo(null);
        jframeLogin.setVisible(true);
    }

    public void awaitComponentEnter() {
        if (loginService.incomeServiceLogIn() == 1) {
            jframeLogin.setEnabled(false);
            jpanelDarkUtil.setVisible(false);
            System.out.println("I entered the coordiantor view");
            controllerAdministrator = new ControllerAdministrator(jframeLogin ,  jpanelDarkUtil);
        } else {   
            jpanelCentralLogin.jLabel4.setText("Datos incorrectos inténtalo de nuevo");
        }

    }

}
