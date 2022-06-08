package com.example.note.system.jxbrowser;


import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.browser.BrowserSettings;
import com.teamdev.jxbrowser.browser.CloseOptions;
import com.teamdev.jxbrowser.browser.SavePageType;
import com.teamdev.jxbrowser.browser.callback.BrowserCallback;
import com.teamdev.jxbrowser.browser.event.BrowserEvent;
import com.teamdev.jxbrowser.devtools.DevTools;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.event.Observer;
import com.teamdev.jxbrowser.event.Subscription;
import com.teamdev.jxbrowser.frame.Frame;
import com.teamdev.jxbrowser.media.Audio;
import com.teamdev.jxbrowser.navigation.Navigation;
import com.teamdev.jxbrowser.os.Display;
import com.teamdev.jxbrowser.search.TextFinder;
import com.teamdev.jxbrowser.ui.Bitmap;
import com.teamdev.jxbrowser.ui.Size;
import com.teamdev.jxbrowser.ui.event.*;
import com.teamdev.jxbrowser.zoom.Zoom;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String url = "http://localhost:1002/open/index";
        JFrame frame = new JFrame();
        // 谷歌内核浏览器
        Browser browser = new Browser() {
            @Override
            public <E extends BrowserEvent> Subscription on(Class<E> aClass, Observer<E> observer) {
                return null;
            }

            @Override
            public <C extends BrowserCallback> C set(Class<C> aClass, C c) {
                return null;
            }

            @Override
            public <C extends BrowserCallback> Optional<C> get(Class<C> aClass) {
                return Optional.empty();
            }

            @Override
            public <C extends BrowserCallback> C remove(Class<C> aClass) {
                return null;
            }

            @Override
            public Engine engine() {
                return null;
            }

            @Override
            public Optional<Frame> mainFrame() {
                return Optional.empty();
            }

            @Override
            public Optional<Frame> focusedFrame() {
                return Optional.empty();
            }

            @Override
            public List<Frame> frames() {
                return null;
            }

            @Override
            public Bitmap bitmap() {
                return null;
            }

            @Override
            public Bitmap favicon() {
                return null;
            }

            @Override
            public TextFinder textFinder() {
                return null;
            }

            @Override
            public Zoom zoom() {
                return null;
            }

            @Override
            public Audio audio() {
                return null;
            }

            @Override
            public Navigation navigation() {
                return null;
            }

            @Override
            public BrowserSettings settings() {
                return null;
            }

            @Override
            public DevTools devTools() {
                return null;
            }

            @Override
            public void replaceMisspelledWord(String s) {

            }

            @Override
            public boolean saveWebPage(Path path, Path path1, SavePageType savePageType) {
                return false;
            }

            @Override
            public String url() {
                return url;
            }

            @Override
            public String title() {
                return null;
            }

            @Override
            public String userAgent() {
                return null;
            }

            @Override
            public void userAgent(String s) {

            }

            @Override
            public void focus() {

            }

            @Override
            public void unfocus() {

            }

            @Override
            public void resize(Size size) {

            }

            @Override
            public void resize(int i, int i1) {

            }

            @Override
            public Size size() {
                return null;
            }

            @Override
            public Display display() {
                return null;
            }

            @Override
            public void dispatch(KeyPressed keyPressed) {

            }

            @Override
            public void dispatch(KeyReleased keyReleased) {

            }

            @Override
            public void dispatch(KeyTyped keyTyped) {

            }

            @Override
            public void dispatch(MousePressed mousePressed) {

            }

            @Override
            public void dispatch(MouseReleased mouseReleased) {

            }

            @Override
            public void dispatch(MouseEntered mouseEntered) {

            }

            @Override
            public void dispatch(MouseExited mouseExited) {

            }

            @Override
            public void dispatch(MouseDragged mouseDragged) {

            }

            @Override
            public void dispatch(MouseMoved mouseMoved) {

            }

            @Override
            public void dispatch(MouseWheel mouseWheel) {

            }

            @Override
            public void close() {

            }

            @Override
            public boolean isClosed() {
                return false;
            }

            @Override
            public void close(CloseOptions closeOptions) {

            }
        };
        //BrowserView aa = new BrowserView();
        //BrowserView view = new BrowserView(browser);

//禁用close功能

// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//隐藏任务栏图标

// frame.setType(JFrame.Type.UTILITY);

// //不显示标题栏,最大化,最小化,退出按钮

        frame.setUndecorated(true);

//尺寸

// frame.setSize(500, 500);

//坐标

        frame.setLocation(0, 0);

        //frame.add(browser);

//全屏显示

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

// 是否显示

        frame.setVisible(true);

//是否在屏幕最上层显示

        frame.setAlwaysOnTop(true);

//加载地址

        //browser.loadURL(url);

// System.out.println(frame.getX());

// System.out.println(frame.getY());

// list.add(frame);

        frame.addWindowListener(new WindowAdapter() {
// 窗口关闭时间监听

            @Override

            public void windowClosing(WindowEvent e){
                System.out.println("窗口关闭...");

            }

        });

    }

}