package com.example.note.system.swing;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/12/3 20:36
 */
@Component
public class SwingTool {

    public static void SwingAction(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
        NativeInterface.runEventPump();
    }

    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Note");
        frame.setSize(350, 200);
        /**
         * 下边的这句话，如果这么写的话，窗口关闭，springboot项目就会关掉，使用
         * dispose则不会
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //如果写这句可实现窗口关闭，springboot项目仍运行
        //frame.dispose();
        JPanel jPanel = swingWebBrowserStructure();
        frame.getContentPane().add(jPanel,
                BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        //界面可见
        frame.setVisible(true);
    }

    private static JPanel swingWebBrowserStructure(){
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        //边框标题
        //webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));
        final JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.navigate("http://www.baidu.com");
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowserPanel.add(webBrowserPanel, BorderLayout.CENTER);
        // Create an additional bar allowing to show/hide the menu bar of the
        // web
        // browser.
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));
        JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser
                .isMenuBarVisible());
        menuBarCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                webBrowser
                        .setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
        buttonPanel.add(menuBarCheckBox);
        webBrowserPanel.add(buttonPanel, BorderLayout.SOUTH);
        return webBrowserPanel;
    }
}